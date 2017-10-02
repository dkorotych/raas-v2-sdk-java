/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class CreditCardModelBuilder {
    //the instance to build
    private CreditCardModel creditCardModel;

    /**
     * Default constructor to initialize the instance
     */
    public CreditCardModelBuilder() {
        creditCardModel = new CreditCardModel();
    }

    public CreditCardModelBuilder customerIdentifier(String customerIdentifier) {
        creditCardModel.setCustomerIdentifier(customerIdentifier);
        return this;
    }

    public CreditCardModelBuilder accountIdentifier(String accountIdentifier) {
        creditCardModel.setAccountIdentifier(accountIdentifier);
        return this;
    }

    public CreditCardModelBuilder token(String token) {
        creditCardModel.setToken(token);
        return this;
    }

    public CreditCardModelBuilder label(String label) {
        creditCardModel.setLabel(label);
        return this;
    }

    public CreditCardModelBuilder lastFourDigits(String lastFourDigits) {
        creditCardModel.setLastFourDigits(lastFourDigits);
        return this;
    }

    public CreditCardModelBuilder expirationDate(String expirationDate) {
        creditCardModel.setExpirationDate(expirationDate);
        return this;
    }

    public CreditCardModelBuilder status(String status) {
        creditCardModel.setStatus(status);
        return this;
    }

    public CreditCardModelBuilder createdDate(Date createdDate) {
        creditCardModel.setCreatedDate(createdDate);
        return this;
    }

    public CreditCardModelBuilder activationDate(Date activationDate) {
        creditCardModel.setActivationDate(activationDate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreditCardModel build() {
        return creditCardModel;
    }
}