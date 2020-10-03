package com.sonbear.views;

import com.sonbear.views.controllers.utils.ButtonCellEditor;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Window;
import javax.swing.Box;
import javax.swing.GroupLayout;
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
public class BuyersView extends JDialog implements UIConstants {

    public BuyersView(Window owner) {
        super(owner);
        initComponents();
        initTables();
    }

    private void initTables() {
        tablePosts.getColumnModel().getColumn(2).setCellRenderer((table, value, isSelected, hasFocus, row, column) -> {
            JButton button = new JButton(DEFAULT_ROW_ICON);
            button.setToolTipText("¡Me interesa!");
            return button;
        });

        tablePosts.getColumnModel().getColumn(2).setCellEditor(new ButtonCellEditor(DEFAULT_ROW_ICON));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        filler1 = new Box.Filler(new Dimension(0, 5), new Dimension(0, 5), new Dimension(32767, 5));
        filler2 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        filler3 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        filler4 = new Box.Filler(new Dimension(0, 5), new Dimension(0, 5), new Dimension(32767, 5));
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        tablePosts = new JTable();

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Posts disponibles");
        setMaximumSize(new Dimension(425, 300));
        setMinimumSize(new Dimension(425, 300));
        setPreferredSize(new Dimension(425, 300));
        getContentPane().add(filler1, BorderLayout.SOUTH);
        getContentPane().add(filler2, BorderLayout.LINE_START);
        getContentPane().add(filler3, BorderLayout.LINE_END);
        getContentPane().add(filler4, BorderLayout.PAGE_START);

        jPanel2.setLayout(new BorderLayout());

        jLabel1.setText("Posts disponibles:");
        jPanel2.add(jLabel1, BorderLayout.PAGE_START);

        tablePosts.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Concepto", "Tipo de bien", "Comprar"
            }
        ));
        tablePosts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablePosts);
        if (tablePosts.getColumnModel().getColumnCount() > 0) {
            tablePosts.getColumnModel().getColumn(1).setMinWidth(120);
            tablePosts.getColumnModel().getColumn(1).setPreferredWidth(120);
            tablePosts.getColumnModel().getColumn(1).setMaxWidth(120);
            tablePosts.getColumnModel().getColumn(2).setMinWidth(60);
            tablePosts.getColumnModel().getColumn(2).setPreferredWidth(60);
            tablePosts.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        jPanel2.add(jScrollPane1, BorderLayout.CENTER);

        getContentPane().add(jPanel2, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTable getTablePosts() {
        return tablePosts;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Box.Filler filler1;
    private Box.Filler filler2;
    private Box.Filler filler3;
    private Box.Filler filler4;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable tablePosts;
    // End of variables declaration//GEN-END:variables
}
