/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class CreateOrderRequestModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5134646535331171534L;
    private String accountIdentifier;
    private double amount;
    private String customerIdentifier;
    private boolean sendEmail;
    private String utid;
    private String campaign;
    private String emailSubject;
    private String externalRefID;
    private String message;
    private NameEmailModel recipient;
    private NameEmailModel sender;
    private String notes;
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
     * Amount
     */
    @JsonGetter("amount")
    public double getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Amount
     */
    @JsonSetter("amount")
    public void setAmount (double value) { 
        this.amount = value;
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
     * Email Message
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * Email Message
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
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
 
}
 