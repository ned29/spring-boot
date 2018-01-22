package ua.start.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.start.model.Car;
import ua.start.service.repository.CarRepository;
import ua.start.service.CarService;

import java.util.List;

@Component
public class CarsServiceImpl implements CarService{

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
