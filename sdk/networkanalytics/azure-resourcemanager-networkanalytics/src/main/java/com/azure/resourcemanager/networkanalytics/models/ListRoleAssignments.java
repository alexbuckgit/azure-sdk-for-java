// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.models;

import com.azure.resourcemanager.networkanalytics.fluent.models.ListRoleAssignmentsInner;
import java.util.List;

/**
 * An immutable client-side representation of ListRoleAssignments.
 */
public interface ListRoleAssignments {
    /**
     * Gets the count property: Count of role assignments.
     * 
     * @return the count value.
     */
    int count();

    /**
     * Gets the roleAssignmentResponse property: list of role assignments.
     * 
     * @return the roleAssignmentResponse value.
     */
    List<RoleAssignmentDetail> roleAssignmentResponse();

    /**
     * Gets the inner com.azure.resourcemanager.networkanalytics.fluent.models.ListRoleAssignmentsInner object.
     * 
     * @return the inner object.
     */
    ListRoleAssignmentsInner innerModel();
}
