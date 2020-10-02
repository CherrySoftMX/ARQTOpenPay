package com.sonbear.model.services.transactions;

import com.sonbear.model.entities.Seller;
import com.sonbear.model.services.exceptions.ServiceException;
import java.util.Calendar;

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

    @Override public String processPayment() throws ServiceException {
        Calendar dueDate = Calendar.getInstance();
        dueDate.add(Calendar.DATE, 2);
        return apiService.createChargeWithStoreDeposit(seller, dueDate.getTime(), amount);
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
