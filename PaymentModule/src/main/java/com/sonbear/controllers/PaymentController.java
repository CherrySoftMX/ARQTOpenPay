package com.sonbear.controllers;

import com.sonbear.model.entities.CreditCard;
import com.sonbear.model.entities.Post;
import com.sonbear.model.services.PaymentService;
import com.sonbear.model.services.exceptions.ServiceException;

/**
 *
 * @author Sonbear
 */
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController() {
        this.paymentService = PaymentService.getInstance();
    }

    public void publishPostWithCreditCard(Post post, CreditCard card) throws ServiceException {
        paymentService.publishPostWithCreditCard(post, card);
    }

    public void publishPostWithStoreDeposit(Post post, String phoneNumber) throws ServiceException {
        paymentService.publishPostWithStoreDeposit(post, phoneNumber);
    }

    public void payPostWithCreditCard(Post post, CreditCard creditCard) throws ServiceException {
        paymentService.payPostWithCreditCard(post, creditCard);
    }

    public void payPostWithStoreDeposit(Post post, String phoneNumber) throws ServiceException {
        paymentService.payPostWithStoreDeposit(post, phoneNumber);
    }

}
