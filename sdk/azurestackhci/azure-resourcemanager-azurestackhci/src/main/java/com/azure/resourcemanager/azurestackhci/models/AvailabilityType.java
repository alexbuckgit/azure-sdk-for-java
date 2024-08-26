// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Indicates the way the update content can be downloaded.
 */
public final class AvailabilityType extends ExpandableStringEnum<AvailabilityType> {
    /**
     * Static value Local for AvailabilityType.
     */
    public static final AvailabilityType LOCAL = fromString("Local");

    /**
     * Static value Online for AvailabilityType.
     */
    public static final AvailabilityType ONLINE = fromString("Online");

    /**
     * Static value Notify for AvailabilityType.
     */
    public static final AvailabilityType NOTIFY = fromString("Notify");

    /**
     * Creates a new instance of AvailabilityType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AvailabilityType() {
    }

    /**
     * Creates or finds a AvailabilityType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AvailabilityType.
     */
    public static AvailabilityType fromString(String name) {
        return fromString(name, AvailabilityType.class);
    }

    /**
     * Gets known AvailabilityType values.
     * 
     * @return known AvailabilityType values.
     */
    public static Collection<AvailabilityType> values() {
        return values(AvailabilityType.class);
    }
}
