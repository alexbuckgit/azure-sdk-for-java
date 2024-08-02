// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.IsWorkloadProtected;
import java.io.IOException;

/**
 * Response for GetPublicIpAddressDdosProtectionStatusOperation API service call.
 */
@Fluent
public final class PublicIpDdosProtectionStatusResultInner
    implements JsonSerializable<PublicIpDdosProtectionStatusResultInner> {
    /*
     * Public IP ARM resource ID
     */
    private String publicIpAddressId;

    /*
     * IP Address of the Public IP Resource
     */
    private String publicIpAddress;

    /*
     * Value indicating whether the IP address is DDoS workload protected or not.
     */
    private IsWorkloadProtected isWorkloadProtected;

    /*
     * DDoS protection plan Resource Id of a if IP address is protected through a plan.
     */
    private String ddosProtectionPlanId;

    /**
     * Creates an instance of PublicIpDdosProtectionStatusResultInner class.
     */
    public PublicIpDdosProtectionStatusResultInner() {
    }

    /**
     * Get the publicIpAddressId property: Public IP ARM resource ID.
     * 
     * @return the publicIpAddressId value.
     */
    public String publicIpAddressId() {
        return this.publicIpAddressId;
    }

    /**
     * Set the publicIpAddressId property: Public IP ARM resource ID.
     * 
     * @param publicIpAddressId the publicIpAddressId value to set.
     * @return the PublicIpDdosProtectionStatusResultInner object itself.
     */
    public PublicIpDdosProtectionStatusResultInner withPublicIpAddressId(String publicIpAddressId) {
        this.publicIpAddressId = publicIpAddressId;
        return this;
    }

    /**
     * Get the publicIpAddress property: IP Address of the Public IP Resource.
     * 
     * @return the publicIpAddress value.
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: IP Address of the Public IP Resource.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the PublicIpDdosProtectionStatusResultInner object itself.
     */
    public PublicIpDdosProtectionStatusResultInner withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the isWorkloadProtected property: Value indicating whether the IP address is DDoS workload protected or not.
     * 
     * @return the isWorkloadProtected value.
     */
    public IsWorkloadProtected isWorkloadProtected() {
        return this.isWorkloadProtected;
    }

    /**
     * Set the isWorkloadProtected property: Value indicating whether the IP address is DDoS workload protected or not.
     * 
     * @param isWorkloadProtected the isWorkloadProtected value to set.
     * @return the PublicIpDdosProtectionStatusResultInner object itself.
     */
    public PublicIpDdosProtectionStatusResultInner withIsWorkloadProtected(IsWorkloadProtected isWorkloadProtected) {
        this.isWorkloadProtected = isWorkloadProtected;
        return this;
    }

    /**
     * Get the ddosProtectionPlanId property: DDoS protection plan Resource Id of a if IP address is protected through a
     * plan.
     * 
     * @return the ddosProtectionPlanId value.
     */
    public String ddosProtectionPlanId() {
        return this.ddosProtectionPlanId;
    }

    /**
     * Set the ddosProtectionPlanId property: DDoS protection plan Resource Id of a if IP address is protected through a
     * plan.
     * 
     * @param ddosProtectionPlanId the ddosProtectionPlanId value to set.
     * @return the PublicIpDdosProtectionStatusResultInner object itself.
     */
    public PublicIpDdosProtectionStatusResultInner withDdosProtectionPlanId(String ddosProtectionPlanId) {
        this.ddosProtectionPlanId = ddosProtectionPlanId;
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
        jsonWriter.writeStringField("publicIpAddressId", this.publicIpAddressId);
        jsonWriter.writeStringField("publicIpAddress", this.publicIpAddress);
        jsonWriter.writeStringField("isWorkloadProtected",
            this.isWorkloadProtected == null ? null : this.isWorkloadProtected.toString());
        jsonWriter.writeStringField("ddosProtectionPlanId", this.ddosProtectionPlanId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PublicIpDdosProtectionStatusResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PublicIpDdosProtectionStatusResultInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PublicIpDdosProtectionStatusResultInner.
     */
    public static PublicIpDdosProtectionStatusResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PublicIpDdosProtectionStatusResultInner deserializedPublicIpDdosProtectionStatusResultInner
                = new PublicIpDdosProtectionStatusResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publicIpAddressId".equals(fieldName)) {
                    deserializedPublicIpDdosProtectionStatusResultInner.publicIpAddressId = reader.getString();
                } else if ("publicIpAddress".equals(fieldName)) {
                    deserializedPublicIpDdosProtectionStatusResultInner.publicIpAddress = reader.getString();
                } else if ("isWorkloadProtected".equals(fieldName)) {
                    deserializedPublicIpDdosProtectionStatusResultInner.isWorkloadProtected
                        = IsWorkloadProtected.fromString(reader.getString());
                } else if ("ddosProtectionPlanId".equals(fieldName)) {
                    deserializedPublicIpDdosProtectionStatusResultInner.ddosProtectionPlanId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPublicIpDdosProtectionStatusResultInner;
        });
    }
}
