package ua.lviv.iot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.CreditCard;

@Repository
public interface CreditCardRepository  extends JpaRepository<CreditCard, Integer>{
}
