// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.BillingProfileInner;

/** Resource collection API of BillingProfiles. */
public interface BillingProfiles {
    /**
     * Lists the billing profiles that a user has access to. The operation is supported for billing accounts with
     * agreement type Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing profiles as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BillingProfile> listByBillingAccount(String billingAccountName);

    /**
     * Lists the billing profiles that a user has access to. The operation is supported for billing accounts with
     * agreement type Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the invoice sections.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing profiles as paginated response with {@link PagedIterable}.
     */
    PagedIterable<BillingProfile> listByBillingAccount(String billingAccountName, String expand, Context context);

    /**
     * Gets a billing profile by its ID. The operation is supported for billing accounts with agreement type Microsoft
     * Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param expand May be used to expand the invoice sections.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing profile by its ID along with {@link Response}.
     */
    Response<BillingProfile> getWithResponse(
        String billingAccountName, String billingProfileName, String expand, Context context);

    /**
     * Gets a billing profile by its ID. The operation is supported for billing accounts with agreement type Microsoft
     * Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing profile by its ID.
     */
    BillingProfile get(String billingAccountName, String billingProfileName);

    /**
     * Creates or updates a billing profile. The operation is supported for billing accounts with agreement type
     * Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters The new or updated billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing profile.
     */
    BillingProfile createOrUpdate(String billingAccountName, String billingProfileName, BillingProfileInner parameters);

    /**
     * Creates or updates a billing profile. The operation is supported for billing accounts with agreement type
     * Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters The new or updated billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing profile.
     */
    BillingProfile createOrUpdate(
        String billingAccountName, String billingProfileName, BillingProfileInner parameters, Context context);
}
