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

public class Car {
    @Id
    @Column(name = "id_car")
    @NotNull
    private Integer idCar;

    @Column(name = "category", length = 20)
    @NotNull
    private String category;

    @Column(name = "number", length = 8)
    @NotNull
    private String number;

    @Column(name = "availability")
    @NotNull
    private Boolean availability;

    @Column(name = "manufacturer_id_country")
    @NotNull
    private Integer manufacturerIdCountry;

    @Column(name = "driver_id_driver")
    @NotNull
    private Integer driverIdDriver;

}
