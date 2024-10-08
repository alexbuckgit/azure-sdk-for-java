// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.PartialRegistryPartialTrackedResource;
import com.azure.resourcemanager.machinelearning.models.PartialSku;
import com.azure.resourcemanager.machinelearning.models.RegistryPartialManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import com.azure.resourcemanager.machinelearning.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PartialRegistryPartialTrackedResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartialRegistryPartialTrackedResource model = BinaryData.fromString(
            "{\"identity\":{\"principalId\":\"370e11aa-1cde-446e-8d05-867ab14f8848\",\"tenantId\":\"6ce29048-e549-4164-b52f-77a4a18b36b5\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{\"r\":{\"principalId\":\"c0ed1deb-cbad-445a-b9ba-e55fb37d4cda\",\"clientId\":\"6027cd1a-6031-447a-8589-17ea0ae59b90\"},\"neyttl\":{\"principalId\":\"065f8464-6928-4247-b151-0cfc74b63250\",\"clientId\":\"c36db973-09ef-4904-af3f-cc91f0a96536\"},\"ivcbkutpumltwj\":{\"principalId\":\"d91934d8-363d-495a-88b2-425c44255200\",\"clientId\":\"0aa30399-8e40-4496-ac14-d68156b72902\"}}},\"sku\":{\"name\":\"xynbpvzlqywa\",\"tier\":\"Standard\",\"size\":\"jckhmocgj\",\"family\":\"gouarhwvixqq\",\"capacity\":902896501},\"tags\":{\"rvtz\":\"ybsjrc\",\"y\":\"nrbctbhpjhxpcvrd\"}}")
            .toObject(PartialRegistryPartialTrackedResource.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("xynbpvzlqywa", model.sku().name());
        Assertions.assertEquals(SkuTier.STANDARD, model.sku().tier());
        Assertions.assertEquals("jckhmocgj", model.sku().size());
        Assertions.assertEquals("gouarhwvixqq", model.sku().family());
        Assertions.assertEquals(902896501, model.sku().capacity());
        Assertions.assertEquals("ybsjrc", model.tags().get("rvtz"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartialRegistryPartialTrackedResource model = new PartialRegistryPartialTrackedResource()
            .withIdentity(new RegistryPartialManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf("r", new UserAssignedIdentity(), "neyttl", new UserAssignedIdentity(),
                    "ivcbkutpumltwj", new UserAssignedIdentity())))
            .withSku(new PartialSku().withName("xynbpvzlqywa")
                .withTier(SkuTier.STANDARD)
                .withSize("jckhmocgj")
                .withFamily("gouarhwvixqq")
                .withCapacity(902896501))
            .withTags(mapOf("rvtz", "ybsjrc", "y", "nrbctbhpjhxpcvrd"));
        model = BinaryData.fromObject(model).toObject(PartialRegistryPartialTrackedResource.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("xynbpvzlqywa", model.sku().name());
        Assertions.assertEquals(SkuTier.STANDARD, model.sku().tier());
        Assertions.assertEquals("jckhmocgj", model.sku().size());
        Assertions.assertEquals("gouarhwvixqq", model.sku().family());
        Assertions.assertEquals(902896501, model.sku().capacity());
        Assertions.assertEquals("ybsjrc", model.tags().get("rvtz"));
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
