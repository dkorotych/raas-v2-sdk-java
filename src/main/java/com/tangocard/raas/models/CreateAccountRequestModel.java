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
public class CreateAccountRequestModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4728128488534361794L;
    private String accountIdentifier;
    private String displayName;
    private String contactEmail;
    /** GETTER
     * Account Identifier
     */
    @JsonGetter("accountIdentifier")
    public String getAccountIdentifier ( ) { 
        return this.accountIdentifier;
    }
    
    /** SETTER
     * Account Identifier
     */
    @JsonSetter("accountIdentifier")
    public void setAccountIdentifier (String value) { 
        this.accountIdentifier = value;
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
 
    /** GETTER
     * Contact Email
     */
    @JsonGetter("contactEmail")
    public String getContactEmail ( ) { 
        return this.contactEmail;
    }
    
    /** SETTER
     * Contact Email
     */
    @JsonSetter("contactEmail")
    public void setContactEmail (String value) { 
        this.contactEmail = value;
    }
 
}
 