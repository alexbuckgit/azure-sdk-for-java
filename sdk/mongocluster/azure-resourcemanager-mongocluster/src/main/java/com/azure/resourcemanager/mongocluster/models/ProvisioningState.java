// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The provisioning state of the last accepted operation.
 */
public final class ProvisioningState extends ExpandableStringEnum<ProvisioningState> {
    /**
     * Static value Succeeded for ProvisioningState.
     */
    public static final ProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for ProvisioningState.
     */
    public static final ProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for ProvisioningState.
     */
    public static final ProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value InProgress for ProvisioningState.
     */
    public static final ProvisioningState IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Updating for ProvisioningState.
     */
    public static final ProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Dropping for ProvisioningState.
     */
    public static final ProvisioningState DROPPING = fromString("Dropping");

    /**
     * Creates a new instance of ProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningState() {
    }

    /**
     * Creates or finds a ProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisioningState.
     */
    public static ProvisioningState fromString(String name) {
        return fromString(name, ProvisioningState.class);
    }

    /**
     * Gets known ProvisioningState values.
     * 
     * @return known ProvisioningState values.
     */
    public static Collection<ProvisioningState> values() {
        return values(ProvisioningState.class);
    }
}
