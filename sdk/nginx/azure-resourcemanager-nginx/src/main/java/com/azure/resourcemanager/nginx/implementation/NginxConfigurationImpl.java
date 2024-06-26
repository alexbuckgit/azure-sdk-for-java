// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.nginx.fluent.models.NginxConfigurationInner;
import com.azure.resourcemanager.nginx.models.AnalysisCreate;
import com.azure.resourcemanager.nginx.models.AnalysisResult;
import com.azure.resourcemanager.nginx.models.NginxConfiguration;
import com.azure.resourcemanager.nginx.models.NginxConfigurationProperties;

public final class NginxConfigurationImpl
    implements NginxConfiguration, NginxConfiguration.Definition, NginxConfiguration.Update {
    private NginxConfigurationInner innerObject;

    private final com.azure.resourcemanager.nginx.NginxManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public NginxConfigurationProperties properties() {
        return this.innerModel().properties();
    }

    public String location() {
        return this.innerModel().location();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
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

    public NginxConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.nginx.NginxManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String deploymentName;

    private String configurationName;

    public NginxConfigurationImpl withExistingNginxDeployment(String resourceGroupName, String deploymentName) {
        this.resourceGroupName = resourceGroupName;
        this.deploymentName = deploymentName;
        return this;
    }

    public NginxConfiguration create() {
        this.innerObject = serviceManager.serviceClient()
            .getConfigurations()
            .createOrUpdate(resourceGroupName, deploymentName, configurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public NginxConfiguration create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getConfigurations()
            .createOrUpdate(resourceGroupName, deploymentName, configurationName, this.innerModel(), context);
        return this;
    }

    NginxConfigurationImpl(String name, com.azure.resourcemanager.nginx.NginxManager serviceManager) {
        this.innerObject = new NginxConfigurationInner();
        this.serviceManager = serviceManager;
        this.configurationName = name;
    }

    public NginxConfigurationImpl update() {
        return this;
    }

    public NginxConfiguration apply() {
        this.innerObject = serviceManager.serviceClient()
            .getConfigurations()
            .createOrUpdate(resourceGroupName, deploymentName, configurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public NginxConfiguration apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getConfigurations()
            .createOrUpdate(resourceGroupName, deploymentName, configurationName, this.innerModel(), context);
        return this;
    }

    NginxConfigurationImpl(NginxConfigurationInner innerObject,
        com.azure.resourcemanager.nginx.NginxManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.deploymentName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "nginxDeployments");
        this.configurationName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "configurations");
    }

    public NginxConfiguration refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getConfigurations()
            .getWithResponse(resourceGroupName, deploymentName, configurationName, Context.NONE)
            .getValue();
        return this;
    }

    public NginxConfiguration refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getConfigurations()
            .getWithResponse(resourceGroupName, deploymentName, configurationName, context)
            .getValue();
        return this;
    }

    public Response<AnalysisResult> analysisWithResponse(AnalysisCreate body, Context context) {
        return serviceManager.configurations()
            .analysisWithResponse(resourceGroupName, deploymentName, configurationName, body, context);
    }

    public AnalysisResult analysis() {
        return serviceManager.configurations().analysis(resourceGroupName, deploymentName, configurationName);
    }

    public NginxConfigurationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NginxConfigurationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NginxConfigurationImpl withProperties(NginxConfigurationProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
