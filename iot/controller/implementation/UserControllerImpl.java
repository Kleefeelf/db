package iot.controller.implementation;

import iot.dao.implementation.UserDaoImpl;
import iot.models.User;

public class UserControllerImpl extends AbstractControllerImpl<User>{
    public UserControllerImpl() {
        super(new UserDaoImpl());
    }
}
