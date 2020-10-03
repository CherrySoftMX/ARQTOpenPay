package com.sonbear.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.WindowConstants;

/**
 *
 * @author Sonbear
 */
public class PaymentProcessView extends JDialog {

    public PaymentProcessView(Window owner) {
        super(owner);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        buttonGroup1 = new ButtonGroup();
        jLabel1 = new JLabel();
        filler1 = new Box.Filler(new Dimension(10, 0), new Dimension(10, 0), new Dimension(10, 32767));
        filler2 = new Box.Filler(new Dimension(10, 0), new Dimension(10, 0), new Dimension(10, 32767));
        filler3 = new Box.Filler(new Dimension(0, 10), new Dimension(0, 10), new Dimension(32767, 10));
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        lblConceptoPago = new JLabel();
        lblFechaAdjudicacion = new JLabel();
        jLabel6 = new JLabel();
        lblTipoBien = new JLabel();
        jLabel8 = new JLabel();
        lblHoraAdjudicacion = new JLabel();
        jLabel10 = new JLabel();
        lblIdEvento = new JLabel();
        jLabel12 = new JLabel();
        lblHusoHorario = new JLabel();
        jLabel14 = new JLabel();
        lblImporte = new JLabel();
        jPanel3 = new JPanel();
        jLabel16 = new JLabel();
        jPanel6 = new JPanel();
        btnPagoTarjeta = new JToggleButton();
        btnPagoTienda = new JToggleButton();
        metodoPagoPanel = new JPanel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payment process");
        setMinimumSize(new Dimension(610, 640));

        jLabel1.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pagar ahora");
        jLabel1.setBorder(BorderFactory.createEmptyBorder(12, 10, 12, 10));
        getContentPane().add(jLabel1, BorderLayout.NORTH);
        getContentPane().add(filler1, BorderLayout.WEST);
        getContentPane().add(filler2, BorderLayout.EAST);
        getContentPane().add(filler3, BorderLayout.PAGE_END);

        jPanel1.setLayout(new GridLayout(3, 1));

        jPanel2.setLayout(new GridBagLayout());

        jLabel2.setFont(new Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new Color(44, 51, 88));
        jLabel2.setText("Concepto de pago:");
        jLabel2.setToolTipText("");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new Color(44, 51, 88));
        jLabel3.setText("Fecha de adjudicación:");
        jLabel3.setToolTipText("");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jLabel3, gridBagConstraints);

        lblConceptoPago.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(lblConceptoPago, gridBagConstraints);

        lblFechaAdjudicacion.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(lblFechaAdjudicacion, gridBagConstraints);

        jLabel6.setFont(new Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new Color(44, 51, 88));
        jLabel6.setText("Tipo de bien:");
        jLabel6.setToolTipText("");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(10, 0, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);

        lblTipoBien.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        jPanel2.add(lblTipoBien, gridBagConstraints);

        jLabel8.setFont(new Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new Color(44, 51, 88));
        jLabel8.setText("Hora de adjudicación:");
        jLabel8.setToolTipText("");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(10, 0, 0, 0);
        jPanel2.add(jLabel8, gridBagConstraints);

        lblHoraAdjudicacion.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        jPanel2.add(lblHoraAdjudicacion, gridBagConstraints);

        jLabel10.setFont(new Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new Color(44, 51, 88));
        jLabel10.setText("ID del evento:");
        jLabel10.setToolTipText("");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(10, 0, 0, 0);
        jPanel2.add(jLabel10, gridBagConstraints);

        lblIdEvento.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        jPanel2.add(lblIdEvento, gridBagConstraints);

        jLabel12.setFont(new Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new Color(44, 51, 88));
        jLabel12.setText("Huso-horario deseado:");
        jLabel12.setToolTipText("");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(10, 0, 0, 0);
        jPanel2.add(jLabel12, gridBagConstraints);

        lblHusoHorario.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        jPanel2.add(lblHusoHorario, gridBagConstraints);

        jLabel14.setFont(new Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new Color(44, 51, 88));
        jLabel14.setText("Importe del servicio:");
        jLabel14.setToolTipText("");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(10, 0, 0, 0);
        jPanel2.add(jLabel14, gridBagConstraints);

        lblImporte.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(0, 0, 10, 0);
        jPanel2.add(lblImporte, gridBagConstraints);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new BorderLayout());

        jLabel16.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Seleccione un método de pago:");
        jPanel3.add(jLabel16, BorderLayout.PAGE_START);

        jPanel6.setLayout(new GridBagLayout());

        buttonGroup1.add(btnPagoTarjeta);
        btnPagoTarjeta.setIcon(new ImageIcon(getClass().getResource("/card.png"))); // NOI18N
        btnPagoTarjeta.setContentAreaFilled(false);
        btnPagoTarjeta.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(0, 5, 0, 5);
        jPanel6.add(btnPagoTarjeta, gridBagConstraints);

        buttonGroup1.add(btnPagoTienda);
        btnPagoTienda.setIcon(new ImageIcon(getClass().getResource("/oxxo.png"))); // NOI18N
        btnPagoTienda.setContentAreaFilled(false);
        btnPagoTienda.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(0, 5, 0, 5);
        jPanel6.add(btnPagoTienda, gridBagConstraints);

        jPanel3.add(jPanel6, BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        metodoPagoPanel.setLayout(new BorderLayout());
        jPanel1.add(metodoPagoPanel);

        getContentPane().add(jPanel1, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JToggleButton getBtnPagoTarjeta() {
        return btnPagoTarjeta;
    }

    public JToggleButton getBtnPagoTienda() {
        return btnPagoTienda;
    }

    public JPanel getMetodoPagoPanel() {
        return metodoPagoPanel;
    }

    public JLabel getLblConceptoPago() {
        return lblConceptoPago;
    }

    public JLabel getLblFechaAdjudicacion() {
        return lblFechaAdjudicacion;
    }

    public JLabel getLblHoraAdjudicacion() {
        return lblHoraAdjudicacion;
    }

    public JLabel getLblHusoHorario() {
        return lblHusoHorario;
    }

    public JLabel getLblIdEvento() {
        return lblIdEvento;
    }

    public JLabel getLblImporte() {
        return lblImporte;
    }

    public JLabel getLblTipoBien() {
        return lblTipoBien;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JToggleButton btnPagoTarjeta;
    private JToggleButton btnPagoTienda;
    private ButtonGroup buttonGroup1;
    private Box.Filler filler1;
    private Box.Filler filler2;
    private Box.Filler filler3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel12;
    private JLabel jLabel14;
    private JLabel jLabel16;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel6;
    private JLabel lblConceptoPago;
    private JLabel lblFechaAdjudicacion;
    private JLabel lblHoraAdjudicacion;
    private JLabel lblHusoHorario;
    private JLabel lblIdEvento;
    private JLabel lblImporte;
    private JLabel lblTipoBien;
    private JPanel metodoPagoPanel;
    // End of variables declaration//GEN-END:variables
}
