package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.SecurityDto;
import ua.lviv.iot.domain.Security;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.SecurityMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.SecurityService;


@RequestMapping(value = "/security")
@RestController
@AllArgsConstructor
public class SecurityController extends AbstractController<Security, SecurityDto, Integer> {
    private final SecurityService SecurityService;
    private final SecurityMapper SecurityMapper;

    @Override
    protected AbstractService<Security, Integer> getService() {
        return SecurityService;
    }

    @Override
    protected AbstractMapper<Security, SecurityDto> getMapper() {
        return SecurityMapper;
    }
}


