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
 * workbookChartAxis.
 */
@Fluent
public final class MicrosoftGraphWorkbookChartAxis extends MicrosoftGraphEntity {
    /*
     * Json
     */
    private Map<String, Object> majorUnit;

    /*
     * Json
     */
    private Map<String, Object> maximum;

    /*
     * Json
     */
    private Map<String, Object> minimum;

    /*
     * Json
     */
    private Map<String, Object> minorUnit;

    /*
     * workbookChartAxisFormat
     */
    private MicrosoftGraphWorkbookChartAxisFormat format;

    /*
     * workbookChartGridlines
     */
    private MicrosoftGraphWorkbookChartGridlines majorGridlines;

    /*
     * workbookChartGridlines
     */
    private MicrosoftGraphWorkbookChartGridlines minorGridlines;

    /*
     * workbookChartAxisTitle
     */
    private MicrosoftGraphWorkbookChartAxisTitle title;

    /*
     * workbookChartAxis
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphWorkbookChartAxis class.
     */
    public MicrosoftGraphWorkbookChartAxis() {
    }

    /**
     * Get the majorUnit property: Json.
     * 
     * @return the majorUnit value.
     */
    public Map<String, Object> majorUnit() {
        return this.majorUnit;
    }

    /**
     * Set the majorUnit property: Json.
     * 
     * @param majorUnit the majorUnit value to set.
     * @return the MicrosoftGraphWorkbookChartAxis object itself.
     */
    public MicrosoftGraphWorkbookChartAxis withMajorUnit(Map<String, Object> majorUnit) {
        this.majorUnit = majorUnit;
        return this;
    }

