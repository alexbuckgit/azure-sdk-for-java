// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Get Daily Air Quality Forecast call. */
@Fluent
public final class DailyAirQualityForecastResult {
    /*
     * A list of all daily air quality forecasts for the queried location.
     */
    @JsonProperty(value = "results")
    private List<DailyAirQuality> airQualityResults;

    /*
     * The is the link to the next page of the features returned. If it's the last page, no this field.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Set default DailyAirQualityForecastResult constructor to private */
    private DailyAirQualityForecastResult() {}

    /**
     * Get the airQualityResults property: A list of all daily air quality forecasts for the queried location.
     *
     * @return the airQualityResults value.
     */
    public List<DailyAirQuality> getAirQualityResults() {
        return this.airQualityResults;
    }

    /**
     * Get the nextLink property: The is the link to the next page of the features returned. If it's the last page, no
     * this field.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
