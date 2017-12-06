/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ExchangeRateResponseModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5764268457676933040L;
    private String disclaimer;
    private List<ExchangeRateModel> exchangeRates;
    /** GETTER
     * Disclaimer
     */
    @JsonGetter("disclaimer")
    public String getDisclaimer ( ) { 
        return this.disclaimer;
    }
    
    /** SETTER
     * Disclaimer
     */
    @JsonSetter("disclaimer")
    public void setDisclaimer (String value) { 
        this.disclaimer = value;
    }
 
    /** GETTER
     * Exchange Rates
     */
    @JsonGetter("exchangeRates")
    public List<ExchangeRateModel> getExchangeRates ( ) { 
        return this.exchangeRates;
    }
    
    /** SETTER
     * Exchange Rates
     */
    @JsonSetter("exchangeRates")
    public void setExchangeRates (List<ExchangeRateModel> value) { 
        this.exchangeRates = value;
    }
 
}
 