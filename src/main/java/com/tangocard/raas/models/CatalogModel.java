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
public class CatalogModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5364263865530780250L;
    private String catalogName;
    private List<BrandModel> brands;
    /** GETTER
     * The name of your catalog
     */
    @JsonGetter("catalogName")
    public String getCatalogName ( ) { 
        return this.catalogName;
    }
    
    /** SETTER
     * The name of your catalog
     */
    @JsonSetter("catalogName")
    public void setCatalogName (String value) { 
        this.catalogName = value;
    }
 
    /** GETTER
     * The brands in your catalog
     */
    @JsonGetter("brands")
    public List<BrandModel> getBrands ( ) { 
        return this.brands;
    }
    
    /** SETTER
     * The brands in your catalog
     */
    @JsonSetter("brands")
    public void setBrands (List<BrandModel> value) { 
        this.brands = value;
    }
 
}
 