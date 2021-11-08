package iot.controller.implementation;

import iot.dao.implementation.ManufacturerDaoImpl;
import iot.models.Manufacturer;

public class ManufacturerControllerImpl extends AbstractControllerImpl<Manufacturer>{
    public ManufacturerControllerImpl() {
        super(new ManufacturerDaoImpl());
    }
}

/*
    CAR             = "0";
    COST            = "1";
    CREDIT_CARD     = "2";
    DRIVER          = "3";
    DRIVER_ADDRESS  = "4";
    MANUFACTURER    = "5";
    ORDER           = "6";
    SECURITY        = "7";
    USER            = "8";
    GET_ALL         = "GA";
    GET_BY_ID       = "GI";
    UPDATE          = "U";
    CREATE          = "C";
    DELETE          = "D";
* */