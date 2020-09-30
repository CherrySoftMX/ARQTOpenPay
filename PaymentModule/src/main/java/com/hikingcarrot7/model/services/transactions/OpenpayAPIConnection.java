package com.hikingcarrot7.model.services.transactions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import mx.openpay.client.core.OpenpayAPI;

/**
 *
 * @author HikingCarrot7
 */
public class OpenpayAPIConnection {

    private static OpenpayAPI openpayAPI;

    public synchronized static OpenpayAPI getOpenpayAPI() throws IOException {
        if (openpayAPI == null)
            authenticate();

        return openpayAPI;
    }

    private OpenpayAPIConnection() {
    }

    private static void authenticate() throws IOException {
        Properties properties = getSecretProperties();
        String llavePrivada = properties.getProperty("LLAVE_PRIVADA");
        String id = properties.getProperty("ID");
        openpayAPI = new OpenpayAPI("https://sandbox-api.openpay.mx", llavePrivada, id);
    }

    private static Properties getSecretProperties() throws IOException {
        FileReader reader = new FileReader("api.properties");
        Properties properties = new Properties();
        properties.load(reader);
        return properties;
    }

}
