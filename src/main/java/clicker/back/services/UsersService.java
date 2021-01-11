package clicker.back.services;

import clicker.back.entities.User;

import java.util.List;

public interface UsersService {

    User save(User user);

    void delete(User user);

    User getById(User user);

    List<User> getAll();
}
