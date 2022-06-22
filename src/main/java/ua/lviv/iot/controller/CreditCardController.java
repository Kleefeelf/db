package ua.lviv.iot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.DTO.CreditCardDto;
import ua.lviv.iot.domain.CreditCard;
import ua.lviv.iot.mapper.AbstractMapper;
import ua.lviv.iot.mapper.CreditCardMapper;
import ua.lviv.iot.service.AbstractService;
import ua.lviv.iot.service.CreditCardService;


@RequestMapping(value = "/credit_card")
@RestController
@AllArgsConstructor
public class CreditCardController extends AbstractController<CreditCard, CreditCardDto, Integer> {
    private final CreditCardService CreditCardService;
    private final CreditCardMapper CreditCardMapper;

    @Override
    protected AbstractService<CreditCard, Integer> getService() {
        return CreditCardService;
    }

    @Override
    protected AbstractMapper<CreditCard, CreditCardDto> getMapper() {
        return CreditCardMapper;
    }
}


