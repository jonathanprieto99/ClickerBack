package clicker.back.repositories;

import clicker.back.entities.Auto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AutoRepository extends PagingAndSortingRepository<Auto,Long> {

    @Query(value = "select count(DISTINCT marca) from auto",nativeQuery = true)
    Long getmarcas();
}
