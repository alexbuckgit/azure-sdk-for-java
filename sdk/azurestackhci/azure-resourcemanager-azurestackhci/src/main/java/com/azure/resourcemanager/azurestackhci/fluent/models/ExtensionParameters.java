// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the properties of a Machine Extension. This object mirrors the definition in HybridCompute.
 */
@Fluent
public final class ExtensionParameters implements JsonSerializable<ExtensionParameters> {
    /*
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     */
    private String forceUpdateTag;

    /*
     * The name of the extension handler publisher.
     */
    private String publisher;

    /*
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     */
    private String type;

    /*
     * Specifies the version of the script handler. Latest version would be used if not specified.
     */
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once
     * deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set
     * to true.
     */
    private Boolean autoUpgradeMinorVersion;

    /*
     * Json formatted public settings for the extension.
     */
    private Object settings;

    /*
     * Protected settings (may contain secrets).
     */
    private Object protectedSettings;

    /*
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version
     * available.
     */
    private Boolean enableAutomaticUpgrade;

    /**
     * Creates an instance of ExtensionParameters class.
     */
    public ExtensionParameters() {
    }

    /**
     * Get the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     * 
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     * 
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     * 
     * @param publisher the publisher value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @param type the type value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler. Latest version would be used if
     * not specified.
     * 
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler. Latest version would be used if
     * not specified.
     * 
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     * 
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     * 
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     * 
     * @return the settings value.
     */
    public Object settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     * 
     * @param settings the settings value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withSettings(Object settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: Protected settings (may contain secrets).
     * 
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: Protected settings (may contain secrets).
     * 
     * @param protectedSettings the protectedSettings value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version available.
     * 
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }

    /**
     * Set the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version available.
     * 
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the ExtensionParameters object itself.
     */
    public ExtensionParameters withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
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
        jsonWriter.writeStringField("forceUpdateTag", this.forceUpdateTag);
        jsonWriter.writeStringField("publisher", this.publisher);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("typeHandlerVersion", this.typeHandlerVersion);
        jsonWriter.writeBooleanField("autoUpgradeMinorVersion", this.autoUpgradeMinorVersion);
        jsonWriter.writeUntypedField("settings", this.settings);
        jsonWriter.writeUntypedField("protectedSettings", this.protectedSettings);
        jsonWriter.writeBooleanField("enableAutomaticUpgrade", this.enableAutomaticUpgrade);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtensionParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtensionParameters if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtensionParameters.
     */
    public static ExtensionParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtensionParameters deserializedExtensionParameters = new ExtensionParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("forceUpdateTag".equals(fieldName)) {
                    deserializedExtensionParameters.forceUpdateTag = reader.getString();
                } else if ("publisher".equals(fieldName)) {
                    deserializedExtensionParameters.publisher = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedExtensionParameters.type = reader.getString();
                } else if ("typeHandlerVersion".equals(fieldName)) {
                    deserializedExtensionParameters.typeHandlerVersion = reader.getString();
                } else if ("autoUpgradeMinorVersion".equals(fieldName)) {
                    deserializedExtensionParameters.autoUpgradeMinorVersion
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("settings".equals(fieldName)) {
                    deserializedExtensionParameters.settings = reader.readUntyped();
                } else if ("protectedSettings".equals(fieldName)) {
                    deserializedExtensionParameters.protectedSettings = reader.readUntyped();
                } else if ("enableAutomaticUpgrade".equals(fieldName)) {
                    deserializedExtensionParameters.enableAutomaticUpgrade = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtensionParameters;
        });
    }
}
