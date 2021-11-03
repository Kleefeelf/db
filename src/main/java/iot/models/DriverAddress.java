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

public class DriverAddress {
    @Id
    @Column(name = "id_location")
    @NotNull
    private  Integer idLocation;

    @Column(name = "location_name", length = 45)
    @NotNull
    private String locationName;
}
