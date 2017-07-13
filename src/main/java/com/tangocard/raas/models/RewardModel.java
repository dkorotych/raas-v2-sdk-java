/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RewardModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4922426715931799228L;
    private LinkedHashMap<String, String> credentials;
    private List<RewardCredentialModel> credentialList;
    private String redemptionInstructions;
    /** GETTER
     * A map of reward credentials
     */
    @JsonGetter("credentials")
    public LinkedHashMap<String, String> getCredentials ( ) { 
        return this.credentials;
    }
    
    /** SETTER
     * A map of reward credentials
     */
    @JsonSetter("credentials")
    public void setCredentials (LinkedHashMap<String, String> value) { 
        this.credentials = value;
    }
 
    /** GETTER
     * An array of reward credentials
     */
    @JsonGetter("credentialList")
    public List<RewardCredentialModel> getCredentialList ( ) { 
        return this.credentialList;
    }
    
    /** SETTER
     * An array of reward credentials
     */
    @JsonSetter("credentialList")
    public void setCredentialList (List<RewardCredentialModel> value) { 
        this.credentialList = value;
    }
 
    /** GETTER
     * Reward redemption instructions
     */
    @JsonGetter("redemptionInstructions")
    public String getRedemptionInstructions ( ) { 
        return this.redemptionInstructions;
    }
    
    /** SETTER
     * Reward redemption instructions
     */
    @JsonSetter("redemptionInstructions")
    public void setRedemptionInstructions (String value) { 
        this.redemptionInstructions = value;
    }
 
}
 