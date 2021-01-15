package clicker.back.services;

import clicker.back.Antiguo.Concesionarios;
import clicker.back.entities.Denuncia;

import java.util.List;

public interface DenunciaService {
    Denuncia save(Denuncia denuncia);

    void delete(Denuncia denuncia);

    Denuncia getById(Long id );

    List<Denuncia> getAll();

}
