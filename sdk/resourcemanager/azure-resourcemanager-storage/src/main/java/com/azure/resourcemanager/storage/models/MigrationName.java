// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for MigrationName.
 */
public final class MigrationName extends ExpandableStringEnum<MigrationName> {
    /**
     * Static value default for MigrationName.
     */
    public static final MigrationName DEFAULT = fromString("default");

    /**
     * Creates a new instance of MigrationName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MigrationName() {
    }

    /**
     * Creates or finds a MigrationName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MigrationName.
     */
    public static MigrationName fromString(String name) {
        return fromString(name, MigrationName.class);
    }

    /**
     * Gets known MigrationName values.
     * 
     * @return known MigrationName values.
     */
    public static Collection<MigrationName> values() {
        return values(MigrationName.class);
    }
}
