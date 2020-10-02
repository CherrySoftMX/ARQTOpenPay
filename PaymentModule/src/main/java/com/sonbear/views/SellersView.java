package com.sonbear.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sonbear
 */
public class SellersView extends JFrame {

    public SellersView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        btnAddSeller = new JButton();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        tableSellers = new JTable();
        jLabel1 = new JLabel();
        filler1 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        filler2 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        filler3 = new Box.Filler(new Dimension(0, 5), new Dimension(0, 5), new Dimension(32767, 5));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendedores registrados");
        setMaximumSize(new Dimension(425, 300));
        setMinimumSize(new Dimension(425, 300));
        setPreferredSize(new Dimension(425, 300));

        FlowLayout flowLayout1 = new FlowLayout(FlowLayout.RIGHT);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        btnAddSeller.setText("Agregar vendedor");
        jPanel1.add(btnAddSeller);

        getContentPane().add(jPanel1, BorderLayout.PAGE_START);

        jPanel2.setLayout(new BorderLayout());

        tableSellers.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Iniciar sesión"
            }
        ));
        jScrollPane1.setViewportView(tableSellers);
        if (tableSellers.getColumnModel().getColumnCount() > 0) {
            tableSellers.getColumnModel().getColumn(1).setMinWidth(85);
            tableSellers.getColumnModel().getColumn(1).setPreferredWidth(85);
            tableSellers.getColumnModel().getColumn(1).setMaxWidth(85);
        }

        jPanel2.add(jScrollPane1, BorderLayout.CENTER);

        jLabel1.setText("Vendedores registrados:");
        jPanel2.add(jLabel1, BorderLayout.PAGE_START);

        getContentPane().add(jPanel2, BorderLayout.CENTER);
        getContentPane().add(filler1, BorderLayout.LINE_END);
        getContentPane().add(filler2, BorderLayout.LINE_START);
        getContentPane().add(filler3, BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAddSeller;
    private Box.Filler filler1;
    private Box.Filler filler2;
    private Box.Filler filler3;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable tableSellers;
    // End of variables declaration//GEN-END:variables
}
