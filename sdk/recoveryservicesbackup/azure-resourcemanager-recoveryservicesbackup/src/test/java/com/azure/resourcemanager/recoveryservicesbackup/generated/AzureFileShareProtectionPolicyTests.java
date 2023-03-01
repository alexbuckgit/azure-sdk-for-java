// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SchedulePolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureFileShareProtectionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileShareProtectionPolicy model =
            BinaryData
                .fromString(
                    "{\"backupManagementType\":\"AzureStorage\",\"workLoadType\":\"VM\",\"schedulePolicy\":{\"schedulePolicyType\":\"SchedulePolicy\"},\"retentionPolicy\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"timeZone\":\"qtqzfavyv\",\"protectedItemsCount\":141630952,\"resourceGuardOperationRequests\":[\"aryeu\"]}")
                .toObject(AzureFileShareProtectionPolicy.class);
        Assertions.assertEquals(141630952, model.protectedItemsCount());
        Assertions.assertEquals("aryeu", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(WorkloadType.VM, model.workLoadType());
        Assertions.assertEquals("qtqzfavyv", model.timeZone());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileShareProtectionPolicy model =
            new AzureFileShareProtectionPolicy()
                .withProtectedItemsCount(141630952)
                .withResourceGuardOperationRequests(Arrays.asList("aryeu"))
                .withWorkLoadType(WorkloadType.VM)
                .withSchedulePolicy(new SchedulePolicy())
                .withRetentionPolicy(new RetentionPolicy())
                .withTimeZone("qtqzfavyv");
        model = BinaryData.fromObject(model).toObject(AzureFileShareProtectionPolicy.class);
        Assertions.assertEquals(141630952, model.protectedItemsCount());
        Assertions.assertEquals("aryeu", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(WorkloadType.VM, model.workLoadType());
        Assertions.assertEquals("qtqzfavyv", model.timeZone());
    }
}