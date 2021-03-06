package clicker.back.services;

import clicker.back.entities.Auto;

import java.util.List;

public interface AutoService {

    Auto save(Auto autos);

    void delete(Auto autos);

    Auto getById(Long id);

    List<Auto> getAll();

    Long getCountMarca();

}
