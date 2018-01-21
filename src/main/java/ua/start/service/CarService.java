package ua.start.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.start.model.Car;

import java.util.List;

@Service
@Transactional
public interface CarService {

    Car save(Car car);

    Iterable<Car> findAll();

    List<Car> findByCar(String car);
}
