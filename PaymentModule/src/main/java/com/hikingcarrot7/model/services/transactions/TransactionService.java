package com.hikingcarrot7.model.services.transactions;

import java.io.IOException;
import mx.openpay.client.core.OpenpayAPI;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

/**
 *
 * @author HikingCarrot7
 */
public abstract class TransactionService {

    protected final OpenpayAPI openpayAPI;

    public TransactionService() throws IOException {
        openpayAPI = OpenpayAPIConnection.getOpenpayAPI();
    }

    public abstract void processPayment() throws OpenpayServiceException, ServiceUnavailableException;
}
