package ua.lviv.iot.mapper;

import ua.lviv.iot.DTO.UserDto;
import ua.lviv.iot.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends AbstractMapper<User, UserDto>{

    @Override
    public UserDto mapEntityToDto(User User) {
        if (User == null)
            return null;

        UserDto.UserDtoBuilder UserDtoBuilder = UserDto.builder();
        UserDtoBuilder.userId(User.getUserId());
        UserDtoBuilder.login(User.getLogin());
        UserDtoBuilder.phone(User.getPhone());

        return UserDtoBuilder.build();
    }
}
