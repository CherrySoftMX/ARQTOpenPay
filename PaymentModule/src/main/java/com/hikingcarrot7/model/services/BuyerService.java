package com.hikingcarrot7.model.services;

import com.hikingcarrot7.model.database.BuyerDataAccessService;
import com.hikingcarrot7.model.database.DataAccessService;
import com.hikingcarrot7.model.entities.Buyer;
import com.hikingcarrot7.model.services.exceptions.ServiceException;
import com.hikingcarrot7.model.services.openpay.APIService;
import com.hikingcarrot7.model.services.openpay.OpenpayAPIService;
import java.util.List;

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

    private final APIService apiService;
    private final DataAccessService dao;

    private BuyerService() {
        dao = new BuyerDataAccessService();
        apiService = OpenpayAPIService.getOpenpayAPI();
    }

    public void insertBuyer(Buyer buyer) throws ServiceException {
        if (!existBuyer(buyer.getId())) {
            buyer = (Buyer) apiService.registerUser(buyer);
            dao.insertEntity(buyer);
        }
    }

    public void removeBuyer(Buyer buyer) throws ServiceException {
        if (existBuyer(buyer.getId())) {
            apiService.deleteUser(buyer);
            dao.removeEntity(buyer);
        }
    }

    public boolean existBuyer(String id) {
        return dao.existEntity(id);
    }

    public Buyer getBuyerById(String id) {
        return (Buyer) dao.selectEntityById(id).orElse(null);
    }

    public boolean updateBuyer(String id, Buyer buyer) {
        return dao.updateEntityById(id, buyer);
    }

    public List<Buyer> getAllBuyers() {
        return dao.getAllEntities();
    }

}
