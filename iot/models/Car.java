package iot.models;

import iot.models.annotations.NotInputtable;
import lombok.*;

import javax.persistence.*;


@Entity
@Table(name= "car")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private Integer idCar;

    @Column(name = "category", length = 20, nullable = false)
    private String category;

    @Column(name = "number", length = 8, nullable = false)
    private String number;

    @Column(name = "availability", nullable = false)
    private Boolean availability;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id_country", nullable = false, referencedColumnName = "id_country")
    private Manufacturer manufacturerIdCountry;

    @ManyToOne
    @JoinColumn(name = "driver_id_driver", nullable = false, referencedColumnName = "id_driver")
    private Driver  driverIdDriver;

    @Override
    public String toString() {
        return "Car {"
                + "id =" + idCar + ", "
                + "category =" + category + ", "
                + "number = " + number + ", "
                + "availability = " + availability + ", "
                + "manufacturerIdCountry = " + manufacturerIdCountry + ", "
                + "driverIdDriver = " + driverIdDriver + ", "
                + "};" + "\n";
    }
}
