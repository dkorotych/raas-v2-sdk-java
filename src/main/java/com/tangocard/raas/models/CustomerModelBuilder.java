/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class CustomerModelBuilder {
    //the instance to build
    private CustomerModel customerModel;

    /**
     * Default constructor to initialize the instance
     */
    public CustomerModelBuilder() {
        customerModel = new CustomerModel();
    }

    /**
     * Customer Identifier
     */
    public CustomerModelBuilder customerIdentifier(String customerIdentifier) {
        customerModel.setCustomerIdentifier(customerIdentifier);
        return this;
    }

    /**
     * Display Name
     */
    public CustomerModelBuilder displayName(String displayName) {
        customerModel.setDisplayName(displayName);
        return this;
    }

    /**
     * Status
     */
    public CustomerModelBuilder status(String status) {
        customerModel.setStatus(status);
        return this;
    }

    /**
     * Date Created
     */
    public CustomerModelBuilder createdAt(Date createdAt) {
        customerModel.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Accounts
     */
    public CustomerModelBuilder accounts(List<AccountSummaryModel> accounts) {
        customerModel.setAccounts(accounts);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CustomerModel build() {
        return customerModel;
    }
}