// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of IPConfigurationBgpPeeringAddress.
 */
@Fluent
public final class IpConfigurationBgpPeeringAddress implements JsonSerializable<IpConfigurationBgpPeeringAddress> {
    /*
     * The ID of IP configuration which belongs to gateway.
     */
    private String ipconfigurationId;

    /*
     * The list of default BGP peering addresses which belong to IP configuration.
     */
    private List<String> defaultBgpIpAddresses;

    /*
     * The list of custom BGP peering addresses which belong to IP configuration.
     */
    private List<String> customBgpIpAddresses;

    /*
     * The list of tunnel public IP addresses which belong to IP configuration.
     */
    private List<String> tunnelIpAddresses;

    /**
     * Creates an instance of IpConfigurationBgpPeeringAddress class.
     */
    public IpConfigurationBgpPeeringAddress() {
    }

    /**
     * Get the ipconfigurationId property: The ID of IP configuration which belongs to gateway.
     * 
     * @return the ipconfigurationId value.
     */
    public String ipconfigurationId() {
        return this.ipconfigurationId;
    }

    /**
     * Set the ipconfigurationId property: The ID of IP configuration which belongs to gateway.
     * 
     * @param ipconfigurationId the ipconfigurationId value to set.
     * @return the IpConfigurationBgpPeeringAddress object itself.
     */
    public IpConfigurationBgpPeeringAddress withIpconfigurationId(String ipconfigurationId) {
        this.ipconfigurationId = ipconfigurationId;
        return this;
    }

    /**
     * Get the defaultBgpIpAddresses property: The list of default BGP peering addresses which belong to IP
     * configuration.
     * 
     * @return the defaultBgpIpAddresses value.
     */
    public List<String> defaultBgpIpAddresses() {
        return this.defaultBgpIpAddresses;
    }

    /**
     * Get the customBgpIpAddresses property: The list of custom BGP peering addresses which belong to IP configuration.
     * 
     * @return the customBgpIpAddresses value.
     */
    public List<String> customBgpIpAddresses() {
        return this.customBgpIpAddresses;
    }

    /**
     * Set the customBgpIpAddresses property: The list of custom BGP peering addresses which belong to IP configuration.
     * 
     * @param customBgpIpAddresses the customBgpIpAddresses value to set.
     * @return the IpConfigurationBgpPeeringAddress object itself.
     */
    public IpConfigurationBgpPeeringAddress withCustomBgpIpAddresses(List<String> customBgpIpAddresses) {
        this.customBgpIpAddresses = customBgpIpAddresses;
        return this;
    }

    /**
     * Get the tunnelIpAddresses property: The list of tunnel public IP addresses which belong to IP configuration.
     * 
     * @return the tunnelIpAddresses value.
     */
    public List<String> tunnelIpAddresses() {
        return this.tunnelIpAddresses;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ipconfigurationId", this.ipconfigurationId);
        jsonWriter.writeArrayField("customBgpIpAddresses", this.customBgpIpAddresses,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpConfigurationBgpPeeringAddress from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpConfigurationBgpPeeringAddress if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IpConfigurationBgpPeeringAddress.
     */
    public static IpConfigurationBgpPeeringAddress fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpConfigurationBgpPeeringAddress deserializedIpConfigurationBgpPeeringAddress
                = new IpConfigurationBgpPeeringAddress();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ipconfigurationId".equals(fieldName)) {
                    deserializedIpConfigurationBgpPeeringAddress.ipconfigurationId = reader.getString();
                } else if ("defaultBgpIpAddresses".equals(fieldName)) {
                    List<String> defaultBgpIpAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedIpConfigurationBgpPeeringAddress.defaultBgpIpAddresses = defaultBgpIpAddresses;
                } else if ("customBgpIpAddresses".equals(fieldName)) {
                    List<String> customBgpIpAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedIpConfigurationBgpPeeringAddress.customBgpIpAddresses = customBgpIpAddresses;
                } else if ("tunnelIpAddresses".equals(fieldName)) {
                    List<String> tunnelIpAddresses = reader.readArray(reader1 -> reader1.getString());
                    deserializedIpConfigurationBgpPeeringAddress.tunnelIpAddresses = tunnelIpAddresses;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpConfigurationBgpPeeringAddress;
        });
    }
}
