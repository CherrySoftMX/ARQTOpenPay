package com.hikingcarrot7.model.services;

import com.hikingcarrot7.model.database.FakeBuyerDataAccessService;
import com.hikingcarrot7.model.database.FakeDataAccessService;
import com.hikingcarrot7.model.entities.Buyer;

/**
 *
 * @author HikingCarrot7
 */
public class BuyerService {

    private static BuyerService instance;

    public synchronized static BuyerService getInstance() {
        if (instance == null)
            instance = new BuyerService();

        return instance;
    }

    private BuyerService() {
        this.dao = new FakeBuyerDataAccessService();
    }

    private final FakeDataAccessService dao;

    public void insertBuyer(Buyer buyer) {
        dao.insertEntity(buyer);
    }

    public boolean removeBuyer(Buyer buyer) {
        return dao.removeEntity(buyer);
    }

    public Buyer getBuyerById(String id) {
        return (Buyer) dao.selectEntityById(id).orElse(null);
    }

    public boolean updateBuyer(String id, Buyer buyer) {
        return dao.updateEntityById(id, buyer);
    }

}
