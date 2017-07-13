/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class GetOrdersResponseModelBuilder {
    //the instance to build
    private GetOrdersResponseModel getOrdersResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public GetOrdersResponseModelBuilder() {
        getOrdersResponseModel = new GetOrdersResponseModel();
    }

    /**
     * Pagination information
     */
    public GetOrdersResponseModelBuilder page(PageModel page) {
        getOrdersResponseModel.setPage(page);
        return this;
    }

    /**
     * An array of orders
     */
    public GetOrdersResponseModelBuilder orders(List<OrderModel> orders) {
        getOrdersResponseModel.setOrders(orders);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetOrdersResponseModel build() {
        return getOrdersResponseModel;
    }
}