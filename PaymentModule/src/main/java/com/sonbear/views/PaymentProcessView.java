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
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.WindowConstants;

/**
 *
 * @author Sonbear
 */
public class PaymentProcessView extends JFrame {

    public PaymentProcessView() {
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
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jPanel3 = new JPanel();
        jLabel16 = new JLabel();
        jPanel6 = new JPanel();
        jToggleButton1 = new JToggleButton();
        jToggleButton2 = new JToggleButton();
        jPanel4 = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment process");
        setMaximumSize(new Dimension(610, 640));
        setMinimumSize(new Dimension(610, 640));
        setPreferredSize(new Dimension(610, 640));

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

        jLabel4.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("REALIZACIÓN DE UN EVENTO DE SUBASTA");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("2020-09-16");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jLabel5, gridBagConstraints);

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

        jLabel7.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Correo");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel7, gridBagConstraints);

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

        jLabel9.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("12:00 AM");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel9, gridBagConstraints);

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

        jLabel11.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("MXN236478236487236");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel11, gridBagConstraints);

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

        jLabel13.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Africa/Abidjan");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel13, gridBagConstraints);

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

        jLabel15.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("$15");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(0, 0, 10, 0);
        jPanel2.add(jLabel15, gridBagConstraints);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new BorderLayout());

        jLabel16.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Seleccione un método de pago:");
        jPanel3.add(jLabel16, BorderLayout.PAGE_START);

        jPanel6.setLayout(new GridBagLayout());

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setIcon(new ImageIcon(getClass().getResource("/card.png"))); // NOI18N
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(0, 5, 0, 5);
        jPanel6.add(jToggleButton1, gridBagConstraints);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setIcon(new ImageIcon(getClass().getResource("/oxxo.png"))); // NOI18N
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(0, 5, 0, 5);
        jPanel6.add(jToggleButton2, gridBagConstraints);

        jPanel3.add(jPanel6, BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new BorderLayout());
        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonGroup buttonGroup1;
    private Box.Filler filler1;
    private Box.Filler filler2;
    private Box.Filler filler3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel6;
    private JToggleButton jToggleButton1;
    private JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
