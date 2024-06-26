// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Action property bag base. */
@Fluent
public class ActionPropertiesBase {
    /*
     * Logic App Resource Id,
     * /subscriptions/{my-subscription}/resourceGroups/{my-resource-group}/providers/Microsoft.Logic/workflows/{my-workflow-id}.
     */
    @JsonProperty(value = "logicAppResourceId", required = true)
    private String logicAppResourceId;

    /**
     * Get the logicAppResourceId property: Logic App Resource Id,
     * /subscriptions/{my-subscription}/resourceGroups/{my-resource-group}/providers/Microsoft.Logic/workflows/{my-workflow-id}.
     *
     * @return the logicAppResourceId value.
     */
    public String logicAppResourceId() {
        return this.logicAppResourceId;
    }

    /**
     * Set the logicAppResourceId property: Logic App Resource Id,
     * /subscriptions/{my-subscription}/resourceGroups/{my-resource-group}/providers/Microsoft.Logic/workflows/{my-workflow-id}.
     *
     * @param logicAppResourceId the logicAppResourceId value to set.
     * @return the ActionPropertiesBase object itself.
     */
    public ActionPropertiesBase withLogicAppResourceId(String logicAppResourceId) {
        this.logicAppResourceId = logicAppResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logicAppResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property logicAppResourceId in model ActionPropertiesBase"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ActionPropertiesBase.class);
}
