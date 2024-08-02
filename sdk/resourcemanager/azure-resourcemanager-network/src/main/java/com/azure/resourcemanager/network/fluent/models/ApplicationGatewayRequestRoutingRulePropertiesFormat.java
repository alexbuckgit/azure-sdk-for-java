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
import com.azure.resourcemanager.network.models.ApplicationGatewayRequestRoutingRuleType;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;

/**
 * Properties of request routing rule of the application gateway.
 */
@Fluent
public final class ApplicationGatewayRequestRoutingRulePropertiesFormat
    implements JsonSerializable<ApplicationGatewayRequestRoutingRulePropertiesFormat> {
    /*
     * Rule type.
     */
    private ApplicationGatewayRequestRoutingRuleType ruleType;

    /*
     * Priority of the request routing rule.
     */
    private Integer priority;

    /*
     * Backend address pool resource of the application gateway.
     */
    private SubResource backendAddressPool;

    /*
     * Backend http settings resource of the application gateway.
     */
    private SubResource backendHttpSettings;

    /*
     * Http listener resource of the application gateway.
     */
    private SubResource httpListener;

    /*
     * URL path map resource of the application gateway.
     */
    private SubResource urlPathMap;

    /*
     * Rewrite Rule Set resource in Basic rule of the application gateway.
     */
    private SubResource rewriteRuleSet;

    /*
     * Redirect configuration resource of the application gateway.
     */
    private SubResource redirectConfiguration;

    /*
     * Load Distribution Policy resource of the application gateway.
     */
    private SubResource loadDistributionPolicy;

    /*
     * The provisioning state of the request routing rule resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ApplicationGatewayRequestRoutingRulePropertiesFormat class.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat() {
    }

    /**
     * Get the ruleType property: Rule type.
     * 
     * @return the ruleType value.
     */
    public ApplicationGatewayRequestRoutingRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType property: Rule type.
     * 
     * @param ruleType the ruleType value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat
        withRuleType(ApplicationGatewayRequestRoutingRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the priority property: Priority of the request routing rule.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the request routing rule.
     * 
     * @param priority the priority value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the backendAddressPool property: Backend address pool resource of the application gateway.
     * 
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Backend address pool resource of the application gateway.
     * 
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHttpSettings property: Backend http settings resource of the application gateway.
     * 
     * @return the backendHttpSettings value.
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set the backendHttpSettings property: Backend http settings resource of the application gateway.
     * 
     * @param backendHttpSettings the backendHttpSettings value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat
        withBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get the httpListener property: Http listener resource of the application gateway.
     * 
     * @return the httpListener value.
     */
    public SubResource httpListener() {
        return this.httpListener;
    }

    /**
     * Set the httpListener property: Http listener resource of the application gateway.
     * 
     * @param httpListener the httpListener value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withHttpListener(SubResource httpListener) {
        this.httpListener = httpListener;
        return this;
    }

    /**
     * Get the urlPathMap property: URL path map resource of the application gateway.
     * 
     * @return the urlPathMap value.
     */
    public SubResource urlPathMap() {
        return this.urlPathMap;
    }

    /**
     * Set the urlPathMap property: URL path map resource of the application gateway.
     * 
     * @param urlPathMap the urlPathMap value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withUrlPathMap(SubResource urlPathMap) {
        this.urlPathMap = urlPathMap;
        return this;
    }

    /**
     * Get the rewriteRuleSet property: Rewrite Rule Set resource in Basic rule of the application gateway.
     * 
     * @return the rewriteRuleSet value.
     */
    public SubResource rewriteRuleSet() {
        return this.rewriteRuleSet;
    }

    /**
     * Set the rewriteRuleSet property: Rewrite Rule Set resource in Basic rule of the application gateway.
     * 
     * @param rewriteRuleSet the rewriteRuleSet value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat withRewriteRuleSet(SubResource rewriteRuleSet) {
        this.rewriteRuleSet = rewriteRuleSet;
        return this;
    }

    /**
     * Get the redirectConfiguration property: Redirect configuration resource of the application gateway.
     * 
     * @return the redirectConfiguration value.
     */
    public SubResource redirectConfiguration() {
        return this.redirectConfiguration;
    }

    /**
     * Set the redirectConfiguration property: Redirect configuration resource of the application gateway.
     * 
     * @param redirectConfiguration the redirectConfiguration value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat
        withRedirectConfiguration(SubResource redirectConfiguration) {
        this.redirectConfiguration = redirectConfiguration;
        return this;
    }

    /**
     * Get the loadDistributionPolicy property: Load Distribution Policy resource of the application gateway.
     * 
     * @return the loadDistributionPolicy value.
     */
    public SubResource loadDistributionPolicy() {
        return this.loadDistributionPolicy;
    }

    /**
     * Set the loadDistributionPolicy property: Load Distribution Policy resource of the application gateway.
     * 
     * @param loadDistributionPolicy the loadDistributionPolicy value to set.
     * @return the ApplicationGatewayRequestRoutingRulePropertiesFormat object itself.
     */
    public ApplicationGatewayRequestRoutingRulePropertiesFormat
        withLoadDistributionPolicy(SubResource loadDistributionPolicy) {
        this.loadDistributionPolicy = loadDistributionPolicy;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the request routing rule resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
        jsonWriter.writeStringField("ruleType", this.ruleType == null ? null : this.ruleType.toString());
        jsonWriter.writeNumberField("priority", this.priority);
        jsonWriter.writeJsonField("backendAddressPool", this.backendAddressPool);
        jsonWriter.writeJsonField("backendHttpSettings", this.backendHttpSettings);
        jsonWriter.writeJsonField("httpListener", this.httpListener);
        jsonWriter.writeJsonField("urlPathMap", this.urlPathMap);
        jsonWriter.writeJsonField("rewriteRuleSet", this.rewriteRuleSet);
        jsonWriter.writeJsonField("redirectConfiguration", this.redirectConfiguration);
        jsonWriter.writeJsonField("loadDistributionPolicy", this.loadDistributionPolicy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayRequestRoutingRulePropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayRequestRoutingRulePropertiesFormat if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayRequestRoutingRulePropertiesFormat.
     */
    public static ApplicationGatewayRequestRoutingRulePropertiesFormat fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayRequestRoutingRulePropertiesFormat deserializedApplicationGatewayRequestRoutingRulePropertiesFormat
                = new ApplicationGatewayRequestRoutingRulePropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ruleType".equals(fieldName)) {
                    deserializedApplicationGatewayRequestRoutingRulePropertiesFormat.ruleType
                        = ApplicationGatewayRequestRoutingRuleType.fromString(reader.getString());
                } else if ("priority".equals(fieldName)) {
                    deserializedApplicationGatewayRequestRoutingRulePropertiesFormat.priority
                        = reader.getNullable(JsonReader::getInt);
                } else if ("backendAddressPool".equals(fieldName)) {
                    deserializedApplicationGatewayRequestRoutingRulePropertiesFormat.backendAddressPool
                        = SubResource.fromJson(reader);
                } else if ("backendHttpSettings".equals(fieldName)) {
                    deserializedApplicationGatewayRequestRoutingRulePropertiesFormat.backendHttpSettings
                        = SubResource.fromJson(reader);
                } else if ("httpListener".equals(fieldName)) {
                    deserializedApplicationGatewayRequestRoutingRulePropertiesFormat.httpListener
                        = SubResource.fromJson(reader);
                } else if ("urlPathMap".equals(fieldName)) {
                    deserializedApplicationGatewayRequestRoutingRulePropertiesFormat.urlPathMap
                        = SubResource.fromJson(reader);
                } else if ("rewriteRuleSet".equals(fieldName)) {
                    deserializedApplicationGatewayRequestRoutingRulePropertiesFormat.rewriteRuleSet
                        = SubResource.fromJson(reader);
                } else if ("redirectConfiguration".equals(fieldName)) {
                    deserializedApplicationGatewayRequestRoutingRulePropertiesFormat.redirectConfiguration
                        = SubResource.fromJson(reader);
                } else if ("loadDistributionPolicy".equals(fieldName)) {
                    deserializedApplicationGatewayRequestRoutingRulePropertiesFormat.loadDistributionPolicy
                        = SubResource.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedApplicationGatewayRequestRoutingRulePropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayRequestRoutingRulePropertiesFormat;
        });
    }
}
