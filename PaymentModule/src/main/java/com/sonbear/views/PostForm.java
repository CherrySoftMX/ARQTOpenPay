package com.sonbear.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author HikingCarrot7
 */
public class PostForm extends JDialog {

    public PostForm(Window owner) {
        super(owner);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        jPanel1 = new JPanel();
        btnAceptar = new JButton();
        btnCancelar = new JButton();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        txtConceptoPago = new JTextField();
        jLabel2 = new JLabel();
        txtTipoBien = new JTextField();
        jLabel3 = new JLabel();
        txtImporte = new JTextField();
        jLabel4 = new JLabel();
        txtHusoHorario = new JTextField();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo post");
        setMinimumSize(new Dimension(425, 190));

        jPanel1.setLayout(new FlowLayout(FlowLayout.RIGHT));

        btnAceptar.setText("Aceptar");
        jPanel1.add(btnAceptar);

        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar);

        getContentPane().add(jPanel1, BorderLayout.PAGE_END);

        jPanel2.setLayout(new GridBagLayout());

        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel1.setText("Concepto de pago:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.001;
        gridBagConstraints.insets = new Insets(4, 15, 4, 15);
        jPanel2.add(jLabel1, gridBagConstraints);

        txtConceptoPago.setText("REALIZACIÓN DE UN EVENTO DE SUBASTA");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(4, 15, 4, 15);
        jPanel2.add(txtConceptoPago, gridBagConstraints);

        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel2.setText("Tipo de bien:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.001;
        gridBagConstraints.insets = new Insets(4, 15, 4, 15);
        jPanel2.add(jLabel2, gridBagConstraints);

        txtTipoBien.setText("Correo");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(4, 15, 4, 15);
        jPanel2.add(txtTipoBien, gridBagConstraints);

        jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel3.setText("Huso-horario deseado:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.001;
        gridBagConstraints.insets = new Insets(4, 15, 4, 15);
        jPanel2.add(jLabel3, gridBagConstraints);

        txtImporte.setText("15.00");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(4, 15, 4, 15);
        jPanel2.add(txtImporte, gridBagConstraints);

        jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel4.setText("Importe del servicio:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.001;
        gridBagConstraints.insets = new Insets(4, 15, 4, 15);
        jPanel2.add(jLabel4, gridBagConstraints);

        txtHusoHorario.setText("Africa/Abidjan");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(4, 15, 4, 15);
        jPanel2.add(txtHusoHorario, gridBagConstraints);

        getContentPane().add(jPanel2, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JTextField getTxtConceptoPago() {
        return txtConceptoPago;
    }

    public JTextField getTxtHusoHorario() {
        return txtHusoHorario;
    }

    public JTextField getTxtImporte() {
        return txtImporte;
    }

    public JTextField getTxtTipoBien() {
        return txtTipoBien;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAceptar;
    private JButton btnCancelar;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JTextField txtConceptoPago;
    private JTextField txtHusoHorario;
    private JTextField txtImporte;
    private JTextField txtTipoBien;
    // End of variables declaration//GEN-END:variables
}
