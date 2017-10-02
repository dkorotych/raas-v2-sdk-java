/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class DepositRequestModelBuilder {
    //the instance to build
    private DepositRequestModel depositRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public DepositRequestModelBuilder() {
        depositRequestModel = new DepositRequestModel();
    }

    public DepositRequestModelBuilder customerIdentifier(String customerIdentifier) {
        depositRequestModel.setCustomerIdentifier(customerIdentifier);
        return this;
    }

    public DepositRequestModelBuilder accountIdentifier(String accountIdentifier) {
        depositRequestModel.setAccountIdentifier(accountIdentifier);
        return this;
    }

    public DepositRequestModelBuilder creditCardToken(String creditCardToken) {
        depositRequestModel.setCreditCardToken(creditCardToken);
        return this;
    }

    public DepositRequestModelBuilder amount(double amount) {
        depositRequestModel.setAmount(amount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DepositRequestModel build() {
        return depositRequestModel;
    }
}