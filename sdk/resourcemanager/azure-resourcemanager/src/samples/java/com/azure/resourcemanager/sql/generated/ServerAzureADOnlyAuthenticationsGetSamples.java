// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.AuthenticationName;

/**
 * Samples for ServerAzureADOnlyAuthentications Get.
 */
public final class ServerAzureADOnlyAuthenticationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/AzureADOnlyAuthGet.json
     */
    /**
     * Sample code: Gets a Azure Active Directory only authentication property.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getsAAzureActiveDirectoryOnlyAuthenticationProperty(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getServerAzureADOnlyAuthentications()
            .getWithResponse("sqlcrudtest-4799", "sqlcrudtest-6440", AuthenticationName.DEFAULT,
                com.azure.core.util.Context.NONE);
    }
}
