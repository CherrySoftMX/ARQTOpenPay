package com.sonbear.main;

import com.sonbear.model.services.exceptions.ServiceException;
import com.sonbear.views.Login;
import com.sonbear.views.controllers.LoginViewController;
import java.awt.EventQueue;

/**
 *
 * @author Sonbear
 */
public class Main {

    public static void main(String[] args) throws ServiceException {
        EventQueue.invokeLater(() -> {
            Login login = new Login();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
            new LoginViewController(login);
        });
    }

}
