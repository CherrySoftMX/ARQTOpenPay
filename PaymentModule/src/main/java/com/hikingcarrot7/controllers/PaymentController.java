package com.hikingcarrot7.controllers;

import com.hikingcarrot7.model.entities.Post;
import com.hikingcarrot7.model.services.PaymentService;
import java.io.IOException;
import mx.openpay.client.Card;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

/**
 *
 * @author Sonbear
 */
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController() {
        this.paymentService = new PaymentService();
    }

    public void registerPostWithCreditCard(Post post, Card card)
            throws IOException, OpenpayServiceException, ServiceUnavailableException {

        paymentService.registerPostWithCreditCard(post, card);
    }

    public void registerPostWithStoreDeposit(Post post)
            throws IOException, OpenpayServiceException, ServiceUnavailableException {

        paymentService.registerPostWithStoreDeposit(post);
    }

}
