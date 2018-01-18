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
public class CreateCustomerRequestModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5459921284029741826L;
    private String customerIdentifier;
    private String displayName;
    /** GETTER
     * Customer Identifier
     */
    @JsonGetter("customerIdentifier")
    public String getCustomerIdentifier ( ) { 
        return this.customerIdentifier;
    }
    
    /** SETTER
     * Customer Identifier
     */
    @JsonSetter("customerIdentifier")
    public void setCustomerIdentifier (String value) { 
        this.customerIdentifier = value;
    }
 
    /** GETTER
     * Display Name
     */
    @JsonGetter("displayName")
    public String getDisplayName ( ) { 
        return this.displayName;
    }
    
    /** SETTER
     * Display Name
     */
    @JsonSetter("displayName")
    public void setDisplayName (String value) { 
        this.displayName = value;
    }
 
}
 