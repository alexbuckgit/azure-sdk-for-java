// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;

/**
 * Properties of SSL certificates of an application gateway.
 */
@Fluent
public final class ApplicationGatewaySslCertificatePropertiesFormat
    implements JsonSerializable<ApplicationGatewaySslCertificatePropertiesFormat> {
    /*
     * Base-64 encoded pfx certificate. Only applicable in PUT Request.
     */
    private String data;

    /*
     * Password for the pfx file specified in data. Only applicable in PUT request.
     */
    private String password;

    /*
     * Base-64 encoded Public cert data corresponding to pfx specified in data. Only applicable in GET request.
     */
    private String publicCertData;

    /*
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     */
    private String keyVaultSecretId;

    /*
     * The provisioning state of the SSL certificate resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ApplicationGatewaySslCertificatePropertiesFormat class.
     */
    public ApplicationGatewaySslCertificatePropertiesFormat() {
    }

    /**
     * Get the data property: Base-64 encoded pfx certificate. Only applicable in PUT Request.
     * 
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data property: Base-64 encoded pfx certificate. Only applicable in PUT Request.
     * 
     * @param data the data value to set.
     * @return the ApplicationGatewaySslCertificatePropertiesFormat object itself.
     */
    public ApplicationGatewaySslCertificatePropertiesFormat withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the password property: Password for the pfx file specified in data. Only applicable in PUT request.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password for the pfx file specified in data. Only applicable in PUT request.
     * 
     * @param password the password value to set.
     * @return the ApplicationGatewaySslCertificatePropertiesFormat object itself.
     */
    public ApplicationGatewaySslCertificatePropertiesFormat withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the publicCertData property: Base-64 encoded Public cert data corresponding to pfx specified in data. Only
     * applicable in GET request.
     * 
     * @return the publicCertData value.
     */
    public String publicCertData() {
        return this.publicCertData;
    }

    /**
     * Get the keyVaultSecretId property: Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     * 
     * @return the keyVaultSecretId value.
     */
    public String keyVaultSecretId() {
        return this.keyVaultSecretId;
    }

    /**
     * Set the keyVaultSecretId property: Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     * 
     * @param keyVaultSecretId the keyVaultSecretId value to set.
     * @return the ApplicationGatewaySslCertificatePropertiesFormat object itself.
     */
    public ApplicationGatewaySslCertificatePropertiesFormat withKeyVaultSecretId(String keyVaultSecretId) {
        this.keyVaultSecretId = keyVaultSecretId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the SSL certificate resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
        jsonWriter.writeStringField("data", this.data);
        jsonWriter.writeStringField("password", this.password);
        jsonWriter.writeStringField("keyVaultSecretId", this.keyVaultSecretId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewaySslCertificatePropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewaySslCertificatePropertiesFormat if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewaySslCertificatePropertiesFormat.
     */
    public static ApplicationGatewaySslCertificatePropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewaySslCertificatePropertiesFormat deserializedApplicationGatewaySslCertificatePropertiesFormat
                = new ApplicationGatewaySslCertificatePropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("data".equals(fieldName)) {
                    deserializedApplicationGatewaySslCertificatePropertiesFormat.data = reader.getString();
                } else if ("password".equals(fieldName)) {
                    deserializedApplicationGatewaySslCertificatePropertiesFormat.password = reader.getString();
                } else if ("publicCertData".equals(fieldName)) {
                    deserializedApplicationGatewaySslCertificatePropertiesFormat.publicCertData = reader.getString();
                } else if ("keyVaultSecretId".equals(fieldName)) {
                    deserializedApplicationGatewaySslCertificatePropertiesFormat.keyVaultSecretId = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedApplicationGatewaySslCertificatePropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewaySslCertificatePropertiesFormat;
        });
    }
}
