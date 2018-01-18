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
public class ResendOrderResponseModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5702461373467223308L;
    private Date createdAt;
    private int id;
    /** GETTER
     * When the resend request was created
     */
    @JsonGetter("createdAt")
    public Date getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * When the resend request was created
     */
    @JsonSetter("createdAt")
    public void setCreatedAt (Date value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * The order resend id
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The order resend id
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
}
 