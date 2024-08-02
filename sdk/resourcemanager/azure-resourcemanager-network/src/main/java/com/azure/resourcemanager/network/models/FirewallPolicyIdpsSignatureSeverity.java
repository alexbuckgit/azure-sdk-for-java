// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

/**
 * Describes the severity of signature: 1 - High, 2 - Medium, 3 - Low.
 */
public enum FirewallPolicyIdpsSignatureSeverity {
    /**
     * Enum value 1.
     */
    ONE(1),

    /**
     * Enum value 2.
     */
    TWO(2),

    /**
     * Enum value 3.
     */
    THREE(3);

    /**
     * The actual serialized value for a FirewallPolicyIdpsSignatureSeverity instance.
     */
    private final int value;

    FirewallPolicyIdpsSignatureSeverity(int value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FirewallPolicyIdpsSignatureSeverity instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed FirewallPolicyIdpsSignatureSeverity object, or null if unable to parse.
     */
    public static FirewallPolicyIdpsSignatureSeverity fromInt(int value) {
        FirewallPolicyIdpsSignatureSeverity[] items = FirewallPolicyIdpsSignatureSeverity.values();
        for (FirewallPolicyIdpsSignatureSeverity item : items) {
            if (item.toInt() == value) {
                return item;
            }
        }
        return null;
    }

    /**
     * De-serializes the instance to int value.
     * 
     * @return the int value.
     */
    public int toInt() {
        return this.value;
    }
}
