package com.directi.training.srp.exercise;

public class CarLister {
    private final CarDatabase _carsDb;

    public CarLister(CarDatabase cardb) {
        _carsDb = cardb;
    }

    public String getCarNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb.getCars()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
