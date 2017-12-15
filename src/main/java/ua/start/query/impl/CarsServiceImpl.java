package ua.start.query.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.start.model.Car;
import ua.start.query.CarRepository;

import java.util.List;

@Service
@Transactional
public class CarsServiceImpl {

    @Autowired
    private CarRepository carRepository;

    public Car save(Car car) {
        carRepository.save(car);
        return car;
    }

    public Iterable<Car> findAll() {
        return carRepository.findAll();
    }

    public List<Car> findByCar(String car) {
        return carRepository.findByCar(car);
    }
}
