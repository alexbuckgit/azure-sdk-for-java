// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for AzureStackHciClient class.
 */
public interface AzureStackHciClient {
    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the ArcSettingsClient object to access its operations.
     * 
     * @return the ArcSettingsClient object.
     */
    ArcSettingsClient getArcSettings();

    /**
     * Gets the ClustersClient object to access its operations.
     * 
     * @return the ClustersClient object.
     */
    ClustersClient getClusters();

    /**
     * Gets the DeploymentSettingsClient object to access its operations.
     * 
     * @return the DeploymentSettingsClient object.
     */
    DeploymentSettingsClient getDeploymentSettings();

    /**
     * Gets the EdgeDevicesClient object to access its operations.
     * 
     * @return the EdgeDevicesClient object.
     */
    EdgeDevicesClient getEdgeDevices();

    /**
     * Gets the ExtensionsClient object to access its operations.
     * 
     * @return the ExtensionsClient object.
     */
    ExtensionsClient getExtensions();

    /**
     * Gets the OffersClient object to access its operations.
     * 
     * @return the OffersClient object.
     */
    OffersClient getOffers();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PublishersClient object to access its operations.
     * 
     * @return the PublishersClient object.
     */
    PublishersClient getPublishers();

    /**
     * Gets the SecuritySettingsClient object to access its operations.
     * 
     * @return the SecuritySettingsClient object.
     */
    SecuritySettingsClient getSecuritySettings();

    /**
     * Gets the SkusClient object to access its operations.
     * 
     * @return the SkusClient object.
     */
    SkusClient getSkus();

    /**
     * Gets the UpdateRunsClient object to access its operations.
     * 
     * @return the UpdateRunsClient object.
     */
    UpdateRunsClient getUpdateRuns();

    /**
     * Gets the UpdateSummariesOperationsClient object to access its operations.
     * 
     * @return the UpdateSummariesOperationsClient object.
     */
    UpdateSummariesOperationsClient getUpdateSummariesOperations();

    /**
     * Gets the UpdatesClient object to access its operations.
     * 
     * @return the UpdatesClient object.
     */
    UpdatesClient getUpdates();
}
