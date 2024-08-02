// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

/**
 * The reason that a vault name could not be used. The Reason element is only returned if NameAvailable is false.
 */
public enum Reason {
    /**
     * Enum value AccountNameInvalid.
     */
    ACCOUNT_NAME_INVALID("AccountNameInvalid"),

    /**
     * Enum value AlreadyExists.
     */
    ALREADY_EXISTS("AlreadyExists");

    /**
     * The actual serialized value for a Reason instance.
     */
    private final String value;

    Reason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Reason instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed Reason object, or null if unable to parse.
     */
    public static Reason fromString(String value) {
        if (value == null) {
            return null;
        }
        Reason[] items = Reason.values();
        for (Reason item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
