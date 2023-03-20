// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Container App container definition. */
@Fluent
public final class Container {
    /*
     * Container image tag.
     */
    @JsonProperty(value = "image")
    private String image;

    /*
     * Custom container name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Container start command.
     */
    @JsonProperty(value = "command")
    private List<String> command;

    /*
     * Container start command arguments.
     */
    @JsonProperty(value = "args")
    private List<String> args;

    /*
     * Container environment variables.
     */
    @JsonProperty(value = "env")
    private List<EnvironmentVar> env;

    /*
     * Container resource requirements.
     */
    @JsonProperty(value = "resources")
    private ContainerResources resources;

    /** Creates an instance of Container class. */
    public Container() {
    }

    /**
     * Get the image property: Container image tag.
     *
     * @return the image value.
     */
    public String image() {
        return this.image;
    }

    /**
     * Set the image property: Container image tag.
     *
     * @param image the image value to set.
     * @return the Container object itself.
     */
    public Container withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get the name property: Custom container name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Custom container name.
     *
     * @param name the name value to set.
     * @return the Container object itself.
     */
    public Container withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the command property: Container start command.
     *
     * @return the command value.
     */
    public List<String> command() {
        return this.command;
    }

    /**
     * Set the command property: Container start command.
     *
     * @param command the command value to set.
     * @return the Container object itself.
     */
    public Container withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    /**
     * Get the args property: Container start command arguments.
     *
     * @return the args value.
     */
    public List<String> args() {
        return this.args;
    }

    /**
     * Set the args property: Container start command arguments.
     *
     * @param args the args value to set.
     * @return the Container object itself.
     */
    public Container withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    /**
     * Get the env property: Container environment variables.
     *
     * @return the env value.
     */
    public List<EnvironmentVar> env() {
        return this.env;
    }

    /**
     * Set the env property: Container environment variables.
     *
     * @param env the env value to set.
     * @return the Container object itself.
     */
    public Container withEnv(List<EnvironmentVar> env) {
        this.env = env;
        return this;
    }

    /**
     * Get the resources property: Container resource requirements.
     *
     * @return the resources value.
     */
    public ContainerResources resources() {
        return this.resources;
    }

    /**
     * Set the resources property: Container resource requirements.
     *
     * @param resources the resources value to set.
     * @return the Container object itself.
     */
    public Container withResources(ContainerResources resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (env() != null) {
            env().forEach(e -> e.validate());
        }
        if (resources() != null) {
            resources().validate();
        }
    }
}
