package iot.controller.implementation;

import iot.dao.implementation.CarDaoImpl;
import iot.models.Car;

public class CarControllerImpl extends AbstractControllerImpl<Car, Integer> {
    public CarControllerImpl(){
        super(new CarDaoImpl());
    }
}