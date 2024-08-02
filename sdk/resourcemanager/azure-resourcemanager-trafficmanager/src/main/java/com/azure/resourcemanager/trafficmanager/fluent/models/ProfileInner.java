// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.trafficmanager.models.AllowedEndpointRecordType;
import com.azure.resourcemanager.trafficmanager.models.DnsConfig;
import com.azure.resourcemanager.trafficmanager.models.MonitorConfig;
import com.azure.resourcemanager.trafficmanager.models.ProfileStatus;
import com.azure.resourcemanager.trafficmanager.models.TrafficRoutingMethod;
import com.azure.resourcemanager.trafficmanager.models.TrafficViewEnrollmentStatus;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Class representing a Traffic Manager profile.
 */
@Fluent
public final class ProfileInner extends Resource {
    /*
     * The properties of the Traffic Manager profile.
     */
    private ProfileProperties innerProperties;

    /*
     * Fully qualified resource Id for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/
     * trafficManagerProfiles/{resourceName}
     */
    private String id;

    /*
     * The name of the resource
     */
    private String name;

    /*
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     */
    private String type;

    /**
     * Creates an instance of ProfileInner class.
     */
    public ProfileInner() {
    }

    /**
     * Get the innerProperties property: The properties of the Traffic Manager profile.
     * 
     * @return the innerProperties value.
     */
    private ProfileProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Fully qualified resource Id for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}.
     * 
     * @param id the id value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     * 
     * @param name the name value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     * @param type the type value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfileInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the profileStatus property: The status of the Traffic Manager profile.
     * 
     * @return the profileStatus value.
     */
    public ProfileStatus profileStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().profileStatus();
    }

    /**
     * Set the profileStatus property: The status of the Traffic Manager profile.
     * 
     * @param profileStatus the profileStatus value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withProfileStatus(ProfileStatus profileStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProfileProperties();
        }
        this.innerProperties().withProfileStatus(profileStatus);
        return this;
    }

    /**
     * Get the trafficRoutingMethod property: The traffic routing method of the Traffic Manager profile.
     * 
     * @return the trafficRoutingMethod value.
     */
    public TrafficRoutingMethod trafficRoutingMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().trafficRoutingMethod();
    }

    /**
     * Set the trafficRoutingMethod property: The traffic routing method of the Traffic Manager profile.
     * 
     * @param trafficRoutingMethod the trafficRoutingMethod value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withTrafficRoutingMethod(TrafficRoutingMethod trafficRoutingMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProfileProperties();
        }
        this.innerProperties().withTrafficRoutingMethod(trafficRoutingMethod);
        return this;
    }

    /**
     * Get the dnsConfig property: The DNS settings of the Traffic Manager profile.
     * 
     * @return the dnsConfig value.
     */
    public DnsConfig dnsConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsConfig();
    }

    /**
     * Set the dnsConfig property: The DNS settings of the Traffic Manager profile.
     * 
     * @param dnsConfig the dnsConfig value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withDnsConfig(DnsConfig dnsConfig) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProfileProperties();
        }
        this.innerProperties().withDnsConfig(dnsConfig);
        return this;
    }

    /**
     * Get the monitorConfig property: The endpoint monitoring settings of the Traffic Manager profile.
     * 
     * @return the monitorConfig value.
     */
    public MonitorConfig monitorConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().monitorConfig();
    }

    /**
     * Set the monitorConfig property: The endpoint monitoring settings of the Traffic Manager profile.
     * 
     * @param monitorConfig the monitorConfig value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withMonitorConfig(MonitorConfig monitorConfig) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProfileProperties();
        }
        this.innerProperties().withMonitorConfig(monitorConfig);
        return this;
    }

    /**
     * Get the endpoints property: The list of endpoints in the Traffic Manager profile.
     * 
     * @return the endpoints value.
     */
    public List<EndpointInner> endpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().endpoints();
    }

    /**
     * Set the endpoints property: The list of endpoints in the Traffic Manager profile.
     * 
     * @param endpoints the endpoints value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withEndpoints(List<EndpointInner> endpoints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProfileProperties();
        }
        this.innerProperties().withEndpoints(endpoints);
        return this;
    }

    /**
     * Get the trafficViewEnrollmentStatus property: Indicates whether Traffic View is 'Enabled' or 'Disabled' for the
     * Traffic Manager profile. Null, indicates 'Disabled'. Enabling this feature will increase the cost of the Traffic
     * Manage profile.
     * 
     * @return the trafficViewEnrollmentStatus value.
     */
    public TrafficViewEnrollmentStatus trafficViewEnrollmentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().trafficViewEnrollmentStatus();
    }

    /**
     * Set the trafficViewEnrollmentStatus property: Indicates whether Traffic View is 'Enabled' or 'Disabled' for the
     * Traffic Manager profile. Null, indicates 'Disabled'. Enabling this feature will increase the cost of the Traffic
     * Manage profile.
     * 
     * @param trafficViewEnrollmentStatus the trafficViewEnrollmentStatus value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withTrafficViewEnrollmentStatus(TrafficViewEnrollmentStatus trafficViewEnrollmentStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProfileProperties();
        }
        this.innerProperties().withTrafficViewEnrollmentStatus(trafficViewEnrollmentStatus);
        return this;
    }

    /**
     * Get the allowedEndpointRecordTypes property: The list of allowed endpoint record types.
     * 
     * @return the allowedEndpointRecordTypes value.
     */
    public List<AllowedEndpointRecordType> allowedEndpointRecordTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().allowedEndpointRecordTypes();
    }

    /**
     * Set the allowedEndpointRecordTypes property: The list of allowed endpoint record types.
     * 
     * @param allowedEndpointRecordTypes the allowedEndpointRecordTypes value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withAllowedEndpointRecordTypes(List<AllowedEndpointRecordType> allowedEndpointRecordTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProfileProperties();
        }
        this.innerProperties().withAllowedEndpointRecordTypes(allowedEndpointRecordTypes);
        return this;
    }

    /**
     * Get the maxReturn property: Maximum number of endpoints to be returned for MultiValue routing type.
     * 
     * @return the maxReturn value.
     */
    public Long maxReturn() {
        return this.innerProperties() == null ? null : this.innerProperties().maxReturn();
    }

    /**
     * Set the maxReturn property: Maximum number of endpoints to be returned for MultiValue routing type.
     * 
     * @param maxReturn the maxReturn value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withMaxReturn(Long maxReturn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProfileProperties();
        }
        this.innerProperties().withMaxReturn(maxReturn);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProfileInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProfileInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ProfileInner.
     */
    public static ProfileInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProfileInner deserializedProfileInner = new ProfileInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedProfileInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedProfileInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedProfileInner.innerProperties = ProfileProperties.fromJson(reader);
                } else if ("id".equals(fieldName)) {
                    deserializedProfileInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedProfileInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedProfileInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProfileInner;
        });
    }
}
