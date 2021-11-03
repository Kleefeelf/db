package iot.controller.implementation;

import iot.dao.implementation.OrderDaoImpl;
import iot.models.Order;

public class OrderControllerImpl extends AbstractControllerImpl<Order, Integer>{
    public OrderControllerImpl() {
        super(new OrderDaoImpl());
    }
}
