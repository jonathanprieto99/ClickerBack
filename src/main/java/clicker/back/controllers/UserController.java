package clicker.back.controllers;

import clicker.back.Setup;
import clicker.back.entities.FormRemax;
import clicker.back.entities.Users;
import clicker.back.entities.Usuario;
import clicker.back.services.UsersService;
import clicker.back.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin(origins = {Setup.local/*,Setup.route*/}, allowedHeaders = "*")
public class UserController {

    @Autowired
    UsersService userService;

    @Autowired
    UsuariosService usuariosService;

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<Object> create(@RequestBody Users users){
        if(users.getEmail()==null || users.getPassword()==null)return new ResponseEntity<>("no se envio el email", HttpStatus.BAD_REQUEST);
        Usuario usuario= usuariosService.getById(users.getEmail());
        if(usuario==null){
            Users temp = userService.getById(users.getEmail());
            if(temp==null){
                return new ResponseEntity<>(userService.save(users), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("se encontro un user con ese correo", HttpStatus.BAD_REQUEST);
    }

    @GetMapping(value = "/id")
    @ResponseBody
    public ResponseEntity<Object> getById(@RequestParam("id") String id ) {
        System.out.println(id);
        Users user = userService.getById(id);
        if (user == null)
            return new ResponseEntity<>(usuariosService.getById(id), HttpStatus.OK);
        else
            return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<Object> getAll() {
        return new ResponseEntity<>(usuariosService.getAll(),HttpStatus.OK);
    }

    @PostMapping(value = "/remax")
    @ResponseBody
    public ResponseEntity<Object> postFormRemax(@RequestBody FormRemax formRemax){
        if(formRemax.getUsuario()==null || formRemax.getUsuario().getCorreo()==null)return new ResponseEntity<>("no se envio el usuario",HttpStatus.BAD_REQUEST);
        formRemax.setUsuario(usuariosService.getById(formRemax.getUsuario().getCorreo()));
        if(formRemax.getUsuario()==null) return new ResponseEntity<>("no se encontro el usuario",HttpStatus.BAD_REQUEST);
        if(!formRemax.getUsuario().getRol().equals("REMAX"))return new ResponseEntity<>("el usuario no es un tipo REMAX, no se le debe hacer un forms",HttpStatus.BAD_REQUEST);
        formRemax.getUsuario().setFormRemax(formRemax);
        return new ResponseEntity<>(usuariosService.save(formRemax.getUsuario()),HttpStatus.OK);
    }

}
