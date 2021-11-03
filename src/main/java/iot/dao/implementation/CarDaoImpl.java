package iot.dao.implementation;

import iot.models.Car;

public class CarDaoImpl extends AbstractDaoImpl<Car, Integer> {
    public CarDaoImpl() {
        super(Car.class);
    }
}
