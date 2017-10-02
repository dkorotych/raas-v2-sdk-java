/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateCreditCardRequestModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5455328350875426063L;
    private String customerIdentifier;
    private String accountIdentifier;
    private String label;
    private String ipAddress;
    private NewCreditCardModel creditCard;
    private BillingAddressModel billingAddress;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("customerIdentifier")
    public String getCustomerIdentifier ( ) { 
        return this.customerIdentifier;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("customerIdentifier")
    public void setCustomerIdentifier (String value) { 
        this.customerIdentifier = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("accountIdentifier")
    public String getAccountIdentifier ( ) { 
        return this.accountIdentifier;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("accountIdentifier")
    public void setAccountIdentifier (String value) { 
        this.accountIdentifier = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("label")
    public String getLabel ( ) { 
        return this.label;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("label")
    public void setLabel (String value) { 
        this.label = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ipAddress")
    public String getIpAddress ( ) { 
        return this.ipAddress;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ipAddress")
    public void setIpAddress (String value) { 
        this.ipAddress = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("creditCard")
    public NewCreditCardModel getCreditCard ( ) { 
        return this.creditCard;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("creditCard")
    public void setCreditCard (NewCreditCardModel value) { 
        this.creditCard = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("billingAddress")
    public BillingAddressModel getBillingAddress ( ) { 
        return this.billingAddress;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("billingAddress")
    public void setBillingAddress (BillingAddressModel value) { 
        this.billingAddress = value;
    }
 
}
 