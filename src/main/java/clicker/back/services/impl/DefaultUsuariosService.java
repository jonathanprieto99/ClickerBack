package clicker.back.services.impl;

import clicker.back.entities.Usuario;
import clicker.back.repositories.UsuariosRepository;
import clicker.back.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultUsuariosService implements UsuariosService {

    @Autowired
    UsuariosRepository usuariosRepository;


    @Override
    public Usuario login(String correo, String password ) {
        return usuariosRepository.findByCorreoAndPassword(correo,password);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuariosRepository.save(usuario);
    }

    @Override
    public void delete(Usuario usuario) {
        usuariosRepository.delete(usuario);
    }

    @Override
    public Usuario getById(String id ) {
        return usuariosRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> getAll() {
        return (List<Usuario>) usuariosRepository.findAll();
    }
}
