// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.LoadBalancerBackendAddressPropertiesFormat;
import java.io.IOException;
import java.util.List;

/**
 * Load balancer backend addresses.
 */
@Fluent
public final class LoadBalancerBackendAddress implements JsonSerializable<LoadBalancerBackendAddress> {
    /*
     * Properties of load balancer backend address pool.
     */
    private LoadBalancerBackendAddressPropertiesFormat innerProperties;

    /*
     * Name of the backend address.
     */
    private String name;

    /**
     * Creates an instance of LoadBalancerBackendAddress class.
     */
    public LoadBalancerBackendAddress() {
    }

    /**
     * Get the innerProperties property: Properties of load balancer backend address pool.
     * 
     * @return the innerProperties value.
     */
    private LoadBalancerBackendAddressPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the backend address.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the backend address.
     * 
     * @param name the name value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the virtualNetwork property: Reference to an existing virtual network.
     * 
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetwork();
    }

    /**
     * Set the virtualNetwork property: Reference to an existing virtual network.
     * 
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withVirtualNetwork(SubResource virtualNetwork) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerBackendAddressPropertiesFormat();
        }
        this.innerProperties().withVirtualNetwork(virtualNetwork);
        return this;
    }

    /**
     * Get the subnet property: Reference to an existing subnet.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: Reference to an existing subnet.
     * 
     * @param subnet the subnet value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withSubnet(SubResource subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerBackendAddressPropertiesFormat();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the ipAddress property: IP Address belonging to the referenced virtual network.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().ipAddress();
    }

    /**
     * Set the ipAddress property: IP Address belonging to the referenced virtual network.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withIpAddress(String ipAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerBackendAddressPropertiesFormat();
        }
        this.innerProperties().withIpAddress(ipAddress);
        return this;
    }

    /**
     * Get the networkInterfaceIpConfiguration property: Reference to IP address defined in network interfaces.
     * 
     * @return the networkInterfaceIpConfiguration value.
     */
    public SubResource networkInterfaceIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().networkInterfaceIpConfiguration();
    }

    /**
     * Get the loadBalancerFrontendIpConfiguration property: Reference to the frontend ip address configuration defined
     * in regional loadbalancer.
     * 
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    public SubResource loadBalancerFrontendIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerFrontendIpConfiguration();
    }

    /**
     * Set the loadBalancerFrontendIpConfiguration property: Reference to the frontend ip address configuration defined
     * in regional loadbalancer.
     * 
     * @param loadBalancerFrontendIpConfiguration the loadBalancerFrontendIpConfiguration value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress
        withLoadBalancerFrontendIpConfiguration(SubResource loadBalancerFrontendIpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerBackendAddressPropertiesFormat();
        }
        this.innerProperties().withLoadBalancerFrontendIpConfiguration(loadBalancerFrontendIpConfiguration);
        return this;
    }

    /**
     * Get the inboundNatRulesPortMapping property: Collection of inbound NAT rule port mappings.
     * 
     * @return the inboundNatRulesPortMapping value.
     */
    public List<NatRulePortMapping> inboundNatRulesPortMapping() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundNatRulesPortMapping();
    }

    /**
     * Get the adminState property: A list of administrative states which once set can override health probe so that
     * Load Balancer will always forward new connections to backend, or deny new connections and reset existing
     * connections.
     * 
     * @return the adminState value.
     */
    public LoadBalancerBackendAddressAdminState adminState() {
        return this.innerProperties() == null ? null : this.innerProperties().adminState();
    }

    /**
     * Set the adminState property: A list of administrative states which once set can override health probe so that
     * Load Balancer will always forward new connections to backend, or deny new connections and reset existing
     * connections.
     * 
     * @param adminState the adminState value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withAdminState(LoadBalancerBackendAddressAdminState adminState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerBackendAddressPropertiesFormat();
        }
        this.innerProperties().withAdminState(adminState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancerBackendAddress from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancerBackendAddress if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancerBackendAddress.
     */
    public static LoadBalancerBackendAddress fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancerBackendAddress deserializedLoadBalancerBackendAddress = new LoadBalancerBackendAddress();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedLoadBalancerBackendAddress.innerProperties
                        = LoadBalancerBackendAddressPropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedLoadBalancerBackendAddress.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancerBackendAddress;
        });
    }
}
