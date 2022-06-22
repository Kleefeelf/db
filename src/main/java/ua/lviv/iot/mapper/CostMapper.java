package ua.lviv.iot.mapper;

import ua.lviv.iot.DTO.CostDto;
import ua.lviv.iot.domain.Cost;
import org.springframework.stereotype.Component;

@Component
public class CostMapper extends AbstractMapper<Cost, CostDto>{

    @Override
    public CostDto mapEntityToDto(Cost Cost) {
        if (Cost == null)
            return null;

        CostDto.CostDtoBuilder CostDtoBuilder = CostDto.builder();
        CostDtoBuilder.idCost(Cost.getIdCost());
        CostDtoBuilder.orderCost(Cost.getOrderCost());
        CostDtoBuilder.orderCurrency(Cost.getOrderCurrency());

        return CostDtoBuilder.build();
    }
}