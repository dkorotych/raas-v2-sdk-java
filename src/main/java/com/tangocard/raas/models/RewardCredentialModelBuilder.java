/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

public class RewardCredentialModelBuilder {
    //the instance to build
    private RewardCredentialModel rewardCredentialModel;

    /**
     * Default constructor to initialize the instance
     */
    public RewardCredentialModelBuilder() {
        rewardCredentialModel = new RewardCredentialModel();
    }

    /**
     * Credential Label
     */
    public RewardCredentialModelBuilder label(String label) {
        rewardCredentialModel.setLabel(label);
        return this;
    }

    /**
     * Credential Value
     */
    public RewardCredentialModelBuilder value(String value) {
        rewardCredentialModel.setValue(value);
        return this;
    }

    /**
     * Credential Type
     */
    public RewardCredentialModelBuilder type(String type) {
        rewardCredentialModel.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RewardCredentialModel build() {
        return rewardCredentialModel;
    }
}