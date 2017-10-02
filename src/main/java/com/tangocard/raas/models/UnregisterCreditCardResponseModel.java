/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UnregisterCreditCardResponseModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5622857117287243280L;
    private Date createdDate;
    private String message;
    private String token;
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
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
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
 
}
 