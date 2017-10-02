/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class BrandModelBuilder {
    //the instance to build
    private BrandModel brandModel;

    /**
     * Default constructor to initialize the instance
     */
    public BrandModelBuilder() {
        brandModel = new BrandModel();
    }

    /**
     * Brand Key
     */
    public BrandModelBuilder brandKey(String brandKey) {
        brandModel.setBrandKey(brandKey);
        return this;
    }

    /**
     * Brand Name
     */
    public BrandModelBuilder brandName(String brandName) {
        brandModel.setBrandName(brandName);
        return this;
    }

    /**
     * Disclaimer
     */
    public BrandModelBuilder disclaimer(String disclaimer) {
        brandModel.setDisclaimer(disclaimer);
        return this;
    }

    /**
     * Description
     */
    public BrandModelBuilder description(String description) {
        brandModel.setDescription(description);
        return this;
    }

    /**
     * Short Description
     */
    public BrandModelBuilder shortDescription(String shortDescription) {
        brandModel.setShortDescription(shortDescription);
        return this;
    }

    /**
     * Terms
     */
    public BrandModelBuilder terms(String terms) {
        brandModel.setTerms(terms);
        return this;
    }

    /**
     * Date Created
     */
    public BrandModelBuilder createdDate(Date createdDate) {
        brandModel.setCreatedDate(createdDate);
        return this;
    }

    /**
     * Last Updated
     */
    public BrandModelBuilder lastUpdateDate(Date lastUpdateDate) {
        brandModel.setLastUpdateDate(lastUpdateDate);
        return this;
    }

    /**
     * Image URLs
     */
    public BrandModelBuilder imageUrls(LinkedHashMap<String, String> imageUrls) {
        brandModel.setImageUrls(imageUrls);
        return this;
    }

    /**
     * Status
     */
    public BrandModelBuilder status(String status) {
        brandModel.setStatus(status);
        return this;
    }

    /**
     * Items
     */
    public BrandModelBuilder items(List<ItemModel> items) {
        brandModel.setItems(items);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BrandModel build() {
        return brandModel;
    }
}