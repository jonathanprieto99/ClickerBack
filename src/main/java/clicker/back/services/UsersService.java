package clicker.back.services;

import clicker.back.entities.TiempoCompra;
import clicker.back.entities.Users;

import java.util.List;

public interface UsersService {

    Users save(Users users);

    void delete(Users users);

    Users getById(Users users);

    List<Users> getAll();
}