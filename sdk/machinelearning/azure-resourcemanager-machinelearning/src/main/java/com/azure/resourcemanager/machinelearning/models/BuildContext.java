// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Configuration settings for Docker build context.
 */
@Fluent
public final class BuildContext implements JsonSerializable<BuildContext> {
    /*
     * [Required] URI of the Docker build context used to build the image. Supports blob URIs on environment creation
     * and may return blob or Git URIs.
     * <seealso href="https://docs.docker.com/engine/reference/commandline/build/#extended-description" />
     */
    private String contextUri;

    /*
     * Path to the Dockerfile in the build context.
     * <seealso href="https://docs.docker.com/engine/reference/builder/" />
     */
    private String dockerfilePath;

    /**
     * Creates an instance of BuildContext class.
     */
    public BuildContext() {
    }

    /**
     * Get the contextUri property: [Required] URI of the Docker build context used to build the image. Supports blob
     * URIs on environment creation and may return blob or Git URIs.
     * &lt;seealso href="https://docs.docker.com/engine/reference/commandline/build/#extended-description" /&gt;.
     * 
     * @return the contextUri value.
     */
    public String contextUri() {
        return this.contextUri;
    }

    /**
     * Set the contextUri property: [Required] URI of the Docker build context used to build the image. Supports blob
     * URIs on environment creation and may return blob or Git URIs.
     * &lt;seealso href="https://docs.docker.com/engine/reference/commandline/build/#extended-description" /&gt;.
     * 
     * @param contextUri the contextUri value to set.
     * @return the BuildContext object itself.
     */
    public BuildContext withContextUri(String contextUri) {
        this.contextUri = contextUri;
        return this;
    }

    /**
     * Get the dockerfilePath property: Path to the Dockerfile in the build context.
     * &lt;seealso href="https://docs.docker.com/engine/reference/builder/" /&gt;.
     * 
     * @return the dockerfilePath value.
     */
    public String dockerfilePath() {
        return this.dockerfilePath;
    }

    /**
     * Set the dockerfilePath property: Path to the Dockerfile in the build context.
     * &lt;seealso href="https://docs.docker.com/engine/reference/builder/" /&gt;.
     * 
     * @param dockerfilePath the dockerfilePath value to set.
     * @return the BuildContext object itself.
     */
    public BuildContext withDockerfilePath(String dockerfilePath) {
        this.dockerfilePath = dockerfilePath;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contextUri() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property contextUri in model BuildContext"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BuildContext.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("contextUri", this.contextUri);
        jsonWriter.writeStringField("dockerfilePath", this.dockerfilePath);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BuildContext from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BuildContext if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BuildContext.
     */
    public static BuildContext fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BuildContext deserializedBuildContext = new BuildContext();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("contextUri".equals(fieldName)) {
                    deserializedBuildContext.contextUri = reader.getString();
                } else if ("dockerfilePath".equals(fieldName)) {
                    deserializedBuildContext.dockerfilePath = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBuildContext;
        });
    }
}
