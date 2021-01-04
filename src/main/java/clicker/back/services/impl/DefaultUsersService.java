package clicker.back.services.impl;

import clicker.back.entities.Users;
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
    public Users save(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public void delete(Users users) {
        usersRepository.delete(users);
    }

    @Override
    public Users getById(Users users) {
        return usersRepository.findById(users.getId()).orElse(null);
    }

    @Override
    public List<Users> getAll() {
        return (List<Users>) usersRepository.findAll();
    }
}
