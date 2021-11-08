package iot.models;

import java.util.List;
import lombok.*;
import javax.persistence.*;


@Entity
@Table(name= "driver")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Driver {
    @Id
    @Column(name = "id_driver")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDriver;

    @Column(name = "first_name", length = 20, nullable = false)
    private String firstName;

    @Column(name = "last_name", length=20, nullable = false)
    private String lastName;

    @Column(name = "phone_number", length = 15, nullable = false)
    private String phoneNumber;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    @OneToOne
    @JoinColumn(name = "driver_address_id_location", nullable = false)
    private DriverAddress driverAddressIdLocation;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Driver> drivers;

    @Override
    public String toString() {
        return "Driver {"
                + "id =" + idDriver + ", "
                + "firstName =" + firstName + ", "
                + "lastName = " + lastName + ", "
                + "phoneNumber = " + phoneNumber + ", "
                + "rating = " + rating + ", "
                + "driverAddressIdLocation = " + driverAddressIdLocation + ", "
                + "};" + "\n";
    }
}
