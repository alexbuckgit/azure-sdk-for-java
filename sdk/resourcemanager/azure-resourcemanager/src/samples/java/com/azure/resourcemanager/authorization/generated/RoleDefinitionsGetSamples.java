// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated;

/**
 * Samples for RoleDefinitions Get.
 */
public final class RoleDefinitionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/
     * GetRoleDefinitionByName.json
     */
    /**
     * Sample code: Get role definition by name.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getRoleDefinitionByName(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.accessManagement()
            .roleAssignments()
            .manager()
            .roleServiceClient()
            .getRoleDefinitions()
            .getWithResponse("scope", "roleDefinitionId", com.azure.core.util.Context.NONE);
    }
}
