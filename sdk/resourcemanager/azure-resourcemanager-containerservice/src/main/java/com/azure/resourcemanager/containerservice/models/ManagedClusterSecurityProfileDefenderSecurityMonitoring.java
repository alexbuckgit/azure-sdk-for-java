// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Microsoft Defender settings for the security profile threat detection.
 */
@Fluent
public final class ManagedClusterSecurityProfileDefenderSecurityMonitoring
    implements JsonSerializable<ManagedClusterSecurityProfileDefenderSecurityMonitoring> {
    /*
     * Whether to enable Defender threat detection
     */
    private Boolean enabled;

    /**
     * Creates an instance of ManagedClusterSecurityProfileDefenderSecurityMonitoring class.
     */
    public ManagedClusterSecurityProfileDefenderSecurityMonitoring() {
    }

    /**
     * Get the enabled property: Whether to enable Defender threat detection.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether to enable Defender threat detection.
     * 
     * @param enabled the enabled value to set.
     * @return the ManagedClusterSecurityProfileDefenderSecurityMonitoring object itself.
     */
    public ManagedClusterSecurityProfileDefenderSecurityMonitoring withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterSecurityProfileDefenderSecurityMonitoring from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterSecurityProfileDefenderSecurityMonitoring if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedClusterSecurityProfileDefenderSecurityMonitoring.
     */
    public static ManagedClusterSecurityProfileDefenderSecurityMonitoring fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterSecurityProfileDefenderSecurityMonitoring deserializedManagedClusterSecurityProfileDefenderSecurityMonitoring
                = new ManagedClusterSecurityProfileDefenderSecurityMonitoring();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedManagedClusterSecurityProfileDefenderSecurityMonitoring.enabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterSecurityProfileDefenderSecurityMonitoring;
        });
    }
}
