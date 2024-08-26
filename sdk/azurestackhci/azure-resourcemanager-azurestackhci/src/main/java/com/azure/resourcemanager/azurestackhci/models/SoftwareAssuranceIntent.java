// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Customer Intent for Software Assurance Benefit.
 */
public final class SoftwareAssuranceIntent extends ExpandableStringEnum<SoftwareAssuranceIntent> {
    /**
     * Static value Enable for SoftwareAssuranceIntent.
     */
    public static final SoftwareAssuranceIntent ENABLE = fromString("Enable");

    /**
     * Static value Disable for SoftwareAssuranceIntent.
     */
    public static final SoftwareAssuranceIntent DISABLE = fromString("Disable");

    /**
     * Creates a new instance of SoftwareAssuranceIntent value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SoftwareAssuranceIntent() {
    }

    /**
     * Creates or finds a SoftwareAssuranceIntent from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SoftwareAssuranceIntent.
     */
    public static SoftwareAssuranceIntent fromString(String name) {
        return fromString(name, SoftwareAssuranceIntent.class);
    }

    /**
     * Gets known SoftwareAssuranceIntent values.
     * 
     * @return known SoftwareAssuranceIntent values.
     */
    public static Collection<SoftwareAssuranceIntent> values() {
        return values(SoftwareAssuranceIntent.class);
    }
}
