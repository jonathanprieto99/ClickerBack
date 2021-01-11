package clicker.back.services.impl;

import clicker.back.entities.AutoSemiNuevo;
import clicker.back.repositories.AutoSemiNuevoRepository;
import clicker.back.services.AutoSemiNuevoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefaultAutoSemiNuevoService implements AutoSemiNuevoService {
    @Autowired
    AutoSemiNuevoRepository autoSemiNuevoRepository;

    @Override
    public AutoSemiNuevo save(AutoSemiNuevo autoSemiNuevo) {
        return null;
    }

    @Override
    public void delete(AutoSemiNuevo autoSemiNuevo) {

    }

    @Override
    public AutoSemiNuevo getById(AutoSemiNuevo a) {
        return null;
    }

    @Override
    public List<AutoSemiNuevo> getAll() {
        return null;
    }
}
