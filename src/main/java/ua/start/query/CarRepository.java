package ua.start.query;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.start.model.Car;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    @Query("FROM Car where car like %?1% ")
    List<Car> findByCar(String car);
}
