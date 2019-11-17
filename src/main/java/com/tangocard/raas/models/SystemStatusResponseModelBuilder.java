/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

public class SystemStatusResponseModelBuilder {
    //the instance to build
    private SystemStatusResponseModel systemStatusResponseModel;

    /**
     * Default constructor to initialize the instance
     */
    public SystemStatusResponseModelBuilder() {
        systemStatusResponseModel = new SystemStatusResponseModel();
    }

    /**
     * System Status
     */
    public SystemStatusResponseModelBuilder status(String status) {
        systemStatusResponseModel.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemStatusResponseModel build() {
        return systemStatusResponseModel;
    }
}