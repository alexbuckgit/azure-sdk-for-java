// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.StaticSiteArmResourceInner;
import com.azure.resourcemanager.appservice.models.SkuDescription;
import com.azure.resourcemanager.appservice.models.StaticSiteBuildProperties;

/** Samples for StaticSites CreateOrUpdateStaticSite. */
public final class StaticSitesCreateOrUpdateStaticSiteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/CreateOrUpdateStaticSite.json
     */
    /**
     * Sample code: Create or update a static site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .createOrUpdateStaticSite(
                "rg",
                "testStaticSite0",
                new StaticSiteArmResourceInner()
                    .withLocation("West US 2")
                    .withSku(new SkuDescription().withName("Basic").withTier("Basic"))
                    .withRepositoryUrl("https://github.com/username/RepoName")
                    .withBranch("master")
                    .withRepositoryToken("fakeTokenPlaceholder")
                    .withBuildProperties(
                        new StaticSiteBuildProperties()
                            .withAppLocation("app")
                            .withApiLocation("api")
                            .withAppArtifactLocation("build")),
                com.azure.core.util.Context.NONE);
    }
}
