/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class DepositResponseModelBuilder {
    //the instance to build
    private DepositResponseModel depositResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public DepositResponseModelBuilder() {
        depositResponseModel = new DepositResponseModel();
    }

    public DepositResponseModelBuilder amount(double amount) {
        depositResponseModel.setAmount(amount);
        return this;
    }

    public DepositResponseModelBuilder amountCharged(double amountCharged) {
        depositResponseModel.setAmountCharged(amountCharged);
        return this;
    }

    public DepositResponseModelBuilder createdDate(Date createdDate) {
        depositResponseModel.setCreatedDate(createdDate);
        return this;
    }

    public DepositResponseModelBuilder feePercent(double feePercent) {
        depositResponseModel.setFeePercent(feePercent);
        return this;
    }

    public DepositResponseModelBuilder referenceDepositID(String referenceDepositID) {
        depositResponseModel.setReferenceDepositID(referenceDepositID);
        return this;
    }

    public DepositResponseModelBuilder status(String status) {
        depositResponseModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DepositResponseModel build() {
        return depositResponseModel;
    }
}