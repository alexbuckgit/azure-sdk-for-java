// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * attachmentType.
 */
public final class MicrosoftGraphAttachmentType extends ExpandableStringEnum<MicrosoftGraphAttachmentType> {
    /**
     * Static value file for MicrosoftGraphAttachmentType.
     */
    public static final MicrosoftGraphAttachmentType FILE = fromString("file");

    /**
     * Static value item for MicrosoftGraphAttachmentType.
     */
    public static final MicrosoftGraphAttachmentType ITEM = fromString("item");

    /**
     * Static value reference for MicrosoftGraphAttachmentType.
     */
    public static final MicrosoftGraphAttachmentType REFERENCE = fromString("reference");

    /**
     * Creates a new instance of MicrosoftGraphAttachmentType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MicrosoftGraphAttachmentType() {
    }

    /**
     * Creates or finds a MicrosoftGraphAttachmentType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphAttachmentType.
     */
    public static MicrosoftGraphAttachmentType fromString(String name) {
        return fromString(name, MicrosoftGraphAttachmentType.class);
    }

    /**
     * Gets known MicrosoftGraphAttachmentType values.
     * 
     * @return known MicrosoftGraphAttachmentType values.
     */
    public static Collection<MicrosoftGraphAttachmentType> values() {
        return values(MicrosoftGraphAttachmentType.class);
    }
}
