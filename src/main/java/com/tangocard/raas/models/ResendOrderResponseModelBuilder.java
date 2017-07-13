/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class ResendOrderResponseModelBuilder {
    //the instance to build
    private ResendOrderResponseModel resendOrderResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public ResendOrderResponseModelBuilder() {
        resendOrderResponseModel = new ResendOrderResponseModel();
    }

    /**
     * When the resend request was created
     */
    public ResendOrderResponseModelBuilder createdAt(Date createdAt) {
        resendOrderResponseModel.setCreatedAt(createdAt);
        return this;
    }

    /**
     * The order resend id
     */
    public ResendOrderResponseModelBuilder id(int id) {
        resendOrderResponseModel.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ResendOrderResponseModel build() {
        return resendOrderResponseModel;
    }
}