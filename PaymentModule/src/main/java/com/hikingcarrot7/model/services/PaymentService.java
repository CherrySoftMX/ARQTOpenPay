package com.hikingcarrot7.model.services;

import com.hikingcarrot7.model.entities.Buyer;
import com.hikingcarrot7.model.entities.Post;
import com.hikingcarrot7.model.entities.Seller;
import com.hikingcarrot7.model.services.exceptions.ServiceException;
import com.hikingcarrot7.model.services.openpay.APIService;
import com.hikingcarrot7.model.services.openpay.OpenpayAPIService;
import com.hikingcarrot7.model.services.transactions.CreditCardTransaction;
import com.hikingcarrot7.model.services.transactions.StoreTransaction;
import com.hikingcarrot7.model.services.transactions.TransactionService;
import mx.openpay.client.Card;

/**
 *
 * @author Sonbear
 */
public class PaymentService {

    public static final String COST_PER_POST = "20.00";

    private static PaymentService instance;

    public synchronized static PaymentService getInstance() {
        if (instance == null)
            instance = new PaymentService();

        return instance;
    }

    private final APIService apiService;
    private final SellerService sellerService;

    private PaymentService() {
        apiService = OpenpayAPIService.getOpenpayAPI();
        sellerService = SellerService.getInstance();
    }

    public void publishPostWithCreditCard(Post post, Card card) throws ServiceException {
        card = apiService.registerCreditCard(card);
        Seller seller = getSellerFromPost(post);
        TransactionService transactionService = new CreditCardTransaction(seller, card, COST_PER_POST);
        transactionService.processPayment();
        updatePostStatus(PostService.getInstance(), post);
    }

    public void publishPostWithStoreDeposit(Post post) throws ServiceException {
        Seller seller = getSellerFromPost(post);
        TransactionService transactionService = new StoreTransaction(seller, COST_PER_POST);
        transactionService.processPayment();
        updatePostStatus(PostService.getInstance(), post);
    }

    public void payPostWithCreditCard(Post post, Buyer buyer, Card card) throws ServiceException {

    }

    public void payPostWithStoreDeposit(Post post, Buyer buyer) throws ServiceException {

    }

    private void updatePostStatus(PostService postService, Post post) {
        post.setPaidOut(true);
        postService.updatePost(post.getId(), post);
    }

    private Seller getSellerFromPost(Post post) throws ServiceException {
        if (sellerService.existSeller(post.getId()))
            return sellerService.getSellerById(post.getId());

        throw new ServiceException("Seller does not exist");
    }

}
