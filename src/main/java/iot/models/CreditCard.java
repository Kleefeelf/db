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

public class CreditCard {
    @Id
    @Column(name = "id_credit_card")
    @NotNull
    private Integer idCreditCard;

    @Column(name = "credit_card_number", length = 20)
    @NotNull
    private String creditCardNumber;

    @Column(name = "credit_card_cvc", length = 20)
    @NotNull
    private String creditCardCvc;
}
