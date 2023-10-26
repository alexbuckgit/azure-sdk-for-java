// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Configures whether billing will be only on the cluster or each workspace will be billed by its proportional use. This
 * does not change the overall billing, only how it will be distributed. Default value is 'Cluster'.
 */
public final class BillingType extends ExpandableStringEnum<BillingType> {
    /** Static value Cluster for BillingType. */
    public static final BillingType CLUSTER = fromString("Cluster");

    /** Static value Workspaces for BillingType. */
    public static final BillingType WORKSPACES = fromString("Workspaces");

    /**
     * Creates a new instance of BillingType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BillingType() {
    }

    /**
     * Creates or finds a BillingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BillingType.
     */
    @JsonCreator
    public static BillingType fromString(String name) {
        return fromString(name, BillingType.class);
    }

    /**
     * Gets known BillingType values.
     *
     * @return known BillingType values.
     */
    public static Collection<BillingType> values() {
        return values(BillingType.class);
    }
}
