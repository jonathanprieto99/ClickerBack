package clicker.back.services;

import clicker.back.Antiguo.Registrodecambio;

import java.util.List;

public interface RegistrodecambioService {

    Registrodecambio save(Registrodecambio registrodecambio);

    void delete(Registrodecambio registrodecambio);

    Registrodecambio getById(Registrodecambio registrodecambio);

    List<Registrodecambio> getAll();
}


