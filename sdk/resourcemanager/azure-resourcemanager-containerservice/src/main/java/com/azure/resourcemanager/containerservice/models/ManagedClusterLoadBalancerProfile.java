// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Profile of the managed cluster load balancer.
 */
@Fluent
public final class ManagedClusterLoadBalancerProfile implements JsonSerializable<ManagedClusterLoadBalancerProfile> {
    /*
     * Desired managed outbound IPs for the cluster load balancer.
     */
    private ManagedClusterLoadBalancerProfileManagedOutboundIPs managedOutboundIPs;

    /*
     * Desired outbound IP Prefix resources for the cluster load balancer.
     */
    private ManagedClusterLoadBalancerProfileOutboundIpPrefixes outboundIpPrefixes;

    /*
     * Desired outbound IP resources for the cluster load balancer.
     */
    private ManagedClusterLoadBalancerProfileOutboundIPs outboundIPs;

    /*
     * The effective outbound IP resources of the cluster load balancer.
     */
    private List<ResourceReference> effectiveOutboundIPs;

    /*
     * The desired number of allocated SNAT ports per VM. Allowed values are in the range of 0 to 64000 (inclusive). The
     * default value is 0 which results in Azure dynamically allocating ports.
     */
    private Integer allocatedOutboundPorts;

    /*
     * Desired outbound flow idle timeout in minutes. Allowed values are in the range of 4 to 120 (inclusive). The
     * default value is 30 minutes.
     */
    private Integer idleTimeoutInMinutes;

    /*
     * Enable multiple standard load balancers per AKS cluster or not.
     */
    private Boolean enableMultipleStandardLoadBalancers;

    /*
     * The type of the managed inbound Load Balancer BackendPool.
     */
    private BackendPoolType backendPoolType;

    /**
     * Creates an instance of ManagedClusterLoadBalancerProfile class.
     */
    public ManagedClusterLoadBalancerProfile() {
    }

    /**
     * Get the managedOutboundIPs property: Desired managed outbound IPs for the cluster load balancer.
     * 
     * @return the managedOutboundIPs value.
     */
    public ManagedClusterLoadBalancerProfileManagedOutboundIPs managedOutboundIPs() {
        return this.managedOutboundIPs;
    }

    /**
     * Set the managedOutboundIPs property: Desired managed outbound IPs for the cluster load balancer.
     * 
     * @param managedOutboundIPs the managedOutboundIPs value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile
        withManagedOutboundIPs(ManagedClusterLoadBalancerProfileManagedOutboundIPs managedOutboundIPs) {
        this.managedOutboundIPs = managedOutboundIPs;
        return this;
    }

    /**
     * Get the outboundIpPrefixes property: Desired outbound IP Prefix resources for the cluster load balancer.
     * 
     * @return the outboundIpPrefixes value.
     */
    public ManagedClusterLoadBalancerProfileOutboundIpPrefixes outboundIpPrefixes() {
        return this.outboundIpPrefixes;
    }

    /**
     * Set the outboundIpPrefixes property: Desired outbound IP Prefix resources for the cluster load balancer.
     * 
     * @param outboundIpPrefixes the outboundIpPrefixes value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile
        withOutboundIpPrefixes(ManagedClusterLoadBalancerProfileOutboundIpPrefixes outboundIpPrefixes) {
        this.outboundIpPrefixes = outboundIpPrefixes;
        return this;
    }

    /**
     * Get the outboundIPs property: Desired outbound IP resources for the cluster load balancer.
     * 
     * @return the outboundIPs value.
     */
    public ManagedClusterLoadBalancerProfileOutboundIPs outboundIPs() {
        return this.outboundIPs;
    }

    /**
     * Set the outboundIPs property: Desired outbound IP resources for the cluster load balancer.
     * 
     * @param outboundIPs the outboundIPs value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withOutboundIPs(ManagedClusterLoadBalancerProfileOutboundIPs outboundIPs) {
        this.outboundIPs = outboundIPs;
        return this;
    }

    /**
     * Get the effectiveOutboundIPs property: The effective outbound IP resources of the cluster load balancer.
     * 
     * @return the effectiveOutboundIPs value.
     */
    public List<ResourceReference> effectiveOutboundIPs() {
        return this.effectiveOutboundIPs;
    }

    /**
     * Set the effectiveOutboundIPs property: The effective outbound IP resources of the cluster load balancer.
     * 
     * @param effectiveOutboundIPs the effectiveOutboundIPs value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withEffectiveOutboundIPs(List<ResourceReference> effectiveOutboundIPs) {
        this.effectiveOutboundIPs = effectiveOutboundIPs;
        return this;
    }

    /**
     * Get the allocatedOutboundPorts property: The desired number of allocated SNAT ports per VM. Allowed values are in
     * the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
     * 
     * @return the allocatedOutboundPorts value.
     */
    public Integer allocatedOutboundPorts() {
        return this.allocatedOutboundPorts;
    }

