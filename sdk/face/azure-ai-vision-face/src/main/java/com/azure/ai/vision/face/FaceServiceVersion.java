// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.vision.face;

import com.azure.core.util.ServiceVersion;

/**
 * Service version of FaceClient.
 */
public enum FaceServiceVersion implements ServiceVersion {
    /**
     * Enum value v1.1-preview.1.
     */
    V1_1_PREVIEW_1("v1.1-preview.1"),

    /**
     * Enum value v1.2-preview.1.
     */
    V1_2_PREVIEW_1("v1.2-preview.1");

    private final String version;

    FaceServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     * 
     * @return The latest {@link FaceServiceVersion}.
     */
    public static FaceServiceVersion getLatest() {
        return V1_2_PREVIEW_1;
    }
}
