package com.directi.training.srp.exercise;

public class CarComparator {
    private final CarDatabase _carsDb;

    public CarComparator(CarDatabase cardb) {
        _carsDb = cardb;
    }

    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : _carsDb.getCars()) {
            if (bestCar == null || car.getModel()
            .compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}

