package ua.lviv.iot.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditCardDto {
    private Integer idCreditCard;
    private String creditCardNumber;
    private String creditCardCvc;
}
