// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the rule collection.
 */
public final class FirewallPolicyRuleCollectionType extends ExpandableStringEnum<FirewallPolicyRuleCollectionType> {
    /**
     * Static value FirewallPolicyNatRuleCollection for FirewallPolicyRuleCollectionType.
     */
    public static final FirewallPolicyRuleCollectionType FIREWALL_POLICY_NAT_RULE_COLLECTION
        = fromString("FirewallPolicyNatRuleCollection");

    /**
     * Static value FirewallPolicyFilterRuleCollection for FirewallPolicyRuleCollectionType.
     */
    public static final FirewallPolicyRuleCollectionType FIREWALL_POLICY_FILTER_RULE_COLLECTION
        = fromString("FirewallPolicyFilterRuleCollection");

    /**
     * Creates a new instance of FirewallPolicyRuleCollectionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FirewallPolicyRuleCollectionType() {
    }

    /**
     * Creates or finds a FirewallPolicyRuleCollectionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyRuleCollectionType.
     */
    public static FirewallPolicyRuleCollectionType fromString(String name) {
        return fromString(name, FirewallPolicyRuleCollectionType.class);
    }

    /**
     * Gets known FirewallPolicyRuleCollectionType values.
     * 
     * @return known FirewallPolicyRuleCollectionType values.
     */
    public static Collection<FirewallPolicyRuleCollectionType> values() {
        return values(FirewallPolicyRuleCollectionType.class);
    }
}
