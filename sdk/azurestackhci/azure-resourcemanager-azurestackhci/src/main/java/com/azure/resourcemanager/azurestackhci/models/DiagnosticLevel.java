// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Desired level of diagnostic data emitted by the cluster.
 */
public final class DiagnosticLevel extends ExpandableStringEnum<DiagnosticLevel> {
    /**
     * Static value Off for DiagnosticLevel.
     */
    public static final DiagnosticLevel OFF = fromString("Off");

    /**
     * Static value Basic for DiagnosticLevel.
     */
    public static final DiagnosticLevel BASIC = fromString("Basic");

    /**
     * Static value Enhanced for DiagnosticLevel.
     */
    public static final DiagnosticLevel ENHANCED = fromString("Enhanced");

    /**
     * Creates a new instance of DiagnosticLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DiagnosticLevel() {
    }

    /**
     * Creates or finds a DiagnosticLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DiagnosticLevel.
     */
    public static DiagnosticLevel fromString(String name) {
        return fromString(name, DiagnosticLevel.class);
    }

    /**
     * Gets known DiagnosticLevel values.
     * 
     * @return known DiagnosticLevel values.
     */
    public static Collection<DiagnosticLevel> values() {
        return values(DiagnosticLevel.class);
    }
}
