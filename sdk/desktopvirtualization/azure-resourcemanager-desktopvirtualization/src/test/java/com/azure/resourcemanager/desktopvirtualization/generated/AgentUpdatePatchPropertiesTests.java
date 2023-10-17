// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.AgentUpdatePatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.MaintenanceWindowPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostComponentUpdateType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AgentUpdatePatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentUpdatePatchProperties model =
            BinaryData
                .fromString(
                    "{\"type\":\"Scheduled\",\"useSessionHostLocalTime\":false,\"maintenanceWindowTimeZone\":\"lzywemhzrncsdtc\",\"maintenanceWindows\":[{\"hour\":2121256273,\"dayOfWeek\":\"Thursday\"},{\"hour\":1674447280,\"dayOfWeek\":\"Thursday\"}]}")
                .toObject(AgentUpdatePatchProperties.class);
        Assertions.assertEquals(SessionHostComponentUpdateType.SCHEDULED, model.type());
        Assertions.assertEquals(false, model.useSessionHostLocalTime());
        Assertions.assertEquals("lzywemhzrncsdtc", model.maintenanceWindowTimeZone());
        Assertions.assertEquals(2121256273, model.maintenanceWindows().get(0).hour());
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.maintenanceWindows().get(0).dayOfWeek());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentUpdatePatchProperties model =
            new AgentUpdatePatchProperties()
                .withType(SessionHostComponentUpdateType.SCHEDULED)
                .withUseSessionHostLocalTime(false)
                .withMaintenanceWindowTimeZone("lzywemhzrncsdtc")
                .withMaintenanceWindows(
                    Arrays
                        .asList(
                            new MaintenanceWindowPatchProperties()
                                .withHour(2121256273)
                                .withDayOfWeek(DayOfWeek.THURSDAY),
                            new MaintenanceWindowPatchProperties()
                                .withHour(1674447280)
                                .withDayOfWeek(DayOfWeek.THURSDAY)));
        model = BinaryData.fromObject(model).toObject(AgentUpdatePatchProperties.class);
        Assertions.assertEquals(SessionHostComponentUpdateType.SCHEDULED, model.type());
        Assertions.assertEquals(false, model.useSessionHostLocalTime());
        Assertions.assertEquals("lzywemhzrncsdtc", model.maintenanceWindowTimeZone());
        Assertions.assertEquals(2121256273, model.maintenanceWindows().get(0).hour());
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.maintenanceWindows().get(0).dayOfWeek());
    }
}
