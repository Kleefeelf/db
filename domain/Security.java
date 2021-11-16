package iot.models;

import lombok.*;
import javax.persistence.*;


@Entity
@Table(name= "security")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_security")
    private Integer idSecurity;

    @Column(name = "password", length = 45, nullable = false)
    private String name;

    public Security(Integer idSecurity, String name) {
        this.idSecurity = idSecurity;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Security {"
                + "id =" + idSecurity + ", "
                + "name =" + name + ", "
                + "};" + "\n";
    }
}
