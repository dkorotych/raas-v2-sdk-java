/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BillingAddressModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5180344303624020534L;
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String emailAddress;
    private String addressLine2;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("firstName")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("firstName")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("lastName")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("lastName")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("addressLine1")
    public String getAddressLine1 ( ) { 
        return this.addressLine1;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("addressLine1")
    public void setAddressLine1 (String value) { 
        this.addressLine1 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("state")
    public String getState ( ) { 
        return this.state;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("state")
    public void setState (String value) { 
        this.state = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("postalCode")
    public String getPostalCode ( ) { 
        return this.postalCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("postalCode")
    public void setPostalCode (String value) { 
        this.postalCode = value;
    }
 
    /** GETTER
     * 2-letter country code
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * 2-letter country code
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * billing email address
     */
    @JsonGetter("emailAddress")
    public String getEmailAddress ( ) { 
        return this.emailAddress;
    }
    
    /** SETTER
     * billing email address
     */
    @JsonSetter("emailAddress")
    public void setEmailAddress (String value) { 
        this.emailAddress = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("addressLine2")
    public String getAddressLine2 ( ) { 
        return this.addressLine2;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("addressLine2")
    public void setAddressLine2 (String value) { 
        this.addressLine2 = value;
    }
 
}
 