// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Allow, disallow, or let Network Security Perimeter configuration to evaluate public network access to Storage
 * Account. Value is optional but if passed in, must be 'Enabled', 'Disabled' or 'SecuredByPerimeter'.
 */
public final class PublicNetworkAccess extends ExpandableStringEnum<PublicNetworkAccess> {
    /**
     * Static value Enabled for PublicNetworkAccess.
     */
    public static final PublicNetworkAccess ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for PublicNetworkAccess.
     */
    public static final PublicNetworkAccess DISABLED = fromString("Disabled");

    /**
     * Static value SecuredByPerimeter for PublicNetworkAccess.
     */
    public static final PublicNetworkAccess SECURED_BY_PERIMETER = fromString("SecuredByPerimeter");

    /**
     * Creates a new instance of PublicNetworkAccess value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PublicNetworkAccess() {
    }

    /**
     * Creates or finds a PublicNetworkAccess from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PublicNetworkAccess.
     */
    public static PublicNetworkAccess fromString(String name) {
        return fromString(name, PublicNetworkAccess.class);
    }

    /**
     * Gets known PublicNetworkAccess values.
     * 
     * @return known PublicNetworkAccess values.
     */
    public static Collection<PublicNetworkAccess> values() {
        return values(PublicNetworkAccess.class);
    }
}
