package com.sonbear.views;

import com.sonbear.views.controllers.utils.DialogUtils;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author Sonbear
 */
public class LoadingFrame extends JDialog {

    private static LoadingFrame instance;

    public synchronized static LoadingFrame getInstance() {
        if (instance == null)
            instance = new LoadingFrame();

        return instance;
    }

    private LoadingFrame() {
        initComponents();
    }

    public static void showLoadingFrame(Window relativeTo) {
        DialogUtils.showDialog(relativeTo, LoadingFrame.getInstance());
    }

    public static void disposeLoadingFrame() {
        DialogUtils.quitarDialog(LoadingFrame.getInstance());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        jLabel1 = new JLabel();
        jProgressBar1 = new JProgressBar();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new Dimension(300, 95));
        setUndecorated(true);
        getContentPane().setLayout(new GridBagLayout());

        jLabel1.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Loading...");
        jLabel1.setAlignmentX(0.5F);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(jLabel1, gridBagConstraints);

        jProgressBar1.setIndeterminate(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new Insets(5, 20, 5, 20);
        getContentPane().add(jProgressBar1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel1;
    private JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
