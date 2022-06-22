package ua.lviv.iot.service;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Repository.CreditCardRepository;
import ua.lviv.iot.domain.CreditCard;

@AllArgsConstructor
@Service
public class CreditCardService extends AbstractService<CreditCard, Integer>{
    private final CreditCardRepository CreditCardRepository;

    @Override
    protected JpaRepository<CreditCard, Integer> getRepository() {
        return CreditCardRepository;
    }
}
