/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

public class CurrencyBreakdownModelBuilder {
    //the instance to build
    private CurrencyBreakdownModel currencyBreakdownModel;

    /**
     * Default constructor to initialize the instance
     */
    public CurrencyBreakdownModelBuilder() {
        currencyBreakdownModel = new CurrencyBreakdownModel();
    }

    /**
     * Currency Code
     */
    public CurrencyBreakdownModelBuilder currencyCode(String currencyCode) {
        currencyBreakdownModel.setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * Exchange Rate
     */
    public CurrencyBreakdownModelBuilder exchangeRate(Double exchangeRate) {
        currencyBreakdownModel.setExchangeRate(exchangeRate);
        return this;
    }

    /**
     * Fee
     */
    public CurrencyBreakdownModelBuilder fee(Double fee) {
        currencyBreakdownModel.setFee(fee);
        return this;
    }

    /**
     * Total
     */
    public CurrencyBreakdownModelBuilder total(Double total) {
        currencyBreakdownModel.setTotal(total);
        return this;
    }

    /**
     * Value
     */
    public CurrencyBreakdownModelBuilder value(Double value) {
        currencyBreakdownModel.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CurrencyBreakdownModel build() {
        return currencyBreakdownModel;
    }
}