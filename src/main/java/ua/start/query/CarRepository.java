package ua.start.query;

import org.springframework.stereotype.Repository;
import ua.start.model.Car;

@Repository
public interface CarRepository extends TypeRepository<Car> {
}
