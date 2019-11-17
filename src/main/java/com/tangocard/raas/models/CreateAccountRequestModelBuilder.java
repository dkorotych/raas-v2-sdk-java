/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

public class CreateAccountRequestModelBuilder {
    //the instance to build
    private CreateAccountRequestModel createAccountRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public CreateAccountRequestModelBuilder() {
        createAccountRequestModel = new CreateAccountRequestModel();
    }

    /**
     * Account Identifier
     */
    public CreateAccountRequestModelBuilder accountIdentifier(String accountIdentifier) {
        createAccountRequestModel.setAccountIdentifier(accountIdentifier);
        return this;
    }

    /**
     * Display Name
     */
    public CreateAccountRequestModelBuilder displayName(String displayName) {
        createAccountRequestModel.setDisplayName(displayName);
        return this;
    }

    /**
     * Contact Email
     */
    public CreateAccountRequestModelBuilder contactEmail(String contactEmail) {
        createAccountRequestModel.setContactEmail(contactEmail);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateAccountRequestModel build() {
        return createAccountRequestModel;
    }
}