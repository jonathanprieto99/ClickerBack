package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.EmpresasTaxi;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmpresasTaxiRepository extends PagingAndSortingRepository<EmpresasTaxi,Long> {
}
