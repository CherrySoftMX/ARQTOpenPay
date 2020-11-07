package com.sonbear.views.controllers;

import com.sonbear.model.entities.Seller;
import com.sonbear.views.SellerForm;
import com.sonbear.views.controllers.utils.AlertUtils;
import com.sonbear.views.controllers.utils.DialogUtils;
import java.awt.event.ActionEvent;

/**
 *
 * @author Sonbear
 */
public class SellerFormController {

    private final SellerForm sellerForm;
    private final Seller newSeller;
    private boolean accepted;

    public SellerFormController(SellerForm sellerForm, Seller newSeller) {
        this.sellerForm = sellerForm;
        this.newSeller = newSeller;
        this.accepted = false;
        initComponents();
    }

    private void initComponents() {
        sellerForm.getBtnAceptar().addActionListener(this::actionBtnAcceptNewSeller);
        sellerForm.getBtnCancelar().addActionListener(this::actionBtnCancelar);
    }

    private void actionBtnAcceptNewSeller(ActionEvent e) {
        if (AllFieldsValid()) {
            accepted = true;
            fillNewSellerData();
            DialogUtils.quitarDialog(sellerForm);
        } else
            AlertUtils.mostrarError(sellerForm, "Algún campo es incorrecto");
    }

    private void actionBtnCancelar(ActionEvent e) {
        DialogUtils.quitarDialog(sellerForm);
    }

    private void fillNewSellerData() {
        newSeller.setFirstName(getFirstName())
                .setLastName(getLastName())
                .setEmail(getEmail())
                .setPhoneNumber(getPhoneNumber());
    }

    private boolean AllFieldsValid() {
        return !getFirstName().isEmpty()
                && !getLastName().isEmpty()
                && !getEmail().isEmpty()
                && !getPhoneNumber().isEmpty();
    }

    private String getFirstName() {
        return sellerForm.getTxtFirstName().getText();
    }

    private String getLastName() {
        return sellerForm.getTxtLastName().getText();
    }

    private String getEmail() {
        return sellerForm.getTxtEmail().getText();
    }

    private String getPhoneNumber() {
        return sellerForm.getTxtPhone().getText();
    }

    public boolean isNewSellerAccepted() {
        return accepted;
    }

}
