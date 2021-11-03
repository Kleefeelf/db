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

public class Manufacturer {
    @Id
    @Column(name = "id_country")
    @NotNull
    private Integer idCountry;

    @Column(name = "country_name", length = 45)
    @NotNull
    private String countryName;
}
