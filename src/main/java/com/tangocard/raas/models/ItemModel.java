/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4664874566725733014L;
    private String utid;
    private String rewardName;
    private String currencyCode;
    private String status;
    private String valueType;
    private String rewardType;
    private Date createdDate;
    private Date lastUpdateDate;
    private List<String> countries;
    private Double minValue;
    private Double maxValue;
    private Double faceValue;
    /** GETTER
     * UTID
     */
    @JsonGetter("utid")
    public String getUtid ( ) { 
        return this.utid;
    }
    
    /** SETTER
     * UTID
     */
    @JsonSetter("utid")
    public void setUtid (String value) { 
        this.utid = value;
    }
 
    /** GETTER
     * Reward Name
     */
    @JsonGetter("rewardName")
    public String getRewardName ( ) { 
        return this.rewardName;
    }
    
    /** SETTER
     * Reward Name
     */
    @JsonSetter("rewardName")
    public void setRewardName (String value) { 
        this.rewardName = value;
    }
 
    /** GETTER
     * Currency Code
     */
    @JsonGetter("currencyCode")
    public String getCurrencyCode ( ) { 
        return this.currencyCode;
    }
    
    /** SETTER
     * Currency Code
     */
    @JsonSetter("currencyCode")
    public void setCurrencyCode (String value) { 
        this.currencyCode = value;
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
     * Value Type (fixed/variable)
     */
    @JsonGetter("valueType")
    public String getValueType ( ) { 
        return this.valueType;
    }
    
    /** SETTER
     * Value Type (fixed/variable)
     */
    @JsonSetter("valueType")
    public void setValueType (String value) { 
        this.valueType = value;
    }
 
    /** GETTER
     * Reward Type
     */
    @JsonGetter("rewardType")
    public String getRewardType ( ) { 
        return this.rewardType;
    }
    
    /** SETTER
     * Reward Type
     */
    @JsonSetter("rewardType")
    public void setRewardType (String value) { 
        this.rewardType = value;
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
     * Countries
     */
    @JsonGetter("countries")
    public List<String> getCountries ( ) { 
        return this.countries;
    }
    
    /** SETTER
     * Countries
     */
    @JsonSetter("countries")
    public void setCountries (List<String> value) { 
        this.countries = value;
    }
 
    /** GETTER
     * Minimum Value (for variable value items)
     */
    @JsonGetter("minValue")
    public Double getMinValue ( ) { 
        return this.minValue;
    }
    
    /** SETTER
     * Minimum Value (for variable value items)
     */
    @JsonSetter("minValue")
    public void setMinValue (Double value) { 
        this.minValue = value;
    }
 
    /** GETTER
     * Maximum Value (for variable value items)
     */
    @JsonGetter("maxValue")
    public Double getMaxValue ( ) { 
        return this.maxValue;
    }
    
    /** SETTER
     * Maximum Value (for variable value items)
     */
    @JsonSetter("maxValue")
    public void setMaxValue (Double value) { 
        this.maxValue = value;
    }
 
    /** GETTER
     * Face Value
     */
    @JsonGetter("faceValue")
    public Double getFaceValue ( ) { 
        return this.faceValue;
    }
    
    /** SETTER
     * Face Value
     */
    @JsonSetter("faceValue")
    public void setFaceValue (Double value) { 
        this.faceValue = value;
    }
 
}
 