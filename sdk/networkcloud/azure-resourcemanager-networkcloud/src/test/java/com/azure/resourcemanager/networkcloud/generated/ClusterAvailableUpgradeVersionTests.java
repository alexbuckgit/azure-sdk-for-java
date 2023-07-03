// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.ClusterAvailableUpgradeVersion;

public final class ClusterAvailableUpgradeVersionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterAvailableUpgradeVersion model =
            BinaryData
                .fromString(
                    "{\"controlImpact\":\"True\",\"expectedDuration\":\"qvkelnsm\",\"impactDescription\":\"xwyjsflhhc\",\"supportExpiryDate\":\"lnjixisxya\",\"targetClusterVersion\":\"oyaqcslyjpkiid\",\"workloadImpact\":\"False\"}")
                .toObject(ClusterAvailableUpgradeVersion.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterAvailableUpgradeVersion model = new ClusterAvailableUpgradeVersion();
        model = BinaryData.fromObject(model).toObject(ClusterAvailableUpgradeVersion.class);
    }
}
