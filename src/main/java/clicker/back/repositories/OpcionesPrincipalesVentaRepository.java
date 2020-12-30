package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.OpcionesPrincipalesVenta;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OpcionesPrincipalesVentaRepository extends PagingAndSortingRepository<OpcionesPrincipalesVenta,Long> {
}
