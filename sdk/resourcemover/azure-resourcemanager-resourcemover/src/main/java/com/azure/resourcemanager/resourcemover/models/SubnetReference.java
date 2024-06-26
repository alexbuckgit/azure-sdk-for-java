// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;

/** Defines reference to subnet. */
@Fluent
public final class SubnetReference extends ProxyResourceReference {
    /** Creates an instance of SubnetReference class. */
    public SubnetReference() {
    }

    /** {@inheritDoc} */
    @Override
    public SubnetReference withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SubnetReference withSourceArmResourceId(String sourceArmResourceId) {
        super.withSourceArmResourceId(sourceArmResourceId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
