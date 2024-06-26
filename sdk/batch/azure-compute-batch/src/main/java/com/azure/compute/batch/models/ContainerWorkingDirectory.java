// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * ContainerWorkingDirectory enums.
 */
public final class ContainerWorkingDirectory extends ExpandableStringEnum<ContainerWorkingDirectory> {

    /**
     * Use the standard Batch service Task working directory, which will contain the Task Resource Files populated by
     * Batch.
     */
    @Generated
    public static final ContainerWorkingDirectory TASK_WORKING_DIRECTORY = fromString("taskWorkingDirectory");

    /**
     * Use the working directory defined in the container Image. Beware that this directory will not contain the
     * Resource Files downloaded by Batch.
     */
    @Generated
    public static final ContainerWorkingDirectory CONTAINER_IMAGE_DEFAULT = fromString("containerImageDefault");

    /**
     * Creates a new instance of ContainerWorkingDirectory value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ContainerWorkingDirectory() {
    }

    /**
     * Creates or finds a ContainerWorkingDirectory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContainerWorkingDirectory.
     */
    @Generated
    public static ContainerWorkingDirectory fromString(String name) {
        return fromString(name, ContainerWorkingDirectory.class);
    }

    /**
     * Gets known ContainerWorkingDirectory values.
     *
     * @return known ContainerWorkingDirectory values.
     */
    @Generated
    public static Collection<ContainerWorkingDirectory> values() {
        return values(ContainerWorkingDirectory.class);
    }
}
