// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SitePhpErrorLogFlag resource specific properties. */
@Fluent
public final class SitePhpErrorLogFlagProperties {
    /*
     * Local log_errors setting.
     */
    @JsonProperty(value = "localLogErrors")
    private String localLogErrors;

    /*
     * Master log_errors setting.
     */
    @JsonProperty(value = "masterLogErrors")
    private String masterLogErrors;

    /*
     * Local log_errors_max_len setting.
     */
    @JsonProperty(value = "localLogErrorsMaxLength")
    private String localLogErrorsMaxLength;

    /*
     * Master log_errors_max_len setting.
     */
    @JsonProperty(value = "masterLogErrorsMaxLength")
    private String masterLogErrorsMaxLength;

    /** Creates an instance of SitePhpErrorLogFlagProperties class. */
    public SitePhpErrorLogFlagProperties() {
    }

    /**
     * Get the localLogErrors property: Local log_errors setting.
     *
     * @return the localLogErrors value.
     */
    public String localLogErrors() {
        return this.localLogErrors;
    }

    /**
     * Set the localLogErrors property: Local log_errors setting.
     *
     * @param localLogErrors the localLogErrors value to set.
     * @return the SitePhpErrorLogFlagProperties object itself.
     */
    public SitePhpErrorLogFlagProperties withLocalLogErrors(String localLogErrors) {
        this.localLogErrors = localLogErrors;
        return this;
    }

    /**
     * Get the masterLogErrors property: Master log_errors setting.
     *
     * @return the masterLogErrors value.
     */
    public String masterLogErrors() {
        return this.masterLogErrors;
    }

    /**
     * Set the masterLogErrors property: Master log_errors setting.
     *
     * @param masterLogErrors the masterLogErrors value to set.
     * @return the SitePhpErrorLogFlagProperties object itself.
     */
    public SitePhpErrorLogFlagProperties withMasterLogErrors(String masterLogErrors) {
        this.masterLogErrors = masterLogErrors;
        return this;
    }

    /**
     * Get the localLogErrorsMaxLength property: Local log_errors_max_len setting.
     *
     * @return the localLogErrorsMaxLength value.
     */
    public String localLogErrorsMaxLength() {
        return this.localLogErrorsMaxLength;
    }

    /**
     * Set the localLogErrorsMaxLength property: Local log_errors_max_len setting.
     *
     * @param localLogErrorsMaxLength the localLogErrorsMaxLength value to set.
     * @return the SitePhpErrorLogFlagProperties object itself.
     */
    public SitePhpErrorLogFlagProperties withLocalLogErrorsMaxLength(String localLogErrorsMaxLength) {
        this.localLogErrorsMaxLength = localLogErrorsMaxLength;
        return this;
    }

    /**
     * Get the masterLogErrorsMaxLength property: Master log_errors_max_len setting.
     *
     * @return the masterLogErrorsMaxLength value.
     */
    public String masterLogErrorsMaxLength() {
        return this.masterLogErrorsMaxLength;
    }

    /**
     * Set the masterLogErrorsMaxLength property: Master log_errors_max_len setting.
     *
     * @param masterLogErrorsMaxLength the masterLogErrorsMaxLength value to set.
     * @return the SitePhpErrorLogFlagProperties object itself.
     */
    public SitePhpErrorLogFlagProperties withMasterLogErrorsMaxLength(String masterLogErrorsMaxLength) {
        this.masterLogErrorsMaxLength = masterLogErrorsMaxLength;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
