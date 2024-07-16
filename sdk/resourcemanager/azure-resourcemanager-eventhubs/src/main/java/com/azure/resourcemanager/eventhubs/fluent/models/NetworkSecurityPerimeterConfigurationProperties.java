// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventhubs.models.NetworkSecurityPerimeter;
import com.azure.resourcemanager.eventhubs.models.NetworkSecurityPerimeterConfigurationPropertiesProfile;
import com.azure.resourcemanager.eventhubs.models.NetworkSecurityPerimeterConfigurationPropertiesResourceAssociation;
import com.azure.resourcemanager.eventhubs.models.NetworkSecurityPerimeterConfigurationProvisioningState;
import com.azure.resourcemanager.eventhubs.models.ProvisioningIssue;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Properties of NetworkSecurityPerimeterConfiguration.
 */
@Fluent
public final class NetworkSecurityPerimeterConfigurationProperties {
    /*
     * Provisioning state of NetworkSecurityPerimeter configuration propagation
     */
    @JsonProperty(value = "provisioningState")
    private NetworkSecurityPerimeterConfigurationProvisioningState provisioningState;

    /*
     * List of Provisioning Issues if any
     */
    @JsonProperty(value = "provisioningIssues")
    private List<ProvisioningIssue> provisioningIssues;

    /*
     * NetworkSecurityPerimeter related information
     */
    @JsonProperty(value = "networkSecurityPerimeter", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkSecurityPerimeter networkSecurityPerimeter;

    /*
     * Information about resource association
     */
    @JsonProperty(value = "resourceAssociation", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkSecurityPerimeterConfigurationPropertiesResourceAssociation resourceAssociation;

    /*
     * Information about current network profile
     */
    @JsonProperty(value = "profile", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkSecurityPerimeterConfigurationPropertiesProfile profile;

    /*
     * True if the EventHub namespace is backed by another Azure resource and not visible to end users.
     */
    @JsonProperty(value = "isBackingResource", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isBackingResource;

    /*
     * Indicates that the NSP controls related to backing association are only applicable to a specific feature in
     * backing resource's data plane.
     */
    @JsonProperty(value = "applicableFeatures", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> applicableFeatures;

    /*
     * Source Resource Association name
     */
    @JsonProperty(value = "parentAssociationName", access = JsonProperty.Access.WRITE_ONLY)
    private String parentAssociationName;

    /*
     * ARM Id of source resource
     */
    @JsonProperty(value = "sourceResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceResourceId;

    /**
     * Creates an instance of NetworkSecurityPerimeterConfigurationProperties class.
     */
    public NetworkSecurityPerimeterConfigurationProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of NetworkSecurityPerimeter configuration propagation.
     *
     * @return the provisioningState value.
     */
    public NetworkSecurityPerimeterConfigurationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of NetworkSecurityPerimeter configuration propagation.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkSecurityPerimeterConfigurationProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationProperties
        withProvisioningState(NetworkSecurityPerimeterConfigurationProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the provisioningIssues property: List of Provisioning Issues if any.
     *
     * @return the provisioningIssues value.
     */
    public List<ProvisioningIssue> provisioningIssues() {
        return this.provisioningIssues;
    }

    /**
     * Set the provisioningIssues property: List of Provisioning Issues if any.
     *
     * @param provisioningIssues the provisioningIssues value to set.
     * @return the NetworkSecurityPerimeterConfigurationProperties object itself.
     */
    public NetworkSecurityPerimeterConfigurationProperties
        withProvisioningIssues(List<ProvisioningIssue> provisioningIssues) {
        this.provisioningIssues = provisioningIssues;
        return this;
    }

    /**
     * Get the networkSecurityPerimeter property: NetworkSecurityPerimeter related information.
     *
     * @return the networkSecurityPerimeter value.
     */
    public NetworkSecurityPerimeter networkSecurityPerimeter() {
        return this.networkSecurityPerimeter;
    }

    /**
     * Get the resourceAssociation property: Information about resource association.
     *
     * @return the resourceAssociation value.
     */
    public NetworkSecurityPerimeterConfigurationPropertiesResourceAssociation resourceAssociation() {
        return this.resourceAssociation;
    }

    /**
     * Get the profile property: Information about current network profile.
     *
     * @return the profile value.
     */
    public NetworkSecurityPerimeterConfigurationPropertiesProfile profile() {
        return this.profile;
    }

    /**
     * Get the isBackingResource property: True if the EventHub namespace is backed by another Azure resource and not
     * visible to end users.
     *
     * @return the isBackingResource value.
     */
    public Boolean isBackingResource() {
        return this.isBackingResource;
    }

    /**
     * Get the applicableFeatures property: Indicates that the NSP controls related to backing association are only
     * applicable to a specific feature in backing resource's data plane.
     *
     * @return the applicableFeatures value.
     */
    public List<String> applicableFeatures() {
        return this.applicableFeatures;
    }

    /**
     * Get the parentAssociationName property: Source Resource Association name.
     *
     * @return the parentAssociationName value.
     */
    public String parentAssociationName() {
        return this.parentAssociationName;
    }

    /**
     * Get the sourceResourceId property: ARM Id of source resource.
     *
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (provisioningIssues() != null) {
            provisioningIssues().forEach(e -> e.validate());
        }
        if (networkSecurityPerimeter() != null) {
            networkSecurityPerimeter().validate();
        }
        if (resourceAssociation() != null) {
            resourceAssociation().validate();
        }
        if (profile() != null) {
            profile().validate();
        }
    }
}
