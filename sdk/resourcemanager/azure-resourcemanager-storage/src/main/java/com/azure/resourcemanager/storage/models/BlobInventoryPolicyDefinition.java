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
import java.util.List;

/**
 * An object that defines the blob inventory rule.
 */
@Fluent
public final class BlobInventoryPolicyDefinition implements JsonSerializable<BlobInventoryPolicyDefinition> {
    /*
     * An object that defines the filter set.
     */
    private BlobInventoryPolicyFilter filters;

    /*
     * This is a required field, it specifies the format for the inventory files.
     */
    private Format format;

    /*
     * This is a required field. This field is used to schedule an inventory formation.
     */
    private Schedule schedule;

    /*
     * This is a required field. This field specifies the scope of the inventory created either at the blob or container
     * level.
     */
    private ObjectType objectType;

    /*
     * This is a required field. This field specifies the fields and properties of the object to be included in the
     * inventory. The Schema field value 'Name' is always required. The valid values for this field for the 'Blob'
     * definition.objectType include 'Name, Creation-Time, Last-Modified, Content-Length, Content-MD5, BlobType,
     * AccessTier, AccessTierChangeTime, AccessTierInferred, Tags, Expiry-Time, hdi_isfolder, Owner, Group, Permissions,
     * Acl, Snapshot, VersionId, IsCurrentVersion, Metadata, LastAccessTime, Tags, Etag, ContentType, ContentEncoding,
     * ContentLanguage, ContentCRC64, CacheControl, ContentDisposition, LeaseStatus, LeaseState, LeaseDuration,
     * ServerEncrypted, Deleted, DeletionId, DeletedTime, RemainingRetentionDays, ImmutabilityPolicyUntilDate,
     * ImmutabilityPolicyMode, LegalHold, CopyId, CopyStatus, CopySource, CopyProgress, CopyCompletionTime,
     * CopyStatusDescription, CustomerProvidedKeySha256, RehydratePriority, ArchiveStatus, XmsBlobSequenceNumber,
     * EncryptionScope, IncrementalCopy, TagCount'. For Blob object type schema field value 'DeletedTime' is applicable
     * only for Hns enabled accounts. The valid values for 'Container' definition.objectType include 'Name,
     * Last-Modified, Metadata, LeaseStatus, LeaseState, LeaseDuration, PublicAccess, HasImmutabilityPolicy,
     * HasLegalHold, Etag, DefaultEncryptionScope, DenyEncryptionScopeOverride, ImmutableStorageWithVersioningEnabled,
     * Deleted, Version, DeletedTime, RemainingRetentionDays'. Schema field values 'Expiry-Time, hdi_isfolder, Owner,
     * Group, Permissions, Acl, DeletionId' are valid only for Hns enabled accounts.Schema field values 'Tags, TagCount'
     * are only valid for Non-Hns accounts.
     */
    private List<String> schemaFields;

    /**
     * Creates an instance of BlobInventoryPolicyDefinition class.
     */
    public BlobInventoryPolicyDefinition() {
    }

    /**
     * Get the filters property: An object that defines the filter set.
     * 
     * @return the filters value.
     */
    public BlobInventoryPolicyFilter filters() {
        return this.filters;
    }

    /**
     * Set the filters property: An object that defines the filter set.
     * 
     * @param filters the filters value to set.
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withFilters(BlobInventoryPolicyFilter filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the format property: This is a required field, it specifies the format for the inventory files.
     * 
     * @return the format value.
     */
    public Format format() {
        return this.format;
    }

