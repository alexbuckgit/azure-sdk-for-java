// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ApplicationGatewayProbeHealthResponseMatch;
import com.azure.resourcemanager.network.models.ApplicationGatewayProtocol;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;

/**
 * Probe of the application gateway.
 */
@Fluent
public final class ApplicationGatewayProbeInner extends SubResource {
    /*
     * Properties of the application gateway probe.
     */
    private ApplicationGatewayProbePropertiesFormat innerProperties;

    /*
     * Name of the probe that is unique within an Application Gateway.
     */
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ApplicationGatewayProbeInner class.
     */
    public ApplicationGatewayProbeInner() {
    }

    /**
     * Get the innerProperties property: Properties of the application gateway probe.
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewayProbePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the probe that is unique within an Application Gateway.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the probe that is unique within an Application Gateway.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewayProbeInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the protocol property: The protocol used for the probe.
     * 
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: The protocol used for the probe.
     * 
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withProtocol(ApplicationGatewayProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the host property: Host name to send the probe to.
     * 
     * @return the host value.
     */
    public String host() {
        return this.innerProperties() == null ? null : this.innerProperties().host();
    }

    /**
     * Set the host property: Host name to send the probe to.
     * 
     * @param host the host value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withHost(String host) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withHost(host);
        return this;
    }

    /**
     * Get the path property: Relative path of probe. Valid path starts from '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     * 
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: Relative path of probe. Valid path starts from '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     * 
     * @param path the path value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Get the interval property: The probing interval in seconds. This is the time interval between two consecutive
     * probes. Acceptable values are from 1 second to 86400 seconds.
     * 
     * @return the interval value.
     */
    public Integer interval() {
        return this.innerProperties() == null ? null : this.innerProperties().interval();
    }

    /**
     * Set the interval property: The probing interval in seconds. This is the time interval between two consecutive
     * probes. Acceptable values are from 1 second to 86400 seconds.
     * 
     * @param interval the interval value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withInterval(Integer interval) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withInterval(interval);
        return this;
    }

    /**
     * Get the timeout property: The probe timeout in seconds. Probe marked as failed if valid response is not received
     * with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     * 
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.innerProperties() == null ? null : this.innerProperties().timeout();
    }

    /**
     * Set the timeout property: The probe timeout in seconds. Probe marked as failed if valid response is not received
     * with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     * 
     * @param timeout the timeout value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withTimeout(Integer timeout) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withTimeout(timeout);
        return this;
    }

    /**
     * Get the unhealthyThreshold property: The probe retry count. Backend server is marked down after consecutive probe
     * failure count reaches UnhealthyThreshold. Acceptable values are from 1 second to 20.
     * 
     * @return the unhealthyThreshold value.
     */
    public Integer unhealthyThreshold() {
        return this.innerProperties() == null ? null : this.innerProperties().unhealthyThreshold();
    }

    /**
     * Set the unhealthyThreshold property: The probe retry count. Backend server is marked down after consecutive probe
     * failure count reaches UnhealthyThreshold. Acceptable values are from 1 second to 20.
     * 
     * @param unhealthyThreshold the unhealthyThreshold value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withUnhealthyThreshold(Integer unhealthyThreshold) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withUnhealthyThreshold(unhealthyThreshold);
        return this;
    }

    /**
     * Get the pickHostnameFromBackendHttpSettings property: Whether the host header should be picked from the backend
     * http settings. Default value is false.
     * 
     * @return the pickHostnameFromBackendHttpSettings value.
     */
    public Boolean pickHostnameFromBackendHttpSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().pickHostnameFromBackendHttpSettings();
    }

    /**
     * Set the pickHostnameFromBackendHttpSettings property: Whether the host header should be picked from the backend
     * http settings. Default value is false.
     * 
     * @param pickHostnameFromBackendHttpSettings the pickHostnameFromBackendHttpSettings value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner
        withPickHostnameFromBackendHttpSettings(Boolean pickHostnameFromBackendHttpSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withPickHostnameFromBackendHttpSettings(pickHostnameFromBackendHttpSettings);
        return this;
    }

    /**
     * Get the pickHostnameFromBackendSettings property: Whether the server name indication should be picked from the
     * backend settings for Tls protocol. Default value is false.
     * 
     * @return the pickHostnameFromBackendSettings value.
     */
    public Boolean pickHostnameFromBackendSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().pickHostnameFromBackendSettings();
    }

    /**
     * Set the pickHostnameFromBackendSettings property: Whether the server name indication should be picked from the
     * backend settings for Tls protocol. Default value is false.
     * 
     * @param pickHostnameFromBackendSettings the pickHostnameFromBackendSettings value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withPickHostnameFromBackendSettings(Boolean pickHostnameFromBackendSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withPickHostnameFromBackendSettings(pickHostnameFromBackendSettings);
        return this;
    }

    /**
     * Get the minServers property: Minimum number of servers that are always marked healthy. Default value is 0.
     * 
     * @return the minServers value.
     */
    public Integer minServers() {
        return this.innerProperties() == null ? null : this.innerProperties().minServers();
    }

    /**
     * Set the minServers property: Minimum number of servers that are always marked healthy. Default value is 0.
     * 
     * @param minServers the minServers value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withMinServers(Integer minServers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withMinServers(minServers);
        return this;
    }

    /**
     * Get the match property: Criterion for classifying a healthy probe response.
     * 
     * @return the match value.
     */
    public ApplicationGatewayProbeHealthResponseMatch match() {
        return this.innerProperties() == null ? null : this.innerProperties().match();
    }

    /**
     * Set the match property: Criterion for classifying a healthy probe response.
     * 
     * @param match the match value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withMatch(ApplicationGatewayProbeHealthResponseMatch match) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withMatch(match);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the probe resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the port property: Custom port which will be used for probing the backend servers. The valid value ranges
     * from 1 to 65535. In case not set, port from http settings will be used. This property is valid for Basic,
     * Standard_v2 and WAF_v2 only.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Set the port property: Custom port which will be used for probing the backend servers. The valid value ranges
     * from 1 to 65535. In case not set, port from http settings will be used. This property is valid for Basic,
     * Standard_v2 and WAF_v2 only.
     * 
     * @param port the port value to set.
     * @return the ApplicationGatewayProbeInner object itself.
     */
    public ApplicationGatewayProbeInner withPort(Integer port) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayProbePropertiesFormat();
        }
        this.innerProperties().withPort(port);
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
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayProbeInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayProbeInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayProbeInner.
     */
    public static ApplicationGatewayProbeInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayProbeInner deserializedApplicationGatewayProbeInner = new ApplicationGatewayProbeInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedApplicationGatewayProbeInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedApplicationGatewayProbeInner.innerProperties
                        = ApplicationGatewayProbePropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedApplicationGatewayProbeInner.name = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedApplicationGatewayProbeInner.etag = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedApplicationGatewayProbeInner.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayProbeInner;
        });
    }
}
