package com.sonbear.views.controllers;

import com.sonbear.controllers.SellerController;
import com.sonbear.views.BuyersView;
import com.sonbear.views.Login;
import com.sonbear.views.SellersView;
import com.sonbear.views.controllers.utils.DialogUtils;
import java.awt.event.ActionEvent;

/**
 *
 * @author Sonbear
 */
public class LoginViewController {

    private final Login login;

    public LoginViewController(Login login) {
        this.login = login;
        initComponents();
    }

    private void initComponents() {
        login.getBtnSeller().addActionListener(this::actionBtnSeller);
        login.getBtnBuyer().addActionListener(this::actionBtnBuyer);
    }

    private void actionBtnSeller(ActionEvent e) {
        SellersView sellersView = new SellersView(login);
        new SellersViewController(sellersView, new SellerController());
        DialogUtils.showDialogAndWait(login, sellersView);
    }

    private void actionBtnBuyer(ActionEvent e) {
        BuyersView buyersView = new BuyersView(login);
        new BuyersViewController(buyersView);
        DialogUtils.showDialogAndWait(login, buyersView);
    }

}
