package com.hikingcarrot7.model.services.openpay;

import com.hikingcarrot7.model.entities.User;
import com.hikingcarrot7.model.services.exceptions.ServiceException;
import java.util.Date;
import mx.openpay.client.Card;
import mx.openpay.client.Charge;

/**
 *
 * @author HikingCarrot7
 */
public interface APIService {

    public User registerUser(User user) throws ServiceException;

    public void deleteUser(User user) throws ServiceException;

    public Charge createChargeWithCreditCard(User user, Card card, String amount) throws ServiceException;

    public Charge createChargeWithStoreDeposit(User user, Date dueDate, String amount) throws ServiceException;

    public Card registerCreditCard(Card card) throws ServiceException;

    public boolean isCardRegistered(Card card);

}
