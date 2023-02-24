// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ScriptExecutionProperties;
import com.azure.resourcemanager.avs.models.ScriptExecutionParameter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScriptExecutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptExecutionProperties model =
            BinaryData
                .fromString(
                    "{\"scriptCmdletId\":\"p\",\"parameters\":[{\"type\":\"ScriptExecutionParameter\",\"name\":\"itvgbmhrixkwm\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"ijejvegrhbpn\"}],\"hiddenParameters\":[{\"type\":\"ScriptExecutionParameter\",\"name\":\"exccbdreaxhcexd\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"rvqahqkghtpwi\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"nhyjsv\"},{\"type\":\"ScriptExecutionParameter\",\"name\":\"ycxzbfvoo\"}],\"failureReason\":\"rvmtgjq\",\"timeout\":\"pyostronzmyhgfi\",\"retention\":\"sxkm\",\"submittedAt\":\"2021-10-27T14:15:12Z\",\"startedAt\":\"2020-12-24T09:43:24Z\",\"finishedAt\":\"2021-04-17T18:50:11Z\",\"provisioningState\":\"Deleting\",\"output\":[\"fxtsgum\",\"jglikkxwslolb\"],\"namedOutputs\":{\"felfktg\":\"datauzlm\",\"xeznoi\":\"datalcrpw\"},\"information\":[\"njwmwkpnbsazejj\",\"qkagfhsxt\"],\"warnings\":[\"gzxnfaazpxdtnk\",\"mkqjj\"],\"errors\":[\"envrkpyouaibrebq\",\"aysjkixqtnqttez\"]}")
                .toObject(ScriptExecutionProperties.class);
        Assertions.assertEquals("p", model.scriptCmdletId());
        Assertions.assertEquals("itvgbmhrixkwm", model.parameters().get(0).name());
        Assertions.assertEquals("exccbdreaxhcexd", model.hiddenParameters().get(0).name());
        Assertions.assertEquals("rvmtgjq", model.failureReason());
        Assertions.assertEquals("pyostronzmyhgfi", model.timeout());
        Assertions.assertEquals("sxkm", model.retention());
        Assertions.assertEquals("fxtsgum", model.output().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptExecutionProperties model =
            new ScriptExecutionProperties()
                .withScriptCmdletId("p")
                .withParameters(
                    Arrays
                        .asList(
                            new ScriptExecutionParameter().withName("itvgbmhrixkwm"),
                            new ScriptExecutionParameter().withName("ijejvegrhbpn")))
                .withHiddenParameters(
                    Arrays
                        .asList(
                            new ScriptExecutionParameter().withName("exccbdreaxhcexd"),
                            new ScriptExecutionParameter().withName("rvqahqkghtpwi"),
                            new ScriptExecutionParameter().withName("nhyjsv"),
                            new ScriptExecutionParameter().withName("ycxzbfvoo")))
                .withFailureReason("rvmtgjq")
                .withTimeout("pyostronzmyhgfi")
                .withRetention("sxkm")
                .withOutput(Arrays.asList("fxtsgum", "jglikkxwslolb"))
                .withNamedOutputs(mapOf("felfktg", "datauzlm", "xeznoi", "datalcrpw"));
        model = BinaryData.fromObject(model).toObject(ScriptExecutionProperties.class);
        Assertions.assertEquals("p", model.scriptCmdletId());
        Assertions.assertEquals("itvgbmhrixkwm", model.parameters().get(0).name());
        Assertions.assertEquals("exccbdreaxhcexd", model.hiddenParameters().get(0).name());
        Assertions.assertEquals("rvmtgjq", model.failureReason());
        Assertions.assertEquals("pyostronzmyhgfi", model.timeout());
        Assertions.assertEquals("sxkm", model.retention());
        Assertions.assertEquals("fxtsgum", model.output().get(0));
    }

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