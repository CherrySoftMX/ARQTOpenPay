package com.sonbear.controllers;

import com.sonbear.model.entities.Seller;
import com.sonbear.model.services.SellerService;
import com.sonbear.model.services.exceptions.ServiceException;
import java.util.List;

/**
 *
 * @author Sonbear
 */
public class SellerController {

    private final SellerService sellerService;

    public SellerController() {
        this.sellerService = SellerService.getInstance();
    }

    public void insertSeller(Seller seller) throws ServiceException {
        sellerService.insertSeller(seller);
    }

    public void removeSeller(Seller seller) throws ServiceException {
        sellerService.removeSeller(seller);
    }

    public Seller getSellerById(String id) {
        return sellerService.getSellerById(id);
    }

    public List<Seller> getAllRegisteredSellers() {
        return sellerService.getAllSellers();
    }

}
