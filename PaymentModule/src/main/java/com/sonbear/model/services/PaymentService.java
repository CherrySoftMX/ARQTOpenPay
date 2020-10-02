package com.sonbear.model.services;

import com.sonbear.model.entities.CreditCard;
import com.sonbear.model.entities.Post;
import com.sonbear.model.entities.Seller;
import com.sonbear.model.entities.User;
import com.sonbear.model.services.exceptions.ServiceException;
import com.sonbear.model.services.openpay.APIService;
import com.sonbear.model.services.openpay.OpenpayAPIService;
import com.sonbear.model.services.transactions.CreditCardTransaction;
import com.sonbear.model.services.transactions.StoreTransaction;
import com.sonbear.model.services.transactions.TransactionService;

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

    private PaymentService() {
        apiService = OpenpayAPIService.getOpenpayAPI();
    }

    public void publishPostWithCreditCard(Post post, CreditCard card) throws ServiceException {
        card = apiService.registerCreditCard(card);
        Seller seller = getPostAuthor(SellerService.getInstance(), post);
        TransactionService transactionService = new CreditCardTransaction(seller, card, COST_PER_POST);
        transactionService.processPayment();
        updatePostStatus(PostService.getInstance(), post);
    }

    public void publishPostWithStoreDeposit(Post post) throws ServiceException {
        Seller seller = getPostAuthor(SellerService.getInstance(), post);
        TransactionService transactionService = new StoreTransaction(seller, COST_PER_POST);
        transactionService.processPayment();
        updatePostStatus(PostService.getInstance(), post);
    }

    public void payPostWithCreditCard(Post post, User buyer, CreditCard card) throws ServiceException {

    }

    public void payPostWithStoreDeposit(Post post, User buyer) throws ServiceException {

    }

    private Seller getPostAuthor(SellerService sellerService, Post post) throws ServiceException {
        if (sellerService.existSeller(post.getSellerId()))
            return sellerService.getSellerById(post.getSellerId());

        throw new ServiceException("Seller does not exist");
    }

    private void updatePostStatus(PostService postService, Post post) {
        post.setPaidOut(true);
        postService.updatePost(post.getId(), post);
    }

}
