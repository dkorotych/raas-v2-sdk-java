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
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class ExchangeRateModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5547612337551964879L;
    private Date lastModifiedDate;
    private String rewardCurrency;
    private String baseCurrency;
    private double baseFx;
    /** GETTER
     * Last Modified
     */
    @JsonGetter("lastModifiedDate")
    public Date getLastModifiedDate ( ) { 
        return this.lastModifiedDate;
    }
    
    /** SETTER
     * Last Modified
     */
    @JsonSetter("lastModifiedDate")
    public void setLastModifiedDate (Date value) { 
        this.lastModifiedDate = value;
    }
 
    /** GETTER
     * Reward Currency
     */
    @JsonGetter("rewardCurrency")
    public String getRewardCurrency ( ) { 
        return this.rewardCurrency;
    }
    
    /** SETTER
     * Reward Currency
     */
    @JsonSetter("rewardCurrency")
    public void setRewardCurrency (String value) { 
        this.rewardCurrency = value;
    }
 
    /** GETTER
     * Base Currency
     */
    @JsonGetter("baseCurrency")
    public String getBaseCurrency ( ) { 
        return this.baseCurrency;
    }
    
    /** SETTER
     * Base Currency
     */
    @JsonSetter("baseCurrency")
    public void setBaseCurrency (String value) { 
        this.baseCurrency = value;
    }
 
    /** GETTER
     * Exchange Rate
     */
    @JsonGetter("baseFx")
    public double getBaseFx ( ) { 
        return this.baseFx;
    }
    
    /** SETTER
     * Exchange Rate
     */
    @JsonSetter("baseFx")
    public void setBaseFx (double value) { 
        this.baseFx = value;
    }
 
}
 