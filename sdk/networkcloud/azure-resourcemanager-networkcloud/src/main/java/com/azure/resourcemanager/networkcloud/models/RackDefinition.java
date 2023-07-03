// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** RackDefinition represents details regarding the rack. */
@Fluent
public final class RackDefinition {
    /*
     * The zone name used for this rack when created. Availability zones are used for workload placement.
     */
    @JsonProperty(value = "availabilityZone")
    private String availabilityZone;

    /*
     * The unordered list of bare metal machine configuration.
     */
    @JsonProperty(value = "bareMetalMachineConfigurationData")
    private List<BareMetalMachineConfigurationData> bareMetalMachineConfigurationData;

    /*
     * The resource ID of the network rack that matches this rack definition.
     */
    @JsonProperty(value = "networkRackId", required = true)
    private String networkRackId;

    /*
     * The free-form description of the rack's location.
     */
    @JsonProperty(value = "rackLocation")
    private String rackLocation;

    /*
     * The unique identifier for the rack within Network Cloud cluster. An alternate unique alphanumeric value other
     * than a serial number may be provided if desired.
     */
    @JsonProperty(value = "rackSerialNumber", required = true)
    private String rackSerialNumber;

    /*
     * The resource ID of the sku for the rack being added.
     */
    @JsonProperty(value = "rackSkuId", required = true)
    private String rackSkuId;

    /*
     * The list of storage appliance configuration data for this rack.
     */
    @JsonProperty(value = "storageApplianceConfigurationData")
    private List<StorageApplianceConfigurationData> storageApplianceConfigurationData;

    /** Creates an instance of RackDefinition class. */
    public RackDefinition() {
    }

    /**
     * Get the availabilityZone property: The zone name used for this rack when created. Availability zones are used for
     * workload placement.
     *
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Set the availabilityZone property: The zone name used for this rack when created. Availability zones are used for
     * workload placement.
     *
     * @param availabilityZone the availabilityZone value to set.
     * @return the RackDefinition object itself.
     */
    public RackDefinition withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get the bareMetalMachineConfigurationData property: The unordered list of bare metal machine configuration.
     *
     * @return the bareMetalMachineConfigurationData value.
     */
    public List<BareMetalMachineConfigurationData> bareMetalMachineConfigurationData() {
        return this.bareMetalMachineConfigurationData;
    }

    /**
     * Set the bareMetalMachineConfigurationData property: The unordered list of bare metal machine configuration.
     *
     * @param bareMetalMachineConfigurationData the bareMetalMachineConfigurationData value to set.
     * @return the RackDefinition object itself.
     */
    public RackDefinition withBareMetalMachineConfigurationData(
        List<BareMetalMachineConfigurationData> bareMetalMachineConfigurationData) {
        this.bareMetalMachineConfigurationData = bareMetalMachineConfigurationData;
        return this;
    }

    /**
     * Get the networkRackId property: The resource ID of the network rack that matches this rack definition.
     *
     * @return the networkRackId value.
     */
    public String networkRackId() {
        return this.networkRackId;
    }

    /**
     * Set the networkRackId property: The resource ID of the network rack that matches this rack definition.
     *
     * @param networkRackId the networkRackId value to set.
     * @return the RackDefinition object itself.
     */
    public RackDefinition withNetworkRackId(String networkRackId) {
        this.networkRackId = networkRackId;
        return this;
    }

    /**
     * Get the rackLocation property: The free-form description of the rack's location.
     *
     * @return the rackLocation value.
     */
    public String rackLocation() {
        return this.rackLocation;
    }

    /**
     * Set the rackLocation property: The free-form description of the rack's location.
     *
     * @param rackLocation the rackLocation value to set.
     * @return the RackDefinition object itself.
     */
    public RackDefinition withRackLocation(String rackLocation) {
        this.rackLocation = rackLocation;
        return this;
    }

    /**
     * Get the rackSerialNumber property: The unique identifier for the rack within Network Cloud cluster. An alternate
     * unique alphanumeric value other than a serial number may be provided if desired.
     *
     * @return the rackSerialNumber value.
     */
    public String rackSerialNumber() {
        return this.rackSerialNumber;
    }

    /**
     * Set the rackSerialNumber property: The unique identifier for the rack within Network Cloud cluster. An alternate
     * unique alphanumeric value other than a serial number may be provided if desired.
     *
     * @param rackSerialNumber the rackSerialNumber value to set.
     * @return the RackDefinition object itself.
     */
    public RackDefinition withRackSerialNumber(String rackSerialNumber) {
        this.rackSerialNumber = rackSerialNumber;
        return this;
    }

    /**
     * Get the rackSkuId property: The resource ID of the sku for the rack being added.
     *
     * @return the rackSkuId value.
     */
    public String rackSkuId() {
        return this.rackSkuId;
    }

    /**
     * Set the rackSkuId property: The resource ID of the sku for the rack being added.
     *
     * @param rackSkuId the rackSkuId value to set.
     * @return the RackDefinition object itself.
     */
    public RackDefinition withRackSkuId(String rackSkuId) {
        this.rackSkuId = rackSkuId;
        return this;
    }

    /**
     * Get the storageApplianceConfigurationData property: The list of storage appliance configuration data for this
     * rack.
     *
     * @return the storageApplianceConfigurationData value.
     */
    public List<StorageApplianceConfigurationData> storageApplianceConfigurationData() {
        return this.storageApplianceConfigurationData;
    }

    /**
     * Set the storageApplianceConfigurationData property: The list of storage appliance configuration data for this
     * rack.
     *
     * @param storageApplianceConfigurationData the storageApplianceConfigurationData value to set.
     * @return the RackDefinition object itself.
     */
    public RackDefinition withStorageApplianceConfigurationData(
        List<StorageApplianceConfigurationData> storageApplianceConfigurationData) {
        this.storageApplianceConfigurationData = storageApplianceConfigurationData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bareMetalMachineConfigurationData() != null) {
            bareMetalMachineConfigurationData().forEach(e -> e.validate());
        }
        if (networkRackId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property networkRackId in model RackDefinition"));
        }
        if (rackSerialNumber() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property rackSerialNumber in model RackDefinition"));
        }
        if (rackSkuId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property rackSkuId in model RackDefinition"));
        }
        if (storageApplianceConfigurationData() != null) {
            storageApplianceConfigurationData().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RackDefinition.class);
}
