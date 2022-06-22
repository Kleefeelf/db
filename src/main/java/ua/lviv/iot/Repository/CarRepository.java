package ua.lviv.iot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{
}
