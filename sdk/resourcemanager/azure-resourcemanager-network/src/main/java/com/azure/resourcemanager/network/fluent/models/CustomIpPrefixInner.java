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
import com.azure.resourcemanager.network.models.CommissionedState;
import com.azure.resourcemanager.network.models.CustomIpPrefixType;
import com.azure.resourcemanager.network.models.ExtendedLocation;
import com.azure.resourcemanager.network.models.Geo;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Custom IP prefix resource.
 */
@Fluent
public final class CustomIpPrefixInner extends Resource {
    /*
     * The extended location of the custom IP prefix.
     */
    private ExtendedLocation extendedLocation;

    /*
     * Custom IP prefix properties.
     */
    private CustomIpPrefixPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     */
    private List<String> zones;

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
     * Creates an instance of CustomIpPrefixInner class.
     */
    public CustomIpPrefixInner() {
    }

    /**
     * Get the extendedLocation property: The extended location of the custom IP prefix.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the custom IP prefix.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: Custom IP prefix properties.
     * 
     * @return the innerProperties value.
     */
    private CustomIpPrefixPropertiesFormat innerProperties() {
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
     * Get the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     * 
     * @param zones the zones value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withZones(List<String> zones) {
        this.zones = zones;
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
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withId(String id) {
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
    public CustomIpPrefixInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomIpPrefixInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the asn property: The ASN for CIDR advertising. Should be an integer as string.
     * 
     * @return the asn value.
     */
    public String asn() {
        return this.innerProperties() == null ? null : this.innerProperties().asn();
    }

    /**
     * Set the asn property: The ASN for CIDR advertising. Should be an integer as string.
     * 
     * @param asn the asn value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withAsn(String asn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormat();
        }
        this.innerProperties().withAsn(asn);
        return this;
    }

    /**
     * Get the cidr property: The prefix range in CIDR notation. Should include the start address and the prefix length.
     * 
     * @return the cidr value.
     */
    public String cidr() {
        return this.innerProperties() == null ? null : this.innerProperties().cidr();
    }

    /**
     * Set the cidr property: The prefix range in CIDR notation. Should include the start address and the prefix length.
     * 
     * @param cidr the cidr value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withCidr(String cidr) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormat();
        }
        this.innerProperties().withCidr(cidr);
        return this;
    }

    /**
     * Get the signedMessage property: Signed message for WAN validation.
     * 
     * @return the signedMessage value.
     */
    public String signedMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().signedMessage();
    }

    /**
     * Set the signedMessage property: Signed message for WAN validation.
     * 
     * @param signedMessage the signedMessage value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withSignedMessage(String signedMessage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormat();
        }
        this.innerProperties().withSignedMessage(signedMessage);
        return this;
    }

    /**
     * Get the authorizationMessage property: Authorization message for WAN validation.
     * 
     * @return the authorizationMessage value.
     */
    public String authorizationMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationMessage();
    }

    /**
     * Set the authorizationMessage property: Authorization message for WAN validation.
     * 
     * @param authorizationMessage the authorizationMessage value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withAuthorizationMessage(String authorizationMessage) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormat();
        }
        this.innerProperties().withAuthorizationMessage(authorizationMessage);
        return this;
    }

    /**
     * Get the customIpPrefixParent property: The Parent CustomIpPrefix for IPv6 /64 CustomIpPrefix.
     * 
     * @return the customIpPrefixParent value.
     */
    public SubResource customIpPrefixParent() {
        return this.innerProperties() == null ? null : this.innerProperties().customIpPrefixParent();
    }

    /**
     * Set the customIpPrefixParent property: The Parent CustomIpPrefix for IPv6 /64 CustomIpPrefix.
     * 
     * @param customIpPrefixParent the customIpPrefixParent value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withCustomIpPrefixParent(SubResource customIpPrefixParent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormat();
        }
        this.innerProperties().withCustomIpPrefixParent(customIpPrefixParent);
        return this;
    }

    /**
     * Get the childCustomIpPrefixes property: The list of all Children for IPv6 /48 CustomIpPrefix.
     * 
     * @return the childCustomIpPrefixes value.
     */
    public List<SubResource> childCustomIpPrefixes() {
        return this.innerProperties() == null ? null : this.innerProperties().childCustomIpPrefixes();
    }

    /**
     * Get the commissionedState property: The commissioned state of the Custom IP Prefix.
     * 
     * @return the commissionedState value.
     */
    public CommissionedState commissionedState() {
        return this.innerProperties() == null ? null : this.innerProperties().commissionedState();
    }

    /**
     * Set the commissionedState property: The commissioned state of the Custom IP Prefix.
     * 
     * @param commissionedState the commissionedState value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withCommissionedState(CommissionedState commissionedState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormat();
        }
        this.innerProperties().withCommissionedState(commissionedState);
        return this;
    }

    /**
     * Get the expressRouteAdvertise property: Whether to do express route advertise.
     * 
     * @return the expressRouteAdvertise value.
     */
    public Boolean expressRouteAdvertise() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRouteAdvertise();
    }

