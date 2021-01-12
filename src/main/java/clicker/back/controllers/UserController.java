package clicker.back.controllers;

import clicker.back.Setup;
import clicker.back.entities.User;
import clicker.back.entities.Usuarios;
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
    public ResponseEntity<Object> create(@RequestBody User user){
        if(user.getEmail()==null || user.getPassword()==null)return new ResponseEntity<>("no se envio el email", HttpStatus.BAD_REQUEST);
        Usuarios usuario= usuariosService.getById(user.getEmail());
        if(usuario==null){
            User temp = userService.getById(user);
            if(temp==null){
                return new ResponseEntity<>(userService.save(user   ), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("se encontro un user con ese correo", HttpStatus.BAD_REQUEST);}

}
