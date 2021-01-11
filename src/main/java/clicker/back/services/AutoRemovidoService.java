package clicker.back.services;

import clicker.back.entities.Auto;
import clicker.back.entities.AutoRemovido;

import java.util.List;

public interface AutoRemovidoService {
    AutoRemovido save(AutoRemovido autoRemovido);

    void delete(AutoRemovido autoRemovido);

    AutoRemovido getById(AutoRemovido autoRemovido);

    List<AutoRemovido> getAll();
}
