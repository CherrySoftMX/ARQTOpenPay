package com.sonbear.views.controllers;

import com.sonbear.controllers.PostController;
import com.sonbear.model.entities.Post;
import com.sonbear.model.entities.Seller;
import com.sonbear.views.PaymentProcessView;
import com.sonbear.views.PostForm;
import com.sonbear.views.PostsView;
import com.sonbear.views.controllers.behaviors.SellerTransactionBehavior;
import com.sonbear.views.controllers.utils.DialogUtils;
import com.sonbear.views.controllers.utils.TableUtils;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author Sonbear
 */
public class PostsViewController {

    private final PostsView postsView;
    private final PostController postController;
    private final Seller seller;

    public PostsViewController(PostsView postView, PostController postController, Seller seller) {
        this.postsView = postView;
        this.seller = seller;
        this.postController = postController;
        initComponents();
    }

    private void initComponents() {
        postsView.getBtnCreateNewPost().addActionListener(this::actionBtnCreateNewPost);
        initTable(postsView.getPublishedPostsTable(), this::clicEnPublishedPostsTabla);
        initTable(postsView.getUnpublishedPostsTable(), this::clicEnUnpublishedPostsTabla);
        loadPublishedPosts();
        loadUnpublishedPosts();
    }

    private void initTable(JTable table, TableModelListener listener) {
        TableUtils.initTable(table);
        TableUtils.initTableSelectionBehavior(table);
        table.getModel().addTableModelListener(listener);
    }

    private void loadPublishedPosts() {
        List<Post> publishedPosts = postController.getAllPublishedPosts(seller.getId());
        JTable table = postsView.getPublishedPostsTable();
        loadPosts(table, publishedPosts);
    }

    private void loadUnpublishedPosts() {
        List<Post> unpublishedPosts = postController.getAllUnpublishedPosts(seller.getId());
        JTable table = postsView.getUnpublishedPostsTable();
        loadPosts(table, unpublishedPosts);
    }

    private void loadPosts(JTable table, List<Post> posts) {
        TableUtils.vaciarTabla(table);
        TableUtils.setTableItems(table, posts, post -> new Object[]{post.getConceptoPago(), post.getTipoBien()});
    }

    private void actionBtnCreateNewPost(ActionEvent e) {
        PostForm postForm = new PostForm(postsView);
        Post newPost = new Post(seller.getId());
        PostFormController controller = new PostFormController(postForm, newPost);
        DialogUtils.showDialogAndWait(postsView, postForm);

        if (controller.isNewPostAccepted()) {
            insertNewPost(newPost);
            loadUnpublishedPosts();
        }
    }

    private void clicEnPublishedPostsTabla(TableModelEvent e) {
        if (e.getColumn() == PostsView.BOTON_DELETE_PUBLISHED_POST) {
            deletePublishedPost(e.getFirstRow());
            loadPublishedPosts();
        }
    }

    private void clicEnUnpublishedPostsTabla(TableModelEvent e) {
        if (e.getColumn() == PostsView.BOTON_PUBLISH_POST)
            publishPost(e.getFirstRow());
    }

    private void publishPost(int idxPost) {
        List<Post> posts = postController.getAllUnpublishedPosts(seller.getId());
        publishPost(posts.get(idxPost));
    }

    private void publishPost(Post post) {
        PaymentProcessView paymentProcessView = new PaymentProcessView(postsView);
        new PaymentProcessController(paymentProcessView, new SellerTransactionBehavior(), post);
        DialogUtils.showDialogAndWait(postsView, paymentProcessView);
        loadPublishedPosts();
        loadUnpublishedPosts();
    }

    private void deletePublishedPost(int idxPost) {
        List<Post> posts = postController.getAllPublishedPosts(seller.getId());
        deletePost(posts.get(idxPost));
    }

    private void deletePost(Post post) {
        postController.removePost(post);
    }

    private void insertNewPost(Post post) {
        postController.insertPost(post);
    }

}
