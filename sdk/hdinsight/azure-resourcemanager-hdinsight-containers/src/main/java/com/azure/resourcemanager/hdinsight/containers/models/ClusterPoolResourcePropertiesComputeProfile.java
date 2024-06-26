// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;

/**
 * CLuster pool compute profile.
 */
@Fluent
public final class ClusterPoolResourcePropertiesComputeProfile extends ClusterPoolComputeProfile {
    /**
     * Creates an instance of ClusterPoolResourcePropertiesComputeProfile class.
     */
    public ClusterPoolResourcePropertiesComputeProfile() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterPoolResourcePropertiesComputeProfile withVmSize(String vmSize) {
        super.withVmSize(vmSize);
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
