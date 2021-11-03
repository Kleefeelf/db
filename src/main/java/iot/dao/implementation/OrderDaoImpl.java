package iot.dao.implementation;

import iot.models.Order;

public class OrderDaoImpl extends AbstractDaoImpl<Order, Integer>{
    public OrderDaoImpl() {
        super(Order.class);
    }
}
