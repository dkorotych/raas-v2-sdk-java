/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class AccountModelBuilder {
    //the instance to build
    private AccountModel accountModel;

    /**
     * Default constructor to initialize the instance
     */
    public AccountModelBuilder() {
        accountModel = new AccountModel();
    }

    /**
     * Account Identifier
     */
    public AccountModelBuilder accountIdentifier(String accountIdentifier) {
        accountModel.setAccountIdentifier(accountIdentifier);
        return this;
    }

    /**
     * Display Name
     */
    public AccountModelBuilder displayName(String displayName) {
        accountModel.setDisplayName(displayName);
        return this;
    }

    /**
     * Currency Code
     */
    public AccountModelBuilder currencyCode(String currencyCode) {
        accountModel.setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * Current Balance
     */
    public AccountModelBuilder currentBalance(double currentBalance) {
        accountModel.setCurrentBalance(currentBalance);
        return this;
    }

    /**
     * Date Created
     */
    public AccountModelBuilder createdAt(Date createdAt) {
        accountModel.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Status
     */
    public AccountModelBuilder status(String status) {
        accountModel.setStatus(status);
        return this;
    }

    /**
     * Contact Email
     */
    public AccountModelBuilder contactEmail(String contactEmail) {
        accountModel.setContactEmail(contactEmail);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AccountModel build() {
        return accountModel;
    }
}