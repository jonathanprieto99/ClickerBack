package clicker.back.repositories;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User,Long> {
}
