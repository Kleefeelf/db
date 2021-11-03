package iot.controller.implementation;

import iot.dao.implementation.CreditCardDaoImpl;
import iot.models.CreditCard;

public class CreditCardControllerImpl extends AbstractControllerImpl<CreditCard, Integer>{
    public CreditCardControllerImpl(){
        super(new CreditCardDaoImpl());
    }
}
