package clicker.back.services;

import clicker.back.entities.ResultadosInfocorp;
import clicker.back.entities.SedesConcesionarios;

import java.util.List;

public interface SedesConcesionariosService {
    SedesConcesionarios save(SedesConcesionarios sedesConcesionarios);

    void delete(SedesConcesionarios sedesConcesionarios);

    SedesConcesionarios getById(SedesConcesionarios sedesConcesionarios);

    List<SedesConcesionarios> getAll();
}
