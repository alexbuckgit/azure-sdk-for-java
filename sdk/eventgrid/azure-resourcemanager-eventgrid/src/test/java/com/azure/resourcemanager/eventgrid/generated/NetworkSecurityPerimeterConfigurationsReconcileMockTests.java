// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterAssociationAccessMode;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigProvisioningState;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfiguration;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationIssueSeverity;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterConfigurationIssueType;
import com.azure.resourcemanager.eventgrid.models.NetworkSecurityPerimeterResourceType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NetworkSecurityPerimeterConfigurationsReconcileMockTests {
    @Test
    public void testReconcile() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"provisioningIssues\":[{\"name\":\"qmlfv\",\"properties\":{\"issueType\":\"MissingIdentityConfiguration\",\"severity\":\"Error\",\"description\":\"qjmxpt\",\"suggestedResourceIds\":[\"puugkw\",\"rq\",\"rpahuuonjkkxuk\"],\"suggestedAccessRules\":[\"hvvpx\"]}},{\"name\":\"egcjojlleuid\",\"properties\":{\"issueType\":\"ConfigurationPropagationFailure\",\"severity\":\"Warning\",\"description\":\"gnhtmeplhbpjbap\",\"suggestedResourceIds\":[\"mmkvav\",\"c\",\"jiuaiqpmnufzh\",\"chxwwuzdmh\"],\"suggestedAccessRules\":[\"vivjm\",\"mlitqdsj\"]}},{\"name\":\"dvisco\",\"properties\":{\"issueType\":\"MissingPerimeterConfiguration\",\"severity\":\"Warning\",\"description\":\"fefndslvrqoemwsi\",\"suggestedResourceIds\":[\"ilwdqmqfy\",\"eotmf\",\"lkdlgwgna\"],\"suggestedAccessRules\":[\"u\",\"i\"]}}],\"networkSecurityPerimeter\":{\"id\":\"afixlxicwgpthd\",\"perimeterGuid\":\"mfzcfasfodropalv\",\"location\":\"tw\"},\"resourceAssociation\":{\"name\":\"kwgqrn\",\"accessMode\":\"Enforced\"},\"profile\":{\"name\":\"rcjlvkrkegtyczup\",\"accessRulesVersion\":\"yxlz\",\"accessRules\":[{\"fullyQualifiedArmId\":\"deeqzqvabmh\",\"name\":\"exduetbapfczew\",\"type\":\"rlqbpxyazkjpir\",\"properties\":{}},{\"fullyQualifiedArmId\":\"vbczwhyegb\",\"name\":\"msritjbuiggr\",\"type\":\"ozfvualjt\",\"properties\":{}}],\"diagnosticSettingsVersion\":\"vsdwsngkrfihscj\",\"enabledLogCategories\":[\"mhzbhwahfbwih\",\"nnx\"]}},\"id\":\"mvynuqqko\",\"name\":\"auratni\",\"type\":\"ppfzsclef\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        NetworkSecurityPerimeterConfiguration response = manager.networkSecurityPerimeterConfigurations()
            .reconcile("peerscd", NetworkSecurityPerimeterResourceType.DOMAINS, "nrnjrcuf", "bgacnr", "fdtncmspsanma",
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals(NetworkSecurityPerimeterConfigProvisioningState.SUCCEEDED,
            response.provisioningState());
        Assertions.assertEquals("qmlfv", response.provisioningIssues().get(0).name());
        Assertions.assertEquals(NetworkSecurityPerimeterConfigurationIssueType.MISSING_IDENTITY_CONFIGURATION,
            response.provisioningIssues().get(0).issueType());
        Assertions.assertEquals(NetworkSecurityPerimeterConfigurationIssueSeverity.ERROR,
            response.provisioningIssues().get(0).severity());
        Assertions.assertEquals("qjmxpt", response.provisioningIssues().get(0).description());
        Assertions.assertEquals("puugkw", response.provisioningIssues().get(0).suggestedResourceIds().get(0));
        Assertions.assertEquals("hvvpx", response.provisioningIssues().get(0).suggestedAccessRules().get(0));
        Assertions.assertEquals("afixlxicwgpthd", response.networkSecurityPerimeter().id());
        Assertions.assertEquals("mfzcfasfodropalv", response.networkSecurityPerimeter().perimeterGuid());
        Assertions.assertEquals("tw", response.networkSecurityPerimeter().location());
        Assertions.assertEquals("kwgqrn", response.resourceAssociation().name());
        Assertions.assertEquals(NetworkSecurityPerimeterAssociationAccessMode.ENFORCED,
            response.resourceAssociation().accessMode());
        Assertions.assertEquals("rcjlvkrkegtyczup", response.profile().name());
        Assertions.assertEquals("yxlz", response.profile().accessRulesVersion());
        Assertions.assertEquals("deeqzqvabmh", response.profile().accessRules().get(0).fullyQualifiedArmId());
        Assertions.assertEquals("exduetbapfczew", response.profile().accessRules().get(0).name());
        Assertions.assertEquals("rlqbpxyazkjpir", response.profile().accessRules().get(0).type());
        Assertions.assertEquals("vsdwsngkrfihscj", response.profile().diagnosticSettingsVersion());
        Assertions.assertEquals("mhzbhwahfbwih", response.profile().enabledLogCategories().get(0));
    }
}
