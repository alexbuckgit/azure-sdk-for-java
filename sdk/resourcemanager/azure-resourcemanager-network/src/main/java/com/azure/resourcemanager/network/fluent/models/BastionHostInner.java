// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.BastionHostIpConfiguration;
import com.azure.resourcemanager.network.models.BastionHostPropertiesFormatNetworkAcls;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.Sku;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Bastion Host resource.
 */
@Fluent
public final class BastionHostInner extends Resource {
    /*
     * Represents the bastion host resource.
     */
    private BastionHostPropertiesFormat innerProperties;

    /*
     * A list of availability zones denoting where the resource needs to come from.
     */
    private List<String> zones;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * The sku of this Bastion Host.
     */
    private Sku sku;

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
     * Creates an instance of BastionHostInner class.
     */
    public BastionHostInner() {
    }

    /**
     * Get the innerProperties property: Represents the bastion host resource.
     * 
     * @return the innerProperties value.
     */
    private BastionHostPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the zones property: A list of availability zones denoting where the resource needs to come from.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting where the resource needs to come from.
     * 
     * @param zones the zones value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
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
     * Get the sku property: The sku of this Bastion Host.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of this Bastion Host.
     * 
     * @param sku the sku value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withSku(Sku sku) {
        this.sku = sku;
        return this;
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
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withId(String id) {
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
    public BastionHostInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BastionHostInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configuration of the Bastion Host resource.
     * 
     * @return the ipConfigurations value.
     */
    public List<BastionHostIpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: IP configuration of the Bastion Host resource.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withIpConfigurations(List<BastionHostIpConfiguration> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     * 
     * @return the dnsName value.
     */
    public String dnsName() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsName();
    }

    /**
     * Set the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     * 
     * @param dnsName the dnsName value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withDnsName(String dnsName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withDnsName(dnsName);
        return this;
    }

    /**
     * Get the virtualNetwork property: Reference to an existing virtual network required for Developer Bastion Host
     * only.
     * 
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetwork();
    }

    /**
     * Set the virtualNetwork property: Reference to an existing virtual network required for Developer Bastion Host
     * only.
     * 
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withVirtualNetwork(SubResource virtualNetwork) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withVirtualNetwork(virtualNetwork);
        return this;
    }

    /**
     * Get the networkAcls property: The networkAcls property.
     * 
     * @return the networkAcls value.
     */
    public BastionHostPropertiesFormatNetworkAcls networkAcls() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAcls();
    }

    /**
     * Set the networkAcls property: The networkAcls property.
     * 
     * @param networkAcls the networkAcls value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withNetworkAcls(BastionHostPropertiesFormatNetworkAcls networkAcls) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withNetworkAcls(networkAcls);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the bastion host resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the scaleUnits property: The scale units for the Bastion Host resource.
     * 
     * @return the scaleUnits value.
     */
    public Integer scaleUnits() {
        return this.innerProperties() == null ? null : this.innerProperties().scaleUnits();
    }

    /**
     * Set the scaleUnits property: The scale units for the Bastion Host resource.
     * 
     * @param scaleUnits the scaleUnits value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withScaleUnits(Integer scaleUnits) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withScaleUnits(scaleUnits);
        return this;
    }

    /**
     * Get the disableCopyPaste property: Enable/Disable Copy/Paste feature of the Bastion Host resource.
     * 
     * @return the disableCopyPaste value.
     */
    public Boolean disableCopyPaste() {
        return this.innerProperties() == null ? null : this.innerProperties().disableCopyPaste();
    }

    /**
     * Set the disableCopyPaste property: Enable/Disable Copy/Paste feature of the Bastion Host resource.
     * 
     * @param disableCopyPaste the disableCopyPaste value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withDisableCopyPaste(Boolean disableCopyPaste) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withDisableCopyPaste(disableCopyPaste);
        return this;
    }

    /**
     * Get the enableFileCopy property: Enable/Disable File Copy feature of the Bastion Host resource.
     * 
     * @return the enableFileCopy value.
     */
    public Boolean enableFileCopy() {
        return this.innerProperties() == null ? null : this.innerProperties().enableFileCopy();
    }

    /**
     * Set the enableFileCopy property: Enable/Disable File Copy feature of the Bastion Host resource.
     * 
     * @param enableFileCopy the enableFileCopy value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableFileCopy(Boolean enableFileCopy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableFileCopy(enableFileCopy);
        return this;
    }

    /**
     * Get the enableIpConnect property: Enable/Disable IP Connect feature of the Bastion Host resource.
     * 
     * @return the enableIpConnect value.
     */
    public Boolean enableIpConnect() {
        return this.innerProperties() == null ? null : this.innerProperties().enableIpConnect();
    }

    /**
     * Set the enableIpConnect property: Enable/Disable IP Connect feature of the Bastion Host resource.
     * 
     * @param enableIpConnect the enableIpConnect value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableIpConnect(Boolean enableIpConnect) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableIpConnect(enableIpConnect);
        return this;
    }

    /**
     * Get the enableShareableLink property: Enable/Disable Shareable Link of the Bastion Host resource.
     * 
     * @return the enableShareableLink value.
     */
    public Boolean enableShareableLink() {
        return this.innerProperties() == null ? null : this.innerProperties().enableShareableLink();
    }

    /**
     * Set the enableShareableLink property: Enable/Disable Shareable Link of the Bastion Host resource.
     * 
     * @param enableShareableLink the enableShareableLink value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableShareableLink(Boolean enableShareableLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableShareableLink(enableShareableLink);
        return this;
    }

    /**
     * Get the enableTunneling property: Enable/Disable Tunneling feature of the Bastion Host resource.
     * 
     * @return the enableTunneling value.
     */
    public Boolean enableTunneling() {
        return this.innerProperties() == null ? null : this.innerProperties().enableTunneling();
    }

    /**
     * Set the enableTunneling property: Enable/Disable Tunneling feature of the Bastion Host resource.
     * 
     * @param enableTunneling the enableTunneling value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableTunneling(Boolean enableTunneling) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableTunneling(enableTunneling);
        return this;
    }

    /**
     * Get the enableKerberos property: Enable/Disable Kerberos feature of the Bastion Host resource.
     * 
     * @return the enableKerberos value.
     */
    public Boolean enableKerberos() {
        return this.innerProperties() == null ? null : this.innerProperties().enableKerberos();
    }

    /**
     * Set the enableKerberos property: Enable/Disable Kerberos feature of the Bastion Host resource.
     * 
     * @param enableKerberos the enableKerberos value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableKerberos(Boolean enableKerberos) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableKerberos(enableKerberos);
        return this;
    }

    /**
     * Get the enableSessionRecording property: Enable/Disable Session Recording feature of the Bastion Host resource.
     * 
     * @return the enableSessionRecording value.
     */
    public Boolean enableSessionRecording() {
        return this.innerProperties() == null ? null : this.innerProperties().enableSessionRecording();
    }

    /**
     * Set the enableSessionRecording property: Enable/Disable Session Recording feature of the Bastion Host resource.
     * 
     * @param enableSessionRecording the enableSessionRecording value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableSessionRecording(Boolean enableSessionRecording) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableSessionRecording(enableSessionRecording);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BastionHostInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BastionHostInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BastionHostInner.
     */
    public static BastionHostInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BastionHostInner deserializedBastionHostInner = new BastionHostInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedBastionHostInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedBastionHostInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedBastionHostInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedBastionHostInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedBastionHostInner.innerProperties = BastionHostPropertiesFormat.fromJson(reader);
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedBastionHostInner.zones = zones;
                } else if ("etag".equals(fieldName)) {
                    deserializedBastionHostInner.etag = reader.getString();
                } else if ("sku".equals(fieldName)) {
                    deserializedBastionHostInner.sku = Sku.fromJson(reader);
                } else if ("id".equals(fieldName)) {
                    deserializedBastionHostInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBastionHostInner;
        });
    }
}
