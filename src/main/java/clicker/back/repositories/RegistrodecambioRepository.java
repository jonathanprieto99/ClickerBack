package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.Registrodecambio;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RegistrodecambioRepository extends PagingAndSortingRepository<Registrodecambio,Long> {
}
