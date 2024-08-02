// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * workbookApplication.
 */
@Fluent
public final class MicrosoftGraphWorkbookApplication extends MicrosoftGraphEntity {
    /*
     * Returns the calculation mode used in the workbook. Possible values are: Automatic, AutomaticExceptTables, Manual.
     */
    private String calculationMode;

    /*
     * workbookApplication
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphWorkbookApplication class.
     */
    public MicrosoftGraphWorkbookApplication() {
    }

    /**
     * Get the calculationMode property: Returns the calculation mode used in the workbook. Possible values are:
     * Automatic, AutomaticExceptTables, Manual.
     * 
     * @return the calculationMode value.
     */
    public String calculationMode() {
        return this.calculationMode;
    }

    /**
     * Set the calculationMode property: Returns the calculation mode used in the workbook. Possible values are:
     * Automatic, AutomaticExceptTables, Manual.
     * 
     * @param calculationMode the calculationMode value to set.
     * @return the MicrosoftGraphWorkbookApplication object itself.
     */
    public MicrosoftGraphWorkbookApplication withCalculationMode(String calculationMode) {
        this.calculationMode = calculationMode;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookApplication.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookApplication.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookApplication object itself.
     */
    public MicrosoftGraphWorkbookApplication withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphWorkbookApplication withId(String id) {
        super.withId(id);
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
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeStringField("calculationMode", this.calculationMode);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphWorkbookApplication from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphWorkbookApplication if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphWorkbookApplication.
     */
    public static MicrosoftGraphWorkbookApplication fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphWorkbookApplication deserializedMicrosoftGraphWorkbookApplication
                = new MicrosoftGraphWorkbookApplication();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookApplication.withId(reader.getString());
                } else if ("calculationMode".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookApplication.calculationMode = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphWorkbookApplication.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphWorkbookApplication;
        });
    }
}
