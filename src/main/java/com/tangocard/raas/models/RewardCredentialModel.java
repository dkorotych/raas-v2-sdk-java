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
public class RewardCredentialModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5431698668648998287L;
    private String label;
    private String value;
    private String type;
    /** GETTER
     * Credential Label
     */
    @JsonGetter("label")
    public String getLabel ( ) { 
        return this.label;
    }
    
    /** SETTER
     * Credential Label
     */
    @JsonSetter("label")
    public void setLabel (String value) { 
        this.label = value;
    }
 
    /** GETTER
     * Credential Value
     */
    @JsonGetter("value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * Credential Value
     */
    @JsonSetter("value")
    public void setValue (String value) { 
        this.value = value;
    }
 
    /** GETTER
     * Credential Type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Credential Type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
 