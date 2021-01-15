package clicker.back.services;

import clicker.back.entities.AutoSemiNuevo;

import java.util.List;

public interface AutoSemiNuevoService {

    AutoSemiNuevo save(AutoSemiNuevo autoSemiNuevo);

    void delete(AutoSemiNuevo autoSemiNuevo);

    AutoSemiNuevo getById(Long id );

    List<AutoSemiNuevo> getAll();

}
