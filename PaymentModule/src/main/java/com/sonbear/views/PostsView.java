package com.sonbear.views;

import com.sonbear.views.controllers.utils.ButtonCellEditor;
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
public class PostsView extends JDialog implements UIConstants {

    public PostsView(Window owner) {
        super(owner);
        initComponents();
        initTables();
    }

    private void initTables() {
        publishedPostsTable.getColumnModel().getColumn(2).setCellRenderer((table, value, isSelected, hasFocus, row, column) -> {
            JButton button = new JButton(DEFAULT_DELETE_ICON);
            button.setToolTipText("Eliminar post");
            return button;
        });

        unpublishedPostsTable.getColumnModel().getColumn(2).setCellRenderer((table, value, isSelected, hasFocus, row, column) -> {
            JButton button = new JButton(DEFAULT_ROW_ICON);
            button.setToolTipText("Publicar post");
            return button;
        });

        publishedPostsTable.getColumnModel().getColumn(2).setCellEditor(new ButtonCellEditor(DEFAULT_DELETE_ICON));
        unpublishedPostsTable.getColumnModel().getColumn(2).setCellEditor(new ButtonCellEditor(DEFAULT_ROW_ICON));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        btnCreateNewPost = new JButton();
        filler1 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        filler2 = new Box.Filler(new Dimension(5, 0), new Dimension(5, 0), new Dimension(5, 32767));
        filler3 = new Box.Filler(new Dimension(0, 5), new Dimension(0, 5), new Dimension(32767, 5));
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        publishedPostsTable = new JTable();
        jPanel4 = new JPanel();
        jLabel2 = new JLabel();
        jScrollPane2 = new JScrollPane();
        unpublishedPostsTable = new JTable();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Posts del vendedor");
        setMaximumSize(new Dimension(500, 390));
        setMinimumSize(new Dimension(500, 390));
        setPreferredSize(new Dimension(500, 390));

        jPanel1.setLayout(new FlowLayout(FlowLayout.RIGHT));

        btnCreateNewPost.setText("Crear nuevo post");
        jPanel1.add(btnCreateNewPost);

        getContentPane().add(jPanel1, BorderLayout.PAGE_START);
        getContentPane().add(filler1, BorderLayout.LINE_END);
        getContentPane().add(filler2, BorderLayout.LINE_START);
        getContentPane().add(filler3, BorderLayout.PAGE_END);

        jPanel2.setLayout(new GridLayout(2, 1, 0, 5));

        jPanel3.setLayout(new BorderLayout());

        jLabel1.setText("Post publicados:");
        jPanel3.add(jLabel1, BorderLayout.PAGE_START);

        publishedPostsTable.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Concepto", "Tipo de bien", "Eliminar"
            }
        ));
        jScrollPane1.setViewportView(publishedPostsTable);
        if (publishedPostsTable.getColumnModel().getColumnCount() > 0) {
            publishedPostsTable.getColumnModel().getColumn(1).setMinWidth(120);
            publishedPostsTable.getColumnModel().getColumn(1).setPreferredWidth(120);
            publishedPostsTable.getColumnModel().getColumn(1).setMaxWidth(120);
            publishedPostsTable.getColumnModel().getColumn(2).setMinWidth(60);
            publishedPostsTable.getColumnModel().getColumn(2).setPreferredWidth(60);
            publishedPostsTable.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        jPanel3.add(jScrollPane1, BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new BorderLayout());

        jLabel2.setText("Post no publicados:");
        jPanel4.add(jLabel2, BorderLayout.PAGE_START);

        unpublishedPostsTable.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Concepto", "Tipo de bien", "Publicar"
            }
        ));
        jScrollPane2.setViewportView(unpublishedPostsTable);
        if (unpublishedPostsTable.getColumnModel().getColumnCount() > 0) {
            unpublishedPostsTable.getColumnModel().getColumn(1).setMinWidth(120);
            unpublishedPostsTable.getColumnModel().getColumn(1).setPreferredWidth(120);
            unpublishedPostsTable.getColumnModel().getColumn(1).setMaxWidth(120);
            unpublishedPostsTable.getColumnModel().getColumn(2).setMinWidth(60);
            unpublishedPostsTable.getColumnModel().getColumn(2).setPreferredWidth(60);
            unpublishedPostsTable.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        jPanel4.add(jScrollPane2, BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2, BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnCreateNewPost() {
        return btnCreateNewPost;
    }

    public JTable getPublishedPostsTable() {
        return publishedPostsTable;
    }

    public JTable getUnpublishedPostsTable() {
        return unpublishedPostsTable;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnCreateNewPost;
    private Box.Filler filler1;
    private Box.Filler filler2;
    private Box.Filler filler3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable publishedPostsTable;
    private JTable unpublishedPostsTable;
    // End of variables declaration//GEN-END:variables
}
