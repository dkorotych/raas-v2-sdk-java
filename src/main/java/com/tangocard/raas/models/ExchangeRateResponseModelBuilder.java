/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class ExchangeRateResponseModelBuilder {
    //the instance to build
    private ExchangeRateResponseModel exchangeRateResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public ExchangeRateResponseModelBuilder() {
        exchangeRateResponseModel = new ExchangeRateResponseModel();
    }

    /**
     * Disclaimer
     */
    public ExchangeRateResponseModelBuilder disclaimer(String disclaimer) {
        exchangeRateResponseModel.setDisclaimer(disclaimer);
        return this;
    }

    /**
     * Exchange Rates
     */
    public ExchangeRateResponseModelBuilder exchangeRates(List<ExchangeRateModel> exchangeRates) {
        exchangeRateResponseModel.setExchangeRates(exchangeRates);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ExchangeRateResponseModel build() {
        return exchangeRateResponseModel;
    }
}