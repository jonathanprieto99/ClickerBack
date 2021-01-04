package clicker.back.services;

import clicker.back.entities.Users;
import clicker.back.entities.Usuarios;

import java.util.List;

public interface UsuariosService {


    Usuarios save(Usuarios usuarios);

    void delete(Usuarios usuarios);

    Usuarios getById(Usuarios usuarios);

    List<Usuarios> getAll();
}
