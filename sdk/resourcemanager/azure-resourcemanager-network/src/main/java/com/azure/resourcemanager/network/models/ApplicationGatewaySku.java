// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * SKU of an application gateway.
 */
@Fluent
public final class ApplicationGatewaySku implements JsonSerializable<ApplicationGatewaySku> {
    /*
     * Name of an application gateway SKU.
     */
    private ApplicationGatewaySkuName name;

    /*
     * Tier of an application gateway.
     */
    private ApplicationGatewayTier tier;

    /*
     * Capacity (instance count) of an application gateway.
     */
    private Integer capacity;

    /*
     * Family of an application gateway SKU.
     */
    private ApplicationGatewaySkuFamily family;

    /**
     * Creates an instance of ApplicationGatewaySku class.
     */
    public ApplicationGatewaySku() {
    }

    /**
     * Get the name property: Name of an application gateway SKU.
     * 
     * @return the name value.
     */
    public ApplicationGatewaySkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of an application gateway SKU.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withName(ApplicationGatewaySkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Tier of an application gateway.
     * 
     * @return the tier value.
     */
    public ApplicationGatewayTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Tier of an application gateway.
     * 
     * @param tier the tier value to set.
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withTier(ApplicationGatewayTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity property: Capacity (instance count) of an application gateway.
     * 
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Capacity (instance count) of an application gateway.
     * 
     * @param capacity the capacity value to set.
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the family property: Family of an application gateway SKU.
     * 
     * @return the family value.
     */
    public ApplicationGatewaySkuFamily family() {
        return this.family;
    }

    /**
     * Set the family property: Family of an application gateway SKU.
     * 
     * @param family the family value to set.
     * @return the ApplicationGatewaySku object itself.
     */
    public ApplicationGatewaySku withFamily(ApplicationGatewaySkuFamily family) {
        this.family = family;
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
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        jsonWriter.writeStringField("tier", this.tier == null ? null : this.tier.toString());
        jsonWriter.writeNumberField("capacity", this.capacity);
        jsonWriter.writeStringField("family", this.family == null ? null : this.family.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewaySku from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewaySku if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewaySku.
     */
    public static ApplicationGatewaySku fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewaySku deserializedApplicationGatewaySku = new ApplicationGatewaySku();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedApplicationGatewaySku.name = ApplicationGatewaySkuName.fromString(reader.getString());
                } else if ("tier".equals(fieldName)) {
                    deserializedApplicationGatewaySku.tier = ApplicationGatewayTier.fromString(reader.getString());
                } else if ("capacity".equals(fieldName)) {
                    deserializedApplicationGatewaySku.capacity = reader.getNullable(JsonReader::getInt);
                } else if ("family".equals(fieldName)) {
                    deserializedApplicationGatewaySku.family
                        = ApplicationGatewaySkuFamily.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewaySku;
        });
    }
}
