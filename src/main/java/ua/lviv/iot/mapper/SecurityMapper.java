package ua.lviv.iot.mapper;

import ua.lviv.iot.DTO.SecurityDto;
import ua.lviv.iot.domain.Security;
import org.springframework.stereotype.Component;

@Component
public class SecurityMapper extends AbstractMapper<Security, SecurityDto>{

    @Override
    public SecurityDto mapEntityToDto(Security Security) {
        if (Security == null)
            return null;

        SecurityDto.SecurityDtoBuilder SecurityDtoBuilder = SecurityDto.builder();
        SecurityDtoBuilder.idSecurity(Security.getIdSecurity());
        SecurityDtoBuilder.password(Security.getPassword());

        return SecurityDtoBuilder.build();
    }
}
