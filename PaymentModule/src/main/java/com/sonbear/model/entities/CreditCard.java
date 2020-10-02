package com.sonbear.model.entities;

import java.util.UUID;

/**
 *
 * @author HikingCarrot7
 */
public class CreditCard extends Entity {

    private String holderName;
    private String cardNumber;
    private String cvc;
    private int expirationMonth;
    private int expirationYear;

    public CreditCard(String id, String holderName, String cardNumber, String cvc, int expirationMonth, int expirationYear) {
        super(id);
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }

    public CreditCard(String holderName, String cardNumber, String cvc, int expirationMonth, int expirationYear) {
        this(UUID.randomUUID().toString(), holderName, cardNumber, cvc, expirationMonth, expirationYear);
    }

    public CreditCard() {
        super(UUID.randomUUID().toString());
    }

    public String getHolderName() {
        return holderName;
    }

    public CreditCard holderName(String holderName) {
        this.holderName = holderName;
        return this;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public CreditCard cardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getCvc() {
        return cvc;
    }

    public CreditCard cvc(String cvc) {
        this.cvc = cvc;
        return this;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public CreditCard expirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
        return this;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public CreditCard expirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
        return this;
    }

}
