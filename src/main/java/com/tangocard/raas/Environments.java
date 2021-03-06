/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Environments {
    SANDBOX, //Sandbox (Fake) Environment
    PRODUCTION, //Production (Live) Environment
    QA, //Tango Card Internal Use Only
    GAMMA, //Tango Card Internal Use Only
    LOCAL; //Tango Card Internal Use Only

    private static TreeMap<String, Environments> valueMap = new TreeMap<>();
    private String value;

    static {
        SANDBOX.value = "sandbox";
        PRODUCTION.value = "production";
        QA.value = "qa";
        GAMMA.value = "gamma";
        LOCAL.value = "local";

        valueMap.put("sandbox", SANDBOX);
        valueMap.put("production", PRODUCTION);
        valueMap.put("qa", QA);
        valueMap.put("gamma", GAMMA);
        valueMap.put("local", LOCAL);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Environments fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value;
    }

    /**
     * Convert list of Environments values to list of string values
     * @param toConvert The list of Environments values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Environments> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<>();
        for (Environments enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 