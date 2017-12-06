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
public class NameEmailModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4920750908732151244L;
    private String email;
    private String firstName;
    private String lastName;
    /** GETTER
     * Email Address
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Email Address
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * First Name
     */
    @JsonGetter("firstName")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * First Name
     */
    @JsonSetter("firstName")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * Last Name
     */
    @JsonGetter("lastName")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * Last Name
     */
    @JsonSetter("lastName")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
}
 