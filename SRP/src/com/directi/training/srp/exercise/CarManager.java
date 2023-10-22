package com.directi.training.srp.exercise;


public class CarManager
{
    private final CarLister _carsLs;
    private final CarComparator _carscmp;
    public CarManager(CarLister carls, CarComparator carcmp){
        _carsLs=carls;
        _carscmp=carcmp;
    }
    public String getCarsNames()
    {
        return _carsLs.getCarNames();
    }

    public Car getBestCar(){
        return _carscmp.getBestCar();
    }
}
