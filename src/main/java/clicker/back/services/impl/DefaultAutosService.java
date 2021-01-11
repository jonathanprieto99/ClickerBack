package clicker.back.services.impl;

import clicker.back.entities.Auto;
import clicker.back.repositories.AutoRepository;
import clicker.back.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultAutosService implements AutoService {
    @Autowired
    AutoRepository autosRepository;


    @Override
    public Auto save(Auto autos) {
        return autosRepository.save(autos);
    }

    @Override
    public void delete(Auto autos) {
        autosRepository.delete(autos);
    }

    @Override
    public Auto getById(Auto autos) {
        return autosRepository.findById(autos.getId()).orElse(null);
    }

    @Override
    public List<Auto> getAll() {
        return (List<Auto>) autosRepository.findAll();
    }
}
