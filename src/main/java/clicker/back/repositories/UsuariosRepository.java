package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.Usuarios;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsuariosRepository extends PagingAndSortingRepository<Usuarios,Long> {
}
