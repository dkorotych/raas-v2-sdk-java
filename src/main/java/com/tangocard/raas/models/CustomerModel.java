/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CustomerModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4964688174496987167L;
    private String customerIdentifier;
    private String displayName;
    private String status;
    private Date createdAt;
    private List<AccountSummaryModel> accounts;
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
     * Accounts
     */
    @JsonGetter("accounts")
    public List<AccountSummaryModel> getAccounts ( ) { 
        return this.accounts;
    }
    
    /** SETTER
     * Accounts
     */
    @JsonSetter("accounts")
    public void setAccounts (List<AccountSummaryModel> value) { 
        this.accounts = value;
    }
 
}
 