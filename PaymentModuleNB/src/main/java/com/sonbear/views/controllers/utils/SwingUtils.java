package com.sonbear.views.controllers.utils;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sonbear
 */
public class SwingUtils {

    public static void loadPanel(JPanel parent, JPanel child) {
        parent.removeAll();
        parent.setLayout(new BorderLayout());
        parent.add(child, BorderLayout.CENTER);
        parent.validate();
        parent.repaint();
    }

}
