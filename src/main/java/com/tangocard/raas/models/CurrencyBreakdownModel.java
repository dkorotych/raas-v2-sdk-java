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
public class CurrencyBreakdownModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5411073901369224876L;
    private String currencyCode;
    private Double exchangeRate;
    private Double fee;
    private Double total;
    private Double value;
    /** GETTER
     * Currency Code
     */
    @JsonGetter("currencyCode")
    public String getCurrencyCode ( ) { 
        return this.currencyCode;
    }
    
    /** SETTER
     * Currency Code
     */
    @JsonSetter("currencyCode")
    public void setCurrencyCode (String value) { 
        this.currencyCode = value;
    }
 
    /** GETTER
     * Exchange Rate
     */
    @JsonGetter("exchangeRate")
    public Double getExchangeRate ( ) { 
        return this.exchangeRate;
    }
    
    /** SETTER
     * Exchange Rate
     */
    @JsonSetter("exchangeRate")
    public void setExchangeRate (Double value) { 
        this.exchangeRate = value;
    }
 
    /** GETTER
     * Fee
     */
    @JsonGetter("fee")
    public Double getFee ( ) { 
        return this.fee;
    }
    
    /** SETTER
     * Fee
     */
    @JsonSetter("fee")
    public void setFee (Double value) { 
        this.fee = value;
    }
 
    /** GETTER
     * Total
     */
    @JsonGetter("total")
    public Double getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * Total
     */
    @JsonSetter("total")
    public void setTotal (Double value) { 
        this.total = value;
    }
 
    /** GETTER
     * Value
     */
    @JsonGetter("value")
    public Double getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * Value
     */
    @JsonSetter("value")
    public void setValue (Double value) { 
        this.value = value;
    }
 
}
 