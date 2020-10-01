package com.hikingcarrot7.model.services;

import com.hikingcarrot7.model.database.DataAccessService;
import com.hikingcarrot7.model.database.SellerDataAccessService;
import com.hikingcarrot7.model.entities.Seller;
import java.util.List;

/**
 *
 * @author HikingCarrot7
 */
public class SellerService {

    private static SellerService instance;

    public synchronized static SellerService getInstance() {
        if (instance == null)
            instance = new SellerService();

        return instance;
    }

    private final DataAccessService<Seller> dao;

    private SellerService() {
        this.dao = new SellerDataAccessService();
    }

    public void insertSeller(Seller seller) {
        dao.insertEntity(seller);
    }

    public void removeSeller(Seller seller) {
        dao.removeEntity(seller);
    }

    public Seller getSellerById(String id) {
        return dao.selectEntityById(id).orElse(null);
    }

    public List<Seller> getAllSellers() {
        return dao.getAllEntities();
    }

}
