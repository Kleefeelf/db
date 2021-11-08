package iot.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name= "manufacturer")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Manufacturer {
    @Id
    @Column(name = "id_country")
    private Integer idCountry;

    @Column(name = "country_name", length = 45, nullable = false)
    private String countryName;

    @Override
    public String toString() {
        return "Manufacturer {"
                + "id =" + idCountry + ", "
                + "countryName =" + countryName + ", "
                + "};" + "\n";
    }
}
