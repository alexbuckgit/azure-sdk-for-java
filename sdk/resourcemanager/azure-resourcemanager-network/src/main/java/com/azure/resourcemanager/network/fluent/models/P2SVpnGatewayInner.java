// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.P2SConnectionConfiguration;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VpnClientConnectionHealth;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * P2SVpnGateway Resource.
 */
@Fluent
public final class P2SVpnGatewayInner extends Resource {
    /*
     * Properties of the P2SVpnGateway.
     */
    private P2SVpnGatewayProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Resource ID.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of P2SVpnGatewayInner class.
     */
    public P2SVpnGatewayInner() {
    }

    /**
     * Get the innerProperties property: Properties of the P2SVpnGateway.
     * 
     * @return the innerProperties value.
     */
    private P2SVpnGatewayProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public P2SVpnGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public P2SVpnGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the virtualHub property: The VirtualHub to which the gateway belongs.
     * 
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualHub();
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway belongs.
     * 
     * @param virtualHub the virtualHub value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVirtualHub(SubResource virtualHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withVirtualHub(virtualHub);
        return this;
    }

    /**
     * Get the p2SConnectionConfigurations property: List of all p2s connection configurations of the gateway.
     * 
     * @return the p2SConnectionConfigurations value.
     */
    public List<P2SConnectionConfiguration> p2SConnectionConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().p2SConnectionConfigurations();
    }

    /**
     * Set the p2SConnectionConfigurations property: List of all p2s connection configurations of the gateway.
     * 
     * @param p2SConnectionConfigurations the p2SConnectionConfigurations value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner
        withP2SConnectionConfigurations(List<P2SConnectionConfiguration> p2SConnectionConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withP2SConnectionConfigurations(p2SConnectionConfigurations);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the P2S VPN gateway resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     * 
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer vpnGatewayScaleUnit() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnGatewayScaleUnit();
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     * 
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withVpnGatewayScaleUnit(vpnGatewayScaleUnit);
        return this;
    }

    /**
     * Get the vpnServerConfiguration property: The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     * 
     * @return the vpnServerConfiguration value.
     */
    public SubResource vpnServerConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnServerConfiguration();
    }

    /**
     * Set the vpnServerConfiguration property: The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     * 
     * @param vpnServerConfiguration the vpnServerConfiguration value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnServerConfiguration(SubResource vpnServerConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withVpnServerConfiguration(vpnServerConfiguration);
        return this;
    }

    /**
     * Get the vpnClientConnectionHealth property: All P2S VPN clients' connection health status.
     * 
     * @return the vpnClientConnectionHealth value.
     */
    public VpnClientConnectionHealth vpnClientConnectionHealth() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnClientConnectionHealth();
    }

    /**
     * Get the customDnsServers property: List of all customer specified DNS servers IP addresses.
     * 
     * @return the customDnsServers value.
     */
    public List<String> customDnsServers() {
        return this.innerProperties() == null ? null : this.innerProperties().customDnsServers();
    }

    /**
     * Set the customDnsServers property: List of all customer specified DNS servers IP addresses.
     * 
     * @param customDnsServers the customDnsServers value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withCustomDnsServers(List<String> customDnsServers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withCustomDnsServers(customDnsServers);
        return this;
    }

    /**
     * Get the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the P2SVpnGateway.
     * 
     * @return the isRoutingPreferenceInternet value.
     */
    public Boolean isRoutingPreferenceInternet() {
        return this.innerProperties() == null ? null : this.innerProperties().isRoutingPreferenceInternet();
    }

    /**
     * Set the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the P2SVpnGateway.
     * 
     * @param isRoutingPreferenceInternet the isRoutingPreferenceInternet value to set.
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withIsRoutingPreferenceInternet(Boolean isRoutingPreferenceInternet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SVpnGatewayProperties();
        }
        this.innerProperties().withIsRoutingPreferenceInternet(isRoutingPreferenceInternet);
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of P2SVpnGatewayInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of P2SVpnGatewayInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the P2SVpnGatewayInner.
     */
    public static P2SVpnGatewayInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            P2SVpnGatewayInner deserializedP2SVpnGatewayInner = new P2SVpnGatewayInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedP2SVpnGatewayInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedP2SVpnGatewayInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedP2SVpnGatewayInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedP2SVpnGatewayInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedP2SVpnGatewayInner.innerProperties = P2SVpnGatewayProperties.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedP2SVpnGatewayInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedP2SVpnGatewayInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedP2SVpnGatewayInner;
        });
    }
}
