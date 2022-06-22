package ua.lviv.iot.mapper;

import org.springframework.stereotype.Component;
import ua.lviv.iot.DTO.CarDto;
import ua.lviv.iot.domain.Car;

@Component
public class CarMapper extends AbstractMapper<Car, CarDto>{

    @Override
    public CarDto mapEntityToDto(Car car) {
        if (car == null)
            return null;

        CarDto.CarDtoBuilder carDtoBuilder = CarDto.builder();
        carDtoBuilder.idCar(car.getIdCar());
        carDtoBuilder.name(car.getName());
        carDtoBuilder.category(car.getCategory());
        carDtoBuilder.number(car.getNumber());
        carDtoBuilder.availability(car.getAvailability());

        return carDtoBuilder.build();
    }
}
