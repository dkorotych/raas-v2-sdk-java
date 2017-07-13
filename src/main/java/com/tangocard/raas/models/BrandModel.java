/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BrandModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5406418759664624127L;
    private String brandKey;
    private String brandName;
    private String disclaimer;
    private String description;
    private String shortDescription;
    private String terms;
    private Date createdDate;
    private Date lastUpdateDate;
    private LinkedHashMap<String, String> imageUrls;
    private String status;
    private List<ItemModel> items;
    /** GETTER
     * Brand Key
     */
    @JsonGetter("brandKey")
    public String getBrandKey ( ) { 
        return this.brandKey;
    }
    
    /** SETTER
     * Brand Key
     */
    @JsonSetter("brandKey")
    public void setBrandKey (String value) { 
        this.brandKey = value;
    }
 
    /** GETTER
     * Brand Name
     */
    @JsonGetter("brandName")
    public String getBrandName ( ) { 
        return this.brandName;
    }
    
    /** SETTER
     * Brand Name
     */
    @JsonSetter("brandName")
    public void setBrandName (String value) { 
        this.brandName = value;
    }
 
    /** GETTER
     * Disclaimer
     */
    @JsonGetter("disclaimer")
    public String getDisclaimer ( ) { 
        return this.disclaimer;
    }
    
    /** SETTER
     * Disclaimer
     */
    @JsonSetter("disclaimer")
    public void setDisclaimer (String value) { 
        this.disclaimer = value;
    }
 
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Short Description
     */
    @JsonGetter("shortDescription")
    public String getShortDescription ( ) { 
        return this.shortDescription;
    }
    
    /** SETTER
     * Short Description
     */
    @JsonSetter("shortDescription")
    public void setShortDescription (String value) { 
        this.shortDescription = value;
    }
 
    /** GETTER
     * Terms
     */
    @JsonGetter("terms")
    public String getTerms ( ) { 
        return this.terms;
    }
    
    /** SETTER
     * Terms
     */
    @JsonSetter("terms")
    public void setTerms (String value) { 
        this.terms = value;
    }
 
    /** GETTER
     * Date Created
     */
    @JsonGetter("createdDate")
    public Date getCreatedDate ( ) { 
        return this.createdDate;
    }
    
    /** SETTER
     * Date Created
     */
    @JsonSetter("createdDate")
    public void setCreatedDate (Date value) { 
        this.createdDate = value;
    }
 
    /** GETTER
     * Last Updated
     */
    @JsonGetter("lastUpdateDate")
    public Date getLastUpdateDate ( ) { 
        return this.lastUpdateDate;
    }
    
    /** SETTER
     * Last Updated
     */
    @JsonSetter("lastUpdateDate")
    public void setLastUpdateDate (Date value) { 
        this.lastUpdateDate = value;
    }
 
    /** GETTER
     * Image URLs
     */
    @JsonGetter("imageUrls")
    public LinkedHashMap<String, String> getImageUrls ( ) { 
        return this.imageUrls;
    }
    
    /** SETTER
     * Image URLs
     */
    @JsonSetter("imageUrls")
    public void setImageUrls (LinkedHashMap<String, String> value) { 
        this.imageUrls = value;
    }
 
    /** GETTER
     * Status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * Items
     */
    @JsonGetter("items")
    public List<ItemModel> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * Items
     */
    @JsonSetter("items")
    public void setItems (List<ItemModel> value) { 
        this.items = value;
    }
 
}
 