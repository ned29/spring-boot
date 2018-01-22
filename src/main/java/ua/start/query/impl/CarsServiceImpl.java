package ua.start.query.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.start.model.Car;
import ua.start.query.CarRepository;
import ua.start.query.CarService;
import ua.start.query.TypeRepository;

import java.util.List;

@Component
public class CarsServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Iterable<Car> findAll() {
        return carRepository.findAll();
    }

//    @Override
//    public List<Car> findByCar(String car) {
//        return carRepository.findByAttribute(car);
//    }
}