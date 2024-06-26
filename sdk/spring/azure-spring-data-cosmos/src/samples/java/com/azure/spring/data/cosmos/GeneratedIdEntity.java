// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos;

import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import org.springframework.data.annotation.Id;

// BEGIN: readme-sample-GeneratedIdEntity
public class GeneratedIdEntity {

    @Id
    @GeneratedValue
    private String id;

}
// END: readme-sample-GeneratedIdEntity
