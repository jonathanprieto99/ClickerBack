package clicker.back.services.impl;

import clicker.back.entities.Autos;
import clicker.back.repositories.AutosRepository;
import clicker.back.services.AutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultAutosService implements AutosService{
    @Autowired
    AutosRepository autosRepository;


    @Override
    public Autos save(Autos autos) {
        return autosRepository.save(autos);
    }

    @Override
    public void delete(Autos autos) {
        autosRepository.delete(autos);
    }

    @Override
    public Autos getById(Autos autos) {
        return autosRepository.findById(autos.getIdAuto()).orElse(null);
    }

    @Override
    public List<Autos> getAll() {
        return (List<Autos>) autosRepository.findAll();
    }
}
