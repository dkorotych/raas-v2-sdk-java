/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class RaasServerErrorModelBuilder {
    //the instance to build
    private RaasServerErrorModel raasServerErrorModel;

    /**
     * Default constructor to initialize the instance
     */
    public RaasServerErrorModelBuilder() {
        raasServerErrorModel = new RaasServerErrorModel();
    }

    /**
     * Error Message
     */
    public RaasServerErrorModelBuilder message(String message) {
        raasServerErrorModel.setMessage(message);
        return this;
    }

    /**
     * Error Code
     */
    public RaasServerErrorModelBuilder code(int code) {
        raasServerErrorModel.setCode(code);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RaasServerErrorModel build() {
        return raasServerErrorModel;
    }
}