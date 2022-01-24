// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated;

import com.azure.core.util.Context;

/** Samples for QueryTexts Get. */
public final class QueryTextsGetSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2018-06-01/examples/QueryTextsGet.json
     */
    /**
     * Sample code: QueryTextsGet.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void queryTextsGet(com.azure.resourcemanager.mysql.MySqlManager manager) {
        manager.queryTexts().getWithResponse("testResourceGroupName", "testServerName", "1", Context.NONE);
    }
}
