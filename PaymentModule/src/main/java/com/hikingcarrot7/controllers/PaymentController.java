package com.hikingcarrot7.controllers;

import com.hikingcarrot7.model.entities.Buyer;
import com.hikingcarrot7.model.entities.Post;
import com.hikingcarrot7.model.services.PaymentService;
import com.hikingcarrot7.model.services.exceptions.ServiceException;
import mx.openpay.client.Card;

/**
 *
 * @author Sonbear
 */
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController() {
        this.paymentService = PaymentService.getInstance();
    }

    public void publishPostWithCreditCard(Post post, Card card) throws ServiceException {
        paymentService.publishPostWithCreditCard(post, card);
    }

    public void publishPostWithStoreDeposit(Post post) throws ServiceException {
        paymentService.publishPostWithStoreDeposit(post);
    }

    public void payPostWithCreditCard(Post post, Buyer buyer, Card card) throws ServiceException {
        paymentService.payPostWithCreditCard(post, buyer, card);
    }

    public void payPostWithStoreDeposit(Post post, Buyer buyer) throws ServiceException {
        paymentService.payPostWithStoreDeposit(post, buyer);
    }

}
