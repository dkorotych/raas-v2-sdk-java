/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class CreateOrderRequestModelBuilder {
    //the instance to build
    private CreateOrderRequestModel createOrderRequestModel;

    /**
     * Default constructor to initialize the instance
     */
    public CreateOrderRequestModelBuilder() {
        createOrderRequestModel = new CreateOrderRequestModel();
    }

    /**
     * Account Identifier
     */
    public CreateOrderRequestModelBuilder accountIdentifier(String accountIdentifier) {
        createOrderRequestModel.setAccountIdentifier(accountIdentifier);
        return this;
    }

    /**
     * Amount
     */
    public CreateOrderRequestModelBuilder amount(double amount) {
        createOrderRequestModel.setAmount(amount);
        return this;
    }

    /**
     * Customer Identifier
     */
    public CreateOrderRequestModelBuilder customerIdentifier(String customerIdentifier) {
        createOrderRequestModel.setCustomerIdentifier(customerIdentifier);
        return this;
    }

    /**
     * Send Email
     */
    public CreateOrderRequestModelBuilder sendEmail(boolean sendEmail) {
        createOrderRequestModel.setSendEmail(sendEmail);
        return this;
    }

    /**
     * UTID
     */
    public CreateOrderRequestModelBuilder utid(String utid) {
        createOrderRequestModel.setUtid(utid);
        return this;
    }

    /**
     * Campaign
     */
    public CreateOrderRequestModelBuilder campaign(String campaign) {
        createOrderRequestModel.setCampaign(campaign);
        return this;
    }

    /**
     * Email Subject
     */
    public CreateOrderRequestModelBuilder emailSubject(String emailSubject) {
        createOrderRequestModel.setEmailSubject(emailSubject);
        return this;
    }

    /**
     * External Reference ID
     */
    public CreateOrderRequestModelBuilder externalRefID(String externalRefID) {
        createOrderRequestModel.setExternalRefID(externalRefID);
        return this;
    }

    /**
     * Email Message
     */
    public CreateOrderRequestModelBuilder message(String message) {
        createOrderRequestModel.setMessage(message);
        return this;
    }

    /**
     * Recipient
     */
    public CreateOrderRequestModelBuilder recipient(NameEmailModel recipient) {
        createOrderRequestModel.setRecipient(recipient);
        return this;
    }

    /**
     * Sender
     */
    public CreateOrderRequestModelBuilder sender(NameEmailModel sender) {
        createOrderRequestModel.setSender(sender);
        return this;
    }

    /**
     * Notes
     */
    public CreateOrderRequestModelBuilder notes(String notes) {
        createOrderRequestModel.setNotes(notes);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateOrderRequestModel build() {
        return createOrderRequestModel;
    }
}