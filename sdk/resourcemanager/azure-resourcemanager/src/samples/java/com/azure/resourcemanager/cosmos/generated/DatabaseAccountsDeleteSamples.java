// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for DatabaseAccounts Delete. */
public final class DatabaseAccountsDeleteSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-04-15/examples/CosmosDBDatabaseAccountDelete.json
     */
    /**
     * Sample code: CosmosDBDatabaseAccountDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBDatabaseAccountDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getDatabaseAccounts()
            .delete("rg1", "ddb1", com.azure.core.util.Context.NONE);
    }
}
