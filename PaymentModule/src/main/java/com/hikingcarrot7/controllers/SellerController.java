package com.hikingcarrot7.controllers;

import com.hikingcarrot7.model.entities.Seller;
import com.hikingcarrot7.model.services.SellerService;
import com.hikingcarrot7.model.services.exceptions.ServiceException;

/**
 *
 * @author HikingCarrot7
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

}
