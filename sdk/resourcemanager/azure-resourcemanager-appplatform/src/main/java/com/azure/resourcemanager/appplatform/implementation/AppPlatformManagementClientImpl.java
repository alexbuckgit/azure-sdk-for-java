// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.appplatform.fluent.ApiPortalCustomDomainsClient;
import com.azure.resourcemanager.appplatform.fluent.ApiPortalsClient;
import com.azure.resourcemanager.appplatform.fluent.ApmsClient;
import com.azure.resourcemanager.appplatform.fluent.ApplicationAcceleratorsClient;
import com.azure.resourcemanager.appplatform.fluent.ApplicationLiveViewsClient;
import com.azure.resourcemanager.appplatform.fluent.AppPlatformManagementClient;
import com.azure.resourcemanager.appplatform.fluent.AppsClient;
import com.azure.resourcemanager.appplatform.fluent.BindingsClient;
import com.azure.resourcemanager.appplatform.fluent.BuildpackBindingsClient;
import com.azure.resourcemanager.appplatform.fluent.BuildServiceAgentPoolsClient;
import com.azure.resourcemanager.appplatform.fluent.BuildServiceBuildersClient;
import com.azure.resourcemanager.appplatform.fluent.BuildServicesClient;
import com.azure.resourcemanager.appplatform.fluent.CertificatesClient;
import com.azure.resourcemanager.appplatform.fluent.ConfigServersClient;
import com.azure.resourcemanager.appplatform.fluent.ConfigurationServicesClient;
import com.azure.resourcemanager.appplatform.fluent.ContainerRegistriesClient;
import com.azure.resourcemanager.appplatform.fluent.CustomDomainsClient;
import com.azure.resourcemanager.appplatform.fluent.CustomizedAcceleratorsClient;
import com.azure.resourcemanager.appplatform.fluent.DeploymentsClient;
import com.azure.resourcemanager.appplatform.fluent.DevToolPortalsClient;
import com.azure.resourcemanager.appplatform.fluent.GatewayCustomDomainsClient;
import com.azure.resourcemanager.appplatform.fluent.GatewayRouteConfigsClient;
import com.azure.resourcemanager.appplatform.fluent.GatewaysClient;
import com.azure.resourcemanager.appplatform.fluent.MonitoringSettingsClient;
import com.azure.resourcemanager.appplatform.fluent.OperationsClient;
import com.azure.resourcemanager.appplatform.fluent.PredefinedAcceleratorsClient;
import com.azure.resourcemanager.appplatform.fluent.RuntimeVersionsClient;
import com.azure.resourcemanager.appplatform.fluent.ServiceRegistriesClient;
import com.azure.resourcemanager.appplatform.fluent.ServicesClient;
import com.azure.resourcemanager.appplatform.fluent.SkusClient;
import com.azure.resourcemanager.appplatform.fluent.StoragesClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/**
 * Initializes a new instance of the AppPlatformManagementClientImpl type.
 */
@ServiceClient(builder = AppPlatformManagementClientBuilder.class)
public final class AppPlatformManagementClientImpl extends AzureServiceClient implements AppPlatformManagementClient {
    /**
     * Gets subscription ID which uniquely identify the Microsoft Azure subscription. The subscription ID forms part of
     * the URI for every service call.
     */
    private final String subscriptionId;

    /**
     * Gets Gets subscription ID which uniquely identify the Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The ServicesClient object to access its operations.
     */
    private final ServicesClient services;

    /**
     * Gets the ServicesClient object to access its operations.
     * 
     * @return the ServicesClient object.
     */
    public ServicesClient getServices() {
        return this.services;
    }

    /**
     * The ApmsClient object to access its operations.
     */
    private final ApmsClient apms;

    /**
     * Gets the ApmsClient object to access its operations.
     * 
     * @return the ApmsClient object.
     */
    public ApmsClient getApms() {
        return this.apms;
    }

    /**
     * The ConfigServersClient object to access its operations.
     */
    private final ConfigServersClient configServers;

