/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AccountSummaryModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5177971519574991581L;
    private String accountIdentifier;
    private String displayName;
    private Date createdAt;
    private String status;
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
 
}
 