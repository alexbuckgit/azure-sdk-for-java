// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestackhci.models.AvailabilityType;
import com.azure.resourcemanager.azurestackhci.models.HealthState;
import com.azure.resourcemanager.azurestackhci.models.PackageVersionInfo;
import com.azure.resourcemanager.azurestackhci.models.PrecheckResult;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import com.azure.resourcemanager.azurestackhci.models.RebootRequirement;
import com.azure.resourcemanager.azurestackhci.models.State;
import com.azure.resourcemanager.azurestackhci.models.UpdatePrerequisite;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Details of a singular Update in HCI Cluster.
 */
@Fluent
public final class UpdateProperties implements JsonSerializable<UpdateProperties> {
    /*
     * Provisioning state of the Updates proxy resource.
     */
    private ProvisioningState provisioningState;

    /*
     * Date that the update was installed.
     */
    private OffsetDateTime installedDate;

    /*
     * Description of the update.
     */
    private String description;

    /*
     * Minimum Sbe Version of the update.
     */
    private String minSbeVersionRequired;

    /*
     * State of the update as it relates to this stamp.
     */
    private State state;

    /*
     * If update State is HasPrerequisite, this property contains an array of objects describing prerequisite updates
     * before installing this update. Otherwise, it is empty.
     */
    private List<UpdatePrerequisite> prerequisites;

    /*
     * An array of component versions for a Solution Bundle update, and an empty array otherwise.
     */
    private List<PackageVersionInfo> componentVersions;

    /*
     * The rebootRequired property.
     */
    private RebootRequirement rebootRequired;

    /*
     * Overall health state for update-specific health checks.
     */
    private HealthState healthState;

    /*
     * An array of PrecheckResult objects.
     */
    private List<PrecheckResult> healthCheckResult;

    /*
     * Last time the package-specific checks were run.
     */
    private OffsetDateTime healthCheckDate;

    /*
     * Path where the update package is available.
     */
    private String packagePath;

    /*
     * Size of the package. This value is a combination of the size from update metadata and size of the payload that
     * results from the live scan operation for OS update content.
     */
    private Float packageSizeInMb;

    /*
     * Display name of the Update
     */
    private String displayName;

    /*
     * Version of the update.
     */
    private String version;

    /*
     * Publisher of the update package.
     */
    private String publisher;

    /*
     * Link to release notes for the update.
     */
    private String releaseLink;

    /*
     * Indicates the way the update content can be downloaded.
     */
    private AvailabilityType availabilityType;

    /*
     * Customer-visible type of the update.
     */
    private String packageType;

    /*
     * Extensible KV pairs serialized as a string. This is currently used to report the stamp OEM family and hardware
     * model information when an update is flagged as Invalid for the stamp based on OEM type.
     */
    private String additionalProperties;

    /*
     * Additional information regarding the state of the update. See definition of UpdateStateProperties type below for
     * more details on this property.
     */
    private UpdateStateProperties innerUpdateStateProperties;

    /**
     * Creates an instance of UpdateProperties class.
     */
    public UpdateProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the Updates proxy resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the installedDate property: Date that the update was installed.
     * 
     * @return the installedDate value.
     */
    public OffsetDateTime installedDate() {
        return this.installedDate;
    }

    /**
     * Set the installedDate property: Date that the update was installed.
     * 
     * @param installedDate the installedDate value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withInstalledDate(OffsetDateTime installedDate) {
        this.installedDate = installedDate;
        return this;
    }

    /**
     * Get the description property: Description of the update.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the update.
     * 
     * @param description the description value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the minSbeVersionRequired property: Minimum Sbe Version of the update.
     * 
     * @return the minSbeVersionRequired value.
     */
    public String minSbeVersionRequired() {
        return this.minSbeVersionRequired;
    }

    /**
     * Set the minSbeVersionRequired property: Minimum Sbe Version of the update.
     * 
     * @param minSbeVersionRequired the minSbeVersionRequired value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withMinSbeVersionRequired(String minSbeVersionRequired) {
        this.minSbeVersionRequired = minSbeVersionRequired;
        return this;
    }

    /**
     * Get the state property: State of the update as it relates to this stamp.
     * 
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Set the state property: State of the update as it relates to this stamp.
     * 
     * @param state the state value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * Get the prerequisites property: If update State is HasPrerequisite, this property contains an array of objects
     * describing prerequisite updates before installing this update. Otherwise, it is empty.
     * 
     * @return the prerequisites value.
     */
    public List<UpdatePrerequisite> prerequisites() {
        return this.prerequisites;
    }

    /**
     * Set the prerequisites property: If update State is HasPrerequisite, this property contains an array of objects
     * describing prerequisite updates before installing this update. Otherwise, it is empty.
     * 
     * @param prerequisites the prerequisites value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withPrerequisites(List<UpdatePrerequisite> prerequisites) {
        this.prerequisites = prerequisites;
        return this;
    }

    /**
     * Get the componentVersions property: An array of component versions for a Solution Bundle update, and an empty
     * array otherwise.
     * 
     * @return the componentVersions value.
     */
    public List<PackageVersionInfo> componentVersions() {
        return this.componentVersions;
    }

    /**
     * Set the componentVersions property: An array of component versions for a Solution Bundle update, and an empty
     * array otherwise.
     * 
     * @param componentVersions the componentVersions value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withComponentVersions(List<PackageVersionInfo> componentVersions) {
        this.componentVersions = componentVersions;
        return this;
    }

    /**
     * Get the rebootRequired property: The rebootRequired property.
     * 
     * @return the rebootRequired value.
     */
    public RebootRequirement rebootRequired() {
        return this.rebootRequired;
    }

    /**
     * Set the rebootRequired property: The rebootRequired property.
     * 
     * @param rebootRequired the rebootRequired value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withRebootRequired(RebootRequirement rebootRequired) {
        this.rebootRequired = rebootRequired;
        return this;
    }

    /**
     * Get the healthState property: Overall health state for update-specific health checks.
     * 
     * @return the healthState value.
     */
    public HealthState healthState() {
        return this.healthState;
    }

    /**
     * Set the healthState property: Overall health state for update-specific health checks.
     * 
     * @param healthState the healthState value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }

    /**
     * Get the healthCheckResult property: An array of PrecheckResult objects.
     * 
     * @return the healthCheckResult value.
     */
    public List<PrecheckResult> healthCheckResult() {
        return this.healthCheckResult;
    }

    /**
     * Set the healthCheckResult property: An array of PrecheckResult objects.
     * 
     * @param healthCheckResult the healthCheckResult value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withHealthCheckResult(List<PrecheckResult> healthCheckResult) {
        this.healthCheckResult = healthCheckResult;
        return this;
    }

    /**
     * Get the healthCheckDate property: Last time the package-specific checks were run.
     * 
     * @return the healthCheckDate value.
     */
    public OffsetDateTime healthCheckDate() {
        return this.healthCheckDate;
    }

    /**
     * Set the healthCheckDate property: Last time the package-specific checks were run.
     * 
     * @param healthCheckDate the healthCheckDate value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withHealthCheckDate(OffsetDateTime healthCheckDate) {
        this.healthCheckDate = healthCheckDate;
        return this;
    }

    /**
     * Get the packagePath property: Path where the update package is available.
     * 
     * @return the packagePath value.
     */
    public String packagePath() {
        return this.packagePath;
    }

    /**
     * Set the packagePath property: Path where the update package is available.
     * 
     * @param packagePath the packagePath value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }

    /**
     * Get the packageSizeInMb property: Size of the package. This value is a combination of the size from update
     * metadata and size of the payload that results from the live scan operation for OS update content.
     * 
     * @return the packageSizeInMb value.
     */
    public Float packageSizeInMb() {
        return this.packageSizeInMb;
    }

    /**
     * Set the packageSizeInMb property: Size of the package. This value is a combination of the size from update
     * metadata and size of the payload that results from the live scan operation for OS update content.
     * 
     * @param packageSizeInMb the packageSizeInMb value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withPackageSizeInMb(Float packageSizeInMb) {
        this.packageSizeInMb = packageSizeInMb;
        return this;
    }

    /**
     * Get the displayName property: Display name of the Update.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the Update.
     * 
     * @param displayName the displayName value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the version property: Version of the update.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the update.
     * 
     * @param version the version value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the publisher property: Publisher of the update package.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: Publisher of the update package.
     * 
     * @param publisher the publisher value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the releaseLink property: Link to release notes for the update.
     * 
     * @return the releaseLink value.
     */
    public String releaseLink() {
        return this.releaseLink;
    }

    /**
     * Set the releaseLink property: Link to release notes for the update.
     * 
     * @param releaseLink the releaseLink value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withReleaseLink(String releaseLink) {
        this.releaseLink = releaseLink;
        return this;
    }

    /**
     * Get the availabilityType property: Indicates the way the update content can be downloaded.
     * 
     * @return the availabilityType value.
     */
    public AvailabilityType availabilityType() {
        return this.availabilityType;
    }

    /**
     * Set the availabilityType property: Indicates the way the update content can be downloaded.
     * 
     * @param availabilityType the availabilityType value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withAvailabilityType(AvailabilityType availabilityType) {
        this.availabilityType = availabilityType;
        return this;
    }

    /**
     * Get the packageType property: Customer-visible type of the update.
     * 
     * @return the packageType value.
     */
    public String packageType() {
        return this.packageType;
    }

    /**
     * Set the packageType property: Customer-visible type of the update.
     * 
     * @param packageType the packageType value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * Get the additionalProperties property: Extensible KV pairs serialized as a string. This is currently used to
     * report the stamp OEM family and hardware model information when an update is flagged as Invalid for the stamp
     * based on OEM type.
     * 
     * @return the additionalProperties value.
     */
    public String additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Extensible KV pairs serialized as a string. This is currently used to
     * report the stamp OEM family and hardware model information when an update is flagged as Invalid for the stamp
     * based on OEM type.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withAdditionalProperties(String additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the innerUpdateStateProperties property: Additional information regarding the state of the update. See
     * definition of UpdateStateProperties type below for more details on this property.
     * 
     * @return the innerUpdateStateProperties value.
     */
    private UpdateStateProperties innerUpdateStateProperties() {
        return this.innerUpdateStateProperties;
    }

    /**
     * Get the progressPercentage property: Progress percentage of ongoing operation. Currently this property is only
     * valid when the update is in the Downloading state, where it maps to how much of the update content has been
     * downloaded.
     * 
     * @return the progressPercentage value.
     */
    public Float progressPercentage() {
        return this.innerUpdateStateProperties() == null
            ? null
            : this.innerUpdateStateProperties().progressPercentage();
    }

    /**
     * Set the progressPercentage property: Progress percentage of ongoing operation. Currently this property is only
     * valid when the update is in the Downloading state, where it maps to how much of the update content has been
     * downloaded.
     * 
     * @param progressPercentage the progressPercentage value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withProgressPercentage(Float progressPercentage) {
        if (this.innerUpdateStateProperties() == null) {
            this.innerUpdateStateProperties = new UpdateStateProperties();
        }
        this.innerUpdateStateProperties().withProgressPercentage(progressPercentage);
        return this;
    }

    /**
     * Get the notifyMessage property: Brief message with instructions for updates of AvailabilityType Notify.
     * 
     * @return the notifyMessage value.
     */
    public String notifyMessage() {
        return this.innerUpdateStateProperties() == null ? null : this.innerUpdateStateProperties().notifyMessage();
    }

    /**
     * Set the notifyMessage property: Brief message with instructions for updates of AvailabilityType Notify.
     * 
     * @param notifyMessage the notifyMessage value to set.
     * @return the UpdateProperties object itself.
     */
    public UpdateProperties withNotifyMessage(String notifyMessage) {
        if (this.innerUpdateStateProperties() == null) {
            this.innerUpdateStateProperties = new UpdateStateProperties();
        }
        this.innerUpdateStateProperties().withNotifyMessage(notifyMessage);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (prerequisites() != null) {
            prerequisites().forEach(e -> e.validate());
        }
        if (componentVersions() != null) {
            componentVersions().forEach(e -> e.validate());
        }
        if (healthCheckResult() != null) {
            healthCheckResult().forEach(e -> e.validate());
        }
        if (innerUpdateStateProperties() != null) {
            innerUpdateStateProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("installedDate",
            this.installedDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.installedDate));
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("minSbeVersionRequired", this.minSbeVersionRequired);
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeArrayField("prerequisites", this.prerequisites, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("componentVersions", this.componentVersions,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("rebootRequired",
            this.rebootRequired == null ? null : this.rebootRequired.toString());
        jsonWriter.writeStringField("healthState", this.healthState == null ? null : this.healthState.toString());
        jsonWriter.writeArrayField("healthCheckResult", this.healthCheckResult,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("healthCheckDate",
            this.healthCheckDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.healthCheckDate));
        jsonWriter.writeStringField("packagePath", this.packagePath);
        jsonWriter.writeNumberField("packageSizeInMb", this.packageSizeInMb);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("version", this.version);
        jsonWriter.writeStringField("publisher", this.publisher);
        jsonWriter.writeStringField("releaseLink", this.releaseLink);
        jsonWriter.writeStringField("availabilityType",
            this.availabilityType == null ? null : this.availabilityType.toString());
        jsonWriter.writeStringField("packageType", this.packageType);
        jsonWriter.writeStringField("additionalProperties", this.additionalProperties);
        jsonWriter.writeJsonField("updateStateProperties", this.innerUpdateStateProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UpdateProperties.
     */
    public static UpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateProperties deserializedUpdateProperties = new UpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedUpdateProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else if ("installedDate".equals(fieldName)) {
                    deserializedUpdateProperties.installedDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("description".equals(fieldName)) {
                    deserializedUpdateProperties.description = reader.getString();
                } else if ("minSbeVersionRequired".equals(fieldName)) {
                    deserializedUpdateProperties.minSbeVersionRequired = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedUpdateProperties.state = State.fromString(reader.getString());
                } else if ("prerequisites".equals(fieldName)) {
                    List<UpdatePrerequisite> prerequisites
                        = reader.readArray(reader1 -> UpdatePrerequisite.fromJson(reader1));
                    deserializedUpdateProperties.prerequisites = prerequisites;
                } else if ("componentVersions".equals(fieldName)) {
                    List<PackageVersionInfo> componentVersions
                        = reader.readArray(reader1 -> PackageVersionInfo.fromJson(reader1));
                    deserializedUpdateProperties.componentVersions = componentVersions;
                } else if ("rebootRequired".equals(fieldName)) {
                    deserializedUpdateProperties.rebootRequired = RebootRequirement.fromString(reader.getString());
                } else if ("healthState".equals(fieldName)) {
                    deserializedUpdateProperties.healthState = HealthState.fromString(reader.getString());
                } else if ("healthCheckResult".equals(fieldName)) {
                    List<PrecheckResult> healthCheckResult
                        = reader.readArray(reader1 -> PrecheckResult.fromJson(reader1));
                    deserializedUpdateProperties.healthCheckResult = healthCheckResult;
                } else if ("healthCheckDate".equals(fieldName)) {
                    deserializedUpdateProperties.healthCheckDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("packagePath".equals(fieldName)) {
                    deserializedUpdateProperties.packagePath = reader.getString();
                } else if ("packageSizeInMb".equals(fieldName)) {
                    deserializedUpdateProperties.packageSizeInMb = reader.getNullable(JsonReader::getFloat);
                } else if ("displayName".equals(fieldName)) {
                    deserializedUpdateProperties.displayName = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedUpdateProperties.version = reader.getString();
                } else if ("publisher".equals(fieldName)) {
                    deserializedUpdateProperties.publisher = reader.getString();
                } else if ("releaseLink".equals(fieldName)) {
                    deserializedUpdateProperties.releaseLink = reader.getString();
                } else if ("availabilityType".equals(fieldName)) {
                    deserializedUpdateProperties.availabilityType = AvailabilityType.fromString(reader.getString());
                } else if ("packageType".equals(fieldName)) {
                    deserializedUpdateProperties.packageType = reader.getString();
                } else if ("additionalProperties".equals(fieldName)) {
                    deserializedUpdateProperties.additionalProperties = reader.getString();
                } else if ("updateStateProperties".equals(fieldName)) {
                    deserializedUpdateProperties.innerUpdateStateProperties = UpdateStateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateProperties;
        });
    }
}
