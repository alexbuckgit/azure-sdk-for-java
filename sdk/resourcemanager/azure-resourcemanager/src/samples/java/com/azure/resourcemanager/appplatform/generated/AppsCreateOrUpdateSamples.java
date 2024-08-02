// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.resourcemanager.appplatform.fluent.models.AppResourceInner;
import com.azure.resourcemanager.appplatform.models.AppResourceProperties;
import com.azure.resourcemanager.appplatform.models.AppVNetAddons;
import com.azure.resourcemanager.appplatform.models.AzureFileVolume;
import com.azure.resourcemanager.appplatform.models.CustomPersistentDiskResource;
import com.azure.resourcemanager.appplatform.models.LoadedCertificate;
import com.azure.resourcemanager.appplatform.models.ManagedIdentityProperties;
import com.azure.resourcemanager.appplatform.models.ManagedIdentityType;
import com.azure.resourcemanager.appplatform.models.PersistentDisk;
import com.azure.resourcemanager.appplatform.models.TemporaryDisk;
import com.azure.resourcemanager.appplatform.models.UserAssignedManagedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Apps CreateOrUpdate.
 */
public final class AppsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/Apps_CreateOrUpdate.
     * json
     */
    /**
     * Sample code: Apps_CreateOrUpdate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void appsCreateOrUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getApps()
            .createOrUpdate("myResourceGroup", "myservice", "myapp", new AppResourceInner()
                .withProperties(new AppResourceProperties().withPublicProperty(true)
                    .withAddonConfigs(mapOf("ApplicationConfigurationService", mapOf("resourceId",
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/configurationServices/myacs"),
                        "ServiceRegistry",
                        mapOf("resourceId",
                            "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/serviceRegistries/myServiceRegistry")))
                    .withHttpsOnly(false)
                    .withTemporaryDisk(new TemporaryDisk().withSizeInGB(2).withMountPath("/mytemporarydisk"))
                    .withPersistentDisk(new PersistentDisk().withSizeInGB(2).withMountPath("/mypersistentdisk"))
                    .withCustomPersistentDisks(Arrays
                        .asList(new CustomPersistentDiskResource()
                            .withCustomPersistentDiskProperties(
                                new AzureFileVolume().withMountPath("/mypath1/mypath2")
                                    .withEnableSubPath(true)
                                    .withMountOptions(
                                        Arrays.asList("uid=0", "gid=0", "dir_mode=0777", "file_mode=0777"))
                                    .withShareName("myFileShare"))
                            .withStorageId("myASCStorageID")))
                    .withEnableEndToEndTls(false)
                    .withLoadedCertificates(Arrays.asList(new LoadedCertificate().withResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/certificates/mycert1")
                        .withLoadTrustStore(false),
                        new LoadedCertificate().withResourceId(
                            "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/certificates/mycert2")
                            .withLoadTrustStore(true))))
                .withIdentity(new ManagedIdentityProperties()
                    .withType(ManagedIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/samplegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1",
                        new UserAssignedManagedIdentity(),
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/samplegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id2",
                        new UserAssignedManagedIdentity())))
                .withLocation("eastus"), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * Apps_CreateOrUpdate_VNetInjection.json
     */
    /**
     * Sample code: Apps_CreateOrUpdate_VNetInjection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void appsCreateOrUpdateVNetInjection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getApps()
            .createOrUpdate("myResourceGroup", "myservice", "myapp", new AppResourceInner()
                .withProperties(new AppResourceProperties().withPublicProperty(true)
                    .withAddonConfigs(mapOf("ApplicationConfigurationService", mapOf("resourceId",
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/configurationServices/myacs"),
                        "ServiceRegistry",
                        mapOf("resourceId",
                            "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/serviceRegistries/myServiceRegistry")))
                    .withHttpsOnly(false)
                    .withTemporaryDisk(new TemporaryDisk().withSizeInGB(2).withMountPath("/mytemporarydisk"))
                    .withPersistentDisk(new PersistentDisk().withSizeInGB(2).withMountPath("/mypersistentdisk"))
                    .withCustomPersistentDisks(Arrays
                        .asList(new CustomPersistentDiskResource()
                            .withCustomPersistentDiskProperties(
                                new AzureFileVolume().withMountPath("/mypath1/mypath2")
                                    .withMountOptions(
                                        Arrays.asList("uid=0", "gid=0", "dir_mode=0777", "file_mode=0777"))
                                    .withShareName("myFileShare"))
                            .withStorageId("myASCStorageID")))
                    .withEnableEndToEndTls(false)
                    .withLoadedCertificates(Arrays.asList(new LoadedCertificate().withResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/certificates/mycert1")
                        .withLoadTrustStore(false),
                        new LoadedCertificate().withResourceId(
                            "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/certificates/mycert2")
                            .withLoadTrustStore(true)))
                    .withVnetAddons(new AppVNetAddons().withPublicEndpoint(true)))
                .withIdentity(new ManagedIdentityProperties()
                    .withType(ManagedIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/samplegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1",
                        new UserAssignedManagedIdentity(),
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/samplegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id2",
                        new UserAssignedManagedIdentity())))
                .withLocation("eastus"), com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
