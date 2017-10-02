/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NewCreditCardModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5735663903922295814L;
    private String number;
    private String expiration;
    private String verificationNumber;
    /** GETTER
     * card number
     */
    @JsonGetter("number")
    public String getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * card number
     */
    @JsonSetter("number")
    public void setNumber (String value) { 
        this.number = value;
    }
 
    /** GETTER
     * card expiration date in YYYY-MM format
     */
    @JsonGetter("expiration")
    public String getExpiration ( ) { 
        return this.expiration;
    }
    
    /** SETTER
     * card expiration date in YYYY-MM format
     */
    @JsonSetter("expiration")
    public void setExpiration (String value) { 
        this.expiration = value;
    }
 
    /** GETTER
     * 3 or 4 digit card security code on the back of card
     */
    @JsonGetter("verificationNumber")
    public String getVerificationNumber ( ) { 
        return this.verificationNumber;
    }
    
    /** SETTER
     * 3 or 4 digit card security code on the back of card
     */
    @JsonSetter("verificationNumber")
    public void setVerificationNumber (String value) { 
        this.verificationNumber = value;
    }
 
}
 