package com.sonbear.views.controllers.behaviors;

import com.sonbear.model.entities.CreditCard;
import com.sonbear.model.entities.Post;
import com.sonbear.model.services.exceptions.ServiceException;
import com.sonbear.views.controllers.utils.AlertUtils;

/**
 *
 * @author HikingCarrot7
 */
public class SellerTransactionBehavior extends UserTransactionBehavior {

    @Override public boolean payPostWithCreditCard(Post post, CreditCard creditCard, String phoneNumber) {
        try {
            paymentController.publishPostWithCreditCard(post, creditCard);
            return true;
        } catch (ServiceException ex) {
            AlertUtils.mostrarError(null, ex.getMessage());
        }
        return false;
    }

    @Override public boolean payPostWithStoreDeposit(Post post, String phoneNumber) {
        try {
            paymentController.publishPostWithStoreDeposit(post);
            return true;
        } catch (ServiceException ex) {
            AlertUtils.mostrarError(null, ex.getMessage());
        }
        return false;
    }

}
