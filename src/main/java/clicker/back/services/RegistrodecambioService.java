package clicker.back.services;

import clicker.back.entities.OpcionesPrincipalesVenta;
import clicker.back.entities.Registrodecambio;

import java.util.List;

public interface RegistrodecambioService {

    Registrodecambio save(Registrodecambio registrodecambio);

    void delete(Registrodecambio registrodecambio);

    Registrodecambio getById(Registrodecambio registrodecambio);

    List<Registrodecambio> getAll();
}


