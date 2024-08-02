// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ApplicationGatewayCustomError;
import com.azure.resourcemanager.network.models.ApplicationGatewayProtocol;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Properties of HTTP listener of an application gateway.
 */
@Fluent
public final class ApplicationGatewayHttpListenerPropertiesFormat
    implements JsonSerializable<ApplicationGatewayHttpListenerPropertiesFormat> {
    /*
     * Frontend IP configuration resource of an application gateway.
     */
    private SubResource frontendIpConfiguration;

    /*
     * Frontend port resource of an application gateway.
     */
    private SubResource frontendPort;

    /*
     * Protocol of the HTTP listener.
     */
    private ApplicationGatewayProtocol protocol;

    /*
     * Host name of HTTP listener.
     */
    private String hostname;

    /*
     * SSL certificate resource of an application gateway.
     */
    private SubResource sslCertificate;

    /*
     * SSL profile resource of the application gateway.
     */
    private SubResource sslProfile;

    /*
     * Applicable only if protocol is https. Enables SNI for multi-hosting.
     */
    private Boolean requireServerNameIndication;

    /*
     * The provisioning state of the HTTP listener resource.
     */
    private ProvisioningState provisioningState;

    /*
     * Custom error configurations of the HTTP listener.
     */
    private List<ApplicationGatewayCustomError> customErrorConfigurations;

    /*
     * Reference to the FirewallPolicy resource.
     */
    private SubResource firewallPolicy;

    /*
     * List of Host names for HTTP Listener that allows special wildcard characters as well.
     */
    private List<String> hostNames;

    /**
     * Creates an instance of ApplicationGatewayHttpListenerPropertiesFormat class.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat() {
    }

    /**
     * Get the frontendIpConfiguration property: Frontend IP configuration resource of an application gateway.
     * 
     * @return the frontendIpConfiguration value.
     */
    public SubResource frontendIpConfiguration() {
        return this.frontendIpConfiguration;
    }

    /**
     * Set the frontendIpConfiguration property: Frontend IP configuration resource of an application gateway.
     * 
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat
        withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        this.frontendIpConfiguration = frontendIpConfiguration;
        return this;
    }

    /**
     * Get the frontendPort property: Frontend port resource of an application gateway.
     * 
     * @return the frontendPort value.
     */
    public SubResource frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort property: Frontend port resource of an application gateway.
     * 
     * @param frontendPort the frontendPort value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withFrontendPort(SubResource frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the protocol property: Protocol of the HTTP listener.
     * 
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol of the HTTP listener.
     * 
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the hostname property: Host name of HTTP listener.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Host name of HTTP listener.
     * 
     * @param hostname the hostname value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the sslCertificate property: SSL certificate resource of an application gateway.
     * 
     * @return the sslCertificate value.
     */
    public SubResource sslCertificate() {
        return this.sslCertificate;
    }

    /**
     * Set the sslCertificate property: SSL certificate resource of an application gateway.
     * 
     * @param sslCertificate the sslCertificate value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withSslCertificate(SubResource sslCertificate) {
        this.sslCertificate = sslCertificate;
        return this;
    }

    /**
     * Get the sslProfile property: SSL profile resource of the application gateway.
     * 
     * @return the sslProfile value.
     */
    public SubResource sslProfile() {
        return this.sslProfile;
    }

    /**
     * Set the sslProfile property: SSL profile resource of the application gateway.
     * 
     * @param sslProfile the sslProfile value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withSslProfile(SubResource sslProfile) {
        this.sslProfile = sslProfile;
        return this;
    }

    /**
     * Get the requireServerNameIndication property: Applicable only if protocol is https. Enables SNI for
     * multi-hosting.
     * 
     * @return the requireServerNameIndication value.
     */
    public Boolean requireServerNameIndication() {
        return this.requireServerNameIndication;
    }

    /**
     * Set the requireServerNameIndication property: Applicable only if protocol is https. Enables SNI for
     * multi-hosting.
     * 
     * @param requireServerNameIndication the requireServerNameIndication value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat
        withRequireServerNameIndication(Boolean requireServerNameIndication) {
        this.requireServerNameIndication = requireServerNameIndication;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the HTTP listener resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the customErrorConfigurations property: Custom error configurations of the HTTP listener.
     * 
     * @return the customErrorConfigurations value.
     */
    public List<ApplicationGatewayCustomError> customErrorConfigurations() {
        return this.customErrorConfigurations;
    }

    /**
     * Set the customErrorConfigurations property: Custom error configurations of the HTTP listener.
     * 
     * @param customErrorConfigurations the customErrorConfigurations value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat
        withCustomErrorConfigurations(List<ApplicationGatewayCustomError> customErrorConfigurations) {
        this.customErrorConfigurations = customErrorConfigurations;
        return this;
    }

    /**
     * Get the firewallPolicy property: Reference to the FirewallPolicy resource.
     * 
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy property: Reference to the FirewallPolicy resource.
     * 
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /**
     * Get the hostNames property: List of Host names for HTTP Listener that allows special wildcard characters as well.
     * 
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Set the hostNames property: List of Host names for HTTP Listener that allows special wildcard characters as well.
     * 
     * @param hostNames the hostNames value to set.
     * @return the ApplicationGatewayHttpListenerPropertiesFormat object itself.
     */
    public ApplicationGatewayHttpListenerPropertiesFormat withHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customErrorConfigurations() != null) {
            customErrorConfigurations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("frontendIPConfiguration", this.frontendIpConfiguration);
        jsonWriter.writeJsonField("frontendPort", this.frontendPort);
        jsonWriter.writeStringField("protocol", this.protocol == null ? null : this.protocol.toString());
        jsonWriter.writeStringField("hostName", this.hostname);
        jsonWriter.writeJsonField("sslCertificate", this.sslCertificate);
        jsonWriter.writeJsonField("sslProfile", this.sslProfile);
        jsonWriter.writeBooleanField("requireServerNameIndication", this.requireServerNameIndication);
        jsonWriter.writeArrayField("customErrorConfigurations", this.customErrorConfigurations,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("firewallPolicy", this.firewallPolicy);
        jsonWriter.writeArrayField("hostNames", this.hostNames, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayHttpListenerPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayHttpListenerPropertiesFormat if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayHttpListenerPropertiesFormat.
     */
    public static ApplicationGatewayHttpListenerPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayHttpListenerPropertiesFormat deserializedApplicationGatewayHttpListenerPropertiesFormat
                = new ApplicationGatewayHttpListenerPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("frontendIPConfiguration".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.frontendIpConfiguration
                        = SubResource.fromJson(reader);
                } else if ("frontendPort".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.frontendPort
                        = SubResource.fromJson(reader);
                } else if ("protocol".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.protocol
                        = ApplicationGatewayProtocol.fromString(reader.getString());
                } else if ("hostName".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.hostname = reader.getString();
                } else if ("sslCertificate".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.sslCertificate
                        = SubResource.fromJson(reader);
                } else if ("sslProfile".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.sslProfile
                        = SubResource.fromJson(reader);
                } else if ("requireServerNameIndication".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.requireServerNameIndication
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("customErrorConfigurations".equals(fieldName)) {
                    List<ApplicationGatewayCustomError> customErrorConfigurations
                        = reader.readArray(reader1 -> ApplicationGatewayCustomError.fromJson(reader1));
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.customErrorConfigurations
                        = customErrorConfigurations;
                } else if ("firewallPolicy".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.firewallPolicy
                        = SubResource.fromJson(reader);
                } else if ("hostNames".equals(fieldName)) {
                    List<String> hostNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedApplicationGatewayHttpListenerPropertiesFormat.hostNames = hostNames;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayHttpListenerPropertiesFormat;
        });
    }
}
