package clicker.back.controllers;

import clicker.back.Setup;
import clicker.back.entities.Users;
import clicker.back.entities.Usuario;
import clicker.back.services.UsersService;
import clicker.back.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<Object> register(@RequestBody Usuario usuario) {
        if(usuario.getCorreo()==null || usuario.getPassword()==null)return new ResponseEntity<>("no se envio el email", HttpStatus.BAD_REQUEST);
        Users users = usersService.getByEmail(usuario.getCorreo());
        if(users ==null){
            Usuario temp = usuariosService.getById(usuario.getCorreo());
            if(temp==null){
                if(usuario.getRol().equals("REMAX")) {
                    usuario.setEnabled(false);
                    usuario.getFormRemax().setUsuario(usuario);
                }else {
                    usuario.setFormRemax(null);
                }
                return new ResponseEntity<>(usuariosService.save(usuario), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("se encontro un usuario con ese correo", HttpStatus.BAD_REQUEST);

    }

    @PostMapping(value = "/login")
    @ResponseBody
    public ResponseEntity<Object> login(@RequestBody Usuario usuario) {
        if(usuario.getCorreo()==null || usuario.getPassword()==null)return new ResponseEntity<>("no se envio credenciales", HttpStatus.OK);
        Users users = usersService.login(usuario.getCorreo(),usuario.getPassword());
        if(users ==null){
            usuario = usuariosService.login(usuario.getCorreo(),usuario.getPassword());
            if(usuario==null){
                return new ResponseEntity<>("no se encontro el usuario", HttpStatus.OK);
            }else{
                return new ResponseEntity<>(usuario, HttpStatus.OK);
            }
        }else {
            return new ResponseEntity<>(users, HttpStatus.OK);
        }
    }


}
