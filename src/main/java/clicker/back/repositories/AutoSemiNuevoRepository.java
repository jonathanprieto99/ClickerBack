package clicker.back.repositories;

import clicker.back.entities.AutoSemiNuevo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AutoSemiNuevoRepository extends PagingAndSortingRepository<AutoSemiNuevo,Long> {

    Page<AutoSemiNuevo> findAllByEnabledAndValidadoAndComprado(Boolean enabled,Boolean validado,Boolean comprado, Pageable pageable);
}
