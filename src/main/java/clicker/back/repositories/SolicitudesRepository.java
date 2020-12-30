package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.Solicitudes;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SolicitudesRepository extends PagingAndSortingRepository<Solicitudes,Long> {
}
