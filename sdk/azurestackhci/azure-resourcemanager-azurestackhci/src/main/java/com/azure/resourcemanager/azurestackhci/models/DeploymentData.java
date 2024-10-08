// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The Deployment data of AzureStackHCI Cluster.
 */
@Fluent
public final class DeploymentData implements JsonSerializable<DeploymentData> {
    /*
     * SecuritySettings to deploy AzureStackHCI Cluster.
     */
    private DeploymentSecuritySettings securitySettings;

    /*
     * Observability config to deploy AzureStackHCI Cluster.
     */
    private Observability observability;

    /*
     * Observability config to deploy AzureStackHCI Cluster.
     */
    private DeploymentCluster cluster;

    /*
     * Storage config to deploy AzureStackHCI Cluster.
     */
    private Storage storage;

    /*
     * naming prefix to deploy cluster.
     */
    private String namingPrefix;

    /*
     * FQDN to deploy cluster
     */
    private String domainFqdn;

    /*
     * InfrastructureNetwork config to deploy AzureStackHCI Cluster.
     */
    private List<InfrastructureNetwork> infrastructureNetwork;

    /*
     * list of physical nodes config to deploy AzureStackHCI Cluster.
     */
    private List<PhysicalNodes> physicalNodes;

    /*
     * HostNetwork config to deploy AzureStackHCI Cluster.
     */
    private DeploymentSettingHostNetwork hostNetwork;

    /*
     * SDN Integration config to deploy AzureStackHCI Cluster.
     */
    private SdnIntegration sdnIntegration;

    /*
     * The path to the Active Directory Organizational Unit container object prepared for the deployment.
     */
    private String adouPath;

    /*
     * Azure keyvault endpoint. This property is deprecated from 2023-12-01-preview. Please use secrets property
     * instead.
     */
    private String secretsLocation;

    /*
     * secrets used for cloud deployment.
     */
    private List<EceDeploymentSecrets> secrets;

    /*
     * OptionalServices config to deploy AzureStackHCI Cluster.
     */
    private OptionalServices optionalServices;

    /**
     * Creates an instance of DeploymentData class.
     */
    public DeploymentData() {
    }

    /**
     * Get the securitySettings property: SecuritySettings to deploy AzureStackHCI Cluster.
     * 
     * @return the securitySettings value.
     */
    public DeploymentSecuritySettings securitySettings() {
        return this.securitySettings;
    }

    /**
     * Set the securitySettings property: SecuritySettings to deploy AzureStackHCI Cluster.
     * 
     * @param securitySettings the securitySettings value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withSecuritySettings(DeploymentSecuritySettings securitySettings) {
        this.securitySettings = securitySettings;
        return this;
    }

    /**
     * Get the observability property: Observability config to deploy AzureStackHCI Cluster.
     * 
     * @return the observability value.
     */
    public Observability observability() {
        return this.observability;
    }

    /**
     * Set the observability property: Observability config to deploy AzureStackHCI Cluster.
     * 
     * @param observability the observability value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withObservability(Observability observability) {
        this.observability = observability;
        return this;
    }

    /**
     * Get the cluster property: Observability config to deploy AzureStackHCI Cluster.
     * 
     * @return the cluster value.
     */
    public DeploymentCluster cluster() {
        return this.cluster;
    }

    /**
     * Set the cluster property: Observability config to deploy AzureStackHCI Cluster.
     * 
     * @param cluster the cluster value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withCluster(DeploymentCluster cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Get the storage property: Storage config to deploy AzureStackHCI Cluster.
     * 
     * @return the storage value.
     */
    public Storage storage() {
        return this.storage;
    }

    /**
     * Set the storage property: Storage config to deploy AzureStackHCI Cluster.
     * 
     * @param storage the storage value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get the namingPrefix property: naming prefix to deploy cluster.
     * 
     * @return the namingPrefix value.
     */
    public String namingPrefix() {
        return this.namingPrefix;
    }

    /**
     * Set the namingPrefix property: naming prefix to deploy cluster.
     * 
     * @param namingPrefix the namingPrefix value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withNamingPrefix(String namingPrefix) {
        this.namingPrefix = namingPrefix;
        return this;
    }

    /**
     * Get the domainFqdn property: FQDN to deploy cluster.
     * 
     * @return the domainFqdn value.
     */
    public String domainFqdn() {
        return this.domainFqdn;
    }

