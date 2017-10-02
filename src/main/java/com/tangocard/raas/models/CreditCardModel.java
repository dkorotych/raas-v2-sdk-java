/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreditCardModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5259105873107386077L;
    private String customerIdentifier;
    private String accountIdentifier;
    private String token;
    private String label;
    private String lastFourDigits;
    private String expirationDate;
    private String status;
    private Date createdDate;
    private Date activationDate;
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
    @JsonGetter("token")
    public String getToken ( ) { 
        return this.token;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("token")
    public void setToken (String value) { 
        this.token = value;
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
    @JsonGetter("lastFourDigits")
    public String getLastFourDigits ( ) { 
        return this.lastFourDigits;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("lastFourDigits")
    public void setLastFourDigits (String value) { 
        this.lastFourDigits = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("expirationDate")
    public String getExpirationDate ( ) { 
        return this.expirationDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("expirationDate")
    public void setExpirationDate (String value) { 
        this.expirationDate = value;
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
    @JsonGetter("activationDate")
    public Date getActivationDate ( ) { 
        return this.activationDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("activationDate")
    public void setActivationDate (Date value) { 
        this.activationDate = value;
    }
 
}
 