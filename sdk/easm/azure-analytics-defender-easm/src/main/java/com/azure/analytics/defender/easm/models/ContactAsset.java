// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The ContactAsset model.
 */
@Immutable
public final class ContactAsset extends InventoryAsset {

    /*
     * The email property.
     */
    @Generated
    private String email;

    /*
     * The names property.
     */
    @Generated
    private List<ObservedString> names;

    /*
     * The organizations property.
     */
    @Generated
    private List<ObservedString> organizations;

    /*
     * The sources property.
     */
    @Generated
    private List<Source> sources;

    /*
     * The firstSeen property.
     */
    @Generated
    private OffsetDateTime firstSeen;

    /*
     * The lastSeen property.
     */
    @Generated
    private OffsetDateTime lastSeen;

    /*
     * The count property.
     */
    @Generated
    private Long count;

    /**
     * Creates an instance of ContactAsset class.
     */
    @Generated
    private ContactAsset() {
    }

    /**
     * Get the email property: The email property.
     *
     * @return the email value.
     */
    @Generated
    public String getEmail() {
        return this.email;
    }

    /**
     * Get the names property: The names property.
     *
     * @return the names value.
     */
    @Generated
    public List<ObservedString> getNames() {
        return this.names;
    }

    /**
     * Get the organizations property: The organizations property.
     *
     * @return the organizations value.
     */
    @Generated
    public List<ObservedString> getOrganizations() {
        return this.organizations;
    }

    /**
     * Get the sources property: The sources property.
     *
     * @return the sources value.
     */
    @Generated
    public List<Source> getSources() {
        return this.sources;
    }

    /**
     * Get the firstSeen property: The firstSeen property.
     *
     * @return the firstSeen value.
     */
    @Generated
    public OffsetDateTime getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * Get the lastSeen property: The lastSeen property.
     *
     * @return the lastSeen value.
     */
    @Generated
    public OffsetDateTime getLastSeen() {
        return this.lastSeen;
    }

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    @Generated
    public Long getCount() {
        return this.count;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("email", this.email);
        jsonWriter.writeArrayField("names", this.names, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("organizations", this.organizations, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("sources", this.sources, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("firstSeen",
            this.firstSeen == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.firstSeen));
        jsonWriter.writeStringField("lastSeen",
            this.lastSeen == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastSeen));
        jsonWriter.writeNumberField("count", this.count);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContactAsset from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContactAsset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContactAsset.
     */
    @Generated
    public static ContactAsset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContactAsset deserializedContactAsset = new ContactAsset();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("email".equals(fieldName)) {
                    deserializedContactAsset.email = reader.getString();
                } else if ("names".equals(fieldName)) {
                    List<ObservedString> names = reader.readArray(reader1 -> ObservedString.fromJson(reader1));
                    deserializedContactAsset.names = names;
                } else if ("organizations".equals(fieldName)) {
                    List<ObservedString> organizations = reader.readArray(reader1 -> ObservedString.fromJson(reader1));
                    deserializedContactAsset.organizations = organizations;
                } else if ("sources".equals(fieldName)) {
                    List<Source> sources = reader.readArray(reader1 -> Source.fromJson(reader1));
                    deserializedContactAsset.sources = sources;
                } else if ("firstSeen".equals(fieldName)) {
                    deserializedContactAsset.firstSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastSeen".equals(fieldName)) {
                    deserializedContactAsset.lastSeen = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("count".equals(fieldName)) {
                    deserializedContactAsset.count = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedContactAsset;
        });
    }
}
