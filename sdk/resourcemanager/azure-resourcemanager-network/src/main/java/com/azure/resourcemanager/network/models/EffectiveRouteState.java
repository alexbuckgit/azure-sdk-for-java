// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The value of effective route.
 */
public final class EffectiveRouteState extends ExpandableStringEnum<EffectiveRouteState> {
    /**
     * Static value Active for EffectiveRouteState.
     */
    public static final EffectiveRouteState ACTIVE = fromString("Active");

    /**
     * Static value Invalid for EffectiveRouteState.
     */
    public static final EffectiveRouteState INVALID = fromString("Invalid");

    /**
     * Creates a new instance of EffectiveRouteState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EffectiveRouteState() {
    }

    /**
     * Creates or finds a EffectiveRouteState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EffectiveRouteState.
     */
    public static EffectiveRouteState fromString(String name) {
        return fromString(name, EffectiveRouteState.class);
    }

    /**
     * Gets known EffectiveRouteState values.
     * 
     * @return known EffectiveRouteState values.
     */
    public static Collection<EffectiveRouteState> values() {
        return values(EffectiveRouteState.class);
    }
}
