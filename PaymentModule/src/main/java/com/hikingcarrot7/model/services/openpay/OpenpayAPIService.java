package com.hikingcarrot7.model.services.openpay;

import com.hikingcarrot7.model.entities.User;
import com.hikingcarrot7.model.services.exceptions.ServiceException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Properties;
import mx.openpay.client.Card;
import mx.openpay.client.Charge;
import mx.openpay.client.Customer;
import mx.openpay.client.core.OpenpayAPI;
import mx.openpay.client.core.requests.transactions.CreateCardChargeParams;
import mx.openpay.client.core.requests.transactions.CreateStoreChargeParams;
import mx.openpay.client.exceptions.OpenpayServiceException;
import mx.openpay.client.exceptions.ServiceUnavailableException;

/**
 *
 * @author HikingCarrot7
 */
public class OpenpayAPIService extends OpenpayAPI implements APIService {

    private static OpenpayAPIService openpayAPIService;

    public synchronized static OpenpayAPIService getOpenpayAPI() {
        if (openpayAPIService == null)
            authenticate();

        return openpayAPIService;
    }

    private static void authenticate() {
        Properties properties = getSecretProperties();
        String llavePrivada = properties.getProperty("LLAVE_PRIVADA");
        String id = properties.getProperty("ID");
        openpayAPIService = new OpenpayAPIService("https://sandbox-api.openpay.mx", llavePrivada, id);
    }

    private static Properties getSecretProperties() {
        try (FileReader reader = new FileReader("api.properties")) {
            Properties properties = new Properties();
            properties.load(reader);
            return properties;
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    private OpenpayAPIService(String location, String apiKey, String merchantId) {
        super(location, apiKey, merchantId);
    }

    @Override public User registerUser(User user) throws ServiceException {
        Customer customer = createCustomer(user);
        try {
            customer = customers().create(customer);
            user.setId(customer.getId());
            return user;
        } catch (OpenpayServiceException | ServiceUnavailableException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    @Override public void deleteUser(User user) throws ServiceException {
        try {
            customers().delete(user.getId());
        } catch (OpenpayServiceException | ServiceUnavailableException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    @Override public Charge createChargeWithCreditCard(User user, Card card, String amount) throws ServiceException {
        try {
            Customer customer = createCustomer(user);

            CreateCardChargeParams request = new CreateCardChargeParams()
                    .amount(new BigDecimal(amount))
                    .cardId(card.getId())
                    .currency("MXN")
                    .description("Pago a correo")
                    .customer(customer)
                    .deviceSessionId("kR1MiQhz2otdIuUlQkbEyitIqVMiI16f");

            return charges().createCharge(request);
        } catch (OpenpayServiceException | ServiceUnavailableException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    @Override public Charge createChargeWithStoreDeposit(User user, Date dueDate, String amount) throws ServiceException {
        try {
            Customer customer = createCustomer(user);
            CreateStoreChargeParams request = new CreateStoreChargeParams();
            request.amount(new BigDecimal(amount));
            request.description("Cargo con tienda");

            request.dueDate(dueDate);
            request.customer(customer);
            return charges().createCharge(request);
        } catch (OpenpayServiceException | ServiceUnavailableException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    @Override public Card registerCreditCard(Card card) throws ServiceException {
        try {
            if (!isCardRegistered(card))
                return cards().create(card);

            return card;
        } catch (OpenpayServiceException | ServiceUnavailableException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    @Override public boolean isCardRegistered(Card card) {
        try {
            return cards().get(card.getId()) != null;
        } catch (ServiceUnavailableException | OpenpayServiceException ex) {
            return false;
        }
    }

    private Customer createCustomer(User user) {
        return new Customer()
                .name(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .requiresAccount(false);
    }

}
