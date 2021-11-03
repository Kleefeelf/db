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

public class Security {
    @Id
    @Column(name = "id_security")
    @NotNull
    private Integer idSecurity;

    @Column(name = "password", length = 45)
    @NotNull
    private String name;
}
