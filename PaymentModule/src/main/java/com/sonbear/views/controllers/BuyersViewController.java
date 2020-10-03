package com.sonbear.views.controllers;

import com.sonbear.controllers.PostController;
import com.sonbear.model.entities.Post;
import com.sonbear.views.BuyersView;
import com.sonbear.views.PaymentProcessView;
import com.sonbear.views.controllers.behaviors.BuyerTransactionBehavior;
import com.sonbear.views.controllers.utils.DialogUtils;
import com.sonbear.views.controllers.utils.TableUtils;
import java.util.List;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;

/**
 *
 * @author HikingCarrot7
 */
public class BuyersViewController {

    private static final int BOTON_REVISAR_POST = 2;

    private final BuyersView buyersView;
    private final PostController postController;

    public BuyersViewController(BuyersView buyersView) {
        this.buyersView = buyersView;
        this.postController = new PostController();
        initComponents();
    }

    private void initComponents() {
        JTable table = buyersView.getTablePosts();
        TableUtils.initTable(table);
        TableUtils.initTableSelectionBehavior(table);
        table.getModel().addTableModelListener(this::clicEnPublishedPosts);
        loadPublishedPosts();
    }

    private void loadPublishedPosts() {
        JTable table = buyersView.getTablePosts();
        List<Post> publishedPosts = postController.getAllPublishedPost();
        loadPublishedPosts(table, publishedPosts);
    }

    private void loadPublishedPosts(JTable table, List<Post> posts) {
        TableUtils.setTableItems(table, posts, post -> new Object[]{post.getConceptoPago(), post.getTipoBien()});
    }

    private void clicEnPublishedPosts(TableModelEvent e) {
        if (e.getColumn() == BOTON_REVISAR_POST)
            revisarPost(e.getFirstRow());
    }

    private void revisarPost(int idxPost) {
        List<Post> posts = postController.getAllPublishedPost();
        revisarPost(posts.get(idxPost));
    }

    private void revisarPost(Post post) {
        PaymentProcessView paymentProcessView = new PaymentProcessView(buyersView);
        new PaymentProcessController(paymentProcessView, new BuyerTransactionBehavior(), post);
        DialogUtils.showDialogAndWait(buyersView, paymentProcessView);
    }

}
