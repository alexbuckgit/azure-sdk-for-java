// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.SbeDeploymentInfo;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class SbeDeploymentInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SbeDeploymentInfo model = BinaryData.fromString(
            "{\"version\":\"bcuejrjxgci\",\"family\":\"brh\",\"publisher\":\"xsdqrhzoymibmrqy\",\"sbeManifestSource\":\"ahwfluszdtmhrk\",\"sbeManifestCreationDate\":\"2021-06-28T13:04:58Z\"}")
            .toObject(SbeDeploymentInfo.class);
        Assertions.assertEquals("bcuejrjxgci", model.version());
        Assertions.assertEquals("brh", model.family());
        Assertions.assertEquals("xsdqrhzoymibmrqy", model.publisher());
        Assertions.assertEquals("ahwfluszdtmhrk", model.sbeManifestSource());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-28T13:04:58Z"), model.sbeManifestCreationDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SbeDeploymentInfo model = new SbeDeploymentInfo().withVersion("bcuejrjxgci")
            .withFamily("brh")
            .withPublisher("xsdqrhzoymibmrqy")
            .withSbeManifestSource("ahwfluszdtmhrk")
            .withSbeManifestCreationDate(OffsetDateTime.parse("2021-06-28T13:04:58Z"));
        model = BinaryData.fromObject(model).toObject(SbeDeploymentInfo.class);
        Assertions.assertEquals("bcuejrjxgci", model.version());
        Assertions.assertEquals("brh", model.family());
        Assertions.assertEquals("xsdqrhzoymibmrqy", model.publisher());
        Assertions.assertEquals("ahwfluszdtmhrk", model.sbeManifestSource());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-28T13:04:58Z"), model.sbeManifestCreationDate());
    }
}
