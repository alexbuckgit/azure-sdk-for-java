// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.fluent.models.RemediationProperties;
import com.azure.resourcemanager.policyinsights.models.RemediationFilters;
import com.azure.resourcemanager.policyinsights.models.RemediationPropertiesFailureThreshold;
import com.azure.resourcemanager.policyinsights.models.ResourceDiscoveryMode;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RemediationPropertiesTests {
    @Test
    public void testDeserialize() {
        RemediationProperties model =
            BinaryData
                .fromString(
                    "{\"policyAssignmentId\":\"qgoulznd\",\"policyDefinitionReferenceId\":\"kwy\",\"resourceDiscoveryMode\":\"ExistingNonCompliant\",\"provisioningState\":\"gibma\",\"createdOn\":\"2021-11-21T23:43:22Z\",\"lastUpdatedOn\":\"2021-10-30T15:28:22Z\",\"filters\":{\"locations\":[\"xybz\",\"qedqytbciqfoufl\"]},\"deploymentStatus\":{\"totalDeployments\":1828393347,\"successfulDeployments\":492225371,\"failedDeployments\":1095106401},\"statusMessage\":\"mglougpbkw\",\"correlationId\":\"utduqktapspwgcu\",\"resourceCount\":1218908818,\"parallelDeployments\":913932124,\"failureThreshold\":{\"percentage\":2.3766458}}")
                .toObject(RemediationProperties.class);
        Assertions.assertEquals("qgoulznd", model.policyAssignmentId());
        Assertions.assertEquals("kwy", model.policyDefinitionReferenceId());
        Assertions.assertEquals(ResourceDiscoveryMode.EXISTING_NON_COMPLIANT, model.resourceDiscoveryMode());
        Assertions.assertEquals("xybz", model.filters().locations().get(0));
        Assertions.assertEquals(1218908818, model.resourceCount());
        Assertions.assertEquals(913932124, model.parallelDeployments());
        Assertions.assertEquals(2.3766458F, model.failureThreshold().percentage());
    }

    @Test
    public void testSerialize() {
        RemediationProperties model =
            new RemediationProperties()
                .withPolicyAssignmentId("qgoulznd")
                .withPolicyDefinitionReferenceId("kwy")
                .withResourceDiscoveryMode(ResourceDiscoveryMode.EXISTING_NON_COMPLIANT)
                .withFilters(new RemediationFilters().withLocations(Arrays.asList("xybz", "qedqytbciqfoufl")))
                .withResourceCount(1218908818)
                .withParallelDeployments(913932124)
                .withFailureThreshold(new RemediationPropertiesFailureThreshold().withPercentage(2.3766458F));
        model = BinaryData.fromObject(model).toObject(RemediationProperties.class);
        Assertions.assertEquals("qgoulznd", model.policyAssignmentId());
        Assertions.assertEquals("kwy", model.policyDefinitionReferenceId());
        Assertions.assertEquals(ResourceDiscoveryMode.EXISTING_NON_COMPLIANT, model.resourceDiscoveryMode());
        Assertions.assertEquals("xybz", model.filters().locations().get(0));
        Assertions.assertEquals(1218908818, model.resourceCount());
        Assertions.assertEquals(913932124, model.parallelDeployments());
        Assertions.assertEquals(2.3766458F, model.failureThreshold().percentage());
    }
}
