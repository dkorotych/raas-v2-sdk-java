/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class CreateCreditCardRequestModelBuilder {
    //the instance to build
    private CreateCreditCardRequestModel createCreditCardRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCreditCardRequestModelBuilder() {
        createCreditCardRequestModel = new CreateCreditCardRequestModel();
    }

    public CreateCreditCardRequestModelBuilder customerIdentifier(String customerIdentifier) {
        createCreditCardRequestModel.setCustomerIdentifier(customerIdentifier);
        return this;
    }

    public CreateCreditCardRequestModelBuilder accountIdentifier(String accountIdentifier) {
        createCreditCardRequestModel.setAccountIdentifier(accountIdentifier);
        return this;
    }

    public CreateCreditCardRequestModelBuilder label(String label) {
        createCreditCardRequestModel.setLabel(label);
        return this;
    }

    public CreateCreditCardRequestModelBuilder ipAddress(String ipAddress) {
        createCreditCardRequestModel.setIpAddress(ipAddress);
        return this;
    }

    public CreateCreditCardRequestModelBuilder creditCard(NewCreditCardModel creditCard) {
        createCreditCardRequestModel.setCreditCard(creditCard);
        return this;
    }

    public CreateCreditCardRequestModelBuilder billingAddress(BillingAddressModel billingAddress) {
        createCreditCardRequestModel.setBillingAddress(billingAddress);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCreditCardRequestModel build() {
        return createCreditCardRequestModel;
    }
}