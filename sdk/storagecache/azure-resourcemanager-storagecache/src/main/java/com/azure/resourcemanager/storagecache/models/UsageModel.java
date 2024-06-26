// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.resourcemanager.storagecache.fluent.models.UsageModelInner;

/**
 * An immutable client-side representation of UsageModel.
 */
public interface UsageModel {
    /**
     * Gets the display property: Localized information describing this usage model.
     * 
     * @return the display value.
     */
    UsageModelDisplay display();

    /**
     * Gets the modelName property: Non-localized keyword name for this usage model.
     * 
     * @return the modelName value.
     */
    String modelName();

    /**
     * Gets the targetType property: The type of Storage Target to which this model is applicable (only nfs3 as of this
     * version).
     * 
     * @return the targetType value.
     */
    String targetType();

    /**
     * Gets the inner com.azure.resourcemanager.storagecache.fluent.models.UsageModelInner object.
     * 
     * @return the inner object.
     */
    UsageModelInner innerModel();
}
