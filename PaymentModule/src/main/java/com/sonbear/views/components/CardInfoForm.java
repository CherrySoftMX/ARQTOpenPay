package com.sonbear.views.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sonbear
 */
public class CardInfoForm extends JPanel {

    public CardInfoForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        jPanel4 = new JPanel();
        jPanel5 = new JPanel();
        btnPay = new JButton();
        jPanel7 = new JPanel();
        jLabel17 = new JLabel();
        txtHolderName = new JTextField();
        jLabel18 = new JLabel();
        txtCreditCardNumber = new JTextField();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        txtCVC = new JTextField();
        jPanel9 = new JPanel();
        txtExpirationMonth = new JTextField();
        jLabel22 = new JLabel();
        txtExpirationYear = new JTextField();
        jLabel1 = new JLabel();
        txtPhoneNumber = new JTextField();

        setLayout(new BorderLayout());

        jPanel4.setLayout(new BorderLayout());

        jPanel5.setBackground(new Color(0, 0, 0));
        jPanel5.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));

        btnPay.setText("Pagar");
        jPanel5.add(btnPay);

        jPanel4.add(jPanel5, BorderLayout.PAGE_END);

        jPanel7.setBackground(new Color(0, 0, 0));
        jPanel7.setLayout(new GridBagLayout());

        jLabel17.setBackground(new Color(51, 51, 51));
        jLabel17.setForeground(new Color(255, 255, 255));
        jLabel17.setText("Nombre del dueño de la tarjeta:");
        jLabel17.setOpaque(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 7, 0, 7);
        jPanel7.add(jLabel17, gridBagConstraints);

        txtHolderName.setText("Nicolás Canul Ibarra");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 7, 0, 7);
        jPanel7.add(txtHolderName, gridBagConstraints);

        jLabel18.setBackground(new Color(51, 51, 51));
        jLabel18.setForeground(new Color(255, 255, 255));
        jLabel18.setText("Número de la tarjeta de crédito:");
        jLabel18.setOpaque(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 7, 0, 7);
        jPanel7.add(jLabel18, gridBagConstraints);

        txtCreditCardNumber.setText("4111111111111111");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 7, 0, 7);
        jPanel7.add(txtCreditCardNumber, gridBagConstraints);

        jLabel19.setBackground(new Color(51, 51, 51));
        jLabel19.setForeground(new Color(255, 255, 255));
        jLabel19.setText("Fecha de expiración (MM/AAAA):");
        jLabel19.setOpaque(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(7, 7, 0, 7);
        jPanel7.add(jLabel19, gridBagConstraints);

        jLabel20.setBackground(new Color(51, 51, 51));
        jLabel20.setForeground(new Color(255, 255, 255));
        jLabel20.setText("CVC:");
        jLabel20.setOpaque(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(7, 7, 0, 7);
        jPanel7.add(jLabel20, gridBagConstraints);

        txtCVC.setText("110");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 7, 0, 7);
        jPanel7.add(txtCVC, gridBagConstraints);

        jPanel9.setLayout(new GridBagLayout());

        txtExpirationMonth.setText("12");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel9.add(txtExpirationMonth, gridBagConstraints);

        jLabel22.setText(" / ");
        jPanel9.add(jLabel22, new GridBagConstraints());

        txtExpirationYear.setText("21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel9.add(txtExpirationYear, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 7, 0, 7);
        jPanel7.add(jPanel9, gridBagConstraints);

        jLabel1.setBackground(new Color(51, 51, 51));
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Número telefónico:");
        jLabel1.setOpaque(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(7, 7, 0, 7);
        jPanel7.add(jLabel1, gridBagConstraints);

        txtPhoneNumber.setText("9992676253");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 7, 0, 7);
        jPanel7.add(txtPhoneNumber, gridBagConstraints);

        jPanel4.add(jPanel7, BorderLayout.CENTER);

        add(jPanel4, BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnPay() {
        return btnPay;
    }

    public JTextField getTxtCreditCardNumber() {
        return txtCreditCardNumber;
    }

    public JTextField getTxtExpirationMonth() {
        return txtExpirationMonth;
    }

    public JTextField getTxtExpirationYear() {
        return txtExpirationYear;
    }

    public JTextField getTxtHolderName() {
        return txtHolderName;
    }

    public JTextField getTxtCVC() {
        return txtCVC;
    }

    public JTextField getTxtPhoneNumber() {
        return txtPhoneNumber;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnPay;
    private JLabel jLabel1;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel20;
    private JLabel jLabel22;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel7;
    private JPanel jPanel9;
    private JTextField txtCVC;
    private JTextField txtCreditCardNumber;
    private JTextField txtExpirationMonth;
    private JTextField txtExpirationYear;
    private JTextField txtHolderName;
    private JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
