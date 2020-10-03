package com.sonbear.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author HikingCarrot7
 */
public class AddSellerForm extends JDialog {

    public AddSellerForm(Window owner) {
        super(owner);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        filler2 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        filler1 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        jPanel1 = new JPanel();
        btnAceptar = new JButton();
        btnCancelar = new JButton();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        txtFirstName = new JTextField();
        jLabel2 = new JLabel();
        txtLastName = new JTextField();
        jLabel3 = new JLabel();
        txtEmail = new JTextField();
        jLabel4 = new JLabel();
        txtPhone = new JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new Dimension(420, 170));
        setMinimumSize(new Dimension(420, 170));
        setPreferredSize(new Dimension(420, 170));
        getContentPane().add(filler2, BorderLayout.WEST);
        getContentPane().add(filler1, BorderLayout.EAST);

        jPanel1.setLayout(new FlowLayout(FlowLayout.RIGHT));

        btnAceptar.setText("Aceptar");
        jPanel1.add(btnAceptar);

        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar);

        getContentPane().add(jPanel1, BorderLayout.PAGE_END);

        jPanel2.setLayout(new GridBagLayout());

        jLabel1.setText("Nombres:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(2, 7, 2, 7);
        jPanel2.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(2, 7, 2, 7);
        jPanel2.add(txtFirstName, gridBagConstraints);

        jLabel2.setText("Apellidos:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(2, 7, 2, 7);
        jPanel2.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(2, 7, 2, 7);
        jPanel2.add(txtLastName, gridBagConstraints);

        jLabel3.setText("Email:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(12, 7, 2, 7);
        jPanel2.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(2, 7, 2, 7);
        jPanel2.add(txtEmail, gridBagConstraints);

        jLabel4.setText("Teléfono:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(12, 7, 2, 7);
        jPanel2.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(2, 7, 2, 7);
        jPanel2.add(txtPhone, gridBagConstraints);

        getContentPane().add(jPanel2, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtFirstName() {
        return txtFirstName;
    }

    public JTextField getTxtLastName() {
        return txtLastName;
    }

    public JTextField getTxtPhone() {
        return txtPhone;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAceptar;
    private JButton btnCancelar;
    private Box.Filler filler1;
    private Box.Filler filler2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JTextField txtEmail;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
