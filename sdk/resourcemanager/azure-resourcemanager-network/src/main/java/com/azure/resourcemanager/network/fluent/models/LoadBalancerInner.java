// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ExtendedLocation;
import com.azure.resourcemanager.network.models.InboundNatPool;
import com.azure.resourcemanager.network.models.LoadBalancerSku;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * LoadBalancer resource.
 */
@Fluent
public final class LoadBalancerInner extends Resource {
    /*
     * The extended location of the load balancer.
     */
    private ExtendedLocation extendedLocation;

    /*
     * The load balancer SKU.
     */
    private LoadBalancerSku sku;

    /*
     * Properties of load balancer.
     */
    private LoadBalancerPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Resource ID.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of LoadBalancerInner class.
     */
    public LoadBalancerInner() {
    }

    /**
     * Get the extendedLocation property: The extended location of the load balancer.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the load balancer.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the sku property: The load balancer SKU.
     * 
     * @return the sku value.
     */
    public LoadBalancerSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The load balancer SKU.
     * 
     * @param sku the sku value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withSku(LoadBalancerSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of load balancer.
     * 
     * @return the innerProperties value.
     */
    private LoadBalancerPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoadBalancerInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load balancer.
     * 
     * @return the frontendIpConfigurations value.
     */
    public List<FrontendIpConfigurationInner> frontendIpConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendIpConfigurations();
    }

    /**
     * Set the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load balancer.
     * 
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withFrontendIpConfigurations(List<FrontendIpConfigurationInner> frontendIpConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withFrontendIpConfigurations(frontendIpConfigurations);
        return this;
    }

    /**
     * Get the backendAddressPools property: Collection of backend address pools used by a load balancer.
     * 
     * @return the backendAddressPools value.
     */
    public List<BackendAddressPoolInner> backendAddressPools() {
        return this.innerProperties() == null ? null : this.innerProperties().backendAddressPools();
    }

    /**
     * Set the backendAddressPools property: Collection of backend address pools used by a load balancer.
     * 
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withBackendAddressPools(List<BackendAddressPoolInner> backendAddressPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withBackendAddressPools(backendAddressPools);
        return this;
    }

    /**
     * Get the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     * 
     * @return the loadBalancingRules value.
     */
    public List<LoadBalancingRuleInner> loadBalancingRules() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancingRules();
    }

    /**
     * Set the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     * 
     * @param loadBalancingRules the loadBalancingRules value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withLoadBalancingRules(List<LoadBalancingRuleInner> loadBalancingRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withLoadBalancingRules(loadBalancingRules);
        return this;
    }

    /**
     * Get the probes property: Collection of probe objects used in the load balancer.
     * 
     * @return the probes value.
     */
    public List<ProbeInner> probes() {
        return this.innerProperties() == null ? null : this.innerProperties().probes();
    }

    /**
     * Set the probes property: Collection of probe objects used in the load balancer.
     * 
     * @param probes the probes value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withProbes(List<ProbeInner> probes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withProbes(probes);
        return this;
    }

    /**
     * Get the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     * @return the inboundNatRules value.
     */
    public List<InboundNatRuleInner> inboundNatRules() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundNatRules();
    }

    /**
     * Set the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     * @param inboundNatRules the inboundNatRules value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withInboundNatRules(List<InboundNatRuleInner> inboundNatRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withInboundNatRules(inboundNatRules);
        return this;
    }

    /**
     * Get the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on NICs
     * associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the
     * Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound NAT rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     * 
     * @return the inboundNatPools value.
     */
    public List<InboundNatPool> inboundNatPools() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundNatPools();
    }

    /**
     * Set the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on NICs
     * associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with the
     * Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound NAT rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     * 
     * @param inboundNatPools the inboundNatPools value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withInboundNatPools(List<InboundNatPool> inboundNatPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withInboundNatPools(inboundNatPools);
        return this;
    }

    /**
     * Get the outboundRules property: The outbound rules.
     * 
     * @return the outboundRules value.
     */
    public List<OutboundRuleInner> outboundRules() {
        return this.innerProperties() == null ? null : this.innerProperties().outboundRules();
    }

    /**
     * Set the outboundRules property: The outbound rules.
     * 
     * @param outboundRules the outboundRules value to set.
     * @return the LoadBalancerInner object itself.
     */
    public LoadBalancerInner withOutboundRules(List<OutboundRuleInner> outboundRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LoadBalancerPropertiesFormat();
        }
        this.innerProperties().withOutboundRules(outboundRules);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the load balancer resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the load balancer resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("extendedLocation", this.extendedLocation);
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancerInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancerInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LoadBalancerInner.
     */
    public static LoadBalancerInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancerInner deserializedLoadBalancerInner = new LoadBalancerInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedLoadBalancerInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedLoadBalancerInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedLoadBalancerInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedLoadBalancerInner.withTags(tags);
                } else if ("extendedLocation".equals(fieldName)) {
                    deserializedLoadBalancerInner.extendedLocation = ExtendedLocation.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedLoadBalancerInner.sku = LoadBalancerSku.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedLoadBalancerInner.innerProperties = LoadBalancerPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedLoadBalancerInner.etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedLoadBalancerInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancerInner;
        });
    }
}
