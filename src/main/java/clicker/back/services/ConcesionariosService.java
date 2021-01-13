package clicker.back.services;

import clicker.back.Antiguo.Concesionarios;

import java.util.List;

public interface ConcesionariosService {
    Concesionarios save(Concesionarios concesionarios);

    void delete(Concesionarios concesionarios);

    Concesionarios getById(Concesionarios concesionarios);

    List<Concesionarios> getAll();
}
