package com.sonbear.views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 *
 * @author Sonbear
 */
public class Login extends JFrame {

    public Login() {
        initLookAndFeel();
        initComponents();
    }

    private void initLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        btnSeller = new JButton();
        btnBuyer = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        setBackground(new Color(0, 0, 0));
        setMinimumSize(new Dimension(350, 100));
        getContentPane().setLayout(new GridBagLayout());

        btnSeller.setText("Soy vendedor");
        btnSeller.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(btnSeller, gridBagConstraints);

        btnBuyer.setText("Soy comprador");
        btnBuyer.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(btnBuyer, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnBuyer() {
        return btnBuyer;
    }

    public JButton getBtnSeller() {
        return btnSeller;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnBuyer;
    private JButton btnSeller;
    // End of variables declaration//GEN-END:variables
}
