// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.QueueSelectorAttachmentKind;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An attachment of queue selectors to resolve a queue to a job from a classification policy.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = QueueSelectorAttachmentInternal.class,
    visible = true)
@JsonTypeName("QueueSelectorAttachmentInternal")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "conditional", value = ConditionalQueueSelectorAttachmentInternal.class),
    @JsonSubTypes.Type(name = "passThrough", value = PassThroughQueueSelectorAttachmentInternal.class),
    @JsonSubTypes.Type(name = "ruleEngine", value = RuleEngineQueueSelectorAttachmentInternal.class),
    @JsonSubTypes.Type(name = "static", value = StaticQueueSelectorAttachmentInternal.class),
    @JsonSubTypes.Type(name = "weightedAllocation", value = WeightedAllocationQueueSelectorAttachmentInternal.class) })
@Immutable
public class QueueSelectorAttachmentInternal {

    /**
     * Creates an instance of QueueSelectorAttachmentInternal class.
     */
    @Generated
    public QueueSelectorAttachmentInternal() {
    }

    /*
     * The type discriminator describing a sub-type of QueueSelectorAttachment.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private QueueSelectorAttachmentKind kind
        = QueueSelectorAttachmentKind.fromString("QueueSelectorAttachmentInternal");

    /**
     * Get the kind property: The type discriminator describing a sub-type of QueueSelectorAttachment.
     *
     * @return the kind value.
     */
    @Generated
    public QueueSelectorAttachmentKind getKind() {
        return this.kind;
    }
}