    /**
     * Get the maximum property: Json.
     * 
     * @return the maximum value.
     */
    public Map<String, Object> maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: Json.
     * 
     * @param maximum the maximum value to set.
     * @return the MicrosoftGraphWorkbookChartAxis object itself.
     */
    public MicrosoftGraphWorkbookChartAxis withMaximum(Map<String, Object> maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the minimum property: Json.
     * 
     * @return the minimum value.
     */
    public Map<String, Object> minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: Json.
     * 
     * @param minimum the minimum value to set.
     * @return the MicrosoftGraphWorkbookChartAxis object itself.
     */
    public MicrosoftGraphWorkbookChartAxis withMinimum(Map<String, Object> minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the minorUnit property: Json.
     * 
     * @return the minorUnit value.
     */
    public Map<String, Object> minorUnit() {
        return this.minorUnit;
    }

    /**
     * Set the minorUnit property: Json.
     * 
     * @param minorUnit the minorUnit value to set.
     * @return the MicrosoftGraphWorkbookChartAxis object itself.
     */
    public MicrosoftGraphWorkbookChartAxis withMinorUnit(Map<String, Object> minorUnit) {
        this.minorUnit = minorUnit;
        return this;
    }

    /**
     * Get the format property: workbookChartAxisFormat.
     * 
     * @return the format value.
     */
    public MicrosoftGraphWorkbookChartAxisFormat format() {
        return this.format;
    }

    /**
     * Set the format property: workbookChartAxisFormat.
     * 
     * @param format the format value to set.
     * @return the MicrosoftGraphWorkbookChartAxis object itself.
     */
    public MicrosoftGraphWorkbookChartAxis withFormat(MicrosoftGraphWorkbookChartAxisFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the majorGridlines property: workbookChartGridlines.
     * 
     * @return the majorGridlines value.
     */
    public MicrosoftGraphWorkbookChartGridlines majorGridlines() {
        return this.majorGridlines;
    }

    /**
     * Set the majorGridlines property: workbookChartGridlines.
     * 
     * @param majorGridlines the majorGridlines value to set.
     * @return the MicrosoftGraphWorkbookChartAxis object itself.
     */
    public MicrosoftGraphWorkbookChartAxis withMajorGridlines(MicrosoftGraphWorkbookChartGridlines majorGridlines) {
        this.majorGridlines = majorGridlines;
        return this;
    }

    /**
     * Get the minorGridlines property: workbookChartGridlines.
     * 
     * @return the minorGridlines value.
     */
    public MicrosoftGraphWorkbookChartGridlines minorGridlines() {
        return this.minorGridlines;
    }

    /**
     * Set the minorGridlines property: workbookChartGridlines.
     * 
     * @param minorGridlines the minorGridlines value to set.
     * @return the MicrosoftGraphWorkbookChartAxis object itself.
     */
    public MicrosoftGraphWorkbookChartAxis withMinorGridlines(MicrosoftGraphWorkbookChartGridlines minorGridlines) {
        this.minorGridlines = minorGridlines;
        return this;
    }

    /**
     * Get the title property: workbookChartAxisTitle.
     * 
     * @return the title value.
     */
    public MicrosoftGraphWorkbookChartAxisTitle title() {
        return this.title;
    }

    /**
     * Set the title property: workbookChartAxisTitle.
     * 
     * @param title the title value to set.
     * @return the MicrosoftGraphWorkbookChartAxis object itself.
     */
    public MicrosoftGraphWorkbookChartAxis withTitle(MicrosoftGraphWorkbookChartAxisTitle title) {
        this.title = title;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookChartAxis.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookChartAxis.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookChartAxis object itself.
     */
    public MicrosoftGraphWorkbookChartAxis withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphWorkbookChartAxis withId(String id) {
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
        if (format() != null) {
            format().validate();
        }
        if (majorGridlines() != null) {
            majorGridlines().validate();
        }
        if (minorGridlines() != null) {
            minorGridlines().validate();
        }
        if (title() != null) {
            title().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeMapField("majorUnit", this.majorUnit, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeMapField("maximum", this.maximum, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeMapField("minimum", this.minimum, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeMapField("minorUnit", this.minorUnit, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("format", this.format);
        jsonWriter.writeJsonField("majorGridlines", this.majorGridlines);
        jsonWriter.writeJsonField("minorGridlines", this.minorGridlines);
        jsonWriter.writeJsonField("title", this.title);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphWorkbookChartAxis from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphWorkbookChartAxis if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphWorkbookChartAxis.
     */
    public static MicrosoftGraphWorkbookChartAxis fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphWorkbookChartAxis deserializedMicrosoftGraphWorkbookChartAxis
                = new MicrosoftGraphWorkbookChartAxis();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartAxis.withId(reader.getString());
                } else if ("majorUnit".equals(fieldName)) {
                    Map<String, Object> majorUnit = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedMicrosoftGraphWorkbookChartAxis.majorUnit = majorUnit;
                } else if ("maximum".equals(fieldName)) {
                    Map<String, Object> maximum = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedMicrosoftGraphWorkbookChartAxis.maximum = maximum;
                } else if ("minimum".equals(fieldName)) {
                    Map<String, Object> minimum = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedMicrosoftGraphWorkbookChartAxis.minimum = minimum;
                } else if ("minorUnit".equals(fieldName)) {
                    Map<String, Object> minorUnit = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedMicrosoftGraphWorkbookChartAxis.minorUnit = minorUnit;
                } else if ("format".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartAxis.format
                        = MicrosoftGraphWorkbookChartAxisFormat.fromJson(reader);
                } else if ("majorGridlines".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartAxis.majorGridlines
                        = MicrosoftGraphWorkbookChartGridlines.fromJson(reader);
                } else if ("minorGridlines".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartAxis.minorGridlines
                        = MicrosoftGraphWorkbookChartGridlines.fromJson(reader);
                } else if ("title".equals(fieldName)) {
                    deserializedMicrosoftGraphWorkbookChartAxis.title
                        = MicrosoftGraphWorkbookChartAxisTitle.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphWorkbookChartAxis.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphWorkbookChartAxis;
        });
    }
}
