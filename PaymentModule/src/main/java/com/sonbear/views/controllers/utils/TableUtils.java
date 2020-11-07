package com.sonbear.views.controllers.utils;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.List;
import java.util.function.Function;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Nicolás
 */
public class TableUtils {

    private TableUtils() {
    }

    public static void initTable(JTable table) {
        JTableHeader header = table.getTableHeader();
        header.setReorderingAllowed(false);
        table.setGridColor(new Color(237, 237, 237));
        table.setRowHeight(25);
        table.setRowSelectionAllowed(true);
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    public static void quitarCabeceraTabla(JTable table) {
        table.getTableHeader().setUI(null);
    }

    public static void initTableSelectionBehavior(JTable table) {
        initTableSelectionBehavior(table, (ActionListener) null);
    }

    public static void initTableSelectionBehavior(JTable table, ActionListener action) {
        initTableSelectionBehavior(table, new FocusAdapter() {

            @Override public void focusLost(FocusEvent e) {
                table.clearSelection();
            }

        }, action);
    }

    public static void initTableSelectionBehavior(JTable table, FocusListener focusListener) {
        initTableSelectionBehavior(table, focusListener, null);
    }

    public static void initTableSelectionBehavior(JTable table, FocusListener focusListener, ActionListener action) {
        table.addFocusListener(focusListener);
        table.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ESCAPE"), "Clear selection");
        table.getActionMap().put("Clear selection", new AbstractAction() {

            @Override public void actionPerformed(ActionEvent e) {
                table.getSelectionModel().clearSelection();

                if (action != null)
                    action.actionPerformed(e);
            }
        });
    }

    public static void setFilas(JTable table, Object[][] elementos) {
        vaciarTabla(table);
        addFilas(table, elementos);
    }

    public static void addFila(JTable table, Object[] fila) {
        DefaultTableModel tableModel = getDefaultTableModel(table);
        tableModel.addRow(fila);
    }

    public static void addFilas(JTable table, Object[][] filas) {
        DefaultTableModel tableModel = getDefaultTableModel(table);

        for (Object[] fila : filas)
            tableModel.addRow(fila);
    }

    public static void eliminarFila(JTable table, int idxFila) {
        DefaultTableModel tableModel = getDefaultTableModel(table);
        tableModel.removeRow(idxFila);
    }

    public static void vaciarTabla(JTable table) {
        DefaultTableModel tableModel = getDefaultTableModel(table);

        while (tableModel.getRowCount() > 0)
            tableModel.removeRow(0);
    }

    public static Object[] getSelectedRowData(JTable table) {
        int selectedRow = table.getSelectedRow();

        if (selectedRow < 0)
            return null;

        Object[] data = new Object[table.getColumnCount()];

        for (int i = 0; i < table.getColumnCount(); i++)
            data[i] = table.getValueAt(selectedRow, i);

        return data;
    }

    public static void selecionarFila(JTable table, int fila) {
        ListSelectionModel listSelectionModel = table.getSelectionModel();
        listSelectionModel.clearSelection();
        listSelectionModel.addSelectionInterval(fila, fila);
    }

    public static void seleccionarFilas(JTable table, int[] indices) {
        for (int i : indices)
            table.getSelectionModel().addSelectionInterval(i, i);
    }

    public static int getRowClicked(JTable table, double y) {
        return (int) (y / table.getRowHeight());
    }

    public static Object[][] getTableData(JTable table) {
        Object[][] items = new Object[table.getRowCount()][table.getColumnCount()];

        for (int i = 0; i < items.length; i++)
            for (int j = 0; j < items[i].length; j++)
                items[i][j] = table.getValueAt(i, j);

        return items;
    }

    public static <T> void setTableItems(JTable table, List<T> items, Function<T, Object[]> mappingFunction) {
        items.forEach(item -> addFila(table, mappingFunction.apply(item)));
    }

    public static void setTableItems(JTable table, Object[][] items) {
        for (int i = 0; i < items.length; i++)
            for (int j = 0; j < items[i].length; j++)
                table.setValueAt(items[i][j], i, j);
    }

    public static void limpiarSeleccion(JTable table) {
        table.getSelectionModel().clearSelection();
    }

    public static void selecionarUltimaFila(JTable table) {
        table.clearSelection();
        int lastIndex = table.getModel().getRowCount() - 1;
        table.getSelectionModel().setSelectionInterval(lastIndex, lastIndex);
    }

    public static int[] getFilasSeleccionadas(JTable table) {
        return table.getSelectedRows();
    }

    public static DefaultTableModel getDefaultTableModel(JTable table) {
        return (DefaultTableModel) table.getModel();
    }

}
