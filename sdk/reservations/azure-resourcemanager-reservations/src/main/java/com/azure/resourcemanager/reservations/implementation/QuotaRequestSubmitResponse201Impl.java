// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.implementation;

import com.azure.resourcemanager.reservations.fluent.models.QuotaRequestSubmitResponse201Inner;
import com.azure.resourcemanager.reservations.models.QuotaRequestState;
import com.azure.resourcemanager.reservations.models.QuotaRequestSubmitResponse201;

public final class QuotaRequestSubmitResponse201Impl implements QuotaRequestSubmitResponse201 {
    private QuotaRequestSubmitResponse201Inner innerObject;

    private final com.azure.resourcemanager.reservations.ReservationsManager serviceManager;

    QuotaRequestSubmitResponse201Impl(
        QuotaRequestSubmitResponse201Inner innerObject,
        com.azure.resourcemanager.reservations.ReservationsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public QuotaRequestState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String message() {
        return this.innerModel().message();
    }

    public QuotaRequestSubmitResponse201Inner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.reservations.ReservationsManager manager() {
        return this.serviceManager;
    }
}