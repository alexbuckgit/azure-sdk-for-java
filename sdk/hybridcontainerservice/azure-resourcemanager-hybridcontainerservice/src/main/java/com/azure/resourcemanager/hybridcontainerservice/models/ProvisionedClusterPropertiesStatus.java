// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The observed status of the provisioned cluster.
 */
@Fluent
public final class ProvisionedClusterPropertiesStatus {
    /*
     * The detailed status of the provisioned cluster components including addons.
     */
    @JsonProperty(value = "controlPlaneStatus")
    private List<AddonStatusProfile> controlPlaneStatus;

    /*
     * The current state of the provisioned cluster.
     */
    @JsonProperty(value = "currentState", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceProvisioningState currentState;

    /*
     * Error messages during a provisioned cluster operation or steady state.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * Creates an instance of ProvisionedClusterPropertiesStatus class.
     */
    public ProvisionedClusterPropertiesStatus() {
    }

    /**
     * Get the controlPlaneStatus property: The detailed status of the provisioned cluster components including addons.
     * 
     * @return the controlPlaneStatus value.
     */
    public List<AddonStatusProfile> controlPlaneStatus() {
        return this.controlPlaneStatus;
    }

    /**
     * Set the controlPlaneStatus property: The detailed status of the provisioned cluster components including addons.
     * 
     * @param controlPlaneStatus the controlPlaneStatus value to set.
     * @return the ProvisionedClusterPropertiesStatus object itself.
     */
    public ProvisionedClusterPropertiesStatus withControlPlaneStatus(List<AddonStatusProfile> controlPlaneStatus) {
        this.controlPlaneStatus = controlPlaneStatus;
        return this;
    }

    /**
     * Get the currentState property: The current state of the provisioned cluster.
     * 
     * @return the currentState value.
     */
    public ResourceProvisioningState currentState() {
        return this.currentState;
    }

    /**
     * Get the errorMessage property: Error messages during a provisioned cluster operation or steady state.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Error messages during a provisioned cluster operation or steady state.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the ProvisionedClusterPropertiesStatus object itself.
     */
    public ProvisionedClusterPropertiesStatus withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (controlPlaneStatus() != null) {
            controlPlaneStatus().forEach(e -> e.validate());
        }
    }
}
