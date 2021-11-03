package iot.controller.implementation;

import iot.dao.implementation.CostDaoImpl;
import iot.models.Cost;

public class CostControllerImpl extends AbstractControllerImpl<Cost, Integer>{
    public CostControllerImpl() {
        super(new CostDaoImpl());
    }
}
