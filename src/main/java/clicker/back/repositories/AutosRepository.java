package clicker.back.repositories;

import clicker.back.entities.Autos;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AutosRepository extends PagingAndSortingRepository<Autos,String> {
}