    /**
     * Set the domainFqdn property: FQDN to deploy cluster.
     * 
     * @param domainFqdn the domainFqdn value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withDomainFqdn(String domainFqdn) {
        this.domainFqdn = domainFqdn;
        return this;
    }

    /**
     * Get the infrastructureNetwork property: InfrastructureNetwork config to deploy AzureStackHCI Cluster.
     * 
     * @return the infrastructureNetwork value.
     */
    public List<InfrastructureNetwork> infrastructureNetwork() {
        return this.infrastructureNetwork;
    }

    /**
     * Set the infrastructureNetwork property: InfrastructureNetwork config to deploy AzureStackHCI Cluster.
     * 
     * @param infrastructureNetwork the infrastructureNetwork value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withInfrastructureNetwork(List<InfrastructureNetwork> infrastructureNetwork) {
        this.infrastructureNetwork = infrastructureNetwork;
        return this;
    }

    /**
     * Get the physicalNodes property: list of physical nodes config to deploy AzureStackHCI Cluster.
     * 
     * @return the physicalNodes value.
     */
    public List<PhysicalNodes> physicalNodes() {
        return this.physicalNodes;
    }

    /**
     * Set the physicalNodes property: list of physical nodes config to deploy AzureStackHCI Cluster.
     * 
     * @param physicalNodes the physicalNodes value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withPhysicalNodes(List<PhysicalNodes> physicalNodes) {
        this.physicalNodes = physicalNodes;
        return this;
    }

    /**
     * Get the hostNetwork property: HostNetwork config to deploy AzureStackHCI Cluster.
     * 
     * @return the hostNetwork value.
     */
    public DeploymentSettingHostNetwork hostNetwork() {
        return this.hostNetwork;
    }

    /**
     * Set the hostNetwork property: HostNetwork config to deploy AzureStackHCI Cluster.
     * 
     * @param hostNetwork the hostNetwork value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withHostNetwork(DeploymentSettingHostNetwork hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    /**
     * Get the sdnIntegration property: SDN Integration config to deploy AzureStackHCI Cluster.
     * 
     * @return the sdnIntegration value.
     */
    public SdnIntegration sdnIntegration() {
        return this.sdnIntegration;
    }

    /**
     * Set the sdnIntegration property: SDN Integration config to deploy AzureStackHCI Cluster.
     * 
     * @param sdnIntegration the sdnIntegration value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withSdnIntegration(SdnIntegration sdnIntegration) {
        this.sdnIntegration = sdnIntegration;
        return this;
    }

    /**
     * Get the adouPath property: The path to the Active Directory Organizational Unit container object prepared for the
     * deployment.
     * 
     * @return the adouPath value.
     */
    public String adouPath() {
        return this.adouPath;
    }

    /**
     * Set the adouPath property: The path to the Active Directory Organizational Unit container object prepared for the
     * deployment.
     * 
     * @param adouPath the adouPath value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withAdouPath(String adouPath) {
        this.adouPath = adouPath;
        return this;
    }

    /**
     * Get the secretsLocation property: Azure keyvault endpoint. This property is deprecated from 2023-12-01-preview.
     * Please use secrets property instead.
     * 
     * @return the secretsLocation value.
     */
    public String secretsLocation() {
        return this.secretsLocation;
    }

