/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class GetOrdersInputBuilder {
    //the instance to build
    private GetOrdersInput getOrdersInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetOrdersInputBuilder() {
        getOrdersInput = new GetOrdersInput();
    }

    public GetOrdersInputBuilder accountIdentifier(String accountIdentifier) {
        getOrdersInput.setAccountIdentifier(accountIdentifier);
        return this;
    }

    public GetOrdersInputBuilder customerIdentifier(String customerIdentifier) {
        getOrdersInput.setCustomerIdentifier(customerIdentifier);
        return this;
    }

    public GetOrdersInputBuilder externalRefID(String externalRefID) {
        getOrdersInput.setExternalRefID(externalRefID);
        return this;
    }

    public GetOrdersInputBuilder startDate(Date startDate) {
        getOrdersInput.setStartDate(startDate);
        return this;
    }

    public GetOrdersInputBuilder endDate(Date endDate) {
        getOrdersInput.setEndDate(endDate);
        return this;
    }

    public GetOrdersInputBuilder elementsPerBlock(Integer elementsPerBlock) {
        getOrdersInput.setElementsPerBlock(elementsPerBlock);
        return this;
    }

    public GetOrdersInputBuilder page(Integer page) {
        getOrdersInput.setPage(page);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetOrdersInput build() {
        return getOrdersInput;
    }
}