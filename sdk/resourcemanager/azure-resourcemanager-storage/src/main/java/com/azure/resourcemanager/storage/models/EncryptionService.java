// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A service that allows server-side encryption to be used.
 */
@Fluent
public final class EncryptionService implements JsonSerializable<EncryptionService> {
    /*
     * A boolean indicating whether or not the service encrypts the data as it is stored. Encryption at rest is enabled
     * by default today and cannot be disabled.
     */
    private Boolean enabled;

    /*
     * Gets a rough estimate of the date/time when the encryption was last enabled by the user. Data is encrypted at
     * rest by default today and cannot be disabled.
     */
    private OffsetDateTime lastEnabledTime;

    /*
     * Encryption key type to be used for the encryption service. 'Account' key type implies that an account-scoped
     * encryption key will be used. 'Service' key type implies that a default service key is used.
     */
    private KeyType keyType;

    /**
     * Creates an instance of EncryptionService class.
     */
    public EncryptionService() {
    }

    /**
     * Get the enabled property: A boolean indicating whether or not the service encrypts the data as it is stored.
     * Encryption at rest is enabled by default today and cannot be disabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: A boolean indicating whether or not the service encrypts the data as it is stored.
     * Encryption at rest is enabled by default today and cannot be disabled.
     * 
     * @param enabled the enabled value to set.
     * @return the EncryptionService object itself.
     */
    public EncryptionService withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the lastEnabledTime property: Gets a rough estimate of the date/time when the encryption was last enabled by
     * the user. Data is encrypted at rest by default today and cannot be disabled.
     * 
     * @return the lastEnabledTime value.
     */
    public OffsetDateTime lastEnabledTime() {
        return this.lastEnabledTime;
    }

    /**
     * Get the keyType property: Encryption key type to be used for the encryption service. 'Account' key type implies
     * that an account-scoped encryption key will be used. 'Service' key type implies that a default service key is
     * used.
     * 
     * @return the keyType value.
     */
    public KeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the keyType property: Encryption key type to be used for the encryption service. 'Account' key type implies
     * that an account-scoped encryption key will be used. 'Service' key type implies that a default service key is
     * used.
     * 
     * @param keyType the keyType value to set.
     * @return the EncryptionService object itself.
     */
    public EncryptionService withKeyType(KeyType keyType) {
        this.keyType = keyType;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("keyType", this.keyType == null ? null : this.keyType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EncryptionService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EncryptionService if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EncryptionService.
     */
    public static EncryptionService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EncryptionService deserializedEncryptionService = new EncryptionService();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedEncryptionService.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("lastEnabledTime".equals(fieldName)) {
                    deserializedEncryptionService.lastEnabledTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("keyType".equals(fieldName)) {
                    deserializedEncryptionService.keyType = KeyType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEncryptionService;
        });
    }
}
