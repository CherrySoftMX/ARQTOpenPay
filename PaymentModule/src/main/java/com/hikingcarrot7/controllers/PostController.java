package com.hikingcarrot7.controllers;

import com.hikingcarrot7.model.entities.Post;
import com.hikingcarrot7.model.services.PostService;
import java.util.List;

/**
 *
 * @author HikingCarrot7
 */
public class PostController {

    private final PostService postService;

    public PostController() {
        this.postService = PostService.getInstance();
    }

    public void insertPost(Post post) {
        postService.insertPost(post);
    }

    public void removePost(Post post) {
        postService.removePost(post);
    }

    public Post getPostById(String id) {
        return postService.getPostById(id);
    }

    public boolean updatePost(String id, Post post) {
        return postService.updatePost(id, post);
    }

    public List<Post> getAllPaidPost() {
        return postService.getAllPaidPost();
    }

}
