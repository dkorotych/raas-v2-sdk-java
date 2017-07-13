/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class ExchangeRateModelBuilder {
    //the instance to build
    private ExchangeRateModel exchangeRateModel;

    /**
     * Default constructor to initialize the instance
     */
    public ExchangeRateModelBuilder() {
        exchangeRateModel = new ExchangeRateModel();
    }

    /**
     * Last Modified
     */
    public ExchangeRateModelBuilder lastModifiedDate(Date lastModifiedDate) {
        exchangeRateModel.setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * Reward Currency
     */
    public ExchangeRateModelBuilder rewardCurrency(String rewardCurrency) {
        exchangeRateModel.setRewardCurrency(rewardCurrency);
        return this;
    }

    /**
     * Base Currency
     */
    public ExchangeRateModelBuilder baseCurrency(String baseCurrency) {
        exchangeRateModel.setBaseCurrency(baseCurrency);
        return this;
    }

    /**
     * Exchange Rate
     */
    public ExchangeRateModelBuilder baseFx(double baseFx) {
        exchangeRateModel.setBaseFx(baseFx);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ExchangeRateModel build() {
        return exchangeRateModel;
    }
}