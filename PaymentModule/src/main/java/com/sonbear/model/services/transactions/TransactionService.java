package com.sonbear.model.services.transactions;

import com.sonbear.model.services.exceptions.ServiceException;
import com.sonbear.model.services.openpay.APIService;
import com.sonbear.model.services.openpay.OpenpayAPIService;

/**
 *
 * @author HikingCarrot7
 */
public abstract class TransactionService {

    protected final APIService apiService;

    public TransactionService() {
        apiService = OpenpayAPIService.getOpenpayAPI();
    }

    public abstract void processPayment() throws ServiceException;
}
