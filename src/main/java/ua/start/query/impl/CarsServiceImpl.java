package ua.start.query.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.start.model.Car;
import ua.start.query.CarService;
import ua.start.query.TypeRepository;

import java.util.List;

@Service
@Transactional
public class CarsServiceImpl{// implements CarService {

    @Autowired
    private TypeRepository<Car> carRepository;

   // @Override
    public Car save(Car car) {
         carRepository.save(car);
         return car;
    }

  //  @Override
    public Iterable<Car> findAll() {
        return carRepository.findAll();
    }

//    @Override
//    public List<Car> findByCar(String car) {
//        return carRepository.findByAttribute(car);
//    }
}