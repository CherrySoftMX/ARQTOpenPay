package com.hikingcarrot7.model.services.transactions;

import com.hikingcarrot7.model.entities.Seller;
import java.io.IOException;
import java.math.BigDecimal;
import mx.openpay.client.Card;
import mx.openpay.client.Charge;
import mx.openpay.client.Customer;
import mx.openpay.client.core.requests.transactions.CreateCardChargeParams;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

/**
 *
 * @author HikingCarrot7
 */
public class CreditCardTransaction extends TransactionService {

    private Card card;
    private Seller seller;
    private String amount;

    public CreditCardTransaction(Seller seller, Card card, String amount) throws IOException {
        this.card = card;
        this.seller = seller;
        this.amount = amount;
    }

    @Override public void processPayment() throws OpenpayServiceException, ServiceUnavailableException {
        Customer customer = new Customer()
                .name(seller.getFirstName())
                .lastName(seller.getLastName())
                .email(seller.getEmail())
                .phoneNumber(seller.getPhoneNumber());

        CreateCardChargeParams request = new CreateCardChargeParams()
                .amount(new BigDecimal(amount))
                .cardId(card.getId())
                .currency("MXN")
                .description("Pago a correo")
                .customer(customer)
                .deviceSessionId("kR1MiQhz2otdIuUlQkbEyitIqVMiI16f");

        Charge charge = openpayAPI.charges().createCharge(request);
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
