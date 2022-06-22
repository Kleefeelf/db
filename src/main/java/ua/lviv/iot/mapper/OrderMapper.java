package ua.lviv.iot.mapper;

import ua.lviv.iot.DTO.OrderDto;
import ua.lviv.iot.domain.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper extends AbstractMapper<Order, OrderDto>{

    @Override
    public OrderDto mapEntityToDto(Order Order) {
        if (Order == null)
            return null;

        OrderDto.OrderDtoBuilder OrderDtoBuilder = OrderDto.builder();
        OrderDtoBuilder.idOrder(Order.getIdOrder());

        return OrderDtoBuilder.build();
    }
}
