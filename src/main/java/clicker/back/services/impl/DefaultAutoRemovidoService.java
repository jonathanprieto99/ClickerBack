package clicker.back.services.impl;

import clicker.back.entities.Auto;
import clicker.back.entities.AutoRemovido;
import clicker.back.repositories.AutoRemovidoRepository;
import clicker.back.services.AutoRemovidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefaultAutoRemovidoService implements AutoRemovidoService {
    @Autowired
    AutoRemovidoRepository autoRemovidoRepository;


    @Override
    public AutoRemovido save(AutoRemovido autoRemovido) {
        return autoRemovidoRepository.save(autoRemovido);
    }

    @Override
    public void delete(AutoRemovido autoRemovido) {
        autoRemovidoRepository.delete(autoRemovido);
    }

    @Override
    public AutoRemovido getById(AutoRemovido autoRemovido) {
        return autoRemovidoRepository.findById(autoRemovido.getId()).orElse(null);
    }

    @Override
    public List<AutoRemovido> getAll() {
        return (List<AutoRemovido>) autoRemovidoRepository.findAll();
    }
}