    /**
     * Set the secretsLocation property: Azure keyvault endpoint. This property is deprecated from 2023-12-01-preview.
     * Please use secrets property instead.
     * 
     * @param secretsLocation the secretsLocation value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withSecretsLocation(String secretsLocation) {
        this.secretsLocation = secretsLocation;
        return this;
    }

    /**
     * Get the secrets property: secrets used for cloud deployment.
     * 
     * @return the secrets value.
     */
    public List<EceDeploymentSecrets> secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: secrets used for cloud deployment.
     * 
     * @param secrets the secrets value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withSecrets(List<EceDeploymentSecrets> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the optionalServices property: OptionalServices config to deploy AzureStackHCI Cluster.
     * 
     * @return the optionalServices value.
     */
    public OptionalServices optionalServices() {
        return this.optionalServices;
    }

    /**
     * Set the optionalServices property: OptionalServices config to deploy AzureStackHCI Cluster.
     * 
     * @param optionalServices the optionalServices value to set.
     * @return the DeploymentData object itself.
     */
    public DeploymentData withOptionalServices(OptionalServices optionalServices) {
        this.optionalServices = optionalServices;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securitySettings() != null) {
            securitySettings().validate();
        }
        if (observability() != null) {
            observability().validate();
        }
        if (cluster() != null) {
            cluster().validate();
        }
        if (storage() != null) {
            storage().validate();
        }
        if (infrastructureNetwork() != null) {
            infrastructureNetwork().forEach(e -> e.validate());
        }
        if (physicalNodes() != null) {
            physicalNodes().forEach(e -> e.validate());
        }
        if (hostNetwork() != null) {
            hostNetwork().validate();
        }
        if (sdnIntegration() != null) {
            sdnIntegration().validate();
        }
        if (secrets() != null) {
            secrets().forEach(e -> e.validate());
        }
        if (optionalServices() != null) {
            optionalServices().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("securitySettings", this.securitySettings);
        jsonWriter.writeJsonField("observability", this.observability);
        jsonWriter.writeJsonField("cluster", this.cluster);
        jsonWriter.writeJsonField("storage", this.storage);
        jsonWriter.writeStringField("namingPrefix", this.namingPrefix);
        jsonWriter.writeStringField("domainFqdn", this.domainFqdn);
        jsonWriter.writeArrayField("infrastructureNetwork", this.infrastructureNetwork,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("physicalNodes", this.physicalNodes, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("hostNetwork", this.hostNetwork);
        jsonWriter.writeJsonField("sdnIntegration", this.sdnIntegration);
        jsonWriter.writeStringField("adouPath", this.adouPath);
        jsonWriter.writeStringField("secretsLocation", this.secretsLocation);
        jsonWriter.writeArrayField("secrets", this.secrets, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("optionalServices", this.optionalServices);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeploymentData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeploymentData if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeploymentData.
     */
    public static DeploymentData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeploymentData deserializedDeploymentData = new DeploymentData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("securitySettings".equals(fieldName)) {
                    deserializedDeploymentData.securitySettings = DeploymentSecuritySettings.fromJson(reader);
                } else if ("observability".equals(fieldName)) {
                    deserializedDeploymentData.observability = Observability.fromJson(reader);
                } else if ("cluster".equals(fieldName)) {
                    deserializedDeploymentData.cluster = DeploymentCluster.fromJson(reader);
                } else if ("storage".equals(fieldName)) {
                    deserializedDeploymentData.storage = Storage.fromJson(reader);
                } else if ("namingPrefix".equals(fieldName)) {
                    deserializedDeploymentData.namingPrefix = reader.getString();
                } else if ("domainFqdn".equals(fieldName)) {
                    deserializedDeploymentData.domainFqdn = reader.getString();
                } else if ("infrastructureNetwork".equals(fieldName)) {
                    List<InfrastructureNetwork> infrastructureNetwork
                        = reader.readArray(reader1 -> InfrastructureNetwork.fromJson(reader1));
                    deserializedDeploymentData.infrastructureNetwork = infrastructureNetwork;
                } else if ("physicalNodes".equals(fieldName)) {
                    List<PhysicalNodes> physicalNodes = reader.readArray(reader1 -> PhysicalNodes.fromJson(reader1));
                    deserializedDeploymentData.physicalNodes = physicalNodes;
                } else if ("hostNetwork".equals(fieldName)) {
                    deserializedDeploymentData.hostNetwork = DeploymentSettingHostNetwork.fromJson(reader);
                } else if ("sdnIntegration".equals(fieldName)) {
                    deserializedDeploymentData.sdnIntegration = SdnIntegration.fromJson(reader);
                } else if ("adouPath".equals(fieldName)) {
                    deserializedDeploymentData.adouPath = reader.getString();
                } else if ("secretsLocation".equals(fieldName)) {
                    deserializedDeploymentData.secretsLocation = reader.getString();
                } else if ("secrets".equals(fieldName)) {
                    List<EceDeploymentSecrets> secrets
                        = reader.readArray(reader1 -> EceDeploymentSecrets.fromJson(reader1));
                    deserializedDeploymentData.secrets = secrets;
                } else if ("optionalServices".equals(fieldName)) {
                    deserializedDeploymentData.optionalServices = OptionalServices.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeploymentData;
        });
    }
}
