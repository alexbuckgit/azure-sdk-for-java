// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.resourcemanager.support.models.LookUpResourceIdRequest;
import com.azure.resourcemanager.support.models.ResourceType;

/**
 * Samples for LookUpResourceId Post.
 */
public final class LookUpResourceIdPostSamples {
    /*
     * x-ms-original-file:
     * specification/support/resource-manager/Microsoft.Support/preview/2023-06-01-preview/examples/LookUpResourceId.
     * json
     */
    /**
     * Sample code: Look up resource id of support resource type.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void lookUpResourceIdOfSupportResourceType(com.azure.resourcemanager.support.SupportManager manager) {
        manager.lookUpResourceIds().postWithResponse(new LookUpResourceIdRequest().withIdentifier("1234668596")
            .withType(ResourceType.MICROSOFT_SUPPORT_SUPPORT_TICKETS), com.azure.core.util.Context.NONE);
    }
}
