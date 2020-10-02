package com.sonbear.views.components;

import java.awt.BorderLayout;
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
 * @author HikingCarrot7
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
        jButton1 = new JButton();
        jPanel7 = new JPanel();
        jLabel17 = new JLabel();
        jTextField1 = new JTextField();
        jLabel18 = new JLabel();
        jTextField2 = new JTextField();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jTextField4 = new JTextField();
        jLabel21 = new JLabel();
        jTextField5 = new JTextField();
        jPanel9 = new JPanel();
        jTextField3 = new JTextField();
        jLabel22 = new JLabel();
        jTextField6 = new JTextField();

        setLayout(new BorderLayout());

        jPanel4.setLayout(new BorderLayout());

        jPanel5.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));

        jButton1.setText("Pagar");
        jPanel5.add(jButton1);

        jPanel4.add(jPanel5, BorderLayout.PAGE_END);

        jPanel7.setLayout(new GridBagLayout());

        jLabel17.setText("Nombre de la tarjeta:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(jLabel17, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(jTextField1, gridBagConstraints);

        jLabel18.setText("Número de la tarjeta de crédito:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(jLabel18, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(jTextField2, gridBagConstraints);

        jLabel19.setText("Fecha de expiración (MM/AAAA):");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(7, 0, 0, 0);
        jPanel7.add(jLabel19, gridBagConstraints);

        jLabel20.setText("CVC:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(7, 0, 0, 0);
        jPanel7.add(jLabel20, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(jTextField4, gridBagConstraints);

        jLabel21.setText("Número telefónico:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(7, 0, 0, 0);
        jPanel7.add(jLabel21, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(jTextField5, gridBagConstraints);

        jPanel9.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel9.add(jTextField3, gridBagConstraints);

        jLabel22.setText(" / ");
        jPanel9.add(jLabel22, new GridBagConstraints());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel9.add(jTextField6, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel7.add(jPanel9, gridBagConstraints);

        jPanel4.add(jPanel7, BorderLayout.CENTER);

        add(jPanel4, BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton1;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel7;
    private JPanel jPanel9;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
