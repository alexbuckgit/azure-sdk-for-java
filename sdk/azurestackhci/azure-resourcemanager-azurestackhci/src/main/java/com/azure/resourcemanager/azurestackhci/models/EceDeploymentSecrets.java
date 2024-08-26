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

/**
 * Protected parameters list stored in keyvault.
 */
@Fluent
public final class EceDeploymentSecrets implements JsonSerializable<EceDeploymentSecrets> {
    /*
     * Secret name stored in keyvault.
     */
    private String secretName;

    /*
     * Secret name expected for Enterprise Cloud Engine (ECE) deployment.
     */
    private EceSecrets eceSecretName;

    /*
     * Secret URI stored in keyvault.
     */
    private String secretLocation;

    /**
     * Creates an instance of EceDeploymentSecrets class.
     */
    public EceDeploymentSecrets() {
    }

    /**
     * Get the secretName property: Secret name stored in keyvault.
     * 
     * @return the secretName value.
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName property: Secret name stored in keyvault.
     * 
     * @param secretName the secretName value to set.
     * @return the EceDeploymentSecrets object itself.
     */
    public EceDeploymentSecrets withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the eceSecretName property: Secret name expected for Enterprise Cloud Engine (ECE) deployment.
     * 
     * @return the eceSecretName value.
     */
    public EceSecrets eceSecretName() {
        return this.eceSecretName;
    }

    /**
     * Set the eceSecretName property: Secret name expected for Enterprise Cloud Engine (ECE) deployment.
     * 
     * @param eceSecretName the eceSecretName value to set.
     * @return the EceDeploymentSecrets object itself.
     */
    public EceDeploymentSecrets withEceSecretName(EceSecrets eceSecretName) {
        this.eceSecretName = eceSecretName;
        return this;
    }

    /**
     * Get the secretLocation property: Secret URI stored in keyvault.
     * 
     * @return the secretLocation value.
     */
    public String secretLocation() {
        return this.secretLocation;
    }

    /**
     * Set the secretLocation property: Secret URI stored in keyvault.
     * 
     * @param secretLocation the secretLocation value to set.
     * @return the EceDeploymentSecrets object itself.
     */
    public EceDeploymentSecrets withSecretLocation(String secretLocation) {
        this.secretLocation = secretLocation;
        return this;
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
        jsonWriter.writeStringField("secretName", this.secretName);
        jsonWriter.writeStringField("eceSecretName", this.eceSecretName == null ? null : this.eceSecretName.toString());
        jsonWriter.writeStringField("secretLocation", this.secretLocation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EceDeploymentSecrets from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EceDeploymentSecrets if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EceDeploymentSecrets.
     */
    public static EceDeploymentSecrets fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EceDeploymentSecrets deserializedEceDeploymentSecrets = new EceDeploymentSecrets();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("secretName".equals(fieldName)) {
                    deserializedEceDeploymentSecrets.secretName = reader.getString();
                } else if ("eceSecretName".equals(fieldName)) {
                    deserializedEceDeploymentSecrets.eceSecretName = EceSecrets.fromString(reader.getString());
                } else if ("secretLocation".equals(fieldName)) {
                    deserializedEceDeploymentSecrets.secretLocation = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEceDeploymentSecrets;
        });
    }
}
