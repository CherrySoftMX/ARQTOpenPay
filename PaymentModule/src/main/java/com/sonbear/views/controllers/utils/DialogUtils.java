package com.sonbear.views.controllers.utils;

import java.awt.Dialog;
import java.awt.Window;
import javax.swing.JDialog;

/**
 *
 * @author Sonbear
 */
public class DialogUtils {

    public static void showDialogAndWait(Window relativeTo, JDialog dialog) {
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        showDialog(relativeTo, dialog);
    }

    public static void showDialog(Window relativeTo, JDialog dialog) {
        dialog.setLocationRelativeTo(relativeTo);
        dialog.setVisible(true);
    }

    public static void quitarDialog(JDialog dialog) {
        if (dialog != null)
            dialog.dispose();
    }

}
