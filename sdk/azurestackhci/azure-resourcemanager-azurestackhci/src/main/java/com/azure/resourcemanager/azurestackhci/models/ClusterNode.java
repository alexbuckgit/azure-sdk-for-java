// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Cluster node details.
 */
@Immutable
public final class ClusterNode implements JsonSerializable<ClusterNode> {
    /*
     * Name of the cluster node.
     */
    private String name;

    /*
     * Id of the node in the cluster.
     */
    private Float id;

    /*
     * State of Windows Server Subscription.
     */
    private WindowsServerSubscription windowsServerSubscription;

    /*
     * Type of the cluster node hardware.
     */
    private ClusterNodeType nodeType;

    /*
     * Edge Hardware Center Resource Id
     */
    private String ehcResourceId;

    /*
     * Manufacturer of the cluster node hardware.
     */
    private String manufacturer;

    /*
     * Model name of the cluster node hardware.
     */
    private String model;

    /*
     * Operating system running on the cluster node.
     */
    private String osName;

    /*
     * Version of the operating system running on the cluster node.
     */
    private String osVersion;

    /*
     * Display version of the operating system running on the cluster node.
     */
    private String osDisplayVersion;

    /*
     * Immutable id of the cluster node.
     */
    private String serialNumber;

    /*
     * Number of physical cores on the cluster node.
     */
    private Float coreCount;

    /*
     * Total available memory on the cluster node (in GiB).
     */
    private Float memoryInGiB;

    /*
     * Most recent licensing timestamp.
     */
    private OffsetDateTime lastLicensingTimestamp;

    /*
     * OEM activation status of the node.
     */
    private OemActivation oemActivation;

    /**
     * Creates an instance of ClusterNode class.
     */
    public ClusterNode() {
    }

    /**
     * Get the name property: Name of the cluster node.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Id of the node in the cluster.
     * 
     * @return the id value.
     */
    public Float id() {
        return this.id;
    }

    /**
     * Get the windowsServerSubscription property: State of Windows Server Subscription.
     * 
     * @return the windowsServerSubscription value.
     */
    public WindowsServerSubscription windowsServerSubscription() {
        return this.windowsServerSubscription;
    }

    /**
     * Get the nodeType property: Type of the cluster node hardware.
     * 
     * @return the nodeType value.
     */
    public ClusterNodeType nodeType() {
        return this.nodeType;
    }

    /**
     * Get the ehcResourceId property: Edge Hardware Center Resource Id.
     * 
     * @return the ehcResourceId value.
     */
    public String ehcResourceId() {
        return this.ehcResourceId;
    }

    /**
     * Get the manufacturer property: Manufacturer of the cluster node hardware.
     * 
     * @return the manufacturer value.
     */
    public String manufacturer() {
        return this.manufacturer;
    }

    /**
     * Get the model property: Model name of the cluster node hardware.
     * 
     * @return the model value.
     */
    public String model() {
        return this.model;
    }

    /**
     * Get the osName property: Operating system running on the cluster node.
     * 
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Get the osVersion property: Version of the operating system running on the cluster node.
     * 
     * @return the osVersion value.
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Get the osDisplayVersion property: Display version of the operating system running on the cluster node.
     * 
     * @return the osDisplayVersion value.
     */
    public String osDisplayVersion() {
        return this.osDisplayVersion;
    }

    /**
     * Get the serialNumber property: Immutable id of the cluster node.
     * 
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the coreCount property: Number of physical cores on the cluster node.
     * 
     * @return the coreCount value.
     */
    public Float coreCount() {
        return this.coreCount;
    }

    /**
     * Get the memoryInGiB property: Total available memory on the cluster node (in GiB).
     * 
     * @return the memoryInGiB value.
     */
    public Float memoryInGiB() {
        return this.memoryInGiB;
    }

    /**
     * Get the lastLicensingTimestamp property: Most recent licensing timestamp.
     * 
     * @return the lastLicensingTimestamp value.
     */
    public OffsetDateTime lastLicensingTimestamp() {
        return this.lastLicensingTimestamp;
    }

    /**
     * Get the oemActivation property: OEM activation status of the node.
     * 
     * @return the oemActivation value.
     */
    public OemActivation oemActivation() {
        return this.oemActivation;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterNode from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterNode if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterNode.
     */
    public static ClusterNode fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterNode deserializedClusterNode = new ClusterNode();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedClusterNode.name = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedClusterNode.id = reader.getNullable(JsonReader::getFloat);
                } else if ("windowsServerSubscription".equals(fieldName)) {
                    deserializedClusterNode.windowsServerSubscription
                        = WindowsServerSubscription.fromString(reader.getString());
                } else if ("nodeType".equals(fieldName)) {
                    deserializedClusterNode.nodeType = ClusterNodeType.fromString(reader.getString());
                } else if ("ehcResourceId".equals(fieldName)) {
                    deserializedClusterNode.ehcResourceId = reader.getString();
                } else if ("manufacturer".equals(fieldName)) {
                    deserializedClusterNode.manufacturer = reader.getString();
                } else if ("model".equals(fieldName)) {
                    deserializedClusterNode.model = reader.getString();
                } else if ("osName".equals(fieldName)) {
                    deserializedClusterNode.osName = reader.getString();
                } else if ("osVersion".equals(fieldName)) {
                    deserializedClusterNode.osVersion = reader.getString();
                } else if ("osDisplayVersion".equals(fieldName)) {
                    deserializedClusterNode.osDisplayVersion = reader.getString();
                } else if ("serialNumber".equals(fieldName)) {
                    deserializedClusterNode.serialNumber = reader.getString();
                } else if ("coreCount".equals(fieldName)) {
                    deserializedClusterNode.coreCount = reader.getNullable(JsonReader::getFloat);
                } else if ("memoryInGiB".equals(fieldName)) {
                    deserializedClusterNode.memoryInGiB = reader.getNullable(JsonReader::getFloat);
                } else if ("lastLicensingTimestamp".equals(fieldName)) {
                    deserializedClusterNode.lastLicensingTimestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("oemActivation".equals(fieldName)) {
                    deserializedClusterNode.oemActivation = OemActivation.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterNode;
        });
    }
}
