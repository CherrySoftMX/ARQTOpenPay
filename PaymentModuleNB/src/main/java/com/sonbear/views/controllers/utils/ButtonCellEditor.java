package com.sonbear.views.controllers.utils;

import com.sonbear.views.UIConstants;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Nicolás
 */
public final class ButtonCellEditor extends DefaultCellEditor implements UIConstants {

    private JButton button;

    public ButtonCellEditor(Icon icon) {
        this(new JTextField(), icon);
    }

    private ButtonCellEditor(JTextField textField, Icon icon) {
        super(textField);
        button = new JButton();
        button.setIcon(icon);
        button.addActionListener(e -> fireEditingStopped());
        setClickCountToStart(1);
    }

    @Override public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return button;
    }

}
