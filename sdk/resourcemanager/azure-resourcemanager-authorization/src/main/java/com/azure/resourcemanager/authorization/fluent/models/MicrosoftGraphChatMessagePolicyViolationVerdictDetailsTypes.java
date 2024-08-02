// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * chatMessagePolicyViolationVerdictDetailsTypes.
 */
public final class MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes
    extends ExpandableStringEnum<MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes> {
    /**
     * Static value none for MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes.
     */
    public static final MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes NONE = fromString("none");

    /**
     * Static value allowFalsePositiveOverride for MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes.
     */
    public static final MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes ALLOW_FALSE_POSITIVE_OVERRIDE
        = fromString("allowFalsePositiveOverride");

    /**
     * Static value allowOverrideWithoutJustification for MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes.
     */
    public static final MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes ALLOW_OVERRIDE_WITHOUT_JUSTIFICATION
        = fromString("allowOverrideWithoutJustification");

    /**
     * Static value allowOverrideWithJustification for MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes.
     */
    public static final MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes ALLOW_OVERRIDE_WITH_JUSTIFICATION
        = fromString("allowOverrideWithJustification");

    /**
     * Creates a new instance of MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes() {
    }

    /**
     * Creates or finds a MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes.
     */
    public static MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes fromString(String name) {
        return fromString(name, MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes.class);
    }

    /**
     * Gets known MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes values.
     * 
     * @return known MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes values.
     */
    public static Collection<MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes> values() {
        return values(MicrosoftGraphChatMessagePolicyViolationVerdictDetailsTypes.class);
    }
}
