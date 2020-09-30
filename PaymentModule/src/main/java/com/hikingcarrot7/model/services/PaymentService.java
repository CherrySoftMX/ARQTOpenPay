package com.hikingcarrot7.model.services;

import com.hikingcarrot7.model.entities.Post;
import com.hikingcarrot7.model.services.transactions.CreditCardTransaction;
import com.hikingcarrot7.model.services.transactions.OpenpayAPIConnection;
import com.hikingcarrot7.model.services.transactions.StoreTransaction;
import com.hikingcarrot7.model.services.transactions.TransactionService;
import java.io.IOException;
import mx.openpay.client.Card;
import mx.openpay.client.core.OpenpayAPI;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

/**
 *
 * @author Sonbear
 */
public class PaymentService {

    public static final String COST_PER_POST = "20.00";

    public void registerPostWithCreditCard(Post post, Card card)
            throws IOException, OpenpayServiceException, ServiceUnavailableException {

        card = registerCard(OpenpayAPIConnection.getOpenpayAPI(), card);
        TransactionService transactionService = new CreditCardTransaction(post.getSeller(), card, COST_PER_POST);
        transactionService.processPayment();
        updatePostStatus(PostService.getInstance(), post);
    }

    public void registerPostWithStoreDeposit(Post post)
            throws IOException, OpenpayServiceException, ServiceUnavailableException {

        TransactionService transactionService = new StoreTransaction(post.getSeller(), COST_PER_POST);
        transactionService.processPayment();
        updatePostStatus(PostService.getInstance(), post);
    }

    private void updatePostStatus(PostService postService, Post post) {
        post.setPaidOut(true);
        postService.updatePost(post.getId(), post);
    }

    public Card registerCard(OpenpayAPI openpayAPI, Card card)
            throws OpenpayServiceException, ServiceUnavailableException {

        if (!isCardRegistered(card))
            return openpayAPI.cards().create(card);

        return card;
    }

    public boolean isCardRegistered(Card card) {
        return card.getId() != null;
    }

}
