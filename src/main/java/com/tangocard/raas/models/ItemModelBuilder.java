/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class ItemModelBuilder {
    //the instance to build
    private ItemModel itemModel;

    /**
     * Default constructor to initialize the instance
     */
    public ItemModelBuilder() {
        itemModel = new ItemModel();
    }

    /**
     * UTID
     */
    public ItemModelBuilder utid(String utid) {
        itemModel.setUtid(utid);
        return this;
    }

    /**
     * Reward Name
     */
    public ItemModelBuilder rewardName(String rewardName) {
        itemModel.setRewardName(rewardName);
        return this;
    }

    /**
     * Currency Code
     */
    public ItemModelBuilder currencyCode(String currencyCode) {
        itemModel.setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * Status
     */
    public ItemModelBuilder status(String status) {
        itemModel.setStatus(status);
        return this;
    }

    /**
     * Value Type (fixed/variable)
     */
    public ItemModelBuilder valueType(String valueType) {
        itemModel.setValueType(valueType);
        return this;
    }

    /**
     * Reward Type
     */
    public ItemModelBuilder rewardType(String rewardType) {
        itemModel.setRewardType(rewardType);
        return this;
    }

    /**
     * Date Created
     */
    public ItemModelBuilder createdDate(Date createdDate) {
        itemModel.setCreatedDate(createdDate);
        return this;
    }

    /**
     * Last Updated
     */
    public ItemModelBuilder lastUpdateDate(Date lastUpdateDate) {
        itemModel.setLastUpdateDate(lastUpdateDate);
        return this;
    }

    /**
     * Countries
     */
    public ItemModelBuilder countries(List<String> countries) {
        itemModel.setCountries(countries);
        return this;
    }

    /**
     * Minimum Value (for variable value items)
     */
    public ItemModelBuilder minValue(Double minValue) {
        itemModel.setMinValue(minValue);
        return this;
    }

    /**
     * Maximum Value (for variable value items)
     */
    public ItemModelBuilder maxValue(Double maxValue) {
        itemModel.setMaxValue(maxValue);
        return this;
    }

    /**
     * Face Value
     */
    public ItemModelBuilder faceValue(Double faceValue) {
        itemModel.setFaceValue(faceValue);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ItemModel build() {
        return itemModel;
    }
}