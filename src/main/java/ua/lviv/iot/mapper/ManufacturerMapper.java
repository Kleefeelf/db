package ua.lviv.iot.mapper;

import ua.lviv.iot.DTO.ManufacturerDto;
import ua.lviv.iot.domain.Manufacturer;
import org.springframework.stereotype.Component;

@Component
public class ManufacturerMapper extends AbstractMapper<Manufacturer, ManufacturerDto>{

    @Override
    public ManufacturerDto mapEntityToDto(Manufacturer Manufacturer) {
        if (Manufacturer == null)
            return null;

        ManufacturerDto.ManufacturerDtoBuilder ManufacturerDtoBuilder = ManufacturerDto.builder();
        ManufacturerDtoBuilder.idCountry(Manufacturer.getIdCountry());
        ManufacturerDtoBuilder.countryName(Manufacturer.getCountryName());

        return ManufacturerDtoBuilder.build();
    }
}
