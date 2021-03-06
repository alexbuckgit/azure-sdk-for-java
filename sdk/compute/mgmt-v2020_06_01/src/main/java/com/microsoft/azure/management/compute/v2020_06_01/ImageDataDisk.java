/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a data disk.
 */
public class ImageDataDisk extends ImageDisk {
    /**
     * Specifies the logical unit number of the data disk. This value is used
     * to identify data disks within the VM and therefore must be unique for
     * each data disk attached to a VM.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /**
     * Get specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     *
     * @return the lun value
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     *
     * @param lun the lun value to set
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

}
