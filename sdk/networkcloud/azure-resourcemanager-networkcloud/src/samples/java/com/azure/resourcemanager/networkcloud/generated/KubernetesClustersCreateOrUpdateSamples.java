// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.AadConfiguration;
import com.azure.resourcemanager.networkcloud.models.AdministratorConfiguration;
import com.azure.resourcemanager.networkcloud.models.AdvertiseToFabric;
import com.azure.resourcemanager.networkcloud.models.AgentOptions;
import com.azure.resourcemanager.networkcloud.models.AgentPoolMode;
import com.azure.resourcemanager.networkcloud.models.AgentPoolUpgradeSettings;
import com.azure.resourcemanager.networkcloud.models.AttachedNetworkConfiguration;
import com.azure.resourcemanager.networkcloud.models.BfdEnabled;
import com.azure.resourcemanager.networkcloud.models.BgpAdvertisement;
import com.azure.resourcemanager.networkcloud.models.BgpMultiHop;
import com.azure.resourcemanager.networkcloud.models.BgpServiceLoadBalancerConfiguration;
import com.azure.resourcemanager.networkcloud.models.ControlPlaneNodeConfiguration;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.FabricPeeringEnabled;
import com.azure.resourcemanager.networkcloud.models.HugepagesSize;
import com.azure.resourcemanager.networkcloud.models.InitialAgentPoolConfiguration;
import com.azure.resourcemanager.networkcloud.models.IpAddressPool;
import com.azure.resourcemanager.networkcloud.models.KubernetesLabel;
import com.azure.resourcemanager.networkcloud.models.KubernetesPluginType;
import com.azure.resourcemanager.networkcloud.models.L2NetworkAttachmentConfiguration;
import com.azure.resourcemanager.networkcloud.models.L3NetworkAttachmentConfiguration;
import com.azure.resourcemanager.networkcloud.models.L3NetworkConfigurationIpamEnabled;
import com.azure.resourcemanager.networkcloud.models.ManagedResourceGroupConfiguration;
import com.azure.resourcemanager.networkcloud.models.NetworkConfiguration;
import com.azure.resourcemanager.networkcloud.models.ServiceLoadBalancerBgpPeer;
import com.azure.resourcemanager.networkcloud.models.SshPublicKey;
import com.azure.resourcemanager.networkcloud.models.TrunkedNetworkAttachmentConfiguration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for KubernetesClusters CreateOrUpdate. */
public final class KubernetesClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/KubernetesClusters_Create.json
     */
    /**
     * Sample code: Create or update Kubernetes cluster.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void createOrUpdateKubernetesCluster(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .kubernetesClusters()
            .define("kubernetesClusterName")
            .withRegion("location")
            .withExistingResourceGroup("resourceGroupName")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withName(
                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.ExtendedLocation/customLocations/clusterExtendedLocationName")
                    .withType("CustomLocation"))
            .withControlPlaneNodeConfiguration(
                new ControlPlaneNodeConfiguration()
                    .withAdministratorConfiguration(
                        new AdministratorConfiguration()
                            .withAdminUsername("azure")
                            .withSshPublicKeys(Arrays.asList(new SshPublicKey().withKeyData("fakeTokenPlaceholder"))))
                    .withAvailabilityZones(Arrays.asList("1", "2", "3"))
                    .withCount(3L)
                    .withVmSkuName("NC_G4_v1"))
            .withInitialAgentPoolConfigurations(
                Arrays
                    .asList(
                        new InitialAgentPoolConfiguration()
                            .withAdministratorConfiguration(
                                new AdministratorConfiguration()
                                    .withAdminUsername("azure")
                                    .withSshPublicKeys(
                                        Arrays.asList(new SshPublicKey().withKeyData("fakeTokenPlaceholder"))))
                            .withAgentOptions(
                                new AgentOptions().withHugepagesCount(96L).withHugepagesSize(HugepagesSize.ONEG))
                            .withAttachedNetworkConfiguration(
                                new AttachedNetworkConfiguration()
                                    .withL2Networks(
                                        Arrays
                                            .asList(
                                                new L2NetworkAttachmentConfiguration()
                                                    .withNetworkId(
                                                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/l2Networks/l2NetworkName")
                                                    .withPluginType(KubernetesPluginType.DPDK)))
                                    .withL3Networks(
                                        Arrays
                                            .asList(
                                                new L3NetworkAttachmentConfiguration()
                                                    .withIpamEnabled(L3NetworkConfigurationIpamEnabled.FALSE)
                                                    .withNetworkId(
                                                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/l3Networks/l3NetworkName")
                                                    .withPluginType(KubernetesPluginType.SRIOV)))
                                    .withTrunkedNetworks(
                                        Arrays
                                            .asList(
                                                new TrunkedNetworkAttachmentConfiguration()
                                                    .withNetworkId(
                                                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/trunkedNetworks/trunkedNetworkName")
                                                    .withPluginType(KubernetesPluginType.MACVLAN))))
                            .withAvailabilityZones(Arrays.asList("1", "2", "3"))
                            .withCount(3L)
                            .withLabels(
                                Arrays.asList(new KubernetesLabel().withKey("fakeTokenPlaceholder").withValue("true")))
                            .withMode(AgentPoolMode.SYSTEM)
                            .withName("SystemPool-1")
                            .withTaints(
                                Arrays.asList(new KubernetesLabel().withKey("fakeTokenPlaceholder").withValue("true")))
                            .withUpgradeSettings(new AgentPoolUpgradeSettings().withMaxSurge("1"))
                            .withVmSkuName("NC_M16_v1")))
            .withKubernetesVersion("1.24.12-1")
            .withNetworkConfiguration(
                new NetworkConfiguration()
                    .withAttachedNetworkConfiguration(
                        new AttachedNetworkConfiguration()
                            .withL2Networks(
                                Arrays
                                    .asList(
                                        new L2NetworkAttachmentConfiguration()
                                            .withNetworkId(
                                                "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/l2Networks/l2NetworkName")
                                            .withPluginType(KubernetesPluginType.DPDK)))
                            .withL3Networks(
                                Arrays
                                    .asList(
                                        new L3NetworkAttachmentConfiguration()
                                            .withIpamEnabled(L3NetworkConfigurationIpamEnabled.FALSE)
                                            .withNetworkId(
                                                "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/l3Networks/l3NetworkName")
                                            .withPluginType(KubernetesPluginType.SRIOV)))
                            .withTrunkedNetworks(
                                Arrays
                                    .asList(
                                        new TrunkedNetworkAttachmentConfiguration()
                                            .withNetworkId(
                                                "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/trunkedNetworks/trunkedNetworkName")
                                            .withPluginType(KubernetesPluginType.MACVLAN))))
                    .withBgpServiceLoadBalancerConfiguration(
                        new BgpServiceLoadBalancerConfiguration()
                            .withBgpAdvertisements(
                                Arrays
                                    .asList(
                                        new BgpAdvertisement()
                                            .withAdvertiseToFabric(AdvertiseToFabric.TRUE)
                                            .withCommunities(Arrays.asList("64512:100"))
                                            .withIpAddressPools(Arrays.asList("pool1"))
                                            .withPeers(Arrays.asList("peer1"))))
                            .withBgpPeers(
                                Arrays
                                    .asList(
                                        new ServiceLoadBalancerBgpPeer()
                                            .withBfdEnabled(BfdEnabled.FALSE)
                                            .withBgpMultiHop(BgpMultiHop.FALSE)
                                            .withHoldTime("P300s")
                                            .withKeepAliveTime("P300s")
                                            .withMyAsn(64512L)
                                            .withName("peer1")
                                            .withPeerAddress("203.0.113.254")
                                            .withPeerAsn(64497L)
                                            .withPeerPort(179L)))
                            .withFabricPeeringEnabled(FabricPeeringEnabled.TRUE)
                            .withIpAddressPools(
                                Arrays
                                    .asList(
                                        new IpAddressPool()
                                            .withAddresses(Arrays.asList("198.51.102.0/24"))
                                            .withAutoAssign(BfdEnabled.TRUE)
                                            .withName("pool1")
                                            .withOnlyUseHostIps(BfdEnabled.TRUE))))
                    .withCloudServicesNetworkId(
                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/cloudServicesNetworks/cloudServicesNetworkName")
                    .withCniNetworkId(
                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.NetworkCloud/l3Networks/l3NetworkName")
                    .withDnsServiceIp("198.51.101.2")
                    .withPodCidrs(Arrays.asList("198.51.100.0/24"))
                    .withServiceCidrs(Arrays.asList("198.51.101.0/24")))
            .withTags(mapOf("key1", "myvalue1", "key2", "myvalue2"))
            .withAadConfiguration(
                new AadConfiguration().withAdminGroupObjectIds(Arrays.asList("ffffffff-ffff-ffff-ffff-ffffffffffff")))
            .withAdministratorConfiguration(
                new AdministratorConfiguration()
                    .withAdminUsername("azure")
                    .withSshPublicKeys(Arrays.asList(new SshPublicKey().withKeyData("fakeTokenPlaceholder"))))
            .withManagedResourceGroupConfiguration(
                new ManagedResourceGroupConfiguration().withLocation("East US").withName("my-managed-rg"))
            .create();
    }

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
