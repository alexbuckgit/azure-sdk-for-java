// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AlertsSuppressionRuleInner;
import com.azure.resourcemanager.security.models.RuleState;
import com.azure.resourcemanager.security.models.SuppressionAlertsScope;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AlertsSuppressionRuleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AlertsSuppressionRuleInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"alertType\":\"vhmxtdrjfu\",\"lastModifiedUtc\":\"2021-09-25T19:58:32Z\",\"expirationDateUtc\":\"2021-07-27T22:13:32Z\",\"reason\":\"bj\",\"state\":\"Expired\",\"comment\":\"zcjznmwcpmgua\",\"suppressionAlertsScope\":{\"allOf\":[]}},\"id\":\"aufactkahzovajjz\",\"name\":\"uxxpshne\",\"type\":\"kulfg\"}")
                .toObject(AlertsSuppressionRuleInner.class);
        Assertions.assertEquals("vhmxtdrjfu", model.alertType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-27T22:13:32Z"), model.expirationDateUtc());
        Assertions.assertEquals("bj", model.reason());
        Assertions.assertEquals(RuleState.EXPIRED, model.state());
        Assertions.assertEquals("zcjznmwcpmgua", model.comment());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AlertsSuppressionRuleInner model =
            new AlertsSuppressionRuleInner()
                .withAlertType("vhmxtdrjfu")
                .withExpirationDateUtc(OffsetDateTime.parse("2021-07-27T22:13:32Z"))
                .withReason("bj")
                .withState(RuleState.EXPIRED)
                .withComment("zcjznmwcpmgua")
                .withSuppressionAlertsScope(new SuppressionAlertsScope().withAllOf(Arrays.asList()));
        model = BinaryData.fromObject(model).toObject(AlertsSuppressionRuleInner.class);
        Assertions.assertEquals("vhmxtdrjfu", model.alertType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-27T22:13:32Z"), model.expirationDateUtc());
        Assertions.assertEquals("bj", model.reason());
        Assertions.assertEquals(RuleState.EXPIRED, model.state());
        Assertions.assertEquals("zcjznmwcpmgua", model.comment());
    }
}