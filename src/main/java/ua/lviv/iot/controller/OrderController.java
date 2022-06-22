package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.OrderDto;
import ua.lviv.iot.domain.Order;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.OrderMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.OrderService;


@RequestMapping(value = "/order")
@RestController
@AllArgsConstructor
public class OrderController extends AbstractController<Order, OrderDto, Integer> {
    private final OrderService OrderService;
    private final OrderMapper OrderMapper;

    @Override
    protected AbstractService<Order, Integer> getService() {
        return OrderService;
    }

    @Override
    protected AbstractMapper<Order, OrderDto> getMapper() {
        return OrderMapper;
    }
}


