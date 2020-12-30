package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.VisitasConcesionario;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VisitasConcesionarioRepository extends PagingAndSortingRepository<VisitasConcesionario,Long> {
}
