/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class NewCreditCardModelBuilder {
    //the instance to build
    private NewCreditCardModel newCreditCardModel;

    /**
     * Default constructor to initialize the instance
     */
    public NewCreditCardModelBuilder() {
        newCreditCardModel = new NewCreditCardModel();
    }

    /**
     * card number
     */
    public NewCreditCardModelBuilder number(String number) {
        newCreditCardModel.setNumber(number);
        return this;
    }

    /**
     * card expiration date in YYYY-MM format
     */
    public NewCreditCardModelBuilder expiration(String expiration) {
        newCreditCardModel.setExpiration(expiration);
        return this;
    }

    /**
     * 3 or 4 digit card security code on the back of card
     */
    public NewCreditCardModelBuilder verificationNumber(String verificationNumber) {
        newCreditCardModel.setVerificationNumber(verificationNumber);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public NewCreditCardModel build() {
        return newCreditCardModel;
    }
}