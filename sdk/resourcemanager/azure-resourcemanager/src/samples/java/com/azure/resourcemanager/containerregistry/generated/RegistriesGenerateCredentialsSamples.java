// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.models.GenerateCredentialsParameters;
import java.time.OffsetDateTime;

/** Samples for Registries GenerateCredentials. */
public final class RegistriesGenerateCredentialsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryGenerateCredentials.json
     */
    /**
     * Sample code: RegistryGenerateCredentials.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registryGenerateCredentials(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getRegistries()
            .generateCredentials(
                "myResourceGroup",
                "myRegistry",
                new GenerateCredentialsParameters()
                    .withTokenId("fakeTokenPlaceholder")
                    .withExpiry(OffsetDateTime.parse("2020-12-31T15:59:59.0707808Z")),
                com.azure.core.util.Context.NONE);
    }
}