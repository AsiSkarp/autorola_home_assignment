package com.autorola.service;

import com.autorola.dto.CarDTO;
import com.autorola.model.Car;
import com.autorola.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private final ICarRepository carRepository;

    @Autowired
    public CarService(ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<CarDTO> getAllCars() {
        return carRepository.getAllCars().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public CarDTO getCarByVin(String vin) {
        return convertToDTO(carRepository.getCarByVin(vin));
    }

    public CarDTO save(CarDTO carDTO) {
        Car car = convertToEntity(carDTO);
        Car savedCar = carRepository.save(car);
        return convertToDTO(savedCar);
    }

    public void deleteCarByVin(String vin) {
        carRepository.deleteCarByVin(vin);
    }

    private CarDTO convertToDTO(Car car) {
        CarDTO carDTO = new CarDTO(
                car.getVin(),
                car.getMake(),
                car.getModel(),
                car.getFirstRegistration(),
                car.getMileage(),
                car.getColor(),
                car.getTransmission()
        );
        carDTO.setDBEntryTime(car.getDBEntryTime());
        return carDTO;
    }

    private Car convertToEntity(CarDTO carDTO) {
        return new Car(
                carDTO.getVin(),
                carDTO.getMake(),
                carDTO.getModel(),
                carDTO.getFirstRegistration(),
                carDTO.getMileage(),
                carDTO.getColor(),
                carDTO.getTransmission(),
                LocalDateTime.now()
        );
    }
}