/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DepositResponseModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5679050494542738406L;
    private double amount;
    private double amountCharged;
    private Date createdDate;
    private double feePercent;
    private String referenceDepositID;
    private String status;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("amount")
    public double getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("amount")
    public void setAmount (double value) { 
        this.amount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("amountCharged")
    public double getAmountCharged ( ) { 
        return this.amountCharged;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("amountCharged")
    public void setAmountCharged (double value) { 
        this.amountCharged = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("createdDate")
    public Date getCreatedDate ( ) { 
        return this.createdDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("createdDate")
    public void setCreatedDate (Date value) { 
        this.createdDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("feePercent")
    public double getFeePercent ( ) { 
        return this.feePercent;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("feePercent")
    public void setFeePercent (double value) { 
        this.feePercent = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("referenceDepositID")
    public String getReferenceDepositID ( ) { 
        return this.referenceDepositID;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("referenceDepositID")
    public void setReferenceDepositID (String value) { 
        this.referenceDepositID = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
}
 