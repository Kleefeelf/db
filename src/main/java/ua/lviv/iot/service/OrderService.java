package ua.lviv.iot.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Repository.OrderRepository;
import ua.lviv.iot.domain.Order;

@AllArgsConstructor
@Service
public class OrderService extends AbstractService<Order, Integer>{
    private final OrderRepository OrderRepository;

    @Override
    protected JpaRepository<Order, Integer> getRepository() {
        return OrderRepository;
    }
}

