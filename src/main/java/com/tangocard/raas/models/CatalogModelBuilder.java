/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class CatalogModelBuilder {
    //the instance to build
    private CatalogModel catalogModel;

    /**
     * Default constructor to initialize the instance
     */
    public CatalogModelBuilder() {
        catalogModel = new CatalogModel();
    }

    /**
     * The name of your catalog
     */
    public CatalogModelBuilder catalogName(String catalogName) {
        catalogModel.setCatalogName(catalogName);
        return this;
    }

    /**
     * The brands in your catalog
     */
    public CatalogModelBuilder brands(List<BrandModel> brands) {
        catalogModel.setBrands(brands);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CatalogModel build() {
        return catalogModel;
    }
}