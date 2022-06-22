package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.DriverAddressDto;
import ua.lviv.iot.domain.DriverAddress;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.DriverAddressMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.DriverAddressService;


@RequestMapping(value = "/driver_addresss")
@RestController
@AllArgsConstructor
public class DriverAddressController extends AbstractController<DriverAddress, DriverAddressDto, Integer> {
    private final DriverAddressService DriverAddressService;
    private final DriverAddressMapper DriverAddressMapper;

    @Override
    protected AbstractService<DriverAddress, Integer> getService() {
        return DriverAddressService;
    }

    @Override
    protected AbstractMapper<DriverAddress, DriverAddressDto> getMapper() {
        return DriverAddressMapper;
    }
}

