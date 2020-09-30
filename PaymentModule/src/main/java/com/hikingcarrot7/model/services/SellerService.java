package com.hikingcarrot7.model.services;

import com.hikingcarrot7.model.database.FakeDataAccessService;
import com.hikingcarrot7.model.database.FakeSellerDataAccessService;
import com.hikingcarrot7.model.entities.Seller;

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

    private SellerService() {
        this.dao = new FakeSellerDataAccessService();
    }

    private final FakeDataAccessService dao;

    public void insertSeller(Seller seller) {
        dao.insertEntity(seller);
    }

    public void removeSeller(Seller seller) {
        dao.removeEntity(seller);
    }

    public Seller getSellerById(String id) {
        return (Seller) dao.selectEntityById(id).orElse(null);
    }

}
