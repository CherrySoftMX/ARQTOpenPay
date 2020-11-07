package com.sonbear.views.controllers;

import com.sonbear.controllers.PostController;
import com.sonbear.controllers.SellerController;
import com.sonbear.model.entities.Seller;
import com.sonbear.model.services.exceptions.ServiceException;
import com.sonbear.views.PostsView;
import com.sonbear.views.SellerForm;
import com.sonbear.views.SellersView;
import com.sonbear.views.UIConstants;
import com.sonbear.views.controllers.utils.AlertUtils;
import com.sonbear.views.controllers.utils.DialogUtils;
import com.sonbear.views.controllers.utils.TableUtils;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;

/**
 *
 * @author Sonbear
 */
public class SellersViewController implements UIConstants {

    private final int BOTON_ELIMINAR_VENDEDOR = 1;
    private final int BOTON_INICIAR_SESION = 2;

    private final SellersView sellersView;
    private final SellerController sellerController;

    public SellersViewController(SellersView sellersView, SellerController sellerController) {
        this.sellersView = sellersView;
        this.sellerController = sellerController;
        initComponents();
    }

    private void initComponents() {
        initSellersTable();
        sellersView.getBtnAddSeller().addActionListener(this::actionBtnAddSeller);
    }

    private void initSellersTable() {
        JTable sellersTable = sellersView.getTableSellers();
        TableUtils.initTable(sellersTable);
        TableUtils.initTableSelectionBehavior(sellersTable);
        TableUtils.quitarCabeceraTabla(sellersTable);
        sellersTable.getModel().addTableModelListener(this::clicEnTablaVendedores);
        loadRegisteredSellers();
    }

    private void loadRegisteredSellers() {
        JTable table = sellersView.getTableSellers();
        loadRegisteredSellers(table, sellerController.getAllRegisteredSellers());
    }

    private void loadRegisteredSellers(JTable table, List<Seller> sellers) {
        TableUtils.vaciarTabla(table);
        TableUtils.setTableItems(table, sellers, seller -> new Object[]{seller.getFullName()});
    }

    private void actionBtnAddSeller(ActionEvent e) {
        SellerForm sellerForm = new SellerForm(sellersView);
        Seller newSeller = new Seller();
        SellerFormController controller = new SellerFormController(sellerForm, newSeller);
        DialogUtils.showDialogAndWait(sellersView, sellerForm);

        if (controller.isNewSellerAccepted()) {
            insertNewSeller(newSeller);
            loadRegisteredSellers();
        }
    }

    private void signInSeller(int idxSeller) {
        Seller seller = getSeller(idxSeller);
        signInSeller(seller);
    }

    private void signInSeller(Seller seller) {
        PostsView postView = new PostsView(sellersView);
        new PostsViewController(postView, new PostController(), seller);
        DialogUtils.showDialogAndWait(sellersView, postView);
    }

    private void clicEnTablaVendedores(TableModelEvent e) {
        if (e.getColumn() == BOTON_INICIAR_SESION)
            signInSeller(e.getFirstRow());

        if (e.getColumn() == BOTON_ELIMINAR_VENDEDOR) {
            deleteSeller(e.getFirstRow());
            loadRegisteredSellers();
        }
    }

    private void insertNewSeller(Seller newSeller) {
        try {
            sellerController.insertSeller(newSeller);
        } catch (ServiceException ex) {
            AlertUtils.mostrarError(sellersView, ex.getMessage());
        }
    }

    private void deleteSeller(int idxSeller) {
        Seller sellerToRemove = getSeller(idxSeller);
        deleteSeller(sellerToRemove);
    }

    private void deleteSeller(Seller seller) {
        try {
            sellerController.removeSeller(seller);
        } catch (ServiceException ex) {
            AlertUtils.mostrarError(sellersView, ex.getMessage());
        }
    }

    private Seller getSeller(int idxSeller) {
        List<Seller> sellers = sellerController.getAllRegisteredSellers();
        return sellers.get(idxSeller);
    }

}
