package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.UserDto;
import ua.lviv.iot.domain.User;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.UserMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.UserService;


@RequestMapping(value = "/user")
@RestController
@AllArgsConstructor
public class UserController extends AbstractController<User, UserDto, Integer> {
    private final UserService UserService;
    private final UserMapper UserMapper;

    @Override
    protected AbstractService<User, Integer> getService() {
        return UserService;
    }

    @Override
    protected AbstractMapper<User, UserDto> getMapper() {
        return UserMapper;
    }
}


