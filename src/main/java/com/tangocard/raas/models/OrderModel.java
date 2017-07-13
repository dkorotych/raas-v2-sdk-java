/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OrderModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5396432515770701476L;
    private String accountIdentifier;
    private CurrencyBreakdownModel amountCharged;
    private Date createdAt;
    private String customerIdentifier;
    private CurrencyBreakdownModel denomination;
    private String referenceOrderID;
    private RewardModel reward;
    private String rewardName;
    private boolean sendEmail;
    private String status;
    private String utid;
    private String campaign;
    private String emailSubject;
    private String externalRefID;
    private String message;
    private String notes;
    private NameEmailModel recipient;
    private NameEmailModel sender;
    /** GETTER
     * Account Identifier
     */
    @JsonGetter("accountIdentifier")
    public String getAccountIdentifier ( ) { 
        return this.accountIdentifier;
    }
    
    /** SETTER
     * Account Identifier
     */
    @JsonSetter("accountIdentifier")
    public void setAccountIdentifier (String value) { 
        this.accountIdentifier = value;
    }
 
    /** GETTER
     * Amount Charged
     */
    @JsonGetter("amountCharged")
    public CurrencyBreakdownModel getAmountCharged ( ) { 
        return this.amountCharged;
    }
    
    /** SETTER
     * Amount Charged
     */
    @JsonSetter("amountCharged")
    public void setAmountCharged (CurrencyBreakdownModel value) { 
        this.amountCharged = value;
    }
 
    /** GETTER
     * Created At
     */
    @JsonGetter("createdAt")
    public Date getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * Created At
     */
    @JsonSetter("createdAt")
    public void setCreatedAt (Date value) { 
        this.createdAt = value;
    }
 
    /** GETTER
     * Customer Identifier
     */
    @JsonGetter("customerIdentifier")
    public String getCustomerIdentifier ( ) { 
        return this.customerIdentifier;
    }
    
    /** SETTER
     * Customer Identifier
     */
    @JsonSetter("customerIdentifier")
    public void setCustomerIdentifier (String value) { 
        this.customerIdentifier = value;
    }
 
    /** GETTER
     * Denomination
     */
    @JsonGetter("denomination")
    public CurrencyBreakdownModel getDenomination ( ) { 
        return this.denomination;
    }
    
    /** SETTER
     * Denomination
     */
    @JsonSetter("denomination")
    public void setDenomination (CurrencyBreakdownModel value) { 
        this.denomination = value;
    }
 
    /** GETTER
     * Reference Order ID
     */
    @JsonGetter("referenceOrderID")
    public String getReferenceOrderID ( ) { 
        return this.referenceOrderID;
    }
    
    /** SETTER
     * Reference Order ID
     */
    @JsonSetter("referenceOrderID")
    public void setReferenceOrderID (String value) { 
        this.referenceOrderID = value;
    }
 
    /** GETTER
     * Reward
     */
    @JsonGetter("reward")
    public RewardModel getReward ( ) { 
        return this.reward;
    }
    
    /** SETTER
     * Reward
     */
    @JsonSetter("reward")
    public void setReward (RewardModel value) { 
        this.reward = value;
    }
 
    /** GETTER
     * Reward Name
     */
    @JsonGetter("rewardName")
    public String getRewardName ( ) { 
        return this.rewardName;
    }
    
    /** SETTER
     * Reward Name
     */
    @JsonSetter("rewardName")
    public void setRewardName (String value) { 
        this.rewardName = value;
    }
 
    /** GETTER
     * Send Email
     */
    @JsonGetter("sendEmail")
    public boolean getSendEmail ( ) { 
        return this.sendEmail;
    }
    
    /** SETTER
     * Send Email
     */
    @JsonSetter("sendEmail")
    public void setSendEmail (boolean value) { 
        this.sendEmail = value;
    }
 
    /** GETTER
     * Status
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * Status
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * UTID
     */
    @JsonGetter("utid")
    public String getUtid ( ) { 
        return this.utid;
    }
    
    /** SETTER
     * UTID
     */
    @JsonSetter("utid")
    public void setUtid (String value) { 
        this.utid = value;
    }
 
    /** GETTER
     * Campaign
     */
    @JsonGetter("campaign")
    public String getCampaign ( ) { 
        return this.campaign;
    }
    
    /** SETTER
     * Campaign
     */
    @JsonSetter("campaign")
    public void setCampaign (String value) { 
        this.campaign = value;
    }
 
    /** GETTER
     * Email Subject
     */
    @JsonGetter("emailSubject")
    public String getEmailSubject ( ) { 
        return this.emailSubject;
    }
    
    /** SETTER
     * Email Subject
     */
    @JsonSetter("emailSubject")
    public void setEmailSubject (String value) { 
        this.emailSubject = value;
    }
 
    /** GETTER
     * External Reference ID
     */
    @JsonGetter("externalRefID")
    public String getExternalRefID ( ) { 
        return this.externalRefID;
    }
    
    /** SETTER
     * External Reference ID
     */
    @JsonSetter("externalRefID")
    public void setExternalRefID (String value) { 
        this.externalRefID = value;
    }
 
    /** GETTER
     * Message
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * Message
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
    /** GETTER
     * Notes
     */
    @JsonGetter("notes")
    public String getNotes ( ) { 
        return this.notes;
    }
    
    /** SETTER
     * Notes
     */
    @JsonSetter("notes")
    public void setNotes (String value) { 
        this.notes = value;
    }
 
    /** GETTER
     * Recipient
     */
    @JsonGetter("recipient")
    public NameEmailModel getRecipient ( ) { 
        return this.recipient;
    }
    
    /** SETTER
     * Recipient
     */
    @JsonSetter("recipient")
    public void setRecipient (NameEmailModel value) { 
        this.recipient = value;
    }
 
    /** GETTER
     * Sender
     */
    @JsonGetter("sender")
    public NameEmailModel getSender ( ) { 
        return this.sender;
    }
    
    /** SETTER
     * Sender
     */
    @JsonSetter("sender")
    public void setSender (NameEmailModel value) { 
        this.sender = value;
    }
 
}
 