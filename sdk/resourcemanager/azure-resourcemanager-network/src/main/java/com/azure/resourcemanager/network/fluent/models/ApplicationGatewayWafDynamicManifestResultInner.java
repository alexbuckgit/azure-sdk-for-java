// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ApplicationGatewayFirewallManifestRuleSet;
import java.io.IOException;
import java.util.List;

/**
 * Response for ApplicationGatewayWafDynamicManifest API service call.
 */
@Fluent
public final class ApplicationGatewayWafDynamicManifestResultInner
    implements JsonSerializable<ApplicationGatewayWafDynamicManifestResultInner> {
    /*
     * Resource ID.
     */
    private String id;

    /*
     * Resource name.
     */
    private String name;

    /*
     * Resource type.
     */
    private String type;

    /*
     * Properties of the ApplicationGatewayWafDynamicManifest .
     */
    private ApplicationGatewayWafDynamicManifestPropertiesResult innerProperties;

    /**
     * Creates an instance of ApplicationGatewayWafDynamicManifestResultInner class.
     */
    public ApplicationGatewayWafDynamicManifestResultInner() {
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the ApplicationGatewayWafDynamicManifestResultInner object itself.
     */
    public ApplicationGatewayWafDynamicManifestResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: Properties of the ApplicationGatewayWafDynamicManifest .
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewayWafDynamicManifestPropertiesResult innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the availableRuleSets property: The available rulesets.
     * 
     * @return the availableRuleSets value.
     */
    public List<ApplicationGatewayFirewallManifestRuleSet> availableRuleSets() {
        return this.innerProperties() == null ? null : this.innerProperties().availableRuleSets();
    }

    /**
     * Set the availableRuleSets property: The available rulesets.
     * 
     * @param availableRuleSets the availableRuleSets value to set.
     * @return the ApplicationGatewayWafDynamicManifestResultInner object itself.
     */
    public ApplicationGatewayWafDynamicManifestResultInner
        withAvailableRuleSets(List<ApplicationGatewayFirewallManifestRuleSet> availableRuleSets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayWafDynamicManifestPropertiesResult();
        }
        this.innerProperties().withAvailableRuleSets(availableRuleSets);
        return this;
    }

    /**
     * Get the ruleSetType property: The type of the web application firewall rule set.
     * 
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetType();
    }

    /**
     * Set the ruleSetType property: The type of the web application firewall rule set.
     * 
     * @param ruleSetType the ruleSetType value to set.
     * @return the ApplicationGatewayWafDynamicManifestResultInner object itself.
     */
    public ApplicationGatewayWafDynamicManifestResultInner withRuleSetType(String ruleSetType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayWafDynamicManifestPropertiesResult();
        }
        this.innerProperties().withRuleSetType(ruleSetType);
        return this;
    }

    /**
     * Get the ruleSetVersion property: The version of the web application firewall rule set type.
     * 
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetVersion();
    }

    /**
     * Set the ruleSetVersion property: The version of the web application firewall rule set type.
     * 
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the ApplicationGatewayWafDynamicManifestResultInner object itself.
     */
    public ApplicationGatewayWafDynamicManifestResultInner withRuleSetVersion(String ruleSetVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayWafDynamicManifestPropertiesResult();
        }
        this.innerProperties().withRuleSetVersion(ruleSetVersion);
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayWafDynamicManifestResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayWafDynamicManifestResultInner if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayWafDynamicManifestResultInner.
     */
    public static ApplicationGatewayWafDynamicManifestResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayWafDynamicManifestResultInner deserializedApplicationGatewayWafDynamicManifestResultInner
                = new ApplicationGatewayWafDynamicManifestResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedApplicationGatewayWafDynamicManifestResultInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedApplicationGatewayWafDynamicManifestResultInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedApplicationGatewayWafDynamicManifestResultInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedApplicationGatewayWafDynamicManifestResultInner.innerProperties
                        = ApplicationGatewayWafDynamicManifestPropertiesResult.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayWafDynamicManifestResultInner;
        });
    }
}
