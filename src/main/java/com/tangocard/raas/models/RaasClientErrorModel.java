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
public class RaasClientErrorModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5708440758383335611L;
    private String path;
    private String message;
    private String constraint;
    private String invalidValue;
    /** GETTER
     * Error Path
     */
    @JsonGetter("path")
    public String getPath ( ) { 
        return this.path;
    }
    
    /** SETTER
     * Error Path
     */
    @JsonSetter("path")
    public void setPath (String value) { 
        this.path = value;
    }
 
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
     * Constraint
     */
    @JsonGetter("constraint")
    public String getConstraint ( ) { 
        return this.constraint;
    }
    
    /** SETTER
     * Constraint
     */
    @JsonSetter("constraint")
    public void setConstraint (String value) { 
        this.constraint = value;
    }
 
    /** GETTER
     * Invalid Value
     */
    @JsonGetter("invalidValue")
    public String getInvalidValue ( ) { 
        return this.invalidValue;
    }
    
    /** SETTER
     * Invalid Value
     */
    @JsonSetter("invalidValue")
    public void setInvalidValue (String value) { 
        this.invalidValue = value;
    }
 
}
 