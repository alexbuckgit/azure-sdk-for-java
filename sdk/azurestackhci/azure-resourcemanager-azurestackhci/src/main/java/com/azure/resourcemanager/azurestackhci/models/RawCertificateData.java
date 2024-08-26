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
 * The RawCertificateData model.
 */
@Fluent
public final class RawCertificateData implements JsonSerializable<RawCertificateData> {
    /*
     * The certificates property.
     */
    private List<String> certificates;

    /**
     * Creates an instance of RawCertificateData class.
     */
    public RawCertificateData() {
    }

    /**
     * Get the certificates property: The certificates property.
     * 
     * @return the certificates value.
     */
    public List<String> certificates() {
        return this.certificates;
    }

    /**
     * Set the certificates property: The certificates property.
     * 
     * @param certificates the certificates value to set.
     * @return the RawCertificateData object itself.
     */
    public RawCertificateData withCertificates(List<String> certificates) {
        this.certificates = certificates;
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
        jsonWriter.writeArrayField("certificates", this.certificates, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RawCertificateData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RawCertificateData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RawCertificateData.
     */
    public static RawCertificateData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RawCertificateData deserializedRawCertificateData = new RawCertificateData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("certificates".equals(fieldName)) {
                    List<String> certificates = reader.readArray(reader1 -> reader1.getString());
                    deserializedRawCertificateData.certificates = certificates;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRawCertificateData;
        });
    }
}