    /**
     * Set the allocatedOutboundPorts property: The desired number of allocated SNAT ports per VM. Allowed values are in
     * the range of 0 to 64000 (inclusive). The default value is 0 which results in Azure dynamically allocating ports.
     * 
     * @param allocatedOutboundPorts the allocatedOutboundPorts value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withAllocatedOutboundPorts(Integer allocatedOutboundPorts) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: Desired outbound flow idle timeout in minutes. Allowed values are in the
     * range of 4 to 120 (inclusive). The default value is 30 minutes.
     * 
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: Desired outbound flow idle timeout in minutes. Allowed values are in the
     * range of 4 to 120 (inclusive). The default value is 30 minutes.
     * 
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the enableMultipleStandardLoadBalancers property: Enable multiple standard load balancers per AKS cluster or
     * not.
     * 
     * @return the enableMultipleStandardLoadBalancers value.
     */
    public Boolean enableMultipleStandardLoadBalancers() {
        return this.enableMultipleStandardLoadBalancers;
    }

    /**
     * Set the enableMultipleStandardLoadBalancers property: Enable multiple standard load balancers per AKS cluster or
     * not.
     * 
     * @param enableMultipleStandardLoadBalancers the enableMultipleStandardLoadBalancers value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile
        withEnableMultipleStandardLoadBalancers(Boolean enableMultipleStandardLoadBalancers) {
        this.enableMultipleStandardLoadBalancers = enableMultipleStandardLoadBalancers;
        return this;
    }

    /**
     * Get the backendPoolType property: The type of the managed inbound Load Balancer BackendPool.
     * 
     * @return the backendPoolType value.
     */
    public BackendPoolType backendPoolType() {
        return this.backendPoolType;
    }

    /**
     * Set the backendPoolType property: The type of the managed inbound Load Balancer BackendPool.
     * 
     * @param backendPoolType the backendPoolType value to set.
     * @return the ManagedClusterLoadBalancerProfile object itself.
     */
    public ManagedClusterLoadBalancerProfile withBackendPoolType(BackendPoolType backendPoolType) {
        this.backendPoolType = backendPoolType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (managedOutboundIPs() != null) {
            managedOutboundIPs().validate();
        }
        if (outboundIpPrefixes() != null) {
            outboundIpPrefixes().validate();
        }
        if (outboundIPs() != null) {
            outboundIPs().validate();
        }
        if (effectiveOutboundIPs() != null) {
            effectiveOutboundIPs().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("managedOutboundIPs", this.managedOutboundIPs);
        jsonWriter.writeJsonField("outboundIPPrefixes", this.outboundIpPrefixes);
        jsonWriter.writeJsonField("outboundIPs", this.outboundIPs);
        jsonWriter.writeArrayField("effectiveOutboundIPs", this.effectiveOutboundIPs,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("allocatedOutboundPorts", this.allocatedOutboundPorts);
        jsonWriter.writeNumberField("idleTimeoutInMinutes", this.idleTimeoutInMinutes);
        jsonWriter.writeBooleanField("enableMultipleStandardLoadBalancers", this.enableMultipleStandardLoadBalancers);
        jsonWriter.writeStringField("backendPoolType",
            this.backendPoolType == null ? null : this.backendPoolType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterLoadBalancerProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterLoadBalancerProfile if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedClusterLoadBalancerProfile.
     */
    public static ManagedClusterLoadBalancerProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterLoadBalancerProfile deserializedManagedClusterLoadBalancerProfile
                = new ManagedClusterLoadBalancerProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("managedOutboundIPs".equals(fieldName)) {
                    deserializedManagedClusterLoadBalancerProfile.managedOutboundIPs
                        = ManagedClusterLoadBalancerProfileManagedOutboundIPs.fromJson(reader);
                } else if ("outboundIPPrefixes".equals(fieldName)) {
                    deserializedManagedClusterLoadBalancerProfile.outboundIpPrefixes
                        = ManagedClusterLoadBalancerProfileOutboundIpPrefixes.fromJson(reader);
                } else if ("outboundIPs".equals(fieldName)) {
                    deserializedManagedClusterLoadBalancerProfile.outboundIPs
                        = ManagedClusterLoadBalancerProfileOutboundIPs.fromJson(reader);
                } else if ("effectiveOutboundIPs".equals(fieldName)) {
                    List<ResourceReference> effectiveOutboundIPs
                        = reader.readArray(reader1 -> ResourceReference.fromJson(reader1));
                    deserializedManagedClusterLoadBalancerProfile.effectiveOutboundIPs = effectiveOutboundIPs;
                } else if ("allocatedOutboundPorts".equals(fieldName)) {
                    deserializedManagedClusterLoadBalancerProfile.allocatedOutboundPorts
                        = reader.getNullable(JsonReader::getInt);
                } else if ("idleTimeoutInMinutes".equals(fieldName)) {
                    deserializedManagedClusterLoadBalancerProfile.idleTimeoutInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else if ("enableMultipleStandardLoadBalancers".equals(fieldName)) {
                    deserializedManagedClusterLoadBalancerProfile.enableMultipleStandardLoadBalancers
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("backendPoolType".equals(fieldName)) {
                    deserializedManagedClusterLoadBalancerProfile.backendPoolType
                        = BackendPoolType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterLoadBalancerProfile;
        });
    }
}
