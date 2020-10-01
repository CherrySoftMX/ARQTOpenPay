package com.hikingcarrot7.model.services;

import com.hikingcarrot7.model.database.DataAccessService;
import com.hikingcarrot7.model.database.PostDataAccessService;
import com.hikingcarrot7.model.entities.Post;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author HikingCarrot7
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

    public List<Post> getAllPostsFromSeller(String sellerId) {
        List<Post> allPosts = getAllPosts();
        return allPosts.stream()
                .filter(post -> post.getSellerId().equals(sellerId))
                .collect(Collectors.toList());
    }

    public boolean isPostPaid(String postId) {
        return dao.selectEntityById(postId)
                .map(Post::isPaidOut)
                .orElse(false);
    }

    public List<Post> getAllPaidPost() {
        return dao.getAllEntities()
                .stream()
                .filter(Post::isPaidOut)
                .collect(Collectors.toList());
    }

    public List<Post> getAllPosts() {
        return dao.getAllEntities();
    }

}
