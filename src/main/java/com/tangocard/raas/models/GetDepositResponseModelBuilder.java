/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class GetDepositResponseModelBuilder {
    //the instance to build
    private GetDepositResponseModel getDepositResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetDepositResponseModelBuilder() {
        getDepositResponseModel = new GetDepositResponseModel();
    }

    public GetDepositResponseModelBuilder amount(double amount) {
        getDepositResponseModel.setAmount(amount);
        return this;
    }

    public GetDepositResponseModelBuilder amountCharged(double amountCharged) {
        getDepositResponseModel.setAmountCharged(amountCharged);
        return this;
    }

    public GetDepositResponseModelBuilder createdDate(String createdDate) {
        getDepositResponseModel.setCreatedDate(createdDate);
        return this;
    }

    public GetDepositResponseModelBuilder feePercent(double feePercent) {
        getDepositResponseModel.setFeePercent(feePercent);
        return this;
    }

    public GetDepositResponseModelBuilder referenceDepositID(String referenceDepositID) {
        getDepositResponseModel.setReferenceDepositID(referenceDepositID);
        return this;
    }

    public GetDepositResponseModelBuilder status(String status) {
        getDepositResponseModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetDepositResponseModel build() {
        return getDepositResponseModel;
    }
}