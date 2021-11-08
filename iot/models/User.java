package iot.models;

import java.util.List;
import lombok.*;
import javax.persistence.*;


@Entity
@Table(name= "user")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "login", length = 45, nullable = false)
    private String login;

    @Column(name = "phone", length = 15, nullable = false)
    private String phone;

    @OneToOne
    @JoinColumn(name = "security_id_security", nullable = false)
    private Security securityIdSecurity;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_card_id_credit_card", nullable = false)
    private List<CreditCard> creditCards;

    @OneToMany(fetch = FetchType.LAZY)
    private List<User> users;

    @Override
    public String toString() {
        return "User {"
                + "id =" + userId + ", "
                + "login =" + login + ", "
                + "phone = " + phone + ", "
                + "securityIdSecurity = " + securityIdSecurity + ", "
                + "creditCards = " + creditCards + ", "
                + "};" + "\n";
    }

}
