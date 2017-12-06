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
public class AccountModel
        implements java.io.Serializable {
    private static final long serialVersionUID = 4614541385856106818L;
    private String accountIdentifier;
    private String displayName;
    private String currencyCode = "USD";
    private double currentBalance;
    private Date createdAt;
    private String status;
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
     * Current Balance
     */
    @JsonGetter("currentBalance")
    public double getCurrentBalance ( ) { 
        return this.currentBalance;
    }
    
    /** SETTER
     * Current Balance
     */
    @JsonSetter("currentBalance")
    public void setCurrentBalance (double value) { 
        this.currentBalance = value;
    }
 
    /** GETTER
     * Date Created
     */
    @JsonGetter("createdAt")
    public Date getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Date Created
     */
    @JsonSetter("createdAt")
    public void setCreatedAt (Date value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
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
 