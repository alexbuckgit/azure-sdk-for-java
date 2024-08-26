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
 * SKU Mapping details.
 */
@Fluent
public final class SkuMappings implements JsonSerializable<SkuMappings> {
    /*
     * Identifier of the CatalogPlan for the sku
     */
    private String catalogPlanId;

    /*
     * Identifier for the sku
     */
    private String marketplaceSkuId;

    /*
     * Array of SKU versions available
     */
    private List<String> marketplaceSkuVersions;

    /**
     * Creates an instance of SkuMappings class.
     */
    public SkuMappings() {
    }

    /**
     * Get the catalogPlanId property: Identifier of the CatalogPlan for the sku.
     * 
     * @return the catalogPlanId value.
     */
    public String catalogPlanId() {
        return this.catalogPlanId;
    }

    /**
     * Set the catalogPlanId property: Identifier of the CatalogPlan for the sku.
     * 
     * @param catalogPlanId the catalogPlanId value to set.
     * @return the SkuMappings object itself.
     */
    public SkuMappings withCatalogPlanId(String catalogPlanId) {
        this.catalogPlanId = catalogPlanId;
        return this;
    }

    /**
     * Get the marketplaceSkuId property: Identifier for the sku.
     * 
     * @return the marketplaceSkuId value.
     */
    public String marketplaceSkuId() {
        return this.marketplaceSkuId;
    }

    /**
     * Set the marketplaceSkuId property: Identifier for the sku.
     * 
     * @param marketplaceSkuId the marketplaceSkuId value to set.
     * @return the SkuMappings object itself.
     */
    public SkuMappings withMarketplaceSkuId(String marketplaceSkuId) {
        this.marketplaceSkuId = marketplaceSkuId;
        return this;
    }

    /**
     * Get the marketplaceSkuVersions property: Array of SKU versions available.
     * 
     * @return the marketplaceSkuVersions value.
     */
    public List<String> marketplaceSkuVersions() {
        return this.marketplaceSkuVersions;
    }

    /**
     * Set the marketplaceSkuVersions property: Array of SKU versions available.
     * 
     * @param marketplaceSkuVersions the marketplaceSkuVersions value to set.
     * @return the SkuMappings object itself.
     */
    public SkuMappings withMarketplaceSkuVersions(List<String> marketplaceSkuVersions) {
        this.marketplaceSkuVersions = marketplaceSkuVersions;
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
        jsonWriter.writeStringField("catalogPlanId", this.catalogPlanId);
        jsonWriter.writeStringField("marketplaceSkuId", this.marketplaceSkuId);
        jsonWriter.writeArrayField("marketplaceSkuVersions", this.marketplaceSkuVersions,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SkuMappings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SkuMappings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SkuMappings.
     */
    public static SkuMappings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SkuMappings deserializedSkuMappings = new SkuMappings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("catalogPlanId".equals(fieldName)) {
                    deserializedSkuMappings.catalogPlanId = reader.getString();
                } else if ("marketplaceSkuId".equals(fieldName)) {
                    deserializedSkuMappings.marketplaceSkuId = reader.getString();
                } else if ("marketplaceSkuVersions".equals(fieldName)) {
                    List<String> marketplaceSkuVersions = reader.readArray(reader1 -> reader1.getString());
                    deserializedSkuMappings.marketplaceSkuVersions = marketplaceSkuVersions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSkuMappings;
        });
    }
}
