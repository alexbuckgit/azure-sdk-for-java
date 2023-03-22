// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupProperties;
import org.junit.jupiter.api.Assertions;

public final class BackupPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupProperties model =
            BinaryData
                .fromString(
                    "{\"backupId\":\"washr\",\"creationDate\":\"2021-08-01T13:56:15Z\",\"provisioningState\":\"cnqxwbpokulpi\",\"size\":6830630218833714201,\"label\":\"sipqii\",\"backupType\":\"Manual\",\"failureReason\":\"qerpqlpqwcc\",\"volumeName\":\"qgbdbuta\",\"useExistingSnapshot\":true}")
                .toObject(BackupProperties.class);
        Assertions.assertEquals("sipqii", model.label());
        Assertions.assertEquals(true, model.useExistingSnapshot());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupProperties model = new BackupProperties().withLabel("sipqii").withUseExistingSnapshot(true);
        model = BinaryData.fromObject(model).toObject(BackupProperties.class);
        Assertions.assertEquals("sipqii", model.label());
        Assertions.assertEquals(true, model.useExistingSnapshot());
    }
}