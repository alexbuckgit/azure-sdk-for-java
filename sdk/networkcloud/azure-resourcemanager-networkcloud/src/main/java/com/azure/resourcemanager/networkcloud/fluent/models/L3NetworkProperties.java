// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.HybridAksIpamEnabled;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.IpAllocationType;
import com.azure.resourcemanager.networkcloud.models.L3NetworkDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.L3NetworkProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** L3NetworkProperties represents properties of the L3 network. */
@Fluent
public final class L3NetworkProperties {
    /*
     * The list of resource IDs for the other Microsoft.NetworkCloud resources that have attached this network.
     */
    @JsonProperty(value = "associatedResourceIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> associatedResourceIds;

    /*
     * The resource ID of the Network Cloud cluster this L3 network is associated with.
     */
    @JsonProperty(value = "clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /*
     * The more detailed status of the L3 network.
     */
    @JsonProperty(value = "detailedStatus", access = JsonProperty.Access.WRITE_ONLY)
    private L3NetworkDetailedStatus detailedStatus;

    /*
     * The descriptive message about the current detailed status.
     */
    @JsonProperty(value = "detailedStatusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String detailedStatusMessage;

    /*
     * Field Deprecated. These fields will be empty/omitted. The list of Hybrid AKS cluster resource IDs that are
     * associated with this L3 network.
     */
    @JsonProperty(value = "hybridAksClustersAssociatedIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hybridAksClustersAssociatedIds;

    /*
     * Field Deprecated. The field was previously optional, now it will have no defined behavior and will be ignored.
     * The indicator of whether or not to disable IPAM allocation on the network attachment definition injected into
     * the Hybrid AKS Cluster.
     */
    @JsonProperty(value = "hybridAksIpamEnabled")
    private HybridAksIpamEnabled hybridAksIpamEnabled;

    /*
     * Field Deprecated. The field was previously optional, now it will have no defined behavior and will be ignored.
     * The network plugin type for Hybrid AKS.
     */
    @JsonProperty(value = "hybridAksPluginType")
    private HybridAksPluginType hybridAksPluginType;

    /*
     * The default interface name for this L3 network in the virtual machine. This name can be overridden by the name
     * supplied in the network attachment configuration of that virtual machine.
     */
    @JsonProperty(value = "interfaceName")
    private String interfaceName;

    /*
     * The type of the IP address allocation, defaulted to "DualStack".
     */
    @JsonProperty(value = "ipAllocationType")
    private IpAllocationType ipAllocationType;

    /*
     * The IPV4 prefix (CIDR) assigned to this L3 network. Required when the IP allocation type
     * is IPV4 or DualStack.
     */
    @JsonProperty(value = "ipv4ConnectedPrefix")
    private String ipv4ConnectedPrefix;

    /*
     * The IPV6 prefix (CIDR) assigned to this L3 network. Required when the IP allocation type
     * is IPV6 or DualStack.
     */
    @JsonProperty(value = "ipv6ConnectedPrefix")
    private String ipv6ConnectedPrefix;

    /*
     * The resource ID of the Network Fabric l3IsolationDomain.
     */
    @JsonProperty(value = "l3IsolationDomainId", required = true)
    private String l3IsolationDomainId;

    /*
     * The provisioning state of the L3 network.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private L3NetworkProvisioningState provisioningState;

    /*
     * Field Deprecated. These fields will be empty/omitted. The list of virtual machine resource IDs, excluding any
     * Hybrid AKS virtual machines, that are currently using this L3 network.
     */
    @JsonProperty(value = "virtualMachinesAssociatedIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> virtualMachinesAssociatedIds;

    /*
     * The VLAN from the l3IsolationDomain that is used for this network.
     */
    @JsonProperty(value = "vlan", required = true)
    private long vlan;

    /** Creates an instance of L3NetworkProperties class. */
    public L3NetworkProperties() {
    }

    /**
     * Get the associatedResourceIds property: The list of resource IDs for the other Microsoft.NetworkCloud resources
     * that have attached this network.
     *
     * @return the associatedResourceIds value.
     */
    public List<String> associatedResourceIds() {
        return this.associatedResourceIds;
    }

    /**
     * Get the clusterId property: The resource ID of the Network Cloud cluster this L3 network is associated with.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the detailedStatus property: The more detailed status of the L3 network.
     *
     * @return the detailedStatus value.
     */
    public L3NetworkDetailedStatus detailedStatus() {
        return this.detailedStatus;
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.detailedStatusMessage;
    }

    /**
     * Get the hybridAksClustersAssociatedIds property: Field Deprecated. These fields will be empty/omitted. The list
     * of Hybrid AKS cluster resource IDs that are associated with this L3 network.
     *
     * @return the hybridAksClustersAssociatedIds value.
     */
    public List<String> hybridAksClustersAssociatedIds() {
        return this.hybridAksClustersAssociatedIds;
    }

    /**
     * Get the hybridAksIpamEnabled property: Field Deprecated. The field was previously optional, now it will have no
     * defined behavior and will be ignored. The indicator of whether or not to disable IPAM allocation on the network
     * attachment definition injected into the Hybrid AKS Cluster.
     *
     * @return the hybridAksIpamEnabled value.
     */
    public HybridAksIpamEnabled hybridAksIpamEnabled() {
        return this.hybridAksIpamEnabled;
    }

    /**
     * Set the hybridAksIpamEnabled property: Field Deprecated. The field was previously optional, now it will have no
     * defined behavior and will be ignored. The indicator of whether or not to disable IPAM allocation on the network
     * attachment definition injected into the Hybrid AKS Cluster.
     *
     * @param hybridAksIpamEnabled the hybridAksIpamEnabled value to set.
     * @return the L3NetworkProperties object itself.
     */
    public L3NetworkProperties withHybridAksIpamEnabled(HybridAksIpamEnabled hybridAksIpamEnabled) {
        this.hybridAksIpamEnabled = hybridAksIpamEnabled;
        return this;
    }

    /**
     * Get the hybridAksPluginType property: Field Deprecated. The field was previously optional, now it will have no
     * defined behavior and will be ignored. The network plugin type for Hybrid AKS.
     *
     * @return the hybridAksPluginType value.
     */
    public HybridAksPluginType hybridAksPluginType() {
        return this.hybridAksPluginType;
    }

    /**
     * Set the hybridAksPluginType property: Field Deprecated. The field was previously optional, now it will have no
     * defined behavior and will be ignored. The network plugin type for Hybrid AKS.
     *
     * @param hybridAksPluginType the hybridAksPluginType value to set.
     * @return the L3NetworkProperties object itself.
     */
    public L3NetworkProperties withHybridAksPluginType(HybridAksPluginType hybridAksPluginType) {
        this.hybridAksPluginType = hybridAksPluginType;
        return this;
    }

    /**
     * Get the interfaceName property: The default interface name for this L3 network in the virtual machine. This name
     * can be overridden by the name supplied in the network attachment configuration of that virtual machine.
     *
     * @return the interfaceName value.
     */
    public String interfaceName() {
        return this.interfaceName;
    }

    /**
     * Set the interfaceName property: The default interface name for this L3 network in the virtual machine. This name
     * can be overridden by the name supplied in the network attachment configuration of that virtual machine.
     *
     * @param interfaceName the interfaceName value to set.
     * @return the L3NetworkProperties object itself.
     */
    public L3NetworkProperties withInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    /**
     * Get the ipAllocationType property: The type of the IP address allocation, defaulted to "DualStack".
     *
     * @return the ipAllocationType value.
     */
    public IpAllocationType ipAllocationType() {
        return this.ipAllocationType;
    }

    /**
     * Set the ipAllocationType property: The type of the IP address allocation, defaulted to "DualStack".
     *
     * @param ipAllocationType the ipAllocationType value to set.
     * @return the L3NetworkProperties object itself.
     */
    public L3NetworkProperties withIpAllocationType(IpAllocationType ipAllocationType) {
        this.ipAllocationType = ipAllocationType;
        return this;
    }

    /**
     * Get the ipv4ConnectedPrefix property: The IPV4 prefix (CIDR) assigned to this L3 network. Required when the IP
     * allocation type is IPV4 or DualStack.
     *
     * @return the ipv4ConnectedPrefix value.
     */
    public String ipv4ConnectedPrefix() {
        return this.ipv4ConnectedPrefix;
    }

    /**
     * Set the ipv4ConnectedPrefix property: The IPV4 prefix (CIDR) assigned to this L3 network. Required when the IP
     * allocation type is IPV4 or DualStack.
     *
     * @param ipv4ConnectedPrefix the ipv4ConnectedPrefix value to set.
     * @return the L3NetworkProperties object itself.
     */
    public L3NetworkProperties withIpv4ConnectedPrefix(String ipv4ConnectedPrefix) {
        this.ipv4ConnectedPrefix = ipv4ConnectedPrefix;
        return this;
    }

    /**
     * Get the ipv6ConnectedPrefix property: The IPV6 prefix (CIDR) assigned to this L3 network. Required when the IP
     * allocation type is IPV6 or DualStack.
     *
     * @return the ipv6ConnectedPrefix value.
     */
    public String ipv6ConnectedPrefix() {
        return this.ipv6ConnectedPrefix;
    }

    /**
     * Set the ipv6ConnectedPrefix property: The IPV6 prefix (CIDR) assigned to this L3 network. Required when the IP
     * allocation type is IPV6 or DualStack.
     *
     * @param ipv6ConnectedPrefix the ipv6ConnectedPrefix value to set.
     * @return the L3NetworkProperties object itself.
     */
    public L3NetworkProperties withIpv6ConnectedPrefix(String ipv6ConnectedPrefix) {
        this.ipv6ConnectedPrefix = ipv6ConnectedPrefix;
        return this;
    }

    /**
     * Get the l3IsolationDomainId property: The resource ID of the Network Fabric l3IsolationDomain.
     *
     * @return the l3IsolationDomainId value.
     */
    public String l3IsolationDomainId() {
        return this.l3IsolationDomainId;
    }

    /**
     * Set the l3IsolationDomainId property: The resource ID of the Network Fabric l3IsolationDomain.
     *
     * @param l3IsolationDomainId the l3IsolationDomainId value to set.
     * @return the L3NetworkProperties object itself.
     */
    public L3NetworkProperties withL3IsolationDomainId(String l3IsolationDomainId) {
        this.l3IsolationDomainId = l3IsolationDomainId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the L3 network.
     *
     * @return the provisioningState value.
     */
    public L3NetworkProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the virtualMachinesAssociatedIds property: Field Deprecated. These fields will be empty/omitted. The list of
     * virtual machine resource IDs, excluding any Hybrid AKS virtual machines, that are currently using this L3
     * network.
     *
     * @return the virtualMachinesAssociatedIds value.
     */
    public List<String> virtualMachinesAssociatedIds() {
        return this.virtualMachinesAssociatedIds;
    }

    /**
     * Get the vlan property: The VLAN from the l3IsolationDomain that is used for this network.
     *
     * @return the vlan value.
     */
    public long vlan() {
        return this.vlan;
    }

    /**
     * Set the vlan property: The VLAN from the l3IsolationDomain that is used for this network.
     *
     * @param vlan the vlan value to set.
     * @return the L3NetworkProperties object itself.
     */
    public L3NetworkProperties withVlan(long vlan) {
        this.vlan = vlan;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (l3IsolationDomainId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property l3IsolationDomainId in model L3NetworkProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(L3NetworkProperties.class);
}
