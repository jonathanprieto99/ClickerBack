package clicker.back.controllers;

import clicker.back.Setup;
import clicker.back.entities.User;
import clicker.back.entities.Usuarios;
import clicker.back.services.UsersService;
import clicker.back.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/auth")
@CrossOrigin(origins = {Setup.local/*,Setup.route*/}, allowedHeaders = "*")
public class AuthController {
    @Autowired
    UsuariosService usuariosService;

    @Autowired
    UsersService usersService;

    @PostMapping(value = "/register")
    @ResponseBody
    public ResponseEntity<Object> register(@RequestBody Usuarios usuario) {
        if(usuario.getCorreo()==null || usuario.getPassword()==null)return new ResponseEntity<>("no se envio el email", HttpStatus.BAD_REQUEST);
        User user = usersService.getByEmail(usuario.getCorreo());
        if(user==null){
            Usuarios temp = usuariosService.getById(usuario.getCorreo());
            if(temp==null){
                return new ResponseEntity<>(usuariosService.save(usuario), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("se encontro un usuario con ese correo", HttpStatus.BAD_REQUEST);

    }

    @PostMapping(value = "/login")
    @ResponseBody
    public ResponseEntity<Object> login(@RequestBody Usuarios usuario) {
        if(usuario.getCorreo()==null || usuario.getPassword()==null)return new ResponseEntity<>("no se envio credenciales", HttpStatus.OK);
        User user = usersService.login(usuario.getCorreo(),usuario.getPassword());
        if(user==null){
            usuario = usuariosService.login(usuario.getCorreo(),usuario.getPassword());
            if(usuario==null){
                return new ResponseEntity<>("no se encontro el usuario", HttpStatus.OK);
            }else{
                return new ResponseEntity<>(usuario, HttpStatus.OK);
            }
        }else {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    }


}
