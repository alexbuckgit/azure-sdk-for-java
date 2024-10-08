// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AadAuthTypeWorkspaceConnectionProperties;
import com.azure.resourcemanager.machinelearning.models.ConnectionCategory;
import com.azure.resourcemanager.machinelearning.models.ValueFormat;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AadAuthTypeWorkspaceConnectionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AadAuthTypeWorkspaceConnectionProperties model = BinaryData.fromString(
            "{\"authType\":\"AAD\",\"category\":\"MySql\",\"createdByWorkspaceArmId\":\"dixqbo\",\"expiryTime\":\"2021-04-26T10:17:01Z\",\"group\":\"NoSQL\",\"isSharedToAll\":false,\"target\":\"egatxgrznm\",\"metadata\":{\"bmgjymncjc\":\"mtsdixchwk\",\"cqzoofjnqjsve\":\"gair\"},\"sharedUserList\":[\"htleberpyljek\",\"fqnwjjqx\",\"wkdnjrxgkrhwiehy\"],\"value\":\"nowawonoehrguqlh\",\"valueFormat\":\"JSON\"}")
            .toObject(AadAuthTypeWorkspaceConnectionProperties.class);
        Assertions.assertEquals(ConnectionCategory.MY_SQL, model.category());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-26T10:17:01Z"), model.expiryTime());
        Assertions.assertEquals(false, model.isSharedToAll());
        Assertions.assertEquals("egatxgrznm", model.target());
        Assertions.assertEquals("mtsdixchwk", model.metadata().get("bmgjymncjc"));
        Assertions.assertEquals("htleberpyljek", model.sharedUserList().get(0));
        Assertions.assertEquals("nowawonoehrguqlh", model.value());
        Assertions.assertEquals(ValueFormat.JSON, model.valueFormat());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AadAuthTypeWorkspaceConnectionProperties model
            = new AadAuthTypeWorkspaceConnectionProperties().withCategory(ConnectionCategory.MY_SQL)
                .withExpiryTime(OffsetDateTime.parse("2021-04-26T10:17:01Z"))
                .withIsSharedToAll(false)
                .withTarget("egatxgrznm")
                .withMetadata(mapOf("bmgjymncjc", "mtsdixchwk", "cqzoofjnqjsve", "gair"))
                .withSharedUserList(Arrays.asList("htleberpyljek", "fqnwjjqx", "wkdnjrxgkrhwiehy"))
                .withValue("nowawonoehrguqlh")
                .withValueFormat(ValueFormat.JSON);
        model = BinaryData.fromObject(model).toObject(AadAuthTypeWorkspaceConnectionProperties.class);
        Assertions.assertEquals(ConnectionCategory.MY_SQL, model.category());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-26T10:17:01Z"), model.expiryTime());
        Assertions.assertEquals(false, model.isSharedToAll());
        Assertions.assertEquals("egatxgrznm", model.target());
        Assertions.assertEquals("mtsdixchwk", model.metadata().get("bmgjymncjc"));
        Assertions.assertEquals("htleberpyljek", model.sharedUserList().get(0));
        Assertions.assertEquals("nowawonoehrguqlh", model.value());
        Assertions.assertEquals(ValueFormat.JSON, model.valueFormat());
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
