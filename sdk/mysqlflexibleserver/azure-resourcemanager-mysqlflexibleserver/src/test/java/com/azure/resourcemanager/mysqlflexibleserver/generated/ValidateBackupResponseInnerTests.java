// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ValidateBackupResponseInner;
import org.junit.jupiter.api.Assertions;

public final class ValidateBackupResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidateBackupResponseInner model = BinaryData.fromString("{\"properties\":{\"numberOfContainers\":148902907}}")
            .toObject(ValidateBackupResponseInner.class);
        Assertions.assertEquals(148902907, model.numberOfContainers());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidateBackupResponseInner model = new ValidateBackupResponseInner().withNumberOfContainers(148902907);
        model = BinaryData.fromObject(model).toObject(ValidateBackupResponseInner.class);
        Assertions.assertEquals(148902907, model.numberOfContainers());
    }
}
