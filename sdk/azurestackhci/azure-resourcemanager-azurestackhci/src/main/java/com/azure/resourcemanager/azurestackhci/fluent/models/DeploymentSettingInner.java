// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestackhci.models.DeploymentConfiguration;
import com.azure.resourcemanager.azurestackhci.models.DeploymentMode;
import com.azure.resourcemanager.azurestackhci.models.EceReportedProperties;
import com.azure.resourcemanager.azurestackhci.models.OperationType;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Edge device resource.
 */
@Fluent
public final class DeploymentSettingInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private DeploymentSettingsProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
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
     * Creates an instance of DeploymentSettingInner class.
     */
    public DeploymentSettingInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private DeploymentSettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
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
     * Get the provisioningState property: DeploymentSetting provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the arcNodeResourceIds property: Azure resource ids of Arc machines to be part of cluster.
     * 
     * @return the arcNodeResourceIds value.
     */
    public List<String> arcNodeResourceIds() {
        return this.innerProperties() == null ? null : this.innerProperties().arcNodeResourceIds();
    }

    /**
     * Set the arcNodeResourceIds property: Azure resource ids of Arc machines to be part of cluster.
     * 
     * @param arcNodeResourceIds the arcNodeResourceIds value to set.
     * @return the DeploymentSettingInner object itself.
     */
    public DeploymentSettingInner withArcNodeResourceIds(List<String> arcNodeResourceIds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeploymentSettingsProperties();
        }
        this.innerProperties().withArcNodeResourceIds(arcNodeResourceIds);
        return this;
    }

    /**
     * Get the deploymentMode property: The deployment mode for cluster deployment.
     * 
     * @return the deploymentMode value.
     */
    public DeploymentMode deploymentMode() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentMode();
    }

    /**
     * Set the deploymentMode property: The deployment mode for cluster deployment.
     * 
     * @param deploymentMode the deploymentMode value to set.
     * @return the DeploymentSettingInner object itself.
     */
    public DeploymentSettingInner withDeploymentMode(DeploymentMode deploymentMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeploymentSettingsProperties();
        }
        this.innerProperties().withDeploymentMode(deploymentMode);
        return this;
    }

    /**
     * Get the operationType property: The intended operation for a cluster.
     * 
     * @return the operationType value.
     */
    public OperationType operationType() {
        return this.innerProperties() == null ? null : this.innerProperties().operationType();
    }

    /**
     * Set the operationType property: The intended operation for a cluster.
     * 
     * @param operationType the operationType value to set.
     * @return the DeploymentSettingInner object itself.
     */
    public DeploymentSettingInner withOperationType(OperationType operationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeploymentSettingsProperties();
        }
        this.innerProperties().withOperationType(operationType);
        return this;
    }

    /**
     * Get the deploymentConfiguration property: Scale units will contains list of deployment data.
     * 
     * @return the deploymentConfiguration value.
     */
    public DeploymentConfiguration deploymentConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentConfiguration();
    }

    /**
     * Set the deploymentConfiguration property: Scale units will contains list of deployment data.
     * 
     * @param deploymentConfiguration the deploymentConfiguration value to set.
     * @return the DeploymentSettingInner object itself.
     */
    public DeploymentSettingInner withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeploymentSettingsProperties();
        }
        this.innerProperties().withDeploymentConfiguration(deploymentConfiguration);
        return this;
    }

    /**
     * Get the reportedProperties property: Deployment Status reported from cluster.
     * 
     * @return the reportedProperties value.
     */
    public EceReportedProperties reportedProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().reportedProperties();
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentSettingInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentSettingInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeploymentSettingInner.
     */
    public static DeploymentSettingInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentSettingInner deserializedDeploymentSettingInner = new DeploymentSettingInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDeploymentSettingInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDeploymentSettingInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDeploymentSettingInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDeploymentSettingInner.innerProperties = DeploymentSettingsProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedDeploymentSettingInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentSettingInner;
        });
    }
}
