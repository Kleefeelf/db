package iot.controller.implementation;

import iot.dao.implementation.DriverDaoImpl;
import iot.models.Driver;

public class DriverControllerImpl extends AbstractControllerImpl<Driver>{
    public DriverControllerImpl() {
        super(new DriverDaoImpl());
    }
}
