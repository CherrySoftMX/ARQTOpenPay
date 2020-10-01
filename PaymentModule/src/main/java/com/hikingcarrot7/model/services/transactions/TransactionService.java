package com.hikingcarrot7.model.services.transactions;

import com.hikingcarrot7.model.services.exceptions.ServiceException;
import com.hikingcarrot7.model.services.openpay.APIService;
import com.hikingcarrot7.model.services.openpay.OpenpayAPIService;
import mx.openpay.client.Charge;

/**
 *
 * @author HikingCarrot7
 */
public abstract class TransactionService {

    protected final APIService apiService;

    public TransactionService() {
        apiService = OpenpayAPIService.getOpenpayAPI();
    }

    public abstract Charge processPayment() throws ServiceException;
}
