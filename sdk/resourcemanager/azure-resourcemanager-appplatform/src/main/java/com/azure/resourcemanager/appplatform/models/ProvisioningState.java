// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Provisioning state of the Service.
 */
public final class ProvisioningState extends ExpandableStringEnum<ProvisioningState> {
    /**
     * Static value Creating for ProvisioningState.
     */
    public static final ProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for ProvisioningState.
     */
    public static final ProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Starting for ProvisioningState.
     */
    public static final ProvisioningState STARTING = fromString("Starting");

    /**
     * Static value Stopping for ProvisioningState.
     */
    public static final ProvisioningState STOPPING = fromString("Stopping");

    /**
     * Static value Deleting for ProvisioningState.
     */
    public static final ProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Deleted for ProvisioningState.
     */
    public static final ProvisioningState DELETED = fromString("Deleted");

    /**
     * Static value Succeeded for ProvisioningState.
     */
    public static final ProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for ProvisioningState.
     */
    public static final ProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Moving for ProvisioningState.
     */
    public static final ProvisioningState MOVING = fromString("Moving");

    /**
     * Static value Moved for ProvisioningState.
     */
    public static final ProvisioningState MOVED = fromString("Moved");

    /**
     * Static value MoveFailed for ProvisioningState.
     */
    public static final ProvisioningState MOVE_FAILED = fromString("MoveFailed");

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
