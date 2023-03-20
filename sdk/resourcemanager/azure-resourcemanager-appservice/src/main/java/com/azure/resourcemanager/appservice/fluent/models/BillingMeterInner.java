// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * App Service billing entity that contains information about meter which the Azure billing system utilizes to charge
 * users for services.
 */
@Fluent
public final class BillingMeterInner extends ProxyOnlyResource {
    /*
     * BillingMeter resource specific properties
     */
    @JsonProperty(value = "properties")
    private BillingMeterProperties innerProperties;

    /** Creates an instance of BillingMeterInner class. */
    public BillingMeterInner() {
    }

    /**
     * Get the innerProperties property: BillingMeter resource specific properties.
     *
     * @return the innerProperties value.
     */
    private BillingMeterProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public BillingMeterInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the meterId property: Meter GUID onboarded in Commerce.
     *
     * @return the meterId value.
     */
    public String meterId() {
        return this.innerProperties() == null ? null : this.innerProperties().meterId();
    }

    /**
     * Set the meterId property: Meter GUID onboarded in Commerce.
     *
     * @param meterId the meterId value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withMeterId(String meterId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingMeterProperties();
        }
        this.innerProperties().withMeterId(meterId);
        return this;
    }

    /**
     * Get the billingLocation property: Azure Location of billable resource.
     *
     * @return the billingLocation value.
     */
    public String billingLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().billingLocation();
    }

    /**
     * Set the billingLocation property: Azure Location of billable resource.
     *
     * @param billingLocation the billingLocation value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withBillingLocation(String billingLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingMeterProperties();
        }
        this.innerProperties().withBillingLocation(billingLocation);
        return this;
    }

    /**
     * Get the shortName property: Short Name from App Service Azure pricing Page.
     *
     * @return the shortName value.
     */
    public String shortName() {
        return this.innerProperties() == null ? null : this.innerProperties().shortName();
    }

    /**
     * Set the shortName property: Short Name from App Service Azure pricing Page.
     *
     * @param shortName the shortName value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withShortName(String shortName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingMeterProperties();
        }
        this.innerProperties().withShortName(shortName);
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of the meter.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Set the friendlyName property: Friendly name of the meter.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withFriendlyName(String friendlyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingMeterProperties();
        }
        this.innerProperties().withFriendlyName(friendlyName);
        return this;
    }

    /**
     * Get the resourceType property: App Service ResourceType meter used for.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceType();
    }

    /**
     * Set the resourceType property: App Service ResourceType meter used for.
     *
     * @param resourceType the resourceType value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withResourceType(String resourceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingMeterProperties();
        }
        this.innerProperties().withResourceType(resourceType);
        return this;
    }

    /**
     * Get the osType property: App Service OS type meter used for.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Set the osType property: App Service OS type meter used for.
     *
     * @param osType the osType value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withOsType(String osType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingMeterProperties();
        }
        this.innerProperties().withOsType(osType);
        return this;
    }

    /**
     * Get the multiplier property: Meter Multiplier.
     *
     * @return the multiplier value.
     */
    public Double multiplier() {
        return this.innerProperties() == null ? null : this.innerProperties().multiplier();
    }

    /**
     * Set the multiplier property: Meter Multiplier.
     *
     * @param multiplier the multiplier value to set.
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withMultiplier(Double multiplier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BillingMeterProperties();
        }
        this.innerProperties().withMultiplier(multiplier);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
