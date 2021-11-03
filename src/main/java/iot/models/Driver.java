package iot.models;

import lombok.*;

import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Table(name= "cost")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Driver {
    @Id
    @Column(name = "id_driver")
    @NotNull
    private Integer idDriver;

    @Column(name = "first_name", length = 20)
    @NotNull
    private String firstName;

    @Column(name = "last_name", length=20)
    @NotNull
    private String lastName;

    @Column(name = "phone_number", length = 15)
    @NotNull
    private String phoneNumber;

    @Column(name = "rating")
    @NotNull
    private Integer rating;

    @Column(name = "driver_address_id_location")
    @NotNull
    private Integer driverAddressIdLocation;
}
