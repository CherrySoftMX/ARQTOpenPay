package com.hikingcarrot7.model.services.transactions;

import com.hikingcarrot7.model.entities.Seller;
import com.hikingcarrot7.model.services.exceptions.ServiceException;
import java.util.Calendar;
import mx.openpay.client.Charge;

/**
 *
 * @author SonBear
 */
public class StoreTransaction extends TransactionService {

    private Seller seller;
    private String amount;

    public StoreTransaction(Seller seller, String amount) {
        this.seller = seller;
        this.amount = amount;
    }

    @Override public Charge processPayment() throws ServiceException {
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(2021, 9, 01, 13, 45, 0);
        return apiService.createChargeWithStore(seller, dueDate.getTime(), amount);
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
