package com.sonbear.views.controllers.behaviors;

import com.sonbear.controllers.PaymentController;
import com.sonbear.model.entities.CreditCard;
import com.sonbear.model.entities.Post;

/**
 *
 * @author HikingCarrot7
 */
public abstract class UserTransactionBehavior {

    protected final PaymentController paymentController;

    public UserTransactionBehavior() {
        this.paymentController = new PaymentController();
    }

    public abstract boolean payPostWithCreditCard(Post post, CreditCard creditCard);

    public abstract boolean payPostWithStoreDeposit(Post post, String phoneNumber);

}
