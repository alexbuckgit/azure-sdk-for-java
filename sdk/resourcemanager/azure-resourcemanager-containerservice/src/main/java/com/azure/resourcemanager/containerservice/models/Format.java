// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for Format.
 */
public final class Format extends ExpandableStringEnum<Format> {
    /**
     * Static value azure for Format.
     */
    public static final Format AZURE = fromString("azure");

    /**
     * Static value exec for Format.
     */
    public static final Format EXEC = fromString("exec");

    /**
     * Creates a new instance of Format value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Format() {
    }

    /**
     * Creates or finds a Format from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding Format.
     */
    public static Format fromString(String name) {
        return fromString(name, Format.class);
    }

    /**
     * Gets known Format values.
     * 
     * @return known Format values.
     */
    public static Collection<Format> values() {
        return values(Format.class);
    }
}
