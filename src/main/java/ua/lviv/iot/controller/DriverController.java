package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.DriverDto;
import ua.lviv.iot.domain.Driver;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.DriverMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.DriverService;


@RequestMapping(value = "/driver")
@RestController
@AllArgsConstructor
public class DriverController extends AbstractController<Driver, DriverDto, Integer> {
    private final DriverService DriverService;
    private final DriverMapper DriverMapper;

    @Override
    protected AbstractService<Driver, Integer> getService() {
        return DriverService;
    }

    @Override
    protected AbstractMapper<Driver, DriverDto> getMapper() {
        return DriverMapper;
    }
}

