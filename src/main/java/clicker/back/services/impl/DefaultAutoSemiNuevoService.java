package clicker.back.services.impl;

import clicker.back.entities.AutoSemiNuevo;
import clicker.back.repositories.AutoSemiNuevoRepository;
import clicker.back.services.AutoSemiNuevoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefaultAutoSemiNuevoService implements AutoSemiNuevoService {
    @Autowired
    AutoSemiNuevoRepository autoSemiNuevoRepository;

    @Override
    public AutoSemiNuevo save(AutoSemiNuevo autoSemiNuevo) {
        return autoSemiNuevoRepository.save(autoSemiNuevo);
    }

    @Override
    public void delete(AutoSemiNuevo autoSemiNuevo) {

    }

    @Override
    public AutoSemiNuevo getById(Long id) {
        return autoSemiNuevoRepository.findById(id).orElse(null);
    }

    @Override
    public List<AutoSemiNuevo> getAll() {
        return null;
    }

    @Override
    public List<AutoSemiNuevo> getAllEnabled(Boolean enabled, Boolean comprado, Boolean validado, Pageable pageable) {
        return autoSemiNuevoRepository.findAllByEnabledAndValidadoAndComprado(enabled,comprado,validado,pageable).getContent();
    }

    @Override
    public Long getPages(Boolean enabled, Boolean validado, Boolean comprado) {
        return autoSemiNuevoRepository.countAllByEnabledAndValidadoAndComprado(enabled,validado,comprado);
    }


}
