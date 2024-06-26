// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.SecureInputOutputPolicy;
import com.azure.resourcemanager.datafactory.models.SetVariableActivity;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SetVariableActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SetVariableActivity model = BinaryData.fromString(
            "{\"type\":\"zd\",\"typeProperties\":{\"variableName\":\"rkvhgn\",\"value\":\"dataxmmpuksvoimdg\",\"setSystemVariable\":false},\"policy\":{\"secureInput\":false,\"secureOutput\":false},\"name\":\"ggghwxpgftshcss\",\"description\":\"eplpphfezzgnwx\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"zgvtjrobowhcvssm\",\"dependencyConditions\":[\"Failed\",\"Failed\"],\"\":{\"o\":\"datalxrgqmuth\"}},{\"activity\":\"dmhypptfppmu\",\"dependencyConditions\":[\"Skipped\",\"Skipped\"],\"\":{\"z\":\"datahgwqqtbubkyi\"}},{\"activity\":\"hitdqmbo\",\"dependencyConditions\":[\"Succeeded\"],\"\":{\"drkolpnebn\":\"datasitgpzablkcvkm\",\"jdbdjxvcxepjfxcm\":\"dataafvks\"}}],\"userProperties\":[{\"name\":\"vwcmt\",\"value\":\"dataetflirbvqkbxg\"},{\"name\":\"epinyursqfhrzpy\",\"value\":\"datamfipvgmlf\"},{\"name\":\"bwfxssxarxvftlls\",\"value\":\"dataqa\"},{\"name\":\"kd\",\"value\":\"datagr\"}],\"\":{\"y\":\"datatfky\"}}")
            .toObject(SetVariableActivity.class);
        Assertions.assertEquals("ggghwxpgftshcss", model.name());
        Assertions.assertEquals("eplpphfezzgnwx", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("zgvtjrobowhcvssm", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("vwcmt", model.userProperties().get(0).name());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("rkvhgn", model.variableName());
        Assertions.assertEquals(false, model.setSystemVariable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SetVariableActivity model
            = new SetVariableActivity().withName("ggghwxpgftshcss")
                .withDescription("eplpphfezzgnwx")
                .withState(ActivityState.ACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                .withDependsOn(
                    Arrays.asList(
                        new ActivityDependency().withActivity("zgvtjrobowhcvssm")
                            .withDependencyConditions(
                                Arrays.asList(DependencyCondition.FAILED, DependencyCondition.FAILED))
                            .withAdditionalProperties(mapOf()),
                        new ActivityDependency().withActivity("dmhypptfppmu")
                            .withDependencyConditions(
                                Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SKIPPED))
                            .withAdditionalProperties(mapOf()),
                        new ActivityDependency().withActivity("hitdqmbo")
                            .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                            .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("vwcmt").withValue("dataetflirbvqkbxg"),
                    new UserProperty().withName("epinyursqfhrzpy").withValue("datamfipvgmlf"),
                    new UserProperty().withName("bwfxssxarxvftlls").withValue("dataqa"),
                    new UserProperty().withName("kd").withValue("datagr")))
                .withPolicy(new SecureInputOutputPolicy().withSecureInput(false).withSecureOutput(false))
                .withVariableName("rkvhgn")
                .withValue("dataxmmpuksvoimdg")
                .withSetSystemVariable(false);
        model = BinaryData.fromObject(model).toObject(SetVariableActivity.class);
        Assertions.assertEquals("ggghwxpgftshcss", model.name());
        Assertions.assertEquals("eplpphfezzgnwx", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("zgvtjrobowhcvssm", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("vwcmt", model.userProperties().get(0).name());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("rkvhgn", model.variableName());
        Assertions.assertEquals(false, model.setSystemVariable());
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
