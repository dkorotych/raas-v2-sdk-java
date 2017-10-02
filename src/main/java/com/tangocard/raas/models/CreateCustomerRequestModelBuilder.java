/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class CreateCustomerRequestModelBuilder {
    //the instance to build
    private CreateCustomerRequestModel createCustomerRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCustomerRequestModelBuilder() {
        createCustomerRequestModel = new CreateCustomerRequestModel();
    }

    /**
     * Customer Identifier
     */
    public CreateCustomerRequestModelBuilder customerIdentifier(String customerIdentifier) {
        createCustomerRequestModel.setCustomerIdentifier(customerIdentifier);
        return this;
    }

    /**
     * Display Name
     */
    public CreateCustomerRequestModelBuilder displayName(String displayName) {
        createCustomerRequestModel.setDisplayName(displayName);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCustomerRequestModel build() {
        return createCustomerRequestModel;
    }
}