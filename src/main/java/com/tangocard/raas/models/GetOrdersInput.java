/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetOrdersInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5391513589169180847L;
    private String accountIdentifier;
    private String customerIdentifier;
    private String externalRefID;
    private Date startDate;
    private Date endDate;
    private Integer elementsPerBlock;
    private Integer page;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("accountIdentifier")
    public String getAccountIdentifier ( ) { 
        return this.accountIdentifier;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("accountIdentifier")
    public void setAccountIdentifier (String value) { 
        this.accountIdentifier = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("customerIdentifier")
    public String getCustomerIdentifier ( ) { 
        return this.customerIdentifier;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("customerIdentifier")
    public void setCustomerIdentifier (String value) { 
        this.customerIdentifier = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("externalRefID")
    public String getExternalRefID ( ) { 
        return this.externalRefID;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("externalRefID")
    public void setExternalRefID (String value) { 
        this.externalRefID = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("startDate")
    public Date getStartDate ( ) { 
        return this.startDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("startDate")
    public void setStartDate (Date value) { 
        this.startDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("endDate")
    public Date getEndDate ( ) { 
        return this.endDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("endDate")
    public void setEndDate (Date value) { 
        this.endDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("elementsPerBlock")
    public Integer getElementsPerBlock ( ) { 
        return this.elementsPerBlock;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("elementsPerBlock")
    public void setElementsPerBlock (Integer value) { 
        this.elementsPerBlock = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
}
 