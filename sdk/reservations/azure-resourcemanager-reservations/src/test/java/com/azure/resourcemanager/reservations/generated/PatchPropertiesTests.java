// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.fluent.models.PatchProperties;
import com.azure.resourcemanager.reservations.models.AppliedScopeProperties;
import com.azure.resourcemanager.reservations.models.AppliedScopeType;
import com.azure.resourcemanager.reservations.models.InstanceFlexibility;
import com.azure.resourcemanager.reservations.models.PatchPropertiesRenewProperties;
import com.azure.resourcemanager.reservations.models.PurchaseRequest;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchProperties model =
            BinaryData
                .fromString(
                    "{\"appliedScopeType\":\"ManagementGroup\",\"appliedScopes\":[\"tcktvfcivfsnky\",\"uctqhjfbe\",\"rjcxerfuwu\",\"ttxfvjr\"],\"appliedScopeProperties\":{\"tenantId\":\"phxepcyvahf\",\"managementGroupId\":\"jky\",\"subscriptionId\":\"j\",\"resourceGroupId\":\"ujqgidok\",\"displayName\":\"ljyoxgvcltb\"},\"instanceFlexibility\":\"On\",\"name\":\"ghkjeszzhbi\",\"renew\":false,\"renewProperties\":{\"purchaseProperties\":{\"location\":\"xbf\"}},\"reviewDateTime\":\"2021-05-15T12:37:03Z\"}")
                .toObject(PatchProperties.class);
        Assertions.assertEquals(AppliedScopeType.MANAGEMENT_GROUP, model.appliedScopeType());
        Assertions.assertEquals("tcktvfcivfsnky", model.appliedScopes().get(0));
        Assertions.assertEquals("phxepcyvahf", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("jky", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("j", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("ujqgidok", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("ljyoxgvcltb", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(InstanceFlexibility.ON, model.instanceFlexibility());
        Assertions.assertEquals("ghkjeszzhbi", model.name());
        Assertions.assertEquals(false, model.renew());
        Assertions.assertEquals("xbf", model.renewProperties().purchaseProperties().location());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-15T12:37:03Z"), model.reviewDateTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchProperties model =
            new PatchProperties()
                .withAppliedScopeType(AppliedScopeType.MANAGEMENT_GROUP)
                .withAppliedScopes(Arrays.asList("tcktvfcivfsnky", "uctqhjfbe", "rjcxerfuwu", "ttxfvjr"))
                .withAppliedScopeProperties(
                    new AppliedScopeProperties()
                        .withTenantId("phxepcyvahf")
                        .withManagementGroupId("jky")
                        .withSubscriptionId("j")
                        .withResourceGroupId("ujqgidok")
                        .withDisplayName("ljyoxgvcltb"))
                .withInstanceFlexibility(InstanceFlexibility.ON)
                .withName("ghkjeszzhbi")
                .withRenew(false)
                .withRenewProperties(
                    new PatchPropertiesRenewProperties()
                        .withPurchaseProperties(new PurchaseRequest().withLocation("xbf")))
                .withReviewDateTime(OffsetDateTime.parse("2021-05-15T12:37:03Z"));
        model = BinaryData.fromObject(model).toObject(PatchProperties.class);
        Assertions.assertEquals(AppliedScopeType.MANAGEMENT_GROUP, model.appliedScopeType());
        Assertions.assertEquals("tcktvfcivfsnky", model.appliedScopes().get(0));
        Assertions.assertEquals("phxepcyvahf", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("jky", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("j", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("ujqgidok", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("ljyoxgvcltb", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(InstanceFlexibility.ON, model.instanceFlexibility());
        Assertions.assertEquals("ghkjeszzhbi", model.name());
        Assertions.assertEquals(false, model.renew());
        Assertions.assertEquals("xbf", model.renewProperties().purchaseProperties().location());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-15T12:37:03Z"), model.reviewDateTime());
    }
}