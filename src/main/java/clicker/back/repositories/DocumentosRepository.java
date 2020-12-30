package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.Documentos;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DocumentosRepository extends PagingAndSortingRepository<Documentos,String> {
}
