package clicker.back.controllers;


import clicker.back.Setup;
import clicker.back.entities.AutoSemiNuevo;
import clicker.back.entities.InteresadoCompra;
import clicker.back.entities.InteresadoReventa;
import clicker.back.entities.Usuario;
import clicker.back.services.AutoSemiNuevoService;
import clicker.back.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/post")
@CrossOrigin(origins = {Setup.local/*,Setup.route*/}, allowedHeaders = "*")
public class CarPostController {
    @Autowired
    UsuariosService usuariosService;

    @Autowired
    AutoSemiNuevoService autoSemiNuevoService;

    @PostMapping
    @ResponseBody
    @Transactional
    public ResponseEntity<Object> post(@RequestBody AutoSemiNuevo autoSemiNuevo){
        Usuario user = usuariosService.getById(autoSemiNuevo.getUsuario().getCorreo());
        if(user == null){
            return new ResponseEntity<>("no se encontro el id de este usuario",  HttpStatus.BAD_REQUEST);
        }else{
            Calendar c1 = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            c2.setTime(new Date());
            int cont=0;
            List<AutoSemiNuevo> autos = user.getCarrosPosteados();
            for(AutoSemiNuevo auto:autos){
                c1.setTime(auto.getFechaPublicacion());
                if(c1.get(Calendar.YEAR)==c2.get(Calendar.YEAR))cont++;
            }
            if(cont>=user.getCantidadCarrosAno())return new ResponseEntity<>("ya agoto sus subidas anuales",  HttpStatus.LOCKED);
            else{
                autoSemiNuevo.setValidado(false);
                if(user.getRol().equals("PARTICULAR")){
                    autoSemiNuevo.setComisionEmpresa(40);
                    autoSemiNuevo.setComisionUsuario(40);
                    autoSemiNuevo.setComisionVendedor(20);
                }else{
                    autoSemiNuevo.setComisionEmpresa(40);
                    autoSemiNuevo.setComisionUsuario(40);
                    autoSemiNuevo.setComisionVendedor(20);
                }

            }
            autoSemiNuevo.setComprado(false);
            autoSemiNuevo.setValidado(false);
            autoSemiNuevo.setEnabled(true);
            autoSemiNuevo.setFechaPublicacion(new Date());
            autos.add(autoSemiNuevo);
            return new ResponseEntity<>(usuariosService.save(user),HttpStatus.ACCEPTED);

        }

    }

    @PostMapping(value = "/interesadosCompra")
    @ResponseBody
    @Transactional
    public ResponseEntity<Object> intCompra(@RequestBody InteresadoCompra interesadoCompra) {
        AutoSemiNuevo autoSemiNuevo = interesadoCompra.getAutoSemiNuevo();
        if(autoSemiNuevo==null || autoSemiNuevo.getId()==null) return new ResponseEntity<>("No se envio el auto por el cual esta interesado",HttpStatus.BAD_REQUEST);
        autoSemiNuevo = autoSemiNuevoService.getById(autoSemiNuevo.getId());
        if(autoSemiNuevo == null) return new ResponseEntity<>("no se encontro el auto",HttpStatus.NOT_FOUND);
        interesadoCompra.setId(null);
        autoSemiNuevo.getInteresadoCompras().add(interesadoCompra);
        interesadoCompra.setAutoSemiNuevo(autoSemiNuevo);
        try{
            return new ResponseEntity<>("se realizo correctamente el post",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("se encontro algun error",HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(autoSemiNuevoService.getById(id),HttpStatus.OK);
    }

    @PostMapping(value = "/interesadosVenta")
    @ResponseBody
    @Transactional
    public ResponseEntity<Object> intVenta(@RequestBody InteresadoReventa interesadoReventa) {
        AutoSemiNuevo autoSemiNuevo = interesadoReventa.getAutoSemiNuevo();
        if(autoSemiNuevo==null || autoSemiNuevo.getId()==null) return new ResponseEntity<>("No se envio el auto por el cual esta interesado",HttpStatus.BAD_REQUEST);
        autoSemiNuevo = autoSemiNuevoService.getById(autoSemiNuevo.getId());
        if(autoSemiNuevo == null) return new ResponseEntity<>("no se encontro el auto",HttpStatus.NOT_FOUND);

        Usuario usuario = interesadoReventa.getUsuario();
        if(usuario==null || usuario.getCorreo()==null) return new ResponseEntity<>("No se envio el usuario interesado",HttpStatus.BAD_REQUEST);
        usuario = usuariosService.getById(usuario.getCorreo());
        if(usuario == null) return new ResponseEntity<>("no se encontro el usuario en la base de datos",HttpStatus.NOT_FOUND);

        interesadoReventa.setId(null);
        autoSemiNuevo.getInteresadoReventas().add(interesadoReventa);
        interesadoReventa.setUsuario(usuario);
        interesadoReventa.setAutoSemiNuevo(autoSemiNuevo);
        try{
            return new ResponseEntity<>("se realizo correctamente el post",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("se encontro algun error",HttpStatus.BAD_REQUEST);
        }
    }
}
