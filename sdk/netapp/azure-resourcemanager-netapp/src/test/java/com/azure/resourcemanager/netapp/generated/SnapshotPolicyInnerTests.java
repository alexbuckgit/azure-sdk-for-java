// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotPolicyInner;
import com.azure.resourcemanager.netapp.models.DailySchedule;
import com.azure.resourcemanager.netapp.models.HourlySchedule;
import com.azure.resourcemanager.netapp.models.MonthlySchedule;
import com.azure.resourcemanager.netapp.models.WeeklySchedule;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SnapshotPolicyInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotPolicyInner model = BinaryData.fromString(
            "{\"etag\":\"lpcirelsf\",\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":730394428,\"minute\":1632471353,\"usedBytes\":6225068900260031070},\"dailySchedule\":{\"snapshotsToKeep\":463401012,\"hour\":1305337055,\"minute\":2043314878,\"usedBytes\":4404254248035230559},\"weeklySchedule\":{\"snapshotsToKeep\":435205940,\"day\":\"oz\",\"hour\":1294061553,\"minute\":1892687086,\"usedBytes\":6944179335245488017},\"monthlySchedule\":{\"snapshotsToKeep\":171728083,\"daysOfMonth\":\"v\",\"hour\":1536946764,\"minute\":1986199851,\"usedBytes\":8172453529452823884},\"enabled\":true,\"provisioningState\":\"sytxitcskfcktqum\"},\"location\":\"kkezzikhlyfjhdgq\",\"tags\":{\"qfatpxllrxcyjm\":\"bdunygaeqid\",\"su\":\"a\"},\"id\":\"arm\",\"name\":\"wdmjsjqbjhhyx\",\"type\":\"rw\"}")
            .toObject(SnapshotPolicyInner.class);
        Assertions.assertEquals("kkezzikhlyfjhdgq", model.location());
        Assertions.assertEquals("bdunygaeqid", model.tags().get("qfatpxllrxcyjm"));
        Assertions.assertEquals(730394428, model.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(1632471353, model.hourlySchedule().minute());
        Assertions.assertEquals(6225068900260031070L, model.hourlySchedule().usedBytes());
        Assertions.assertEquals(463401012, model.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(1305337055, model.dailySchedule().hour());
        Assertions.assertEquals(2043314878, model.dailySchedule().minute());
        Assertions.assertEquals(4404254248035230559L, model.dailySchedule().usedBytes());
        Assertions.assertEquals(435205940, model.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("oz", model.weeklySchedule().day());
        Assertions.assertEquals(1294061553, model.weeklySchedule().hour());
        Assertions.assertEquals(1892687086, model.weeklySchedule().minute());
        Assertions.assertEquals(6944179335245488017L, model.weeklySchedule().usedBytes());
        Assertions.assertEquals(171728083, model.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("v", model.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(1536946764, model.monthlySchedule().hour());
        Assertions.assertEquals(1986199851, model.monthlySchedule().minute());
        Assertions.assertEquals(8172453529452823884L, model.monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotPolicyInner model = new SnapshotPolicyInner().withLocation("kkezzikhlyfjhdgq")
            .withTags(mapOf("qfatpxllrxcyjm", "bdunygaeqid", "su", "a"))
            .withHourlySchedule(new HourlySchedule().withSnapshotsToKeep(730394428)
                .withMinute(1632471353)
                .withUsedBytes(6225068900260031070L))
            .withDailySchedule(new DailySchedule().withSnapshotsToKeep(463401012)
                .withHour(1305337055)
                .withMinute(2043314878)
                .withUsedBytes(4404254248035230559L))
            .withWeeklySchedule(new WeeklySchedule().withSnapshotsToKeep(435205940)
                .withDay("oz")
                .withHour(1294061553)
                .withMinute(1892687086)
                .withUsedBytes(6944179335245488017L))
            .withMonthlySchedule(new MonthlySchedule().withSnapshotsToKeep(171728083)
                .withDaysOfMonth("v")
                .withHour(1536946764)
                .withMinute(1986199851)
                .withUsedBytes(8172453529452823884L))
            .withEnabled(true);
        model = BinaryData.fromObject(model).toObject(SnapshotPolicyInner.class);
        Assertions.assertEquals("kkezzikhlyfjhdgq", model.location());
        Assertions.assertEquals("bdunygaeqid", model.tags().get("qfatpxllrxcyjm"));
        Assertions.assertEquals(730394428, model.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(1632471353, model.hourlySchedule().minute());
        Assertions.assertEquals(6225068900260031070L, model.hourlySchedule().usedBytes());
        Assertions.assertEquals(463401012, model.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(1305337055, model.dailySchedule().hour());
        Assertions.assertEquals(2043314878, model.dailySchedule().minute());
        Assertions.assertEquals(4404254248035230559L, model.dailySchedule().usedBytes());
        Assertions.assertEquals(435205940, model.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("oz", model.weeklySchedule().day());
        Assertions.assertEquals(1294061553, model.weeklySchedule().hour());
        Assertions.assertEquals(1892687086, model.weeklySchedule().minute());
        Assertions.assertEquals(6944179335245488017L, model.weeklySchedule().usedBytes());
        Assertions.assertEquals(171728083, model.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("v", model.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(1536946764, model.monthlySchedule().hour());
        Assertions.assertEquals(1986199851, model.monthlySchedule().minute());
        Assertions.assertEquals(8172453529452823884L, model.monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.enabled());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
