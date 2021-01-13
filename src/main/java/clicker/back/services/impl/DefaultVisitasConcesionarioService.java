package clicker.back.services.impl;

import clicker.back.Antiguo.VisitasConcesionario;
import clicker.back.repositories.VisitasConcesionarioRepository;
import clicker.back.services.VisitasConcesionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultVisitasConcesionarioService implements VisitasConcesionarioService {

    @Autowired
    VisitasConcesionarioRepository visitasConcesionarioRepository;

    @Override
    public VisitasConcesionario save(VisitasConcesionario visitasConcesionario) {
        return visitasConcesionarioRepository.save(visitasConcesionario);
    }

    @Override
    public void delete(VisitasConcesionario visitasConcesionario) {
        visitasConcesionarioRepository.delete(visitasConcesionario);
    }

    @Override
    public VisitasConcesionario getById(VisitasConcesionario visitasConcesionario) {
        return visitasConcesionarioRepository.findById(visitasConcesionario.getIdVisita()).orElse(null);
    }

    @Override
    public List<VisitasConcesionario> getAll() {
        return (List<VisitasConcesionario>) visitasConcesionarioRepository.findAll();
    }
}
