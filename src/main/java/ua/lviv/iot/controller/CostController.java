package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.CostDto;
import ua.lviv.iot.domain.Cost;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.CostMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.CostService;


@RequestMapping(value = "/cost")
@RestController
@AllArgsConstructor
public class CostController extends AbstractController<Cost, CostDto, Integer> {
    private final CostService CostService;
    private final CostMapper CostMapper;

    @Override
    protected AbstractService<Cost, Integer> getService() {
        return CostService;
    }

    @Override
    protected AbstractMapper<Cost, CostDto> getMapper() {
        return CostMapper;
    }
}

