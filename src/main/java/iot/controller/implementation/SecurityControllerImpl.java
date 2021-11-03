package iot.controller.implementation;

import iot.dao.implementation.SecurityDaoImpl;
import iot.models.Security;

public class SecurityControllerImpl extends AbstractControllerImpl<Security, Integer>{
    public SecurityControllerImpl() {
        super(new SecurityDaoImpl());
    }
}
