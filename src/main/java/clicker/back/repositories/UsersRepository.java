package clicker.back.repositories;

import clicker.back.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsersRepository extends PagingAndSortingRepository<User,Long> {
}
