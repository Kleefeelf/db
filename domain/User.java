package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name= "user")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "login", length = 45, nullable = false)
    private String login;

    @Column(name = "phone", length = 15, nullable = false)
    private String phone;

    @OneToOne
    @JoinColumn(name = "security_id_security", nullable = false)
    private Security securityIdSecurity;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<CreditCard> creditCards;

    public User(Integer userId, String login, String phone) {
        this.userId = userId;
        this.login = login;
        this.phone = phone;

    }

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
