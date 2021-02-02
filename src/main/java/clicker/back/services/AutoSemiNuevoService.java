package clicker.back.services;

import clicker.back.entities.Auto;
import clicker.back.entities.AutoSemiNuevo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AutoSemiNuevoService {

    AutoSemiNuevo save(AutoSemiNuevo autoSemiNuevo);

    void delete(AutoSemiNuevo autoSemiNuevo);

    AutoSemiNuevo getById(Long id );

    List<AutoSemiNuevo> getAll();

    List<AutoSemiNuevo> getAllEnabled(Boolean enabled,Boolean validado,Boolean comprado, Pageable pageable);

    Long getPages(Boolean enabled, Boolean validado, Boolean comprado);

    List<AutoSemiNuevo> getAllEnabled(Boolean enabled,Boolean validado,Boolean comprado);

    List<AutoSemiNuevo> getAllFromIdList(List<Long> ids);
}
