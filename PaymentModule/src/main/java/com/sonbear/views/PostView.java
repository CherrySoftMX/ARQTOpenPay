package com.sonbear.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
public class PostView extends JDialog {

    public PostView(Window owner) {
        super(owner);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jButton1 = new JButton();
        filler1 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        filler2 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        filler3 = new Box.Filler(new Dimension(0, 5), new Dimension(0, 5), new Dimension(32767, 5));
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jPanel4 = new JPanel();
        jLabel2 = new JLabel();
        jScrollPane2 = new JScrollPane();
        jTable2 = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Posts del vendedor");
        setMaximumSize(new Dimension(500, 390));
        setMinimumSize(new Dimension(500, 390));
        setPreferredSize(new Dimension(500, 390));

        jPanel1.setLayout(new FlowLayout(FlowLayout.RIGHT));

        jButton1.setText("Crear nuevo post");
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1, BorderLayout.PAGE_START);
        getContentPane().add(filler1, BorderLayout.LINE_END);
        getContentPane().add(filler2, BorderLayout.LINE_START);
        getContentPane().add(filler3, BorderLayout.PAGE_END);

        jPanel2.setLayout(new GridLayout(2, 1, 0, 5));

        jPanel3.setLayout(new BorderLayout());

        jLabel1.setText("Post publicados:");
        jPanel3.add(jLabel1, BorderLayout.PAGE_START);

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Concepto", "Tipo de bien", "Eliminar"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(120);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(120);
            jTable1.getColumnModel().getColumn(2).setMinWidth(60);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        jPanel3.add(jScrollPane1, BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new BorderLayout());

        jLabel2.setText("Post creados:");
        jPanel4.add(jLabel2, BorderLayout.PAGE_START);

        jTable2.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Concepto", "Tipo de bien", "Publicar"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setMinWidth(120);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(120);
            jTable2.getColumnModel().getColumn(2).setMinWidth(60);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        jPanel4.add(jScrollPane2, BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Box.Filler filler1;
    private Box.Filler filler2;
    private Box.Filler filler3;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable jTable1;
    private JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
