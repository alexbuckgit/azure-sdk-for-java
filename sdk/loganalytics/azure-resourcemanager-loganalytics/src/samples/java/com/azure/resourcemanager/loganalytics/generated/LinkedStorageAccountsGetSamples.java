// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.resourcemanager.loganalytics.models.DataSourceType;

/** Samples for LinkedStorageAccounts Get. */
public final class LinkedStorageAccountsGetSamples {
    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2020-08-01/examples/LinkedStorageAccountsGet.json
     */
    /**
     * Sample code: LinkedStorageAccountsGet.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void linkedStorageAccountsGet(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager
            .linkedStorageAccounts()
            .getWithResponse(
                "mms-eus", "testLinkStorageAccountsWS", DataSourceType.CUSTOM_LOGS, com.azure.core.util.Context.NONE);
    }
}
