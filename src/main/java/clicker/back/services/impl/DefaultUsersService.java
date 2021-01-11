package clicker.back.services.impl;

import clicker.back.entities.User;
import clicker.back.repositories.UsersRepository;
import clicker.back.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultUsersService implements UsersService {

    @Autowired
    UsersRepository usersRepository;


    @Override
    public User save(User user) {
        return usersRepository.save(user);
    }

    @Override
    public void delete(User user) {
        usersRepository.delete(user);
    }

    @Override
    public User getById(User user) {
        return usersRepository.findById(user.getId()).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return (List<User>) usersRepository.findAll();
    }
}
