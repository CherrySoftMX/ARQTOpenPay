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
public class StoreInfoForm extends JPanel {

    public StoreInfoForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        jPanel4 = new JPanel();
        jPanel5 = new JPanel();
        btnGenerarComproabante = new JButton();
        jPanel7 = new JPanel();
        jLabel21 = new JLabel();
        txtPhoneNumber = new JTextField();
        jPanel1 = new JPanel();

        setLayout(new BorderLayout());

        jPanel4.setLayout(new BorderLayout());

        jPanel5.setBackground(new Color(0, 0, 0));
        jPanel5.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));

        btnGenerarComproabante.setText("Generar comprabante");
        jPanel5.add(btnGenerarComproabante);

        jPanel4.add(jPanel5, BorderLayout.PAGE_END);

        jPanel7.setBackground(new Color(0, 0, 0));
        jPanel7.setLayout(new GridBagLayout());

        jLabel21.setBackground(new Color(51, 51, 51));
        jLabel21.setForeground(new Color(255, 255, 255));
        jLabel21.setText("Número telefónico:");
        jLabel21.setOpaque(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(7, 0, 0, 0);
        jPanel7.add(jLabel21, gridBagConstraints);

        txtPhoneNumber.setText("9992676253");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(txtPhoneNumber, gridBagConstraints);

        jPanel1.setBackground(new Color(0, 0, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(jPanel1, gridBagConstraints);

        jPanel4.add(jPanel7, BorderLayout.CENTER);

        add(jPanel4, BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnGenerarComproabante() {
        return btnGenerarComproabante;
    }

    public JTextField getTxtPhoneNumber() {
        return txtPhoneNumber;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnGenerarComproabante;
    private JLabel jLabel21;
    private JPanel jPanel1;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel7;
    private JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
