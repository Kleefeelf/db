package iot.models;

import iot.models.annotations.NotInputtable;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "driver_address")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DriverAddress {
    @Id
    @Column(name = "id_location")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idLocation;

    @Column(name = "location_name", length = 45, nullable = false)
    private String locationName;

    @Override
    public String toString() {
        return "DriverAddress {"
                + "id =" + idLocation + ", "
                + "locationName =" + locationName + ", "
                + "};" + "\n";
    }
}
