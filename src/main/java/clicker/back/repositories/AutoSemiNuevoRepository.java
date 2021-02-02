package clicker.back.repositories;

import clicker.back.entities.AutoSemiNuevo;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface AutoSemiNuevoRepository extends PagingAndSortingRepository<AutoSemiNuevo,Long> {

    Page<AutoSemiNuevo> findAllByEnabledAndValidadoAndComprado(Boolean enabled,Boolean validado,Boolean comprado, Pageable pageable);

    Long countAllByEnabledAndValidadoAndComprado(Boolean enabled,Boolean validado,Boolean comprado);

    List<AutoSemiNuevo> findAllByEnabledAndValidadoAndComprado(Boolean enabled, Boolean validado, Boolean comprado);

}
