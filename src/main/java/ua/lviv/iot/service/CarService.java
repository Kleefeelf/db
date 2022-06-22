package ua.lviv.iot.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Repository.CarRepository;
import ua.lviv.iot.domain.Car;

@AllArgsConstructor
@Service
public class CarService extends AbstractService<Car, Integer>{
    private final CarRepository carRepository;

    @Override
    protected JpaRepository<Car, Integer> getRepository() {
        return carRepository;
    }
}
