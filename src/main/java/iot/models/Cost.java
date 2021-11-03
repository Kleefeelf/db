package iot.models;

import lombok.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Table(name= "cost")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Cost {
    @Id
    @Column(name="id_cost")
    @NotNull
    private Integer idCost;

    @Column(name="order_cost")
    @NotNull
    private Integer orderCost;

    @Column(name="order_currency", length = 20)
    @NotNull
    private String orderCurrency;
}
