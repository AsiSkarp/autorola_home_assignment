package com.autorola.repository;

import com.autorola.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICarRepository {
    List<Car> getAllCars();
    Car getCarByVin(String vin);
    Car save(Car car);
    void deleteCarByVin(String vin);
    void updateCar(Car car);
}