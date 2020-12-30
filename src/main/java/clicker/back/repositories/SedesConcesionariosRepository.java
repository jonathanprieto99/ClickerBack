package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.SedesConcesionarios;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SedesConcesionariosRepository extends PagingAndSortingRepository<SedesConcesionarios,Long> {
}
