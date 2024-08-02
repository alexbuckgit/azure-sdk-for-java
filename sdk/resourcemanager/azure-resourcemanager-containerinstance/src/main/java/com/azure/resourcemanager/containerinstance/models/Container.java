// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerinstance.fluent.models.ContainerProperties;
import java.io.IOException;
import java.util.List;

/**
 * A container instance.
 */
@Fluent
public final class Container implements JsonSerializable<Container> {
    /*
     * The user-provided name of the container instance.
     */
    private String name;

    /*
     * The properties of the container instance.
     */
    private ContainerProperties innerProperties = new ContainerProperties();

    /**
     * Creates an instance of Container class.
     */
    public Container() {
    }

    /**
     * Get the name property: The user-provided name of the container instance.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The user-provided name of the container instance.
     * 
     * @param name the name value to set.
     * @return the Container object itself.
     */
    public Container withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the container instance.
     * 
     * @return the innerProperties value.
     */
    private ContainerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the image property: The name of the image used to create the container instance.
     * 
     * @return the image value.
     */
    public String image() {
        return this.innerProperties() == null ? null : this.innerProperties().image();
    }

    /**
     * Set the image property: The name of the image used to create the container instance.
     * 
     * @param image the image value to set.
     * @return the Container object itself.
     */
    public Container withImage(String image) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withImage(image);
        return this;
    }

    /**
     * Get the command property: The commands to execute within the container instance in exec form.
     * 
     * @return the command value.
     */
    public List<String> command() {
        return this.innerProperties() == null ? null : this.innerProperties().command();
    }

    /**
     * Set the command property: The commands to execute within the container instance in exec form.
     * 
     * @param command the command value to set.
     * @return the Container object itself.
     */
    public Container withCommand(List<String> command) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withCommand(command);
        return this;
    }

    /**
     * Get the ports property: The exposed ports on the container instance.
     * 
     * @return the ports value.
     */
    public List<ContainerPort> ports() {
        return this.innerProperties() == null ? null : this.innerProperties().ports();
    }

    /**
     * Set the ports property: The exposed ports on the container instance.
     * 
     * @param ports the ports value to set.
     * @return the Container object itself.
     */
    public Container withPorts(List<ContainerPort> ports) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withPorts(ports);
        return this;
    }

    /**
     * Get the environmentVariables property: The environment variables to set in the container instance.
     * 
     * @return the environmentVariables value.
     */
    public List<EnvironmentVariable> environmentVariables() {
        return this.innerProperties() == null ? null : this.innerProperties().environmentVariables();
    }

    /**
     * Set the environmentVariables property: The environment variables to set in the container instance.
     * 
     * @param environmentVariables the environmentVariables value to set.
     * @return the Container object itself.
     */
    public Container withEnvironmentVariables(List<EnvironmentVariable> environmentVariables) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Get the instanceView property: The instance view of the container instance. Only valid in response.
     * 
     * @return the instanceView value.
     */
    public ContainerPropertiesInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Get the resources property: The resource requirements of the container instance.
     * 
     * @return the resources value.
     */
    public ResourceRequirements resources() {
        return this.innerProperties() == null ? null : this.innerProperties().resources();
    }

    /**
     * Set the resources property: The resource requirements of the container instance.
     * 
     * @param resources the resources value to set.
     * @return the Container object itself.
     */
    public Container withResources(ResourceRequirements resources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withResources(resources);
        return this;
    }

    /**
     * Get the volumeMounts property: The volume mounts available to the container instance.
     * 
     * @return the volumeMounts value.
     */
    public List<VolumeMount> volumeMounts() {
        return this.innerProperties() == null ? null : this.innerProperties().volumeMounts();
    }

    /**
     * Set the volumeMounts property: The volume mounts available to the container instance.
     * 
     * @param volumeMounts the volumeMounts value to set.
     * @return the Container object itself.
     */
    public Container withVolumeMounts(List<VolumeMount> volumeMounts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withVolumeMounts(volumeMounts);
        return this;
    }

    /**
     * Get the livenessProbe property: The liveness probe.
     * 
     * @return the livenessProbe value.
     */
    public ContainerProbe livenessProbe() {
        return this.innerProperties() == null ? null : this.innerProperties().livenessProbe();
    }

    /**
     * Set the livenessProbe property: The liveness probe.
     * 
     * @param livenessProbe the livenessProbe value to set.
     * @return the Container object itself.
     */
    public Container withLivenessProbe(ContainerProbe livenessProbe) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withLivenessProbe(livenessProbe);
        return this;
    }

    /**
     * Get the readinessProbe property: The readiness probe.
     * 
     * @return the readinessProbe value.
     */
    public ContainerProbe readinessProbe() {
        return this.innerProperties() == null ? null : this.innerProperties().readinessProbe();
    }

    /**
     * Set the readinessProbe property: The readiness probe.
     * 
     * @param readinessProbe the readinessProbe value to set.
     * @return the Container object itself.
     */
    public Container withReadinessProbe(ContainerProbe readinessProbe) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withReadinessProbe(readinessProbe);
        return this;
    }

    /**
     * Get the securityContext property: The container security properties.
     * 
     * @return the securityContext value.
     */
    public SecurityContextDefinition securityContext() {
        return this.innerProperties() == null ? null : this.innerProperties().securityContext();
    }

    /**
     * Set the securityContext property: The container security properties.
     * 
     * @param securityContext the securityContext value to set.
     * @return the Container object itself.
     */
    public Container withSecurityContext(SecurityContextDefinition securityContext) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ContainerProperties();
        }
        this.innerProperties().withSecurityContext(securityContext);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model Container"));
        }
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property innerProperties in model Container"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Container.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Container from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Container if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Container.
     */
    public static Container fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Container deserializedContainer = new Container();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedContainer.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedContainer.innerProperties = ContainerProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContainer;
        });
    }
}
