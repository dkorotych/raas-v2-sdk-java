/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class UnregisterCreditCardRequestModelBuilder {
    //the instance to build
    private UnregisterCreditCardRequestModel unregisterCreditCardRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public UnregisterCreditCardRequestModelBuilder() {
        unregisterCreditCardRequestModel = new UnregisterCreditCardRequestModel();
    }

    public UnregisterCreditCardRequestModelBuilder customerIdentifier(String customerIdentifier) {
        unregisterCreditCardRequestModel.setCustomerIdentifier(customerIdentifier);
        return this;
    }

    public UnregisterCreditCardRequestModelBuilder accountIdentifier(String accountIdentifier) {
        unregisterCreditCardRequestModel.setAccountIdentifier(accountIdentifier);
        return this;
    }

    public UnregisterCreditCardRequestModelBuilder creditCardToken(String creditCardToken) {
        unregisterCreditCardRequestModel.setCreditCardToken(creditCardToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UnregisterCreditCardRequestModel build() {
        return unregisterCreditCardRequestModel;
    }
}