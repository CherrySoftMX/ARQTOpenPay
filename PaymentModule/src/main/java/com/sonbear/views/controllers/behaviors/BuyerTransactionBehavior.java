package com.sonbear.views.controllers.behaviors;

import com.sonbear.model.entities.CreditCard;
import com.sonbear.model.entities.Post;
import com.sonbear.model.services.exceptions.ServiceException;
import com.sonbear.views.controllers.utils.AlertUtils;

/**
 *
 * @author HikingCarrot7
 */
public class BuyerTransactionBehavior extends UserTransactionBehavior {

    @Override public boolean payPostWithCreditCard(Post post, CreditCard creditCard) {
        try {
            paymentController.payPostWithCreditCard(post, creditCard);
            AlertUtils.mostrarMensaje(null, "Pago completado",
                    String.format("Se ha realizado tu pago de $%.2f desde tu tarjeta de crédito", post.getImporte()));
            return true;
        } catch (ServiceException ex) {
            AlertUtils.mostrarError(null, ex.getMessage());
        }
        return false;
    }

    @Override public boolean payPostWithStoreDeposit(Post post, String phoneNumber) {
        try {
            paymentController.payPostWithStoreDeposit(post, phoneNumber);
            AlertUtils.mostrarMensaje(null, "Pago completado",
                    String.format("Se ha realizado tu pago de $%.2f", post.getImporte()));
            return true;
        } catch (ServiceException ex) {
            AlertUtils.mostrarError(null, ex.getMessage());
        }
        return false;
    }

}
