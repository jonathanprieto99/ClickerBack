package clicker.back.services;

import clicker.back.entities.Usuario;

import java.util.List;

public interface UsuariosService {

    Usuario login(String correo, String password);

    Usuario save(Usuario usuario);

    void delete(Usuario usuario);

    Usuario getById(String id );

    List<Usuario> getAll();
}
