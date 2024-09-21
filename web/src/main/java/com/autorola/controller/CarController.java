package com.autorola.controller;

import com.autorola.dto.CarDTO;
import com.autorola.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<CarDTO> getCars() {
        return carService.getAllCars();
    }

    @PostMapping
    public CarDTO save(@RequestBody CarDTO carDTO) {
        return carService.save(carDTO);
    }

    @GetMapping("/{vin}")
    public CarDTO getCarByVin(@PathVariable String vin) {
        System.out.println("This routing works!");
        return carService.getCarByVin(vin);
    }

    @DeleteMapping("/{vin}")
    public void deleteCarByVin(@PathVariable String vin) {
        carService.deleteCarByVin(vin);
    }
}
