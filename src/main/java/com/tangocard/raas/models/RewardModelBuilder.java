/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class RewardModelBuilder {
    //the instance to build
    private RewardModel rewardModel;

    /**
     * Default constructor to initialize the instance
     */
    public RewardModelBuilder() {
        rewardModel = new RewardModel();
    }

    /**
     * A map of reward credentials
     */
    public RewardModelBuilder credentials(LinkedHashMap<String, String> credentials) {
        rewardModel.setCredentials(credentials);
        return this;
    }

    /**
     * An array of reward credentials
     */
    public RewardModelBuilder credentialList(List<RewardCredentialModel> credentialList) {
        rewardModel.setCredentialList(credentialList);
        return this;
    }

    /**
     * Reward redemption instructions
     */
    public RewardModelBuilder redemptionInstructions(String redemptionInstructions) {
        rewardModel.setRedemptionInstructions(redemptionInstructions);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RewardModel build() {
        return rewardModel;
    }
}