package com.sonbear.model.services;

import com.sonbear.model.database.DataAccessService;
import com.sonbear.model.database.PostDataAccessService;
import com.sonbear.model.entities.Post;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Sonbear
 */
public class PostService {

    private static PostService instance;

    public synchronized static PostService getInstance() {
        if (instance == null)
            instance = new PostService();

        return instance;
    }

    private final DataAccessService<Post> dao;
    private final SellerService sellerService;

    private PostService() {
        this.dao = new PostDataAccessService();
        this.sellerService = SellerService.getInstance();
    }

    public void insertPost(Post post) {
        String sellerId = post.getSellerId();
        if (sellerService.existSeller(sellerId))
            dao.insertEntity(post);
    }

    public boolean removePost(Post post) {
        return dao.removeEntity(post);
    }

    public Post getPostById(String id) {
        return dao.selectEntityById(id).orElse(null);
    }

    public boolean updatePost(String id, Post post) {
        return dao.updateEntityById(id, post);
    }

    public List<Post> getAllPosts(String sellerId) {
        List<Post> allPosts = PostService.this.getAllPosts();
        return allPosts.stream()
                .filter(post -> post.getSellerId().equals(sellerId))
                .collect(Collectors.toList());
    }

    public List<Post> getAllPublishedPosts(String sellerId) {
        List<Post> postFromSeller = getAllPosts(sellerId);
        return postFromSeller.stream()
                .filter(Post::isPublished)
                .collect(Collectors.toList());
    }

    public List<Post> getAllUnpublishedPosts(String sellerId) {
        List<Post> postFromSeller = getAllPosts(sellerId);
        return postFromSeller.stream()
                .filter(posts -> !posts.isPublished())
                .collect(Collectors.toList());
    }

    public boolean isPublishedPost(String postId) {
        return dao.selectEntityById(postId)
                .map(Post::isPublished)
                .orElse(false);
    }

    public List<Post> getAllPublishedPost() {
        return dao.getAllEntities()
                .stream()
                .filter(Post::isPublished)
                .collect(Collectors.toList());
    }

    public List<Post> getAllUnpublishedPosts() {
        return dao.getAllEntities()
                .stream()
                .filter(post -> !post.isPublished())
                .collect(Collectors.toList());
    }

    public List<Post> getAllPosts() {
        return dao.getAllEntities();
    }

}
