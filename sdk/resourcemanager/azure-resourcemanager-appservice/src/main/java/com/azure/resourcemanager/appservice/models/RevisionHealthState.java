// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Current health State of the revision. */
public final class RevisionHealthState extends ExpandableStringEnum<RevisionHealthState> {
    /** Static value Healthy for RevisionHealthState. */
    public static final RevisionHealthState HEALTHY = fromString("Healthy");

    /** Static value Unhealthy for RevisionHealthState. */
    public static final RevisionHealthState UNHEALTHY = fromString("Unhealthy");

    /** Static value None for RevisionHealthState. */
    public static final RevisionHealthState NONE = fromString("None");

    /**
     * Creates a new instance of RevisionHealthState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RevisionHealthState() {
    }

    /**
     * Creates or finds a RevisionHealthState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RevisionHealthState.
     */
    @JsonCreator
    public static RevisionHealthState fromString(String name) {
        return fromString(name, RevisionHealthState.class);
    }

    /**
     * Gets known RevisionHealthState values.
     *
     * @return known RevisionHealthState values.
     */
    public static Collection<RevisionHealthState> values() {
        return values(RevisionHealthState.class);
    }
}
