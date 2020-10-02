package com.sonbear.model.services.transactions;

import com.sonbear.model.services.exceptions.ServiceException;
import com.sonbear.model.services.openpay.APIService;
import com.sonbear.model.services.openpay.OpenpayAPIService;

/**
 *
 * @author Sonbear
 */
public abstract class TransactionService {

    protected final APIService apiService;

    public TransactionService() {
        apiService = OpenpayAPIService.getOpenpayAPI();
    }

    /**
     * @return El id de la transacción.
     */
    public abstract String processPayment() throws ServiceException;
}
