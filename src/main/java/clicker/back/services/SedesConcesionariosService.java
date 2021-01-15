package clicker.back.services;

import clicker.back.Antiguo.SedesConcesionarios;

import java.util.List;

public interface SedesConcesionariosService {
    SedesConcesionarios save(SedesConcesionarios sedesConcesionarios);

    void delete(SedesConcesionarios sedesConcesionarios);

    SedesConcesionarios getById(Long id);

    List<SedesConcesionarios> getAll();
}
