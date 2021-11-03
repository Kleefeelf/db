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

public class Order {
    @Id
    @Column(name = "id_order")
    @NotNull
    private Integer idOrder;

    @Column(name = "user_userID")
    @NotNull
    private Integer userUserID;

    @Column(name = "cost_id_cost")
    @NotNull
    private Integer costIdCost;

    @Column(name = "user_user_id")
    @NotNull
    private Integer userUserId;

    @Column(name = "driver_id_driver")
    @NotNull
    private Integer driverIdDriver;
}
