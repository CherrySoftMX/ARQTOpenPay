package com.hikingcarrot7.model.services.transactions;

import com.hikingcarrot7.model.entities.Seller;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import mx.openpay.client.Charge;
import mx.openpay.client.Customer;
import mx.openpay.client.core.requests.transactions.CreateStoreChargeParams;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

/**
 *
 * @author SonBear
 */
public class StoreTransaction extends TransactionService {

    private Seller seller;
    private String amount;

    public StoreTransaction(Seller seller, String amount) throws IOException {
        this.seller = seller;
        this.amount = amount;
    }

    @Override
    public void processPayment() throws OpenpayServiceException, ServiceUnavailableException {
        Customer customer = new Customer()
                .name(seller.getFirstName())
                .lastName(seller.getLastName())
                .email(seller.getEmail())
                .phoneNumber(seller.getPhoneNumber());

        Calendar dueDate = Calendar.getInstance();
        dueDate.add(Calendar.DATE, 2);

        CreateStoreChargeParams request = new CreateStoreChargeParams();
        request.amount(new BigDecimal(amount));
        request.description("Cargo con tienda");

        request.dueDate(dueDate.getTime());
        request.customer(customer);

        Charge charge = openpayAPI.charges().createCharge(request);
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
