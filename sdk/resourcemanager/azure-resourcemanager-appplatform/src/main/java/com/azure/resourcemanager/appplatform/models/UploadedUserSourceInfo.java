// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Source with uploaded location.
 */
@Fluent
public class UploadedUserSourceInfo extends UserSourceInfo {
    /*
     * Type of the source uploaded
     */
    private String type = "UploadedUserSourceInfo";

    /*
     * Relative path of the storage which stores the source
     */
    private String relativePath;

    /**
     * Creates an instance of UploadedUserSourceInfo class.
     */
    public UploadedUserSourceInfo() {
    }

    /**
     * Get the type property: Type of the source uploaded.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the relativePath property: Relative path of the storage which stores the source.
     * 
     * @return the relativePath value.
     */
    public String relativePath() {
        return this.relativePath;
    }

    /**
     * Set the relativePath property: Relative path of the storage which stores the source.
     * 
     * @param relativePath the relativePath value to set.
     * @return the UploadedUserSourceInfo object itself.
     */
    public UploadedUserSourceInfo withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadedUserSourceInfo withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", version());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("relativePath", this.relativePath);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UploadedUserSourceInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UploadedUserSourceInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UploadedUserSourceInfo.
     */
    public static UploadedUserSourceInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Jar".equals(discriminatorValue)) {
                    return JarUploadedUserSourceInfo.fromJson(readerToUse.reset());
                } else if ("War".equals(discriminatorValue)) {
                    return WarUploadedUserSourceInfo.fromJson(readerToUse.reset());
                } else if ("Source".equals(discriminatorValue)) {
                    return SourceUploadedUserSourceInfo.fromJson(readerToUse.reset());
                } else if ("NetCoreZip".equals(discriminatorValue)) {
                    return NetCoreZipUploadedUserSourceInfo.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static UploadedUserSourceInfo fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UploadedUserSourceInfo deserializedUploadedUserSourceInfo = new UploadedUserSourceInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedUploadedUserSourceInfo.withVersion(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedUploadedUserSourceInfo.type = reader.getString();
                } else if ("relativePath".equals(fieldName)) {
                    deserializedUploadedUserSourceInfo.relativePath = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUploadedUserSourceInfo;
        });
    }
}
