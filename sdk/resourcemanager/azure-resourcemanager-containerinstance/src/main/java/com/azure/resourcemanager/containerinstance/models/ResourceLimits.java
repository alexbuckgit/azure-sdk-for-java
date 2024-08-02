// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The resource limits.
 */
@Fluent
public final class ResourceLimits implements JsonSerializable<ResourceLimits> {
    /*
     * The memory limit in GB of this container instance.
     */
    private Double memoryInGB;

    /*
     * The CPU limit of this container instance.
     */
    private Double cpu;

    /*
     * The GPU limit of this container instance.
     */
    private GpuResource gpu;

    /**
     * Creates an instance of ResourceLimits class.
     */
    public ResourceLimits() {
    }

    /**
     * Get the memoryInGB property: The memory limit in GB of this container instance.
     * 
     * @return the memoryInGB value.
     */
    public Double memoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set the memoryInGB property: The memory limit in GB of this container instance.
     * 
     * @param memoryInGB the memoryInGB value to set.
     * @return the ResourceLimits object itself.
     */
    public ResourceLimits withMemoryInGB(Double memoryInGB) {
        this.memoryInGB = memoryInGB;
        return this;
    }

    /**
     * Get the cpu property: The CPU limit of this container instance.
     * 
     * @return the cpu value.
     */
    public Double cpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: The CPU limit of this container instance.
     * 
     * @param cpu the cpu value to set.
     * @return the ResourceLimits object itself.
     */
    public ResourceLimits withCpu(Double cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * Get the gpu property: The GPU limit of this container instance.
     * 
     * @return the gpu value.
     */
    public GpuResource gpu() {
        return this.gpu;
    }

    /**
     * Set the gpu property: The GPU limit of this container instance.
     * 
     * @param gpu the gpu value to set.
     * @return the ResourceLimits object itself.
     */
    public ResourceLimits withGpu(GpuResource gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (gpu() != null) {
            gpu().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("memoryInGB", this.memoryInGB);
        jsonWriter.writeNumberField("cpu", this.cpu);
        jsonWriter.writeJsonField("gpu", this.gpu);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceLimits from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceLimits if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceLimits.
     */
    public static ResourceLimits fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceLimits deserializedResourceLimits = new ResourceLimits();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("memoryInGB".equals(fieldName)) {
                    deserializedResourceLimits.memoryInGB = reader.getNullable(JsonReader::getDouble);
                } else if ("cpu".equals(fieldName)) {
                    deserializedResourceLimits.cpu = reader.getNullable(JsonReader::getDouble);
                } else if ("gpu".equals(fieldName)) {
                    deserializedResourceLimits.gpu = GpuResource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceLimits;
        });
    }
}
