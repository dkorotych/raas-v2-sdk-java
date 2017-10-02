/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.models;

import java.util.*;

public class OrderModelBuilder {
    //the instance to build
    private OrderModel orderModel;

    /**
     * Default constructor to initialize the instance
     */
    public OrderModelBuilder() {
        orderModel = new OrderModel();
    }

    /**
     * Account Identifier
     */
    public OrderModelBuilder accountIdentifier(String accountIdentifier) {
        orderModel.setAccountIdentifier(accountIdentifier);
        return this;
    }

    /**
     * Amount Charged
     */
    public OrderModelBuilder amountCharged(CurrencyBreakdownModel amountCharged) {
        orderModel.setAmountCharged(amountCharged);
        return this;
    }

    /**
     * Created At
     */
    public OrderModelBuilder createdAt(Date createdAt) {
        orderModel.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Customer Identifier
     */
    public OrderModelBuilder customerIdentifier(String customerIdentifier) {
        orderModel.setCustomerIdentifier(customerIdentifier);
        return this;
    }

    /**
     * Denomination
     */
    public OrderModelBuilder denomination(CurrencyBreakdownModel denomination) {
        orderModel.setDenomination(denomination);
        return this;
    }

    /**
     * Reference Order ID
     */
    public OrderModelBuilder referenceOrderID(String referenceOrderID) {
        orderModel.setReferenceOrderID(referenceOrderID);
        return this;
    }

    /**
     * Reward
     */
    public OrderModelBuilder reward(RewardModel reward) {
        orderModel.setReward(reward);
        return this;
    }

    /**
     * Reward Name
     */
    public OrderModelBuilder rewardName(String rewardName) {
        orderModel.setRewardName(rewardName);
        return this;
    }

    /**
     * Send Email
     */
    public OrderModelBuilder sendEmail(boolean sendEmail) {
        orderModel.setSendEmail(sendEmail);
        return this;
    }

    /**
     * Status
     */
    public OrderModelBuilder status(String status) {
        orderModel.setStatus(status);
        return this;
    }

    /**
     * UTID
     */
    public OrderModelBuilder utid(String utid) {
        orderModel.setUtid(utid);
        return this;
    }

    /**
     * Campaign
     */
    public OrderModelBuilder campaign(String campaign) {
        orderModel.setCampaign(campaign);
        return this;
    }

    /**
     * Email Subject
     */
    public OrderModelBuilder emailSubject(String emailSubject) {
        orderModel.setEmailSubject(emailSubject);
        return this;
    }

    /**
     * External Reference ID
     */
    public OrderModelBuilder externalRefID(String externalRefID) {
        orderModel.setExternalRefID(externalRefID);
        return this;
    }

    /**
     * Message
     */
    public OrderModelBuilder message(String message) {
        orderModel.setMessage(message);
        return this;
    }

    /**
     * Notes
     */
    public OrderModelBuilder notes(String notes) {
        orderModel.setNotes(notes);
        return this;
    }

    /**
     * Recipient
     */
    public OrderModelBuilder recipient(NameEmailModel recipient) {
        orderModel.setRecipient(recipient);
        return this;
    }

    /**
     * Sender
     */
    public OrderModelBuilder sender(NameEmailModel sender) {
        orderModel.setSender(sender);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OrderModel build() {
        return orderModel;
    }
}