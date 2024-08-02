// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * IpAllocation type.
 */
public final class IpAllocationType extends ExpandableStringEnum<IpAllocationType> {
    /**
     * Static value Undefined for IpAllocationType.
     */
    public static final IpAllocationType UNDEFINED = fromString("Undefined");

    /**
     * Static value Hypernet for IpAllocationType.
     */
    public static final IpAllocationType HYPERNET = fromString("Hypernet");

    /**
     * Creates a new instance of IpAllocationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IpAllocationType() {
    }

    /**
     * Creates or finds a IpAllocationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IpAllocationType.
     */
    public static IpAllocationType fromString(String name) {
        return fromString(name, IpAllocationType.class);
    }

    /**
     * Gets known IpAllocationType values.
     * 
     * @return known IpAllocationType values.
     */
    public static Collection<IpAllocationType> values() {
        return values(IpAllocationType.class);
    }
}
