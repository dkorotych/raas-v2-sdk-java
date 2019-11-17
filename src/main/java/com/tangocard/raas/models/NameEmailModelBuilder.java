/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

public class NameEmailModelBuilder {
    //the instance to build
    private NameEmailModel nameEmailModel;

    /**
     * Default constructor to initialize the instance
     */
    public NameEmailModelBuilder() {
        nameEmailModel = new NameEmailModel();
    }

    /**
     * Email Address
     */
    public NameEmailModelBuilder email(String email) {
        nameEmailModel.setEmail(email);
        return this;
    }

    /**
     * First Name
     */
    public NameEmailModelBuilder firstName(String firstName) {
        nameEmailModel.setFirstName(firstName);
        return this;
    }

    /**
     * Last Name
     */
    public NameEmailModelBuilder lastName(String lastName) {
        nameEmailModel.setLastName(lastName);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public NameEmailModel build() {
        return nameEmailModel;
    }
}