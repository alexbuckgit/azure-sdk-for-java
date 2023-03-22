// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AllowedConnectionsResourceProperties;

public final class AllowedConnectionsResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllowedConnectionsResourceProperties model =
            BinaryData
                .fromString(
                    "{\"calculatedDateTime\":\"2021-07-31T17:06:26Z\",\"connectableResources\":[{\"id\":\"eekpndz\",\"inboundConnectedResources\":[],\"outboundConnectedResources\":[]},{\"id\":\"qmeqwigpibudqwyx\",\"inboundConnectedResources\":[],\"outboundConnectedResources\":[]},{\"id\":\"mzznrtffyaqitmhh\",\"inboundConnectedResources\":[],\"outboundConnectedResources\":[]},{\"id\":\"hvseufuqyrx\",\"inboundConnectedResources\":[],\"outboundConnectedResources\":[]}]}")
                .toObject(AllowedConnectionsResourceProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllowedConnectionsResourceProperties model = new AllowedConnectionsResourceProperties();
        model = BinaryData.fromObject(model).toObject(AllowedConnectionsResourceProperties.class);
    }
}