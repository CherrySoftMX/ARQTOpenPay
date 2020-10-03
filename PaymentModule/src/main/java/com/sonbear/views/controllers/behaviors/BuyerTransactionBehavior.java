package com.sonbear.views.controllers.behaviors;

import com.sonbear.model.entities.CreditCard;
import com.sonbear.model.entities.Post;

/**
 *
 * @author HikingCarrot7
 */
public class BuyerTransactionBehavior extends UserTransactionBehavior {

    @Override
    public boolean payPostWithCreditCard(Post post, CreditCard creditCard, String phoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean payPostWithStoreDeposit(Post post, String phoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
