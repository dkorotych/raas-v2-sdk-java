/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

public class RaasClientErrorModelBuilder {
    //the instance to build
    private RaasClientErrorModel raasClientErrorModel;

    /**
     * Default constructor to initialize the instance
     */
    public RaasClientErrorModelBuilder() {
        raasClientErrorModel = new RaasClientErrorModel();
    }

    /**
     * Error Path
     */
    public RaasClientErrorModelBuilder path(String path) {
        raasClientErrorModel.setPath(path);
        return this;
    }

    /**
     * Error Message
     */
    public RaasClientErrorModelBuilder message(String message) {
        raasClientErrorModel.setMessage(message);
        return this;
    }

    /**
     * Constraint
     */
    public RaasClientErrorModelBuilder constraint(String constraint) {
        raasClientErrorModel.setConstraint(constraint);
        return this;
    }

    /**
     * Invalid Value
     */
    public RaasClientErrorModelBuilder invalidValue(String invalidValue) {
        raasClientErrorModel.setInvalidValue(invalidValue);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RaasClientErrorModel build() {
        return raasClientErrorModel;
    }
}