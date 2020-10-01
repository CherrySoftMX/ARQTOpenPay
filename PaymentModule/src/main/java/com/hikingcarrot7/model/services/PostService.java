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

    private PostService() {
        this.dao = new PostDataAccessService();
    }

    public void insertPost(Post post) {
        dao.insertEntity(post);
    }

    public boolean removePost(Post post) {
        return dao.removeEntity(post);
    }

    public Post getPostById(String id) {
        return (Post) dao.selectEntityById(id).orElse(null);
    }

    public boolean updatePost(String id, Post post) {
        return dao.updateEntityById(id, post);
    }

    public List<Post> getAllPaidPost() {
        return dao.getAllEntities()
                .stream()
                .map(entity -> (Post) entity)
                .filter(Post::isPaidOut)
                .collect(Collectors.toList());
    }

}
