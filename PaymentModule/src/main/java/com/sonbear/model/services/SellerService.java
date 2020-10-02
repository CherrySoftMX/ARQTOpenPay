package com.sonbear.model.services;

import com.sonbear.model.database.DataAccessService;
import com.sonbear.model.database.SellerDataAccessService;
import com.sonbear.model.entities.Seller;
import com.sonbear.model.services.exceptions.ServiceException;
import com.sonbear.model.services.openpay.APIService;
import com.sonbear.model.services.openpay.OpenpayAPIService;
import java.util.List;

/**
 *
 * @author Sonbear
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
