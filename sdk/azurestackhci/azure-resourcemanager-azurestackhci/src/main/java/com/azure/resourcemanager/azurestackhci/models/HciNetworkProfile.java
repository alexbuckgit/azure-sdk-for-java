// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The network profile of a device.
 */
@Immutable
public final class HciNetworkProfile implements JsonSerializable<HciNetworkProfile> {
    /*
     * List of NIC Details of device.
     */
    private List<HciNicDetail> nicDetails;

    /*
     * List of switch details for edge device.
     */
    private List<SwitchDetail> switchDetails;

    /*
     * HostNetwork config to deploy AzureStackHCI Cluster.
     */
    private HciEdgeDeviceHostNetwork hostNetwork;

    /**
     * Creates an instance of HciNetworkProfile class.
     */
    public HciNetworkProfile() {
    }

    /**
     * Get the nicDetails property: List of NIC Details of device.
     * 
     * @return the nicDetails value.
     */
    public List<HciNicDetail> nicDetails() {
        return this.nicDetails;
    }

    /**
     * Get the switchDetails property: List of switch details for edge device.
     * 
     * @return the switchDetails value.
     */
    public List<SwitchDetail> switchDetails() {
        return this.switchDetails;
    }

    /**
     * Get the hostNetwork property: HostNetwork config to deploy AzureStackHCI Cluster.
     * 
     * @return the hostNetwork value.
     */
    public HciEdgeDeviceHostNetwork hostNetwork() {
        return this.hostNetwork;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nicDetails() != null) {
            nicDetails().forEach(e -> e.validate());
        }
        if (switchDetails() != null) {
            switchDetails().forEach(e -> e.validate());
        }
        if (hostNetwork() != null) {
            hostNetwork().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HciNetworkProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HciNetworkProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the HciNetworkProfile.
     */
    public static HciNetworkProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HciNetworkProfile deserializedHciNetworkProfile = new HciNetworkProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nicDetails".equals(fieldName)) {
                    List<HciNicDetail> nicDetails = reader.readArray(reader1 -> HciNicDetail.fromJson(reader1));
                    deserializedHciNetworkProfile.nicDetails = nicDetails;
                } else if ("switchDetails".equals(fieldName)) {
                    List<SwitchDetail> switchDetails = reader.readArray(reader1 -> SwitchDetail.fromJson(reader1));
                    deserializedHciNetworkProfile.switchDetails = switchDetails;
                } else if ("hostNetwork".equals(fieldName)) {
                    deserializedHciNetworkProfile.hostNetwork = HciEdgeDeviceHostNetwork.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHciNetworkProfile;
        });
    }
}