    /**
     * Set the format property: This is a required field, it specifies the format for the inventory files.
     * 
     * @param format the format value to set.
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withFormat(Format format) {
        this.format = format;
        return this;
    }

    /**
     * Get the schedule property: This is a required field. This field is used to schedule an inventory formation.
     * 
     * @return the schedule value.
     */
    public Schedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: This is a required field. This field is used to schedule an inventory formation.
     * 
     * @param schedule the schedule value to set.
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the objectType property: This is a required field. This field specifies the scope of the inventory created
     * either at the blob or container level.
     * 
     * @return the objectType value.
     */
    public ObjectType objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: This is a required field. This field specifies the scope of the inventory created
     * either at the blob or container level.
     * 
     * @param objectType the objectType value to set.
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withObjectType(ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the schemaFields property: This is a required field. This field specifies the fields and properties of the
     * object to be included in the inventory. The Schema field value 'Name' is always required. The valid values for
     * this field for the 'Blob' definition.objectType include 'Name, Creation-Time, Last-Modified, Content-Length,
     * Content-MD5, BlobType, AccessTier, AccessTierChangeTime, AccessTierInferred, Tags, Expiry-Time, hdi_isfolder,
     * Owner, Group, Permissions, Acl, Snapshot, VersionId, IsCurrentVersion, Metadata, LastAccessTime, Tags, Etag,
     * ContentType, ContentEncoding, ContentLanguage, ContentCRC64, CacheControl, ContentDisposition, LeaseStatus,
     * LeaseState, LeaseDuration, ServerEncrypted, Deleted, DeletionId, DeletedTime, RemainingRetentionDays,
     * ImmutabilityPolicyUntilDate, ImmutabilityPolicyMode, LegalHold, CopyId, CopyStatus, CopySource, CopyProgress,
     * CopyCompletionTime, CopyStatusDescription, CustomerProvidedKeySha256, RehydratePriority, ArchiveStatus,
     * XmsBlobSequenceNumber, EncryptionScope, IncrementalCopy, TagCount'. For Blob object type schema field value
     * 'DeletedTime' is applicable only for Hns enabled accounts. The valid values for 'Container' definition.objectType
     * include 'Name, Last-Modified, Metadata, LeaseStatus, LeaseState, LeaseDuration, PublicAccess,
     * HasImmutabilityPolicy, HasLegalHold, Etag, DefaultEncryptionScope, DenyEncryptionScopeOverride,
     * ImmutableStorageWithVersioningEnabled, Deleted, Version, DeletedTime, RemainingRetentionDays'. Schema field
     * values 'Expiry-Time, hdi_isfolder, Owner, Group, Permissions, Acl, DeletionId' are valid only for Hns enabled
     * accounts.Schema field values 'Tags, TagCount' are only valid for Non-Hns accounts.
     * 
     * @return the schemaFields value.
     */
    public List<String> schemaFields() {
        return this.schemaFields;
    }

    /**
     * Set the schemaFields property: This is a required field. This field specifies the fields and properties of the
     * object to be included in the inventory. The Schema field value 'Name' is always required. The valid values for
     * this field for the 'Blob' definition.objectType include 'Name, Creation-Time, Last-Modified, Content-Length,
     * Content-MD5, BlobType, AccessTier, AccessTierChangeTime, AccessTierInferred, Tags, Expiry-Time, hdi_isfolder,
     * Owner, Group, Permissions, Acl, Snapshot, VersionId, IsCurrentVersion, Metadata, LastAccessTime, Tags, Etag,
     * ContentType, ContentEncoding, ContentLanguage, ContentCRC64, CacheControl, ContentDisposition, LeaseStatus,
     * LeaseState, LeaseDuration, ServerEncrypted, Deleted, DeletionId, DeletedTime, RemainingRetentionDays,
     * ImmutabilityPolicyUntilDate, ImmutabilityPolicyMode, LegalHold, CopyId, CopyStatus, CopySource, CopyProgress,
     * CopyCompletionTime, CopyStatusDescription, CustomerProvidedKeySha256, RehydratePriority, ArchiveStatus,
     * XmsBlobSequenceNumber, EncryptionScope, IncrementalCopy, TagCount'. For Blob object type schema field value
     * 'DeletedTime' is applicable only for Hns enabled accounts. The valid values for 'Container' definition.objectType
     * include 'Name, Last-Modified, Metadata, LeaseStatus, LeaseState, LeaseDuration, PublicAccess,
     * HasImmutabilityPolicy, HasLegalHold, Etag, DefaultEncryptionScope, DenyEncryptionScopeOverride,
     * ImmutableStorageWithVersioningEnabled, Deleted, Version, DeletedTime, RemainingRetentionDays'. Schema field
     * values 'Expiry-Time, hdi_isfolder, Owner, Group, Permissions, Acl, DeletionId' are valid only for Hns enabled
     * accounts.Schema field values 'Tags, TagCount' are only valid for Non-Hns accounts.
     * 
     * @param schemaFields the schemaFields value to set.
     * @return the BlobInventoryPolicyDefinition object itself.
     */
    public BlobInventoryPolicyDefinition withSchemaFields(List<String> schemaFields) {
        this.schemaFields = schemaFields;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filters() != null) {
            filters().validate();
        }
        if (format() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property format in model BlobInventoryPolicyDefinition"));
        }
        if (schedule() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property schedule in model BlobInventoryPolicyDefinition"));
        }
        if (objectType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property objectType in model BlobInventoryPolicyDefinition"));
        }
        if (schemaFields() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property schemaFields in model BlobInventoryPolicyDefinition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobInventoryPolicyDefinition.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("format", this.format == null ? null : this.format.toString());
        jsonWriter.writeStringField("schedule", this.schedule == null ? null : this.schedule.toString());
        jsonWriter.writeStringField("objectType", this.objectType == null ? null : this.objectType.toString());
        jsonWriter.writeArrayField("schemaFields", this.schemaFields, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("filters", this.filters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BlobInventoryPolicyDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BlobInventoryPolicyDefinition if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BlobInventoryPolicyDefinition.
     */
    public static BlobInventoryPolicyDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BlobInventoryPolicyDefinition deserializedBlobInventoryPolicyDefinition
                = new BlobInventoryPolicyDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("format".equals(fieldName)) {
                    deserializedBlobInventoryPolicyDefinition.format = Format.fromString(reader.getString());
                } else if ("schedule".equals(fieldName)) {
                    deserializedBlobInventoryPolicyDefinition.schedule = Schedule.fromString(reader.getString());
                } else if ("objectType".equals(fieldName)) {
                    deserializedBlobInventoryPolicyDefinition.objectType = ObjectType.fromString(reader.getString());
                } else if ("schemaFields".equals(fieldName)) {
                    List<String> schemaFields = reader.readArray(reader1 -> reader1.getString());
                    deserializedBlobInventoryPolicyDefinition.schemaFields = schemaFields;
                } else if ("filters".equals(fieldName)) {
                    deserializedBlobInventoryPolicyDefinition.filters = BlobInventoryPolicyFilter.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBlobInventoryPolicyDefinition;
        });
    }
}
