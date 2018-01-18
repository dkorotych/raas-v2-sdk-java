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
public class GetOrdersResponseModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5113173883943513054L;
    private PageModel page;
    private List<OrderModel> orders;
    /** GETTER
     * Pagination information
     */
    @JsonGetter("page")
    public PageModel getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Pagination information
     */
    @JsonSetter("page")
    public void setPage (PageModel value) { 
        this.page = value;
    }
 
    /** GETTER
     * An array of orders
     */
    @JsonGetter("orders")
    public List<OrderModel> getOrders ( ) { 
        return this.orders;
    }
    
    /** SETTER
     * An array of orders
     */
    @JsonSetter("orders")
    public void setOrders (List<OrderModel> value) { 
        this.orders = value;
    }
 
}
 