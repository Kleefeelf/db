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

public class User {
    @Id
    @Column(name = "user_id")
    @NotNull
    private Integer userId;

    @Column(name = "login", length = 45)
    @NotNull
    private String login;

    @Column(name = "phone", length = 15)
    @NotNull
    private String phone;

    @Column(name = "credit_card_id_credit_card")
    @NotNull
    private Integer creditCardIdCreditCard;

    @Column(name = "security_id_security")
    @NotNull
    private Integer securityIdSecurity;
}
