package com.hikingcarrot7.controllers;

import com.hikingcarrot7.model.entities.Buyer;
import com.hikingcarrot7.model.services.BuyerService;
import com.hikingcarrot7.model.services.exceptions.ServiceException;

/**
 *
 * @author HikingCarrot7
 */
public class BuyerController {

    private final BuyerService buyerService;

    public BuyerController() {
        this.buyerService = BuyerService.getInstance();
    }

    public void insertBuyer(Buyer buyer) throws ServiceException {
        buyerService.insertBuyer(buyer);
    }

    public void removeBuyer(Buyer buyer) throws ServiceException {
        buyerService.removeBuyer(buyer);
    }

    public Buyer getBuyerById(String id) {
        return buyerService.getBuyerById(id);
    }

    public boolean updateBuyer(String id, Buyer buyer) {
        return buyerService.updateBuyer(id, buyer);
    }

}
