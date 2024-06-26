// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecurityConnectorProperties;
import com.azure.resourcemanager.security.models.CloudName;
import com.azure.resourcemanager.security.models.CloudOffering;
import com.azure.resourcemanager.security.models.EnvironmentData;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SecurityConnectorPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityConnectorProperties model = BinaryData.fromString(
            "{\"hierarchyIdentifier\":\"rlpyznuciqdsmexi\",\"hierarchyIdentifierTrialEndDate\":\"2021-11-16T11:22:07Z\",\"environmentName\":\"GitLab\",\"offerings\":[{\"offeringType\":\"CloudOffering\",\"description\":\"asiibmiybnnust\"},{\"offeringType\":\"CloudOffering\",\"description\":\"ljhnmgixhcmav\"},{\"offeringType\":\"CloudOffering\",\"description\":\"foudor\"},{\"offeringType\":\"CloudOffering\",\"description\":\"gyyprotwy\"}],\"environmentData\":{\"environmentType\":\"EnvironmentData\"}}")
            .toObject(SecurityConnectorProperties.class);
        Assertions.assertEquals("rlpyznuciqdsmexi", model.hierarchyIdentifier());
        Assertions.assertEquals(CloudName.GIT_LAB, model.environmentName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityConnectorProperties model
            = new SecurityConnectorProperties().withHierarchyIdentifier("rlpyznuciqdsmexi")
                .withEnvironmentName(CloudName.GIT_LAB)
                .withOfferings(
                    Arrays.asList(new CloudOffering(), new CloudOffering(), new CloudOffering(), new CloudOffering()))
                .withEnvironmentData(new EnvironmentData());
        model = BinaryData.fromObject(model).toObject(SecurityConnectorProperties.class);
        Assertions.assertEquals("rlpyznuciqdsmexi", model.hierarchyIdentifier());
        Assertions.assertEquals(CloudName.GIT_LAB, model.environmentName());
    }
}
