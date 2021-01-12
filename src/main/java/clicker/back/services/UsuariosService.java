package clicker.back.services;

import clicker.back.entities.Usuarios;

import java.util.List;

public interface UsuariosService {

    Usuarios login(String correo,String password);

    Usuarios save(Usuarios usuarios);

    void delete(Usuarios usuarios);

    Usuarios getById(String id );

    List<Usuarios> getAll();
}
