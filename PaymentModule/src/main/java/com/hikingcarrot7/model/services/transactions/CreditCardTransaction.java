package com.hikingcarrot7.model.services.transactions;

import com.hikingcarrot7.model.entities.Seller;
import com.hikingcarrot7.model.services.exceptions.ServiceException;
import mx.openpay.client.Card;
import mx.openpay.client.Charge;

/**
 *
 * @author HikingCarrot7
 */
public class CreditCardTransaction extends TransactionService {

    private Card card;
    private Seller seller;
    private String amount;

    public CreditCardTransaction(Seller seller, Card card, String amount) {
        this.card = card;
        this.seller = seller;
        this.amount = amount;
    }

    @Override public Charge processPayment() throws ServiceException {
        return apiService.createChargeWithCreditCard(seller, card, amount);
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
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
