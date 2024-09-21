package com.autorola.dto;

import java.time.LocalDateTime;

public class CarDTO {
    private String vin;
    private String make;
    private String model;
    private LocalDateTime firstRegistration;
    private String mileage;
    private String color;
    private String transmission;
    private LocalDateTime DBEntryTime;

    public CarDTO(String vin, String make, String model, LocalDateTime firstRegistration, String mileage, String color, String transmission) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.firstRegistration = firstRegistration;
        this.mileage = mileage;
        this.color = color;
        this.transmission = transmission;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getFirstRegistration() {
        return firstRegistration;
    }

    public void setFirstRegistration(LocalDateTime firstRegistration) {
        this.firstRegistration = firstRegistration;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public LocalDateTime getDBEntryTime() {
        return DBEntryTime;
    }

    public void setDBEntryTime(LocalDateTime DBEntryTime) {
        this.DBEntryTime = DBEntryTime;
    }
}