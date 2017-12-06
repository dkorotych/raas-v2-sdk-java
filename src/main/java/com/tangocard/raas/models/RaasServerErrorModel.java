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
public class RaasServerErrorModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5116429928608856841L;
    private String message;
    private int code;
    /** GETTER
     * Error Message
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * Error Message
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
    /** GETTER
     * Error Code
     */
    @JsonGetter("code")
    public int getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * Error Code
     */
    @JsonSetter("code")
    public void setCode (int value) { 
        this.code = value;
    }
 
}
 