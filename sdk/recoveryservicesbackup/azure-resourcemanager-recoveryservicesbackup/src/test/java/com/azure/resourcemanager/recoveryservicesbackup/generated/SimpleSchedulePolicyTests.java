// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.HourlySchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.ScheduleRunType;
import com.azure.resourcemanager.recoveryservicesbackup.models.SimpleSchedulePolicy;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SimpleSchedulePolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimpleSchedulePolicy model = BinaryData.fromString(
            "{\"schedulePolicyType\":\"SimpleSchedulePolicy\",\"scheduleRunFrequency\":\"Invalid\",\"scheduleRunDays\":[\"Friday\",\"Thursday\",\"Wednesday\",\"Wednesday\"],\"scheduleRunTimes\":[\"2021-09-06T01:44:02Z\"],\"hourlySchedule\":{\"interval\":1687110835,\"scheduleWindowStartTime\":\"2021-03-22T14:29:01Z\",\"scheduleWindowDuration\":982777727},\"scheduleWeeklyFrequency\":1314772316}")
            .toObject(SimpleSchedulePolicy.class);
        Assertions.assertEquals(ScheduleRunType.INVALID, model.scheduleRunFrequency());
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.scheduleRunDays().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-06T01:44:02Z"), model.scheduleRunTimes().get(0));
        Assertions.assertEquals(1687110835, model.hourlySchedule().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-22T14:29:01Z"),
            model.hourlySchedule().scheduleWindowStartTime());
        Assertions.assertEquals(982777727, model.hourlySchedule().scheduleWindowDuration());
        Assertions.assertEquals(1314772316, model.scheduleWeeklyFrequency());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimpleSchedulePolicy model = new SimpleSchedulePolicy().withScheduleRunFrequency(ScheduleRunType.INVALID)
            .withScheduleRunDays(
                Arrays.asList(DayOfWeek.FRIDAY, DayOfWeek.THURSDAY, DayOfWeek.WEDNESDAY, DayOfWeek.WEDNESDAY))
            .withScheduleRunTimes(Arrays.asList(OffsetDateTime.parse("2021-09-06T01:44:02Z")))
            .withHourlySchedule(new HourlySchedule().withInterval(1687110835)
                .withScheduleWindowStartTime(OffsetDateTime.parse("2021-03-22T14:29:01Z"))
                .withScheduleWindowDuration(982777727))
            .withScheduleWeeklyFrequency(1314772316);
        model = BinaryData.fromObject(model).toObject(SimpleSchedulePolicy.class);
        Assertions.assertEquals(ScheduleRunType.INVALID, model.scheduleRunFrequency());
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.scheduleRunDays().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-06T01:44:02Z"), model.scheduleRunTimes().get(0));
        Assertions.assertEquals(1687110835, model.hourlySchedule().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-22T14:29:01Z"),
            model.hourlySchedule().scheduleWindowStartTime());
        Assertions.assertEquals(982777727, model.hourlySchedule().scheduleWindowDuration());
        Assertions.assertEquals(1314772316, model.scheduleWeeklyFrequency());
    }
}
