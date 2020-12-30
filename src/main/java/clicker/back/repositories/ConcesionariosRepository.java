package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ConcesionariosRepository extends PagingAndSortingRepository<Concesionarios,String> {
}
