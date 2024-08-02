// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Settings properties for Active Directory (AD).
 */
@Fluent
public final class ActiveDirectoryProperties implements JsonSerializable<ActiveDirectoryProperties> {
    /*
     * Specifies the primary domain that the AD DNS server is authoritative for.
     */
    private String domainName;

    /*
     * Specifies the NetBIOS domain name.
     */
    private String netBiosDomainName;

    /*
     * Specifies the Active Directory forest to get.
     */
    private String forestName;

    /*
     * Specifies the domain GUID.
     */
    private String domainGuid;

    /*
     * Specifies the security identifier (SID).
     */
    private String domainSid;

    /*
     * Specifies the security identifier (SID) for Azure Storage.
     */
    private String azureStorageSid;

    /*
     * Specifies the Active Directory SAMAccountName for Azure Storage.
     */
    private String samAccountName;

    /*
     * Specifies the Active Directory account type for Azure Storage.
     */
    private ActiveDirectoryPropertiesAccountType accountType;

    /**
     * Creates an instance of ActiveDirectoryProperties class.
     */
    public ActiveDirectoryProperties() {
    }

    /**
     * Get the domainName property: Specifies the primary domain that the AD DNS server is authoritative for.
     * 
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: Specifies the primary domain that the AD DNS server is authoritative for.
     * 
     * @param domainName the domainName value to set.
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Get the netBiosDomainName property: Specifies the NetBIOS domain name.
     * 
     * @return the netBiosDomainName value.
     */
    public String netBiosDomainName() {
        return this.netBiosDomainName;
    }

    /**
     * Set the netBiosDomainName property: Specifies the NetBIOS domain name.
     * 
     * @param netBiosDomainName the netBiosDomainName value to set.
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withNetBiosDomainName(String netBiosDomainName) {
        this.netBiosDomainName = netBiosDomainName;
        return this;
    }

    /**
     * Get the forestName property: Specifies the Active Directory forest to get.
     * 
     * @return the forestName value.
     */
    public String forestName() {
        return this.forestName;
    }

    /**
     * Set the forestName property: Specifies the Active Directory forest to get.
     * 
     * @param forestName the forestName value to set.
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withForestName(String forestName) {
        this.forestName = forestName;
        return this;
    }

    /**
     * Get the domainGuid property: Specifies the domain GUID.
     * 
     * @return the domainGuid value.
     */
    public String domainGuid() {
        return this.domainGuid;
    }

    /**
     * Set the domainGuid property: Specifies the domain GUID.
     * 
     * @param domainGuid the domainGuid value to set.
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withDomainGuid(String domainGuid) {
        this.domainGuid = domainGuid;
        return this;
    }

    /**
     * Get the domainSid property: Specifies the security identifier (SID).
     * 
     * @return the domainSid value.
     */
    public String domainSid() {
        return this.domainSid;
    }

    /**
     * Set the domainSid property: Specifies the security identifier (SID).
     * 
     * @param domainSid the domainSid value to set.
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withDomainSid(String domainSid) {
        this.domainSid = domainSid;
        return this;
    }

    /**
     * Get the azureStorageSid property: Specifies the security identifier (SID) for Azure Storage.
     * 
     * @return the azureStorageSid value.
     */
    public String azureStorageSid() {
        return this.azureStorageSid;
    }

    /**
     * Set the azureStorageSid property: Specifies the security identifier (SID) for Azure Storage.
     * 
     * @param azureStorageSid the azureStorageSid value to set.
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withAzureStorageSid(String azureStorageSid) {
        this.azureStorageSid = azureStorageSid;
        return this;
    }

    /**
     * Get the samAccountName property: Specifies the Active Directory SAMAccountName for Azure Storage.
     * 
     * @return the samAccountName value.
     */
    public String samAccountName() {
        return this.samAccountName;
    }

    /**
     * Set the samAccountName property: Specifies the Active Directory SAMAccountName for Azure Storage.
     * 
     * @param samAccountName the samAccountName value to set.
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withSamAccountName(String samAccountName) {
        this.samAccountName = samAccountName;
        return this;
    }

    /**
     * Get the accountType property: Specifies the Active Directory account type for Azure Storage.
     * 
     * @return the accountType value.
     */
    public ActiveDirectoryPropertiesAccountType accountType() {
        return this.accountType;
    }

    /**
     * Set the accountType property: Specifies the Active Directory account type for Azure Storage.
     * 
     * @param accountType the accountType value to set.
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withAccountType(ActiveDirectoryPropertiesAccountType accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domainName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property domainName in model ActiveDirectoryProperties"));
        }
        if (domainGuid() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property domainGuid in model ActiveDirectoryProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ActiveDirectoryProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("domainName", this.domainName);
        jsonWriter.writeStringField("domainGuid", this.domainGuid);
        jsonWriter.writeStringField("netBiosDomainName", this.netBiosDomainName);
        jsonWriter.writeStringField("forestName", this.forestName);
        jsonWriter.writeStringField("domainSid", this.domainSid);
        jsonWriter.writeStringField("azureStorageSid", this.azureStorageSid);
        jsonWriter.writeStringField("samAccountName", this.samAccountName);
        jsonWriter.writeStringField("accountType", this.accountType == null ? null : this.accountType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ActiveDirectoryProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ActiveDirectoryProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ActiveDirectoryProperties.
     */
    public static ActiveDirectoryProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ActiveDirectoryProperties deserializedActiveDirectoryProperties = new ActiveDirectoryProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("domainName".equals(fieldName)) {
                    deserializedActiveDirectoryProperties.domainName = reader.getString();
                } else if ("domainGuid".equals(fieldName)) {
                    deserializedActiveDirectoryProperties.domainGuid = reader.getString();
                } else if ("netBiosDomainName".equals(fieldName)) {
                    deserializedActiveDirectoryProperties.netBiosDomainName = reader.getString();
                } else if ("forestName".equals(fieldName)) {
                    deserializedActiveDirectoryProperties.forestName = reader.getString();
                } else if ("domainSid".equals(fieldName)) {
                    deserializedActiveDirectoryProperties.domainSid = reader.getString();
                } else if ("azureStorageSid".equals(fieldName)) {
                    deserializedActiveDirectoryProperties.azureStorageSid = reader.getString();
                } else if ("samAccountName".equals(fieldName)) {
                    deserializedActiveDirectoryProperties.samAccountName = reader.getString();
                } else if ("accountType".equals(fieldName)) {
                    deserializedActiveDirectoryProperties.accountType
                        = ActiveDirectoryPropertiesAccountType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedActiveDirectoryProperties;
        });
    }
}
