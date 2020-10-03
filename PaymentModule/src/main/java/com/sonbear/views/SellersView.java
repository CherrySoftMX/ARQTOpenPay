package com.sonbear.views;

import static com.sonbear.views.UIConstants.DEFAULT_ROW_ICON;
import com.sonbear.views.controllers.utils.ButtonCellEditor;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
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
public class SellersView extends JDialog implements UIConstants {

    public SellersView(Window owner) {
        super(owner);
        initComponents();
        initTables();
    }

    private void initTables() {
        tableSellers.getColumnModel().getColumn(1).setCellRenderer((table, value, isSelected, hasFocus, row, column) -> {
            JButton button = new JButton(DEFAULT_DELETE_ICON);
            button.setToolTipText("Eliminar vendedor");
            return button;
        });

        tableSellers.getColumnModel().getColumn(2).setCellRenderer((table, value, isSelected, hasFocus, row, column) -> {
            JButton button = new JButton(DEFAULT_ROW_ICON);
            button.setToolTipText("Iniciar sesión");
            return button;
        });

        tableSellers.getColumnModel().getColumn(1).setCellEditor(new ButtonCellEditor(DEFAULT_DELETE_ICON));
        tableSellers.getColumnModel().getColumn(2).setCellEditor(new ButtonCellEditor(DEFAULT_ROW_ICON));
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

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendedores registrados");
        setMaximumSize(new Dimension(425, 300));
        setMinimumSize(new Dimension(425, 300));
        setPreferredSize(new Dimension(425, 300));

        FlowLayout flowLayout1 = new FlowLayout(FlowLayout.RIGHT);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        btnAddSeller.setText("Agregar vendedor");
        btnAddSeller.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jPanel1.add(btnAddSeller);

        getContentPane().add(jPanel1, BorderLayout.PAGE_START);

        jPanel2.setLayout(new BorderLayout());

        tableSellers.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Delete", "Iniciar sesión"
            }
        ));
        jScrollPane1.setViewportView(tableSellers);
        if (tableSellers.getColumnModel().getColumnCount() > 0) {
            tableSellers.getColumnModel().getColumn(1).setMinWidth(50);
            tableSellers.getColumnModel().getColumn(1).setPreferredWidth(50);
            tableSellers.getColumnModel().getColumn(1).setMaxWidth(50);
            tableSellers.getColumnModel().getColumn(2).setMinWidth(50);
            tableSellers.getColumnModel().getColumn(2).setPreferredWidth(50);
            tableSellers.getColumnModel().getColumn(2).setMaxWidth(50);
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

    public JButton getBtnAddSeller() {
        return btnAddSeller;
    }

    public JTable getTableSellers() {
        return tableSellers;
    }

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
