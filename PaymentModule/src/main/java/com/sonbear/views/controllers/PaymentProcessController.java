package com.sonbear.views.controllers;

import com.sonbear.model.entities.CreditCard;
import com.sonbear.model.entities.Post;
import com.sonbear.views.PaymentProcessView;
import com.sonbear.views.TicketView;
import com.sonbear.views.components.CardInfoForm;
import com.sonbear.views.components.StoreInfoForm;
import com.sonbear.views.controllers.behaviors.UserTransactionBehavior;
import com.sonbear.views.controllers.utils.DialogUtils;
import com.sonbear.views.controllers.utils.SwingUtils;
import java.awt.event.ActionEvent;

/**
 *
 * @author HikingCarrot7
 */
public class PaymentProcessController {

    private final PaymentProcessView paymentProcessView;
    private final Post post;
    private final UserTransactionBehavior transactionBehavior;
    private final CardInfoForm cardInfoForm;
    private final StoreInfoForm storeInfoForm;

    public PaymentProcessController(PaymentProcessView paymentProcessView, UserTransactionBehavior transactionBehavior, Post post) {
        this.paymentProcessView = paymentProcessView;
        this.post = post;
        this.transactionBehavior = transactionBehavior;
        this.cardInfoForm = new CardInfoForm();
        this.storeInfoForm = new StoreInfoForm();
        initComponents();
    }

    private void initComponents() {
        paymentProcessView.getBtnPagoTarjeta().addActionListener(this::actionBtnPagarConTarjeta);
        paymentProcessView.getBtnPagoTienda().addActionListener(this::actionBtnPagarEnTienda);
        cardInfoForm.getBtnPay().addActionListener(this::actionBtnPagar);
        storeInfoForm.getBtnGenerarComproabante().addActionListener(this::actionBtnGenerarComprobante);
        loadCardInfoForm();
        fillPostInfo();
    }

    private void fillPostInfo() {
        paymentProcessView.getLblConceptoPago().setText(post.getConceptoPago());
        paymentProcessView.getLblFechaAdjudicacion().setText(post.getFechaAdjudicacion());
        paymentProcessView.getLblTipoBien().setText(post.getTipoBien());
        paymentProcessView.getLblHoraAdjudicacion().setText(post.getHoraAdjudicacion());
        paymentProcessView.getLblIdEvento().setText(post.getIdEvento());
        paymentProcessView.getLblHusoHorario().setText(post.getHusoHorario());
        paymentProcessView.getLblImporte().setText(String.format("$%.2f", post.getImporte()));
    }

    private void actionBtnPagarConTarjeta(ActionEvent e) {
        loadCardInfoForm();
    }

    private void actionBtnPagarEnTienda(ActionEvent e) {
        loadStoreInforForm();
    }

    private void actionBtnPagar(ActionEvent e) {
        payPostWithCreditCard();
    }

    private void actionBtnGenerarComprobante(ActionEvent e) {
        TicketView ticketView = new TicketView(paymentProcessView);
        TicketController controller = new TicketController(ticketView);
        DialogUtils.showDialogAndWait(paymentProcessView, ticketView);

        if (controller.isPaid())
            payPostWithStoreDeposit();
    }

    private void payPostWithCreditCard() {
        boolean completed = transactionBehavior.payPostWithCreditCard(post, createCreditCard(), getPhoneNumber());

        if (completed)
            DialogUtils.quitarDialog(paymentProcessView);
    }

    private void payPostWithStoreDeposit() {
        boolean completed = transactionBehavior.payPostWithStoreDeposit(post, getPhoneNumber());

        if (completed)
            DialogUtils.quitarDialog(paymentProcessView);
    }

    private String getCreditCardHolderName() {
        return cardInfoForm.getTxtHolderName().getText();
    }

    private String getCreditCardNumber() {
        return cardInfoForm.getTxtCreditCardNumber().getText();
    }

    private String getCVC() {
        return cardInfoForm.getTxtCVC().getText();
    }

    private int getExpirationMonth() {
        return Integer.parseInt(cardInfoForm.getTxtExpirationMonth().getText());
    }

    private int getExpirationYear() {
        return Integer.parseInt(cardInfoForm.getTxtExpirationYear().getText());
    }

    private String getPhoneNumber() {
        if (paymentProcessView.getBtnPagoTarjeta().isSelected())
            return cardInfoForm.getTxtPhoneNumber().getText();

        return storeInfoForm.getTxtPhoneNumber().getText();
    }

    private CreditCard createCreditCard() {
        return new CreditCard()
                .holderName(getCreditCardHolderName())
                .cardNumber(getCreditCardNumber())
                .cvc(getCVC())
                .expirationMonth(getExpirationMonth())
                .expirationYear(getExpirationYear());
    }

    private void loadCardInfoForm() {
        SwingUtils.loadPanel(paymentProcessView.getMetodoPagoPanel(), cardInfoForm);
    }

    private void loadStoreInforForm() {
        SwingUtils.loadPanel(paymentProcessView.getMetodoPagoPanel(), storeInfoForm);
    }

}
