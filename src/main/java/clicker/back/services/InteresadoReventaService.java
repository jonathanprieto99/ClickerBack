package clicker.back.services;

import clicker.back.entities.FormRemax;
import clicker.back.entities.InteresadoReventa;

import java.util.List;

public interface InteresadoReventaService {

    InteresadoReventa save(InteresadoReventa interesadoReventa);

    void delete(InteresadoReventa interesadoReventa);

    InteresadoReventa getById(InteresadoReventa interesadoReventa);

    List<InteresadoReventa> getAll();
}
