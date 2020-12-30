package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.TiempoCompra;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TiempoCompraRepository extends PagingAndSortingRepository<TiempoCompra,Long> {
}