    /**
     * Gets the ConfigServersClient object to access its operations.
     * 
     * @return the ConfigServersClient object.
     */
    public ConfigServersClient getConfigServers() {
        return this.configServers;
    }

    /**
     * The ConfigurationServicesClient object to access its operations.
     */
    private final ConfigurationServicesClient configurationServices;

    /**
     * Gets the ConfigurationServicesClient object to access its operations.
     * 
     * @return the ConfigurationServicesClient object.
     */
    public ConfigurationServicesClient getConfigurationServices() {
        return this.configurationServices;
    }

    /**
     * The ServiceRegistriesClient object to access its operations.
     */
    private final ServiceRegistriesClient serviceRegistries;

    /**
     * Gets the ServiceRegistriesClient object to access its operations.
     * 
     * @return the ServiceRegistriesClient object.
     */
    public ServiceRegistriesClient getServiceRegistries() {
        return this.serviceRegistries;
    }

    /**
     * The ApplicationLiveViewsClient object to access its operations.
     */
    private final ApplicationLiveViewsClient applicationLiveViews;

    /**
     * Gets the ApplicationLiveViewsClient object to access its operations.
     * 
     * @return the ApplicationLiveViewsClient object.
     */
    public ApplicationLiveViewsClient getApplicationLiveViews() {
        return this.applicationLiveViews;
    }

    /**
     * The DevToolPortalsClient object to access its operations.
     */
    private final DevToolPortalsClient devToolPortals;

    /**
     * Gets the DevToolPortalsClient object to access its operations.
     * 
     * @return the DevToolPortalsClient object.
     */
    public DevToolPortalsClient getDevToolPortals() {
        return this.devToolPortals;
    }

    /**
     * The ContainerRegistriesClient object to access its operations.
     */
    private final ContainerRegistriesClient containerRegistries;

    /**
     * Gets the ContainerRegistriesClient object to access its operations.
     * 
     * @return the ContainerRegistriesClient object.
     */
    public ContainerRegistriesClient getContainerRegistries() {
        return this.containerRegistries;
    }

    /**
     * The BuildServicesClient object to access its operations.
     */
    private final BuildServicesClient buildServices;

    /**
     * Gets the BuildServicesClient object to access its operations.
     * 
     * @return the BuildServicesClient object.
     */
    public BuildServicesClient getBuildServices() {
        return this.buildServices;
    }

    /**
     * The BuildpackBindingsClient object to access its operations.
     */
    private final BuildpackBindingsClient buildpackBindings;

    /**
     * Gets the BuildpackBindingsClient object to access its operations.
     * 
     * @return the BuildpackBindingsClient object.
     */
    public BuildpackBindingsClient getBuildpackBindings() {
        return this.buildpackBindings;
    }

    /**
     * The BuildServiceBuildersClient object to access its operations.
     */
    private final BuildServiceBuildersClient buildServiceBuilders;

    /**
     * Gets the BuildServiceBuildersClient object to access its operations.
     * 
     * @return the BuildServiceBuildersClient object.
     */
    public BuildServiceBuildersClient getBuildServiceBuilders() {
        return this.buildServiceBuilders;
    }

    /**
     * The BuildServiceAgentPoolsClient object to access its operations.
     */
    private final BuildServiceAgentPoolsClient buildServiceAgentPools;

    /**
     * Gets the BuildServiceAgentPoolsClient object to access its operations.
     * 
     * @return the BuildServiceAgentPoolsClient object.
     */
    public BuildServiceAgentPoolsClient getBuildServiceAgentPools() {
        return this.buildServiceAgentPools;
    }

    /**
     * The MonitoringSettingsClient object to access its operations.
     */
    private final MonitoringSettingsClient monitoringSettings;

    /**
     * Gets the MonitoringSettingsClient object to access its operations.
     * 
     * @return the MonitoringSettingsClient object.
     */
    public MonitoringSettingsClient getMonitoringSettings() {
        return this.monitoringSettings;
    }

