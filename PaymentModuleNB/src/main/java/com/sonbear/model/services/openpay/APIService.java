package com.sonbear.model.services.openpay;

import com.sonbear.model.entities.CreditCard;
import com.sonbear.model.entities.User;
import com.sonbear.model.services.exceptions.ServiceException;
import java.util.Date;

/**
 *
 * @author Sonbear
 */
public interface APIService {

    public User registerUser(User user) throws ServiceException;

    public void deleteUser(User user) throws ServiceException;

    /**
     * @return El id de la transacción.
     */
    public String createChargeWithCreditCard(User user, CreditCard creditCard, String amount) throws ServiceException;

    /**
     * @return El id de la transacción.
     */
    public String createChargeWithStoreDeposit(User user, Date dueDate, String amount) throws ServiceException;

    public CreditCard registerCreditCard(CreditCard creditCard) throws ServiceException;

    public boolean isCardRegistered(CreditCard creditCard);

}
