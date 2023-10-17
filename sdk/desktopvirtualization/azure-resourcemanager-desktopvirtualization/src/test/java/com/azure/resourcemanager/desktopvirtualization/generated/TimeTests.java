// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import org.junit.jupiter.api.Assertions;

public final class TimeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Time model = BinaryData.fromString("{\"hour\":1797950253,\"minute\":1146711687}").toObject(Time.class);
        Assertions.assertEquals(1797950253, model.hour());
        Assertions.assertEquals(1146711687, model.minute());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Time model = new Time().withHour(1797950253).withMinute(1146711687);
        model = BinaryData.fromObject(model).toObject(Time.class);
        Assertions.assertEquals(1797950253, model.hour());
        Assertions.assertEquals(1146711687, model.minute());
    }
}
