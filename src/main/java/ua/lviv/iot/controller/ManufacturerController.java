package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.ManufacturerDto;
import ua.lviv.iot.domain.Manufacturer;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.ManufacturerMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.ManufacturerService;


@RequestMapping(value = "/manufacturer")
@RestController
@AllArgsConstructor
public class ManufacturerController extends AbstractController<Manufacturer, ManufacturerDto, Integer> {
    private final ManufacturerService ManufacturerService;
    private final ManufacturerMapper ManufacturerMapper;

    @Override
    protected AbstractService<Manufacturer, Integer> getService() {
        return ManufacturerService;
    }

    @Override
    protected AbstractMapper<Manufacturer, ManufacturerDto> getMapper() {
        return ManufacturerMapper;
    }
}


