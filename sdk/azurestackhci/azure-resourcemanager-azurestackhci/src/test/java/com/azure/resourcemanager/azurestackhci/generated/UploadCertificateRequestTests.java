// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.RawCertificateData;
import com.azure.resourcemanager.azurestackhci.models.UploadCertificateRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UploadCertificateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UploadCertificateRequest model
            = BinaryData.fromString("{\"properties\":{\"certificates\":[\"isgwbnbbeldawkz\",\"ali\"]}}")
                .toObject(UploadCertificateRequest.class);
        Assertions.assertEquals("isgwbnbbeldawkz", model.properties().certificates().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UploadCertificateRequest model = new UploadCertificateRequest()
            .withProperties(new RawCertificateData().withCertificates(Arrays.asList("isgwbnbbeldawkz", "ali")));
        model = BinaryData.fromObject(model).toObject(UploadCertificateRequest.class);
        Assertions.assertEquals("isgwbnbbeldawkz", model.properties().certificates().get(0));
    }
}
