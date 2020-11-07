package com.sonbear.model.services.transactions;

import com.sonbear.model.entities.CreditCard;
import com.sonbear.model.entities.Seller;
import com.sonbear.model.services.exceptions.ServiceException;

/**
 *
 * @author Sonbear
 */
public class CreditCardTransaction extends TransactionService {

    private CreditCard card;
    private Seller seller;
    private String amount;

    public CreditCardTransaction(Seller seller, CreditCard card, String amount) {
        this.card = card;
        this.seller = seller;
        this.amount = amount;
    }

    @Override public String processPayment() throws ServiceException {
        card = apiService.registerCreditCard(card);
        return apiService.createChargeWithCreditCard(seller, card, amount);
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
