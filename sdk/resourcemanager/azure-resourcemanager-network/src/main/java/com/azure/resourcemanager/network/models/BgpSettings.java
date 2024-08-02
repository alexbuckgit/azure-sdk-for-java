// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * BGP settings details.
 */
@Fluent
public final class BgpSettings implements JsonSerializable<BgpSettings> {
    /*
     * The BGP speaker's ASN.
     */
    private Long asn;

    /*
     * The BGP peering address and BGP identifier of this BGP speaker.
     */
    private String bgpPeeringAddress;

    /*
     * The weight added to routes learned from this BGP speaker.
     */
    private Integer peerWeight;

    /*
     * BGP peering address with IP configuration ID for virtual network gateway.
     */
    private List<IpConfigurationBgpPeeringAddress> bgpPeeringAddresses;

    /**
     * Creates an instance of BgpSettings class.
     */
    public BgpSettings() {
    }

    /**
     * Get the asn property: The BGP speaker's ASN.
     * 
     * @return the asn value.
     */
    public Long asn() {
        return this.asn;
    }

    /**
     * Set the asn property: The BGP speaker's ASN.
     * 
     * @param asn the asn value to set.
     * @return the BgpSettings object itself.
     */
    public BgpSettings withAsn(Long asn) {
        this.asn = asn;
        return this;
    }

    /**
     * Get the bgpPeeringAddress property: The BGP peering address and BGP identifier of this BGP speaker.
     * 
     * @return the bgpPeeringAddress value.
     */
    public String bgpPeeringAddress() {
        return this.bgpPeeringAddress;
    }

    /**
     * Set the bgpPeeringAddress property: The BGP peering address and BGP identifier of this BGP speaker.
     * 
     * @param bgpPeeringAddress the bgpPeeringAddress value to set.
     * @return the BgpSettings object itself.
     */
    public BgpSettings withBgpPeeringAddress(String bgpPeeringAddress) {
        this.bgpPeeringAddress = bgpPeeringAddress;
        return this;
    }

    /**
     * Get the peerWeight property: The weight added to routes learned from this BGP speaker.
     * 
     * @return the peerWeight value.
     */
    public Integer peerWeight() {
        return this.peerWeight;
    }

    /**
     * Set the peerWeight property: The weight added to routes learned from this BGP speaker.
     * 
     * @param peerWeight the peerWeight value to set.
     * @return the BgpSettings object itself.
     */
    public BgpSettings withPeerWeight(Integer peerWeight) {
        this.peerWeight = peerWeight;
        return this;
    }

    /**
     * Get the bgpPeeringAddresses property: BGP peering address with IP configuration ID for virtual network gateway.
     * 
     * @return the bgpPeeringAddresses value.
     */
    public List<IpConfigurationBgpPeeringAddress> bgpPeeringAddresses() {
        return this.bgpPeeringAddresses;
    }

    /**
     * Set the bgpPeeringAddresses property: BGP peering address with IP configuration ID for virtual network gateway.
     * 
     * @param bgpPeeringAddresses the bgpPeeringAddresses value to set.
     * @return the BgpSettings object itself.
     */
    public BgpSettings withBgpPeeringAddresses(List<IpConfigurationBgpPeeringAddress> bgpPeeringAddresses) {
        this.bgpPeeringAddresses = bgpPeeringAddresses;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bgpPeeringAddresses() != null) {
            bgpPeeringAddresses().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("asn", this.asn);
        jsonWriter.writeStringField("bgpPeeringAddress", this.bgpPeeringAddress);
        jsonWriter.writeNumberField("peerWeight", this.peerWeight);
        jsonWriter.writeArrayField("bgpPeeringAddresses", this.bgpPeeringAddresses,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BgpSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BgpSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BgpSettings.
     */
    public static BgpSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BgpSettings deserializedBgpSettings = new BgpSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("asn".equals(fieldName)) {
                    deserializedBgpSettings.asn = reader.getNullable(JsonReader::getLong);
                } else if ("bgpPeeringAddress".equals(fieldName)) {
                    deserializedBgpSettings.bgpPeeringAddress = reader.getString();
                } else if ("peerWeight".equals(fieldName)) {
                    deserializedBgpSettings.peerWeight = reader.getNullable(JsonReader::getInt);
                } else if ("bgpPeeringAddresses".equals(fieldName)) {
                    List<IpConfigurationBgpPeeringAddress> bgpPeeringAddresses
                        = reader.readArray(reader1 -> IpConfigurationBgpPeeringAddress.fromJson(reader1));
                    deserializedBgpSettings.bgpPeeringAddresses = bgpPeeringAddresses;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBgpSettings;
        });
    }
}