    /**
     * The AppsClient object to access its operations.
     */
    private final AppsClient apps;

    /**
     * Gets the AppsClient object to access its operations.
     * 
     * @return the AppsClient object.
     */
    public AppsClient getApps() {
        return this.apps;
    }

    /**
     * The BindingsClient object to access its operations.
     */
    private final BindingsClient bindings;

    /**
     * Gets the BindingsClient object to access its operations.
     * 
     * @return the BindingsClient object.
     */
    public BindingsClient getBindings() {
        return this.bindings;
    }

    /**
     * The StoragesClient object to access its operations.
     */
    private final StoragesClient storages;

    /**
     * Gets the StoragesClient object to access its operations.
     * 
     * @return the StoragesClient object.
     */
    public StoragesClient getStorages() {
        return this.storages;
    }

    /**
     * The CertificatesClient object to access its operations.
     */
    private final CertificatesClient certificates;

    /**
     * Gets the CertificatesClient object to access its operations.
     * 
     * @return the CertificatesClient object.
     */
    public CertificatesClient getCertificates() {
        return this.certificates;
    }

    /**
     * The CustomDomainsClient object to access its operations.
     */
    private final CustomDomainsClient customDomains;

    /**
     * Gets the CustomDomainsClient object to access its operations.
     * 
     * @return the CustomDomainsClient object.
     */
    public CustomDomainsClient getCustomDomains() {
        return this.customDomains;
    }

    /**
     * The DeploymentsClient object to access its operations.
     */
    private final DeploymentsClient deployments;

    /**
     * Gets the DeploymentsClient object to access its operations.
     * 
     * @return the DeploymentsClient object.
     */
    public DeploymentsClient getDeployments() {
        return this.deployments;
    }

    /**
     * The OperationsClient object to access its operations.
     */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * The RuntimeVersionsClient object to access its operations.
     */
    private final RuntimeVersionsClient runtimeVersions;

    /**
     * Gets the RuntimeVersionsClient object to access its operations.
     * 
     * @return the RuntimeVersionsClient object.
     */
    public RuntimeVersionsClient getRuntimeVersions() {
        return this.runtimeVersions;
    }

    /**
     * The SkusClient object to access its operations.
     */
    private final SkusClient skus;

    /**
     * Gets the SkusClient object to access its operations.
     * 
     * @return the SkusClient object.
     */
    public SkusClient getSkus() {
        return this.skus;
    }

    /**
     * The GatewaysClient object to access its operations.
     */
    private final GatewaysClient gateways;

    /**
     * Gets the GatewaysClient object to access its operations.
     * 
     * @return the GatewaysClient object.
     */
    public GatewaysClient getGateways() {
        return this.gateways;
    }

    /**
     * The GatewayRouteConfigsClient object to access its operations.
     */
    private final GatewayRouteConfigsClient gatewayRouteConfigs;

    /**
     * Gets the GatewayRouteConfigsClient object to access its operations.
     * 
     * @return the GatewayRouteConfigsClient object.
     */
    public GatewayRouteConfigsClient getGatewayRouteConfigs() {
        return this.gatewayRouteConfigs;
    }

    /**
     * The GatewayCustomDomainsClient object to access its operations.
     */
    private final GatewayCustomDomainsClient gatewayCustomDomains;

    /**
     * Gets the GatewayCustomDomainsClient object to access its operations.
     * 
     * @return the GatewayCustomDomainsClient object.
     */
    public GatewayCustomDomainsClient getGatewayCustomDomains() {
        return this.gatewayCustomDomains;
    }

    /**
     * The ApiPortalsClient object to access its operations.
     */
    private final ApiPortalsClient apiPortals;

    /**
     * Gets the ApiPortalsClient object to access its operations.
     * 
     * @return the ApiPortalsClient object.
     */
    public ApiPortalsClient getApiPortals() {
        return this.apiPortals;
    }

