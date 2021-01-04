package clicker.back.services.impl;

import clicker.back.entities.Usuarios;
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
    public Usuarios save(Usuarios usuarios) {
        return usuariosRepository.save(usuarios);
    }

    @Override
    public void delete(Usuarios usuarios) {
        usuariosRepository.delete(usuarios);
    }

    @Override
    public Usuarios getById(Usuarios usuarios) {
        return usuariosRepository.findById(usuarios.getIdUser()).orElse(null);
    }

    @Override
    public List<Usuarios> getAll() {
        return (List<Usuarios>) usuariosRepository.findAll();
    }
}