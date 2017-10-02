/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class PageModelBuilder {
    //the instance to build
    private PageModel pageModel;

    /**
     * Default constructor to initialize the instance
     */
    public PageModelBuilder() {
        pageModel = new PageModel();
    }

    /**
     * Page Number
     */
    public PageModelBuilder number(int number) {
        pageModel.setNumber(number);
        return this;
    }

    /**
     * Elements per page
     */
    public PageModelBuilder elementsPerBlock(int elementsPerBlock) {
        pageModel.setElementsPerBlock(elementsPerBlock);
        return this;
    }

    /**
     * Result Count
     */
    public PageModelBuilder resultCount(int resultCount) {
        pageModel.setResultCount(resultCount);
        return this;
    }

    /**
     * Total Count
     */
    public PageModelBuilder totalCount(int totalCount) {
        pageModel.setTotalCount(totalCount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PageModel build() {
        return pageModel;
    }
}