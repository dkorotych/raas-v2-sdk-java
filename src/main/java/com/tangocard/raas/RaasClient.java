/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas;

import com.tangocard.raas.controllers.*;
import com.tangocard.raas.http.client.HttpClient;

public class RaasClient {
    /**
     * Singleton access to Accounts controller
     * @return	Returns the AccountsController instance 
     */
    public AccountsController getAccounts() {
        return AccountsController.getInstance();
    }

    /**
     * Singleton access to Orders controller
     * @return	Returns the OrdersController instance 
     */
    public OrdersController getOrders() {
        return OrdersController.getInstance();
    }

    /**
     * Singleton access to Catalog controller
     * @return	Returns the CatalogController instance 
     */
    public CatalogController getCatalog() {
        return CatalogController.getInstance();
    }

    /**
     * Singleton access to ExchangeRates controller
     * @return	Returns the ExchangeRatesController instance 
     */
    public ExchangeRatesController getExchangeRates() {
        return ExchangeRatesController.getInstance();
    }

    /**
     * Singleton access to Status controller
     * @return	Returns the StatusController instance 
     */
    public StatusController getStatus() {
        return StatusController.getInstance();
    }

    /**
     * Singleton access to Customers controller
     * @return	Returns the CustomersController instance 
     */
    public CustomersController getCustomers() {
        return CustomersController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public RaasClient() {
        Configuration.platformName = "QAPlatform2";
        Configuration.platformKey = "apYPfT6HNONpDRUj3CLGWYt7gvIHONpDRUYPfT6Hj";
    }

    /**
     * Client initialization constructor 
     */     
    public RaasClient(String platformName, String platformKey) {
        this();
        if(platformName != null) Configuration.platformName = platformName;
        if(platformKey != null) Configuration.platformKey = platformKey;
    }
}