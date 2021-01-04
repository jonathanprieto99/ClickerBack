package clicker.back.services;

import clicker.back.entities.Autos;

import java.util.List;

public interface AutosService {

    Autos save(Autos autos);

    void delete(Autos autos);

    Autos getById(Autos autos);

    List<Autos> getAll();

}
