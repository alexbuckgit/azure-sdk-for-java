// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.InvoicePropertiesTaxAmount;

public final class InvoicePropertiesTaxAmountTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InvoicePropertiesTaxAmount model = BinaryData.fromString("{\"currency\":\"uoqujlyeg\",\"value\":6.863165}")
            .toObject(InvoicePropertiesTaxAmount.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InvoicePropertiesTaxAmount model = new InvoicePropertiesTaxAmount();
        model = BinaryData.fromObject(model).toObject(InvoicePropertiesTaxAmount.class);
    }
}
