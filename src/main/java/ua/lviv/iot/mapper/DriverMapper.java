package ua.lviv.iot.mapper;

import ua.lviv.iot.DTO.DriverDto;
import ua.lviv.iot.domain.Driver;
import org.springframework.stereotype.Component;

@Component
public class DriverMapper extends AbstractMapper<Driver, DriverDto>{

    @Override
    public DriverDto mapEntityToDto(Driver Driver) {
        if (Driver == null)
            return null;

        DriverDto.DriverDtoBuilder DriverDtoBuilder = DriverDto.builder();
        DriverDtoBuilder.idDriver(Driver.getIdDriver());
        DriverDtoBuilder.firstName(Driver.getFirstName());
        DriverDtoBuilder.lastName(Driver.getLastName());
        DriverDtoBuilder.phoneNumber(Driver.getPhoneNumber());
        DriverDtoBuilder.rating(Driver.getRating());

        return DriverDtoBuilder.build();
    }
}