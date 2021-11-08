package iot.controller.implementation;

import iot.dao.implementation.DriverAddressDaoImpl;
import iot.models.DriverAddress;

public class DriverAddressControllerImpl extends AbstractControllerImpl<DriverAddress>{
    public DriverAddressControllerImpl() {
        super(new DriverAddressDaoImpl());
    }
}