    /**
     * Set the expressRouteAdvertise property: Whether to do express route advertise.
     * 
     * @param expressRouteAdvertise the expressRouteAdvertise value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withExpressRouteAdvertise(Boolean expressRouteAdvertise) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormat();
        }
        this.innerProperties().withExpressRouteAdvertise(expressRouteAdvertise);
        return this;
    }

    /**
     * Get the geo property: The Geo for CIDR advertising. Should be an Geo code.
     * 
     * @return the geo value.
     */
    public Geo geo() {
        return this.innerProperties() == null ? null : this.innerProperties().geo();
    }

    /**
     * Set the geo property: The Geo for CIDR advertising. Should be an Geo code.
     * 
     * @param geo the geo value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withGeo(Geo geo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormat();
        }
        this.innerProperties().withGeo(geo);
        return this;
    }

    /**
     * Get the noInternetAdvertise property: Whether to Advertise the range to Internet.
     * 
     * @return the noInternetAdvertise value.
     */
    public Boolean noInternetAdvertise() {
        return this.innerProperties() == null ? null : this.innerProperties().noInternetAdvertise();
    }

    /**
     * Set the noInternetAdvertise property: Whether to Advertise the range to Internet.
     * 
     * @param noInternetAdvertise the noInternetAdvertise value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withNoInternetAdvertise(Boolean noInternetAdvertise) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormat();
        }
        this.innerProperties().withNoInternetAdvertise(noInternetAdvertise);
        return this;
    }

    /**
     * Get the prefixType property: Type of custom IP prefix. Should be Singular, Parent, or Child.
     * 
     * @return the prefixType value.
     */
    public CustomIpPrefixType prefixType() {
        return this.innerProperties() == null ? null : this.innerProperties().prefixType();
    }

    /**
     * Set the prefixType property: Type of custom IP prefix. Should be Singular, Parent, or Child.
     * 
     * @param prefixType the prefixType value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withPrefixType(CustomIpPrefixType prefixType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomIpPrefixPropertiesFormat();
        }
        this.innerProperties().withPrefixType(prefixType);
        return this;
    }

    /**
     * Get the publicIpPrefixes property: The list of all referenced PublicIpPrefixes.
     * 
     * @return the publicIpPrefixes value.
     */
    public List<SubResource> publicIpPrefixes() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpPrefixes();
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the custom IP prefix resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the failedReason property: The reason why resource is in failed state.
     * 
     * @return the failedReason value.
     */
    public String failedReason() {
        return this.innerProperties() == null ? null : this.innerProperties().failedReason();
    }

    /**
     * Get the provisioningState property: The provisioning state of the custom IP prefix resource.
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeArrayField("zones", this.zones, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomIpPrefixInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomIpPrefixInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomIpPrefixInner.
     */
    public static CustomIpPrefixInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomIpPrefixInner deserializedCustomIpPrefixInner = new CustomIpPrefixInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCustomIpPrefixInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCustomIpPrefixInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedCustomIpPrefixInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedCustomIpPrefixInner.withTags(tags);
                } else if ("extendedLocation".equals(fieldName)) {
                    deserializedCustomIpPrefixInner.extendedLocation = ExtendedLocation.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedCustomIpPrefixInner.innerProperties = CustomIpPrefixPropertiesFormat.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedCustomIpPrefixInner.etag = reader.getString();
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedCustomIpPrefixInner.zones = zones;
                } else if ("id".equals(fieldName)) {
                    deserializedCustomIpPrefixInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomIpPrefixInner;
        });
    }
}
