package clicker.back.controllers;


import clicker.back.Setup;
import clicker.back.entities.*;
import clicker.back.services.AutoSemiNuevoService;
import clicker.back.services.AutoService;
import clicker.back.services.UsuariosService;
import clicker.back.services.VentaSemiNuevoService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    @Autowired
    VentaSemiNuevoService ventaSemiNuevoService;

    @Autowired
    AutoService autoService;

    @PostMapping
    @ResponseBody
    @Transactional
    public ResponseEntity<Object> post(@RequestBody AutoSemiNuevo autoSemiNuevo){
        if(autoSemiNuevo.getAuto()==null || autoSemiNuevo.getAuto().getId()==null)
            return new ResponseEntity<>("no se envio el auto",HttpStatus.BAD_REQUEST);
        autoSemiNuevo.setAuto(autoService.getById(autoSemiNuevo.getAuto().getId()));
        if(autoSemiNuevo.getAuto()==null)return new ResponseEntity<>("no se encontro el auto",HttpStatus.BAD_REQUEST);
        if(autoSemiNuevo.getUsuario()==null || autoSemiNuevo.getUsuario().getCorreo()==null)
            return new ResponseEntity<>("no se envio un usuario",HttpStatus.BAD_REQUEST);
        Usuario user = usuariosService.getById(autoSemiNuevo.getUsuario().getCorreo());
        if(user == null){
            return new ResponseEntity<>("no se encontro el usuario con ese id",  HttpStatus.BAD_REQUEST);
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
            try{
                return new ResponseEntity<>(usuariosService.save(user),HttpStatus.ACCEPTED);
            }catch (Exception e ){
                return new ResponseEntity<>("fallo",HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

    }

    @PostMapping(value = "/interesadosCompra")
    @ResponseBody
    @Transactional
    public ResponseEntity<Object> intCompra(@RequestBody InteresadoCompra interesadoCompra) {
        if(interesadoCompra.getAutoSemiNuevo()==null || interesadoCompra.getAutoSemiNuevo().getId()==null) return new ResponseEntity<>("No se envio el auto por el cual esta interesado",HttpStatus.BAD_REQUEST);
        interesadoCompra.setAutoSemiNuevo(autoSemiNuevoService.getById(interesadoCompra.getAutoSemiNuevo().getId()));
        if(interesadoCompra.getAutoSemiNuevo() == null) return new ResponseEntity<>("no se encontro el auto",HttpStatus.NOT_FOUND);
        interesadoCompra.setId(null);
        interesadoCompra.getAutoSemiNuevo().getInteresadoCompras().add(interesadoCompra);
        interesadoCompra.setAutoSemiNuevo(interesadoCompra.getAutoSemiNuevo());
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
        if(interesadoReventa.getAutoSemiNuevo()==null || interesadoReventa.getAutoSemiNuevo().getId()==null) return new ResponseEntity<>("No se envio el auto por el cual esta interesado",HttpStatus.BAD_REQUEST);
        interesadoReventa.setAutoSemiNuevo(autoSemiNuevoService.getById(interesadoReventa.getAutoSemiNuevo().getId()));
        if(interesadoReventa.getAutoSemiNuevo() == null) return new ResponseEntity<>("no se encontro el auto",HttpStatus.NOT_FOUND);

        if(interesadoReventa.getUsuario()==null || interesadoReventa.getUsuario().getCorreo()==null) return new ResponseEntity<>("No se envio el usuario interesado",HttpStatus.BAD_REQUEST);
        interesadoReventa.setUsuario(usuariosService.getById(interesadoReventa.getUsuario().getCorreo()));
        if(interesadoReventa.getUsuario() == null) return new ResponseEntity<>("no se encontro el usuario en la base de datos",HttpStatus.NOT_FOUND);
        interesadoReventa.setId(null);
        interesadoReventa.getAutoSemiNuevo().getInteresadoReventas().add(interesadoReventa);
        interesadoReventa.setUsuario(interesadoReventa.getUsuario());
        interesadoReventa.setAutoSemiNuevo(interesadoReventa.getAutoSemiNuevo());
        try{
            return new ResponseEntity<>("se realizo correctamente el post",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("se encontro algun error",HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = "/venta")
    @ResponseBody
    @Transactional
    public ResponseEntity<Object> ventaSemiNuevo(@RequestBody VentaSemiNuevo ventaSemiNuevo){
        //TODO balance total
        if(ventaSemiNuevo.getAutoSemiNuevo()==null || ventaSemiNuevo.getAutoSemiNuevo().getId()==null)return new ResponseEntity<>("no se mando el auto",HttpStatus.BAD_REQUEST);
        ventaSemiNuevo.setAutoSemiNuevo(autoSemiNuevoService.getById(ventaSemiNuevo.getAutoSemiNuevo().getId()));
        if(ventaSemiNuevo.getAutoSemiNuevo()==null)return new ResponseEntity<>("no se encontro el auto con ese id",HttpStatus.BAD_REQUEST);
        if(ventaSemiNuevo.getVendedor()==null)return new ResponseEntity<>("no se mando el vendedor",HttpStatus.BAD_REQUEST);
        ventaSemiNuevo.setVendedor(usuariosService.getById(ventaSemiNuevo.getVendedor().getCorreo()));
        if(ventaSemiNuevo.getVendedor()==null)return new ResponseEntity<>("no se encontro el vendedor con ese id",HttpStatus.BAD_REQUEST);
        ventaSemiNuevo.getAutoSemiNuevo().setComprado(true);
        try{
            return new ResponseEntity<>(ventaSemiNuevoService.save(ventaSemiNuevo),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("fallo del servidor",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/enabled/{pageId}")
    @ResponseBody
    @Transactional
    public ResponseEntity<Object> getEnabled(@PathVariable("pageId") Integer pageId){
        try{
            return new ResponseEntity<>(autoSemiNuevoService.getAllEnabled(true,true,false,PageRequest.of(pageId,10, Sort.by("fechaPublicacion").descending())),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("fallo",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/validate/{id}")
    @ResponseBody
    @Transactional
    public ResponseEntity<Object> modify(@PathVariable("id")Long id ){
        AutoSemiNuevo autoSemiNuevo = autoSemiNuevoService.getById(id);
        if(autoSemiNuevo==null)return new ResponseEntity<>("no se encontro el post con ese id",HttpStatus.BAD_REQUEST);
        autoSemiNuevo.setValidado(true);
        try{
            System.out.println(autoSemiNuevo.getValidado().toString());

            return new ResponseEntity<>(autoSemiNuevoService.save(autoSemiNuevo),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("fallo",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
