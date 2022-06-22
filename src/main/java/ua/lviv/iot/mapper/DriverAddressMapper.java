package ua.lviv.iot.mapper;

import ua.lviv.iot.DTO.DriverAddressDto;
import ua.lviv.iot.domain.DriverAddress;
import org.springframework.stereotype.Component;

@Component
public class DriverAddressMapper extends AbstractMapper<DriverAddress, DriverAddressDto>{

    @Override
    public DriverAddressDto mapEntityToDto(DriverAddress DriverAddress) {
        if (DriverAddress == null)
            return null;

        DriverAddressDto.DriverAddressDtoBuilder DriverAddressDtoBuilder = DriverAddressDto.builder();
        DriverAddressDtoBuilder.idLocation(DriverAddress.getIdLocation());
        DriverAddressDtoBuilder.locationName(DriverAddress.getLocationName());

        return DriverAddressDtoBuilder.build();
    }
}