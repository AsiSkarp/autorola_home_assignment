package com.autorola.repository;

import com.autorola.model.Car;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository implements ICarRepository {

    List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getAllCars() {
        return this.cars;
    }

    @Override
    public Car getCarByVin(String vin) {
        return cars.stream().filter(car -> car.getVin().equals(vin)).findFirst().orElse(null);
    }

    @Override
    public Car save(Car car) {
        cars.add(car);
        return car;
    }

    @Override
    public void deleteCarByVin(String vin) {
        cars.removeIf(car -> car.getVin().equals(vin));
    }

    @Override
    public void updateCar(Car updateCar) {
        Car oldCar  = cars.stream().filter(car -> car.getVin().equals(updateCar.getVin())).findFirst().orElse(null);
        cars.set(cars.indexOf(oldCar), updateCar);
    }
}