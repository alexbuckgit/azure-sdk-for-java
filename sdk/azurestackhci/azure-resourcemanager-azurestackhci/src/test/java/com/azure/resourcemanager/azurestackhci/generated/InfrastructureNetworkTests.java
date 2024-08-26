// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.InfrastructureNetwork;
import com.azure.resourcemanager.azurestackhci.models.IpPools;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InfrastructureNetworkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InfrastructureNetwork model = BinaryData.fromString(
            "{\"subnetMask\":\"tpnapnyiropuhpig\",\"gateway\":\"gylgqgitxmedjvcs\",\"ipPools\":[{\"startingAddress\":\"wwncwzzhxgk\",\"endingAddress\":\"mgucna\"}],\"dnsServers\":[\"eoellwptfdygp\"],\"useDhcp\":false}")
            .toObject(InfrastructureNetwork.class);
        Assertions.assertEquals("tpnapnyiropuhpig", model.subnetMask());
        Assertions.assertEquals("gylgqgitxmedjvcs", model.gateway());
        Assertions.assertEquals("wwncwzzhxgk", model.ipPools().get(0).startingAddress());
        Assertions.assertEquals("mgucna", model.ipPools().get(0).endingAddress());
        Assertions.assertEquals("eoellwptfdygp", model.dnsServers().get(0));
        Assertions.assertEquals(false, model.useDhcp());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InfrastructureNetwork model = new InfrastructureNetwork().withSubnetMask("tpnapnyiropuhpig")
            .withGateway("gylgqgitxmedjvcs")
            .withIpPools(Arrays.asList(new IpPools().withStartingAddress("wwncwzzhxgk").withEndingAddress("mgucna")))
            .withDnsServers(Arrays.asList("eoellwptfdygp"))
            .withUseDhcp(false);
        model = BinaryData.fromObject(model).toObject(InfrastructureNetwork.class);
        Assertions.assertEquals("tpnapnyiropuhpig", model.subnetMask());
        Assertions.assertEquals("gylgqgitxmedjvcs", model.gateway());
        Assertions.assertEquals("wwncwzzhxgk", model.ipPools().get(0).startingAddress());
        Assertions.assertEquals("mgucna", model.ipPools().get(0).endingAddress());
        Assertions.assertEquals("eoellwptfdygp", model.dnsServers().get(0));
        Assertions.assertEquals(false, model.useDhcp());
    }
}
