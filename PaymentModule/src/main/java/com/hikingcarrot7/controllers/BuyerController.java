package com.hikingcarrot7.controllers;

import com.hikingcarrot7.model.entities.Buyer;
import com.hikingcarrot7.model.services.BuyerService;

/**
 *
 * @author HikingCarrot7
 */
public class BuyerController {

    private final BuyerService buyerService;

    public BuyerController() {
        this.buyerService = BuyerService.getInstance();
    }

    public void insertBuyer(Buyer buyer) {
        buyerService.insertBuyer(buyer);
    }

    public void removeBuyer(Buyer buyer) {
        buyerService.removeBuyer(buyer);
    }

    public Buyer getBuyerById(String id) {
        return buyerService.getBuyerById(id);
    }

    public boolean updateBuyer(String id, Buyer buyer) {
        return buyerService.updateBuyer(id, buyer);
    }

}
