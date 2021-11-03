package iot.dao.implementation;

import iot.models.User;

public class UserDaoImpl extends AbstractDaoImpl<User, Integer>{
    public UserDaoImpl() {
        super(User.class);
    }
}
