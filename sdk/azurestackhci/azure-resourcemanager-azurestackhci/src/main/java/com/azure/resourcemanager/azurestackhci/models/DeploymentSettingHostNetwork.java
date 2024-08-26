// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The HostNetwork of a cluster.
 */
@Fluent
public final class DeploymentSettingHostNetwork implements JsonSerializable<DeploymentSettingHostNetwork> {
    /*
     * The network intents assigned to the network reference pattern used for the deployment. Each intent will define
     * its own name, traffic type, adapter names, and overrides as recommended by your OEM.
     */
    private List<DeploymentSettingIntents> intents;

    /*
     * List of StorageNetworks config to deploy AzureStackHCI Cluster.
     */
    private List<DeploymentSettingStorageNetworks> storageNetworks;

    /*
     * Defines how the storage adapters between nodes are connected either switch or switch less..
     */
    private Boolean storageConnectivitySwitchless;

    /*
     * Optional parameter required only for 3 Nodes Switchless deployments. This allows users to specify IPs and Mask
     * for Storage NICs when Network ATC is not assigning the IPs for storage automatically.
     */
    private Boolean enableStorageAutoIp;

    /**
     * Creates an instance of DeploymentSettingHostNetwork class.
     */
    public DeploymentSettingHostNetwork() {
    }

    /**
     * Get the intents property: The network intents assigned to the network reference pattern used for the deployment.
     * Each intent will define its own name, traffic type, adapter names, and overrides as recommended by your OEM.
     * 
     * @return the intents value.
     */
    public List<DeploymentSettingIntents> intents() {
        return this.intents;
    }

    /**
     * Set the intents property: The network intents assigned to the network reference pattern used for the deployment.
     * Each intent will define its own name, traffic type, adapter names, and overrides as recommended by your OEM.
     * 
     * @param intents the intents value to set.
     * @return the DeploymentSettingHostNetwork object itself.
     */
    public DeploymentSettingHostNetwork withIntents(List<DeploymentSettingIntents> intents) {
        this.intents = intents;
        return this;
    }

    /**
     * Get the storageNetworks property: List of StorageNetworks config to deploy AzureStackHCI Cluster.
     * 
     * @return the storageNetworks value.
     */
    public List<DeploymentSettingStorageNetworks> storageNetworks() {
        return this.storageNetworks;
    }

    /**
     * Set the storageNetworks property: List of StorageNetworks config to deploy AzureStackHCI Cluster.
     * 
     * @param storageNetworks the storageNetworks value to set.
     * @return the DeploymentSettingHostNetwork object itself.
     */
    public DeploymentSettingHostNetwork withStorageNetworks(List<DeploymentSettingStorageNetworks> storageNetworks) {
        this.storageNetworks = storageNetworks;
        return this;
    }

    /**
     * Get the storageConnectivitySwitchless property: Defines how the storage adapters between nodes are connected
     * either switch or switch less..
     * 
     * @return the storageConnectivitySwitchless value.
     */
    public Boolean storageConnectivitySwitchless() {
        return this.storageConnectivitySwitchless;
    }

    /**
     * Set the storageConnectivitySwitchless property: Defines how the storage adapters between nodes are connected
     * either switch or switch less..
     * 
     * @param storageConnectivitySwitchless the storageConnectivitySwitchless value to set.
     * @return the DeploymentSettingHostNetwork object itself.
     */
    public DeploymentSettingHostNetwork withStorageConnectivitySwitchless(Boolean storageConnectivitySwitchless) {
        this.storageConnectivitySwitchless = storageConnectivitySwitchless;
        return this;
    }

    /**
     * Get the enableStorageAutoIp property: Optional parameter required only for 3 Nodes Switchless deployments. This
     * allows users to specify IPs and Mask for Storage NICs when Network ATC is not assigning the IPs for storage
     * automatically.
     * 
     * @return the enableStorageAutoIp value.
     */
    public Boolean enableStorageAutoIp() {
        return this.enableStorageAutoIp;
    }

    /**
     * Set the enableStorageAutoIp property: Optional parameter required only for 3 Nodes Switchless deployments. This
     * allows users to specify IPs and Mask for Storage NICs when Network ATC is not assigning the IPs for storage
     * automatically.
     * 
     * @param enableStorageAutoIp the enableStorageAutoIp value to set.
     * @return the DeploymentSettingHostNetwork object itself.
     */
    public DeploymentSettingHostNetwork withEnableStorageAutoIp(Boolean enableStorageAutoIp) {
        this.enableStorageAutoIp = enableStorageAutoIp;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (intents() != null) {
            intents().forEach(e -> e.validate());
        }
        if (storageNetworks() != null) {
            storageNetworks().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("intents", this.intents, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("storageNetworks", this.storageNetworks,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("storageConnectivitySwitchless", this.storageConnectivitySwitchless);
        jsonWriter.writeBooleanField("enableStorageAutoIp", this.enableStorageAutoIp);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentSettingHostNetwork from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentSettingHostNetwork if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeploymentSettingHostNetwork.
     */
    public static DeploymentSettingHostNetwork fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentSettingHostNetwork deserializedDeploymentSettingHostNetwork = new DeploymentSettingHostNetwork();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("intents".equals(fieldName)) {
                    List<DeploymentSettingIntents> intents
                        = reader.readArray(reader1 -> DeploymentSettingIntents.fromJson(reader1));
                    deserializedDeploymentSettingHostNetwork.intents = intents;
                } else if ("storageNetworks".equals(fieldName)) {
                    List<DeploymentSettingStorageNetworks> storageNetworks
                        = reader.readArray(reader1 -> DeploymentSettingStorageNetworks.fromJson(reader1));
                    deserializedDeploymentSettingHostNetwork.storageNetworks = storageNetworks;
                } else if ("storageConnectivitySwitchless".equals(fieldName)) {
                    deserializedDeploymentSettingHostNetwork.storageConnectivitySwitchless
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enableStorageAutoIp".equals(fieldName)) {
                    deserializedDeploymentSettingHostNetwork.enableStorageAutoIp
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentSettingHostNetwork;
        });
    }
}
