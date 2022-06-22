package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CostDto {
    private Integer idCost;
    private Integer orderCost;
    private String orderCurrency;
}
// references chain
// hibernate 4-5 lab hibernate entity lifecycle все про сешини персістенс