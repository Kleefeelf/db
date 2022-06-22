package ua.lviv.iot.domain;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "credit_card")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_credit_card")
    private Integer idCreditCard;

    @Column(name = "credit_card_number", length = 20, nullable = false)
    private String creditCardNumber;

    @Column(name = "credit_card_cvc", length = 20, nullable = false)
    private String creditCardCvc;


    @Override
    public String toString() {
        return "CreditCard {"
                + "id =" + idCreditCard + ", "
                + "number =" + creditCardNumber + ", "
                + "cvc code = " + creditCardCvc + ", "
                + "};" + "\n";
    }
}