    /**
     * The ApiPortalCustomDomainsClient object to access its operations.
     */
    private final ApiPortalCustomDomainsClient apiPortalCustomDomains;

    /**
     * Gets the ApiPortalCustomDomainsClient object to access its operations.
     * 
     * @return the ApiPortalCustomDomainsClient object.
     */
    public ApiPortalCustomDomainsClient getApiPortalCustomDomains() {
        return this.apiPortalCustomDomains;
    }

    /**
     * The ApplicationAcceleratorsClient object to access its operations.
     */
    private final ApplicationAcceleratorsClient applicationAccelerators;

    /**
     * Gets the ApplicationAcceleratorsClient object to access its operations.
     * 
     * @return the ApplicationAcceleratorsClient object.
     */
    public ApplicationAcceleratorsClient getApplicationAccelerators() {
        return this.applicationAccelerators;
    }

    /**
     * The CustomizedAcceleratorsClient object to access its operations.
     */
    private final CustomizedAcceleratorsClient customizedAccelerators;

    /**
     * Gets the CustomizedAcceleratorsClient object to access its operations.
     * 
     * @return the CustomizedAcceleratorsClient object.
     */
    public CustomizedAcceleratorsClient getCustomizedAccelerators() {
        return this.customizedAccelerators;
    }

    /**
     * The PredefinedAcceleratorsClient object to access its operations.
     */
    private final PredefinedAcceleratorsClient predefinedAccelerators;

    /**
     * Gets the PredefinedAcceleratorsClient object to access its operations.
     * 
     * @return the PredefinedAcceleratorsClient object.
     */
    public PredefinedAcceleratorsClient getPredefinedAccelerators() {
        return this.predefinedAccelerators;
    }

    /**
     * Initializes an instance of AppPlatformManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Gets subscription ID which uniquely identify the Microsoft Azure subscription. The
     * subscription ID forms part of the URI for every service call.
     * @param endpoint server parameter.
     */
    AppPlatformManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2023-12-01";
        this.services = new ServicesClientImpl(this);
        this.apms = new ApmsClientImpl(this);
        this.configServers = new ConfigServersClientImpl(this);
        this.configurationServices = new ConfigurationServicesClientImpl(this);
        this.serviceRegistries = new ServiceRegistriesClientImpl(this);
        this.applicationLiveViews = new ApplicationLiveViewsClientImpl(this);
        this.devToolPortals = new DevToolPortalsClientImpl(this);
        this.containerRegistries = new ContainerRegistriesClientImpl(this);
        this.buildServices = new BuildServicesClientImpl(this);
        this.buildpackBindings = new BuildpackBindingsClientImpl(this);
        this.buildServiceBuilders = new BuildServiceBuildersClientImpl(this);
        this.buildServiceAgentPools = new BuildServiceAgentPoolsClientImpl(this);
        this.monitoringSettings = new MonitoringSettingsClientImpl(this);
        this.apps = new AppsClientImpl(this);
        this.bindings = new BindingsClientImpl(this);
        this.storages = new StoragesClientImpl(this);
        this.certificates = new CertificatesClientImpl(this);
        this.customDomains = new CustomDomainsClientImpl(this);
        this.deployments = new DeploymentsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.runtimeVersions = new RuntimeVersionsClientImpl(this);
        this.skus = new SkusClientImpl(this);
        this.gateways = new GatewaysClientImpl(this);
        this.gatewayRouteConfigs = new GatewayRouteConfigsClientImpl(this);
        this.gatewayCustomDomains = new GatewayCustomDomainsClientImpl(this);
        this.apiPortals = new ApiPortalsClientImpl(this);
        this.apiPortalCustomDomains = new ApiPortalCustomDomainsClientImpl(this);
        this.applicationAccelerators = new ApplicationAcceleratorsClientImpl(this);
        this.customizedAccelerators = new CustomizedAcceleratorsClientImpl(this);
        this.predefinedAccelerators = new PredefinedAcceleratorsClientImpl(this);
    }
}
