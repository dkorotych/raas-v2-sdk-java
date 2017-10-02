/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class AccountSummaryModelBuilder {
    //the instance to build
    private AccountSummaryModel accountSummaryModel;

    /**
     * Default constructor to initialize the instance
     */
    public AccountSummaryModelBuilder() {
        accountSummaryModel = new AccountSummaryModel();
    }

    /**
     * Account Identifier
     */
    public AccountSummaryModelBuilder accountIdentifier(String accountIdentifier) {
        accountSummaryModel.setAccountIdentifier(accountIdentifier);
        return this;
    }

    /**
     * Display Name
     */
    public AccountSummaryModelBuilder displayName(String displayName) {
        accountSummaryModel.setDisplayName(displayName);
        return this;
    }

    /**
     * Date Created
     */
    public AccountSummaryModelBuilder createdAt(Date createdAt) {
        accountSummaryModel.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Status
     */
    public AccountSummaryModelBuilder status(String status) {
        accountSummaryModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AccountSummaryModel build() {
        return accountSummaryModel;
    }
}