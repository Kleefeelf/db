package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.CarDto;
import ua.lviv.iot.domain.Car;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.CarMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.CarService;


@RequestMapping(value = "/cars")
@RestController
@AllArgsConstructor
public class CarController extends AbstractController<Car, CarDto, Integer> {
    private final CarService carService;
    private final CarMapper carMapper;

    @Override
    protected AbstractService<Car, Integer> getService() {
        return carService;
    }

    @Override
    protected AbstractMapper<Car, CarDto> getMapper() {
        return carMapper;
    }
}
