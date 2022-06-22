package ua.lviv.iot.mapper;

import ua.lviv.iot.DTO.CreditCardDto;
import ua.lviv.iot.domain.CreditCard;
import org.springframework.stereotype.Component;

@Component
public class CreditCardMapper extends AbstractMapper<CreditCard, CreditCardDto>{

    @Override
    public CreditCardDto mapEntityToDto(CreditCard CreditCard) {
        if (CreditCard == null)
            return null;

        CreditCardDto.CreditCardDtoBuilder CreditCardDtoBuilder = CreditCardDto.builder();
        CreditCardDtoBuilder.idCreditCard(CreditCard.getIdCreditCard());
        CreditCardDtoBuilder.creditCardNumber(CreditCard.getCreditCardNumber());
        CreditCardDtoBuilder.creditCardCvc(CreditCard.getCreditCardCvc());

        return CreditCardDtoBuilder.build();
    }
}
