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

    public void publishPostWithCreditCard(Post post, CreditCard creditCard) throws ServiceException {
        creditCard = apiService.registerCreditCard(creditCard);
        Seller seller = getPostAuthor(SellerService.getInstance(), post);
        TransactionService transactionService = new CreditCardTransaction(seller, creditCard, Post.COSTO);
        transactionService.processPayment();
        updatePostStatus(PostService.getInstance(), post);
    }

    public void publishPostWithStoreDeposit(Post post) throws ServiceException {
        Seller seller = getPostAuthor(SellerService.getInstance(), post);
        TransactionService transactionService = new StoreTransaction(seller, Post.COSTO);
        transactionService.processPayment();
        updatePostStatus(PostService.getInstance(), post);
    }

    public void payPostWithCreditCard(Post post, User buyer, CreditCard creditCard) throws ServiceException {

    }

    public void payPostWithStoreDeposit(Post post, User buyer) throws ServiceException {

    }

    private Seller getPostAuthor(SellerService sellerService, Post post) throws ServiceException {
        if (sellerService.existSeller(post.getSellerId()))
            return sellerService.getSellerById(post.getSellerId());

        throw new ServiceException("Seller does not exist");
    }

    private void updatePostStatus(PostService postService, Post post) {
        post.setPublished(true);
        postService.updatePost(post.getId(), post);
    }

}
