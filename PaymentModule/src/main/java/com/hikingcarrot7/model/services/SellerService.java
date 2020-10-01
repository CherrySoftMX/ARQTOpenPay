package com.hikingcarrot7.model.services;

import com.hikingcarrot7.model.database.DataAccessService;
import com.hikingcarrot7.model.database.SellerDataAccessService;
import com.hikingcarrot7.model.entities.Seller;
import com.hikingcarrot7.model.services.exceptions.ServiceException;
import com.hikingcarrot7.model.services.openpay.APIService;
import com.hikingcarrot7.model.services.openpay.OpenpayAPIService;
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
    private final APIService apiService;

    private SellerService() {
        dao = new SellerDataAccessService();
        apiService = OpenpayAPIService.getOpenpayAPI();
    }

    public void insertSeller(Seller seller) throws ServiceException {
        if (!existSeller(seller.getId())) {
            seller = (Seller) apiService.registerUser(seller);
            dao.insertEntity(seller);
        }
    }

    public void removeSeller(Seller seller) throws ServiceException {
        if (existSeller(seller.getId())) {
            apiService.deleteUser(seller);
            dao.removeEntity(seller);
        }
    }

    public boolean existSeller(String id) {
        return dao.existEntity(id);
    }

    public Seller getSellerById(String id) {
        return dao.selectEntityById(id).orElse(null);
    }

    public boolean updateSellerById(String id, Seller seller) {
        return dao.updateEntityById(id, seller);
    }

    public List<Seller> getAllSellers() {
        return dao.getAllEntities();
    }

}
