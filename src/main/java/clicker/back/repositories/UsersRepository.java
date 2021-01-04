package clicker.back.repositories;

import clicker.back.entities.Users;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsersRepository extends PagingAndSortingRepository<Users,Long> {
}
