/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class UnregisterCreditCardResponseModelBuilder {
    //the instance to build
    private UnregisterCreditCardResponseModel unregisterCreditCardResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public UnregisterCreditCardResponseModelBuilder() {
        unregisterCreditCardResponseModel = new UnregisterCreditCardResponseModel();
    }

    public UnregisterCreditCardResponseModelBuilder createdDate(Date createdDate) {
        unregisterCreditCardResponseModel.setCreatedDate(createdDate);
        return this;
    }

    public UnregisterCreditCardResponseModelBuilder message(String message) {
        unregisterCreditCardResponseModel.setMessage(message);
        return this;
    }

    public UnregisterCreditCardResponseModelBuilder token(String token) {
        unregisterCreditCardResponseModel.setToken(token);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UnregisterCreditCardResponseModel build() {
        return unregisterCreditCardResponseModel;
    }
}