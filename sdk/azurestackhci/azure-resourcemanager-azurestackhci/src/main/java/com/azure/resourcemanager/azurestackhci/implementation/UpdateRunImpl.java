// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.Step;
import com.azure.resourcemanager.azurestackhci.fluent.models.UpdateRunInner;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import com.azure.resourcemanager.azurestackhci.models.UpdateRun;
import com.azure.resourcemanager.azurestackhci.models.UpdateRunPropertiesState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class UpdateRunImpl implements UpdateRun, UpdateRun.Definition, UpdateRun.Update {
    private UpdateRunInner innerObject;

    private final com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime timeStarted() {
        return this.innerModel().timeStarted();
    }

    public OffsetDateTime lastUpdatedTime() {
        return this.innerModel().lastUpdatedTime();
    }

    public String duration() {
        return this.innerModel().duration();
    }

    public UpdateRunPropertiesState state() {
        return this.innerModel().state();
    }

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String errorMessage() {
        return this.innerModel().errorMessage();
    }

    public String status() {
        return this.innerModel().status();
    }

    public OffsetDateTime startTimeUtc() {
        return this.innerModel().startTimeUtc();
    }

    public OffsetDateTime endTimeUtc() {
        return this.innerModel().endTimeUtc();
    }

    public OffsetDateTime lastUpdatedTimeUtc() {
        return this.innerModel().lastUpdatedTimeUtc();
    }

    public String expectedExecutionTime() {
        return this.innerModel().expectedExecutionTime();
    }

    public List<Step> steps() {
        List<Step> inner = this.innerModel().steps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public UpdateRunInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String updateName;

    private String updateRunName;

    public UpdateRunImpl withExistingUpdate(String resourceGroupName, String clusterName, String updateName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        this.updateName = updateName;
        return this;
    }

    public UpdateRun create() {
        this.innerObject = serviceManager.serviceClient()
            .getUpdateRuns()
            .putWithResponse(resourceGroupName, clusterName, updateName, updateRunName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public UpdateRun create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getUpdateRuns()
            .putWithResponse(resourceGroupName, clusterName, updateName, updateRunName, this.innerModel(), context)
            .getValue();
        return this;
    }

    UpdateRunImpl(String name, com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager) {
        this.innerObject = new UpdateRunInner();
        this.serviceManager = serviceManager;
        this.updateRunName = name;
    }

    public UpdateRunImpl update() {
        return this;
    }

    public UpdateRun apply() {
        this.innerObject = serviceManager.serviceClient()
            .getUpdateRuns()
            .putWithResponse(resourceGroupName, clusterName, updateName, updateRunName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public UpdateRun apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getUpdateRuns()
            .putWithResponse(resourceGroupName, clusterName, updateName, updateRunName, this.innerModel(), context)
            .getValue();
        return this;
    }

    UpdateRunImpl(UpdateRunInner innerObject,
        com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "clusters");
        this.updateName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "updates");
        this.updateRunName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "updateRuns");
    }

    public UpdateRun refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getUpdateRuns()
            .getWithResponse(resourceGroupName, clusterName, updateName, updateRunName, Context.NONE)
            .getValue();
        return this;
    }

    public UpdateRun refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getUpdateRuns()
            .getWithResponse(resourceGroupName, clusterName, updateName, updateRunName, context)
            .getValue();
        return this;
    }

    public UpdateRunImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public UpdateRunImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public UpdateRunImpl withTimeStarted(OffsetDateTime timeStarted) {
        this.innerModel().withTimeStarted(timeStarted);
        return this;
    }

    public UpdateRunImpl withLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
        this.innerModel().withLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    public UpdateRunImpl withDuration(String duration) {
        this.innerModel().withDuration(duration);
        return this;
    }

    public UpdateRunImpl withState(UpdateRunPropertiesState state) {
        this.innerModel().withState(state);
        return this;
    }

    public UpdateRunImpl withNamePropertiesName(String namePropertiesName) {
        this.innerModel().withNamePropertiesName(namePropertiesName);
        return this;
    }

    public UpdateRunImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public UpdateRunImpl withErrorMessage(String errorMessage) {
        this.innerModel().withErrorMessage(errorMessage);
        return this;
    }

    public UpdateRunImpl withStatus(String status) {
        this.innerModel().withStatus(status);
        return this;
    }

    public UpdateRunImpl withStartTimeUtc(OffsetDateTime startTimeUtc) {
        this.innerModel().withStartTimeUtc(startTimeUtc);
        return this;
    }

    public UpdateRunImpl withEndTimeUtc(OffsetDateTime endTimeUtc) {
        this.innerModel().withEndTimeUtc(endTimeUtc);
        return this;
    }

    public UpdateRunImpl withLastUpdatedTimeUtc(OffsetDateTime lastUpdatedTimeUtc) {
        this.innerModel().withLastUpdatedTimeUtc(lastUpdatedTimeUtc);
        return this;
    }

    public UpdateRunImpl withExpectedExecutionTime(String expectedExecutionTime) {
        this.innerModel().withExpectedExecutionTime(expectedExecutionTime);
        return this;
    }

    public UpdateRunImpl withSteps(List<Step> steps) {
        this.innerModel().withSteps(steps);
        return this;
    }
}
