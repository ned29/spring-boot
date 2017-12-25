package ua.start.query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.start.model.Car;

import java.util.List;

public interface CarService {

    Car save(Car car);

    Iterable<Car> findAll();

   // List<Car> findByCar(String carName);
}
