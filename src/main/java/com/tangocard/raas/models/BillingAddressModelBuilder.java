/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class BillingAddressModelBuilder {
    //the instance to build
    private BillingAddressModel billingAddressModel;

    /**
     * Default constructor to initialize the instance
     */
    public BillingAddressModelBuilder() {
        billingAddressModel = new BillingAddressModel();
    }

    public BillingAddressModelBuilder firstName(String firstName) {
        billingAddressModel.setFirstName(firstName);
        return this;
    }

    public BillingAddressModelBuilder lastName(String lastName) {
        billingAddressModel.setLastName(lastName);
        return this;
    }

    public BillingAddressModelBuilder addressLine1(String addressLine1) {
        billingAddressModel.setAddressLine1(addressLine1);
        return this;
    }

    public BillingAddressModelBuilder city(String city) {
        billingAddressModel.setCity(city);
        return this;
    }

    public BillingAddressModelBuilder state(String state) {
        billingAddressModel.setState(state);
        return this;
    }

    public BillingAddressModelBuilder postalCode(String postalCode) {
        billingAddressModel.setPostalCode(postalCode);
        return this;
    }

    /**
     * 2-letter country code
     */
    public BillingAddressModelBuilder country(String country) {
        billingAddressModel.setCountry(country);
        return this;
    }

    /**
     * billing email address
     */
    public BillingAddressModelBuilder emailAddress(String emailAddress) {
        billingAddressModel.setEmailAddress(emailAddress);
        return this;
    }

    public BillingAddressModelBuilder addressLine2(String addressLine2) {
        billingAddressModel.setAddressLine2(addressLine2);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BillingAddressModel build() {
        return billingAddressModel;
    }
}