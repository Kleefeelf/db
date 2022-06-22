package ua.lviv.iot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
}
