package clicker.back.controllers;


import clicker.back.Setup;
import clicker.back.entities.AutoSemiNuevo;
import clicker.back.entities.Usuario;
import clicker.back.services.UsuariosService;
import com.sun.mail.iap.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/post")
@CrossOrigin(origins = {Setup.local/*,Setup.route*/}, allowedHeaders = "*")
public class CarPostController {
    @Autowired
    UsuariosService usuariosService;

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
                if(user.getParticular()){
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



}
