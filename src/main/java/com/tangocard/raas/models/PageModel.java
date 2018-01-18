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
public class PageModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5403554540793029306L;
    private int number;
    private int elementsPerBlock;
    private int resultCount;
    private int totalCount;
    /** GETTER
     * Page Number
     */
    @JsonGetter("number")
    public int getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * Page Number
     */
    @JsonSetter("number")
    public void setNumber (int value) { 
        this.number = value;
    }
 
    /** GETTER
     * Elements per page
     */
    @JsonGetter("elementsPerBlock")
    public int getElementsPerBlock ( ) { 
        return this.elementsPerBlock;
    }
    
    /** SETTER
     * Elements per page
     */
    @JsonSetter("elementsPerBlock")
    public void setElementsPerBlock (int value) { 
        this.elementsPerBlock = value;
    }
 
    /** GETTER
     * Result Count
     */
    @JsonGetter("resultCount")
    public int getResultCount ( ) { 
        return this.resultCount;
    }
    
    /** SETTER
     * Result Count
     */
    @JsonSetter("resultCount")
    public void setResultCount (int value) { 
        this.resultCount = value;
    }
 
    /** GETTER
     * Total Count
     */
    @JsonGetter("totalCount")
    public int getTotalCount ( ) { 
        return this.totalCount;
    }
    
    /** SETTER
     * Total Count
     */
    @JsonSetter("totalCount")
    public void setTotalCount (int value) { 
        this.totalCount = value;
    }
 
}
 