// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Overall update state of the stamp.
 */
public final class UpdateSummariesPropertiesState extends ExpandableStringEnum<UpdateSummariesPropertiesState> {
    /**
     * Static value Unknown for UpdateSummariesPropertiesState.
     */
    public static final UpdateSummariesPropertiesState UNKNOWN = fromString("Unknown");

    /**
     * Static value AppliedSuccessfully for UpdateSummariesPropertiesState.
     */
    public static final UpdateSummariesPropertiesState APPLIED_SUCCESSFULLY = fromString("AppliedSuccessfully");

    /**
     * Static value UpdateAvailable for UpdateSummariesPropertiesState.
     */
    public static final UpdateSummariesPropertiesState UPDATE_AVAILABLE = fromString("UpdateAvailable");

    /**
     * Static value UpdateInProgress for UpdateSummariesPropertiesState.
     */
    public static final UpdateSummariesPropertiesState UPDATE_IN_PROGRESS = fromString("UpdateInProgress");

    /**
     * Static value UpdateFailed for UpdateSummariesPropertiesState.
     */
    public static final UpdateSummariesPropertiesState UPDATE_FAILED = fromString("UpdateFailed");

    /**
     * Static value NeedsAttention for UpdateSummariesPropertiesState.
     */
    public static final UpdateSummariesPropertiesState NEEDS_ATTENTION = fromString("NeedsAttention");

    /**
     * Static value PreparationInProgress for UpdateSummariesPropertiesState.
     */
    public static final UpdateSummariesPropertiesState PREPARATION_IN_PROGRESS = fromString("PreparationInProgress");

    /**
     * Static value PreparationFailed for UpdateSummariesPropertiesState.
     */
    public static final UpdateSummariesPropertiesState PREPARATION_FAILED = fromString("PreparationFailed");

    /**
     * Creates a new instance of UpdateSummariesPropertiesState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UpdateSummariesPropertiesState() {
    }

    /**
     * Creates or finds a UpdateSummariesPropertiesState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UpdateSummariesPropertiesState.
     */
    public static UpdateSummariesPropertiesState fromString(String name) {
        return fromString(name, UpdateSummariesPropertiesState.class);
    }

    /**
     * Gets known UpdateSummariesPropertiesState values.
     * 
     * @return known UpdateSummariesPropertiesState values.
     */
    public static Collection<UpdateSummariesPropertiesState> values() {
        return values(UpdateSummariesPropertiesState.class);
    }
}
