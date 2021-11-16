package iot.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "manufacturer")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_country")
    private Integer idCountry;

    @Column(name = "country_name", length = 45, nullable = false)
    private String countryName;

    public Manufacturer(Integer idCountry, String countryName)  {
        this.idCountry = idCountry;
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Manufacturer {"
                + "id =" + idCountry + ", "
                + "countryName =" + countryName + ", "
                + "};" + "\n";
    }
}
