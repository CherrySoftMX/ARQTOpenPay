package com.sonbear.views.controllers;

import com.sonbear.model.entities.Seller;
import com.sonbear.views.SellerForm;
import com.sonbear.views.controllers.utils.AlertUtils;
import com.sonbear.views.controllers.utils.DialogUtils;
import java.awt.event.ActionEvent;

/**
 *
 * @author HikingCarrot7
 */
public class SellerFormController {

    private final SellerForm addSellerForm;
    private final Seller newSeller;
    private boolean accepted;

    public SellerFormController(SellerForm addSellerForm, Seller newSeller) {
        this.addSellerForm = addSellerForm;
        this.newSeller = newSeller;
        this.accepted = false;
        initComponents();
    }

    private void initComponents() {
        addSellerForm.getBtnAceptar().addActionListener(this::actionBtnAceptar);
        addSellerForm.getBtnCancelar().addActionListener(this::actionBtnCancelar);
    }

    private void actionBtnAceptar(ActionEvent e) {
        if (AllFieldsValid()) {
            accepted = true;
            fillNewSellerData();
            DialogUtils.quitarDialog(addSellerForm);
        } else
            AlertUtils.mostrarError(addSellerForm, "Algún campo es incorrecto");
    }

    private void actionBtnCancelar(ActionEvent e) {
        DialogUtils.quitarDialog(addSellerForm);
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
        return addSellerForm.getTxtFirstName().getText();
    }

    private String getLastName() {
        return addSellerForm.getTxtLastName().getText();
    }

    private String getEmail() {
        return addSellerForm.getTxtEmail().getText();
    }

    private String getPhoneNumber() {
        return addSellerForm.getTxtPhone().getText();
    }

    public boolean isNewSellerAccepted() {
        return accepted;
    }

}
