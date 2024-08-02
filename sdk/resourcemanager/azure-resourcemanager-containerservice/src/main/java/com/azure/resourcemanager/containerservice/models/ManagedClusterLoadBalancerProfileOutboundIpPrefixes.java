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
import java.util.List;

/**
 * Desired outbound IP Prefix resources for the cluster load balancer.
 */
@Fluent
public final class ManagedClusterLoadBalancerProfileOutboundIpPrefixes
    implements JsonSerializable<ManagedClusterLoadBalancerProfileOutboundIpPrefixes> {
    /*
     * A list of public IP prefix resources.
     */
    private List<ResourceReference> publicIpPrefixes;

    /**
     * Creates an instance of ManagedClusterLoadBalancerProfileOutboundIpPrefixes class.
     */
    public ManagedClusterLoadBalancerProfileOutboundIpPrefixes() {
    }

    /**
     * Get the publicIpPrefixes property: A list of public IP prefix resources.
     * 
     * @return the publicIpPrefixes value.
     */
    public List<ResourceReference> publicIpPrefixes() {
        return this.publicIpPrefixes;
    }

    /**
     * Set the publicIpPrefixes property: A list of public IP prefix resources.
     * 
     * @param publicIpPrefixes the publicIpPrefixes value to set.
     * @return the ManagedClusterLoadBalancerProfileOutboundIpPrefixes object itself.
     */
    public ManagedClusterLoadBalancerProfileOutboundIpPrefixes
        withPublicIpPrefixes(List<ResourceReference> publicIpPrefixes) {
        this.publicIpPrefixes = publicIpPrefixes;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicIpPrefixes() != null) {
            publicIpPrefixes().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("publicIPPrefixes", this.publicIpPrefixes,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedClusterLoadBalancerProfileOutboundIpPrefixes from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedClusterLoadBalancerProfileOutboundIpPrefixes if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedClusterLoadBalancerProfileOutboundIpPrefixes.
     */
    public static ManagedClusterLoadBalancerProfileOutboundIpPrefixes fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedClusterLoadBalancerProfileOutboundIpPrefixes deserializedManagedClusterLoadBalancerProfileOutboundIpPrefixes
                = new ManagedClusterLoadBalancerProfileOutboundIpPrefixes();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publicIPPrefixes".equals(fieldName)) {
                    List<ResourceReference> publicIpPrefixes
                        = reader.readArray(reader1 -> ResourceReference.fromJson(reader1));
                    deserializedManagedClusterLoadBalancerProfileOutboundIpPrefixes.publicIpPrefixes = publicIpPrefixes;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedClusterLoadBalancerProfileOutboundIpPrefixes;
        });
    }
}
