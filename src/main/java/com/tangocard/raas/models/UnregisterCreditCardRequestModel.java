/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UnregisterCreditCardRequestModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5333030598690748299L;
    private String customerIdentifier;
    private String accountIdentifier;
    private String creditCardToken;
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
    @JsonGetter("creditCardToken")
    public String getCreditCardToken ( ) { 
        return this.creditCardToken;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("creditCardToken")
    public void setCreditCardToken (String value) { 
        this.creditCardToken = value;
    }
 
}
 