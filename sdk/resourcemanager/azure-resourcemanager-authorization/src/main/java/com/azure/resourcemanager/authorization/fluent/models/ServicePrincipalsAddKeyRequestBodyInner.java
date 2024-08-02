// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The ServicePrincipalsAddKeyRequestBody model.
 */
@Fluent
public final class ServicePrincipalsAddKeyRequestBodyInner
    implements JsonSerializable<ServicePrincipalsAddKeyRequestBodyInner> {
    /*
     * keyCredential
     */
    private MicrosoftGraphKeyCredentialInner keyCredential;

    /*
     * passwordCredential
     */
    private MicrosoftGraphPasswordCredentialInner passwordCredential;

    /*
     * The proof property.
     */
    private String proof;

    /*
     * Dictionary of <AnyObject>
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of ServicePrincipalsAddKeyRequestBodyInner class.
     */
    public ServicePrincipalsAddKeyRequestBodyInner() {
    }

    /**
     * Get the keyCredential property: keyCredential.
     * 
     * @return the keyCredential value.
     */
    public MicrosoftGraphKeyCredentialInner keyCredential() {
        return this.keyCredential;
    }

    /**
     * Set the keyCredential property: keyCredential.
     * 
     * @param keyCredential the keyCredential value to set.
     * @return the ServicePrincipalsAddKeyRequestBodyInner object itself.
     */
    public ServicePrincipalsAddKeyRequestBodyInner withKeyCredential(MicrosoftGraphKeyCredentialInner keyCredential) {
        this.keyCredential = keyCredential;
        return this;
    }

    /**
     * Get the passwordCredential property: passwordCredential.
     * 
     * @return the passwordCredential value.
     */
    public MicrosoftGraphPasswordCredentialInner passwordCredential() {
        return this.passwordCredential;
    }

    /**
     * Set the passwordCredential property: passwordCredential.
     * 
     * @param passwordCredential the passwordCredential value to set.
     * @return the ServicePrincipalsAddKeyRequestBodyInner object itself.
     */
    public ServicePrincipalsAddKeyRequestBodyInner
        withPasswordCredential(MicrosoftGraphPasswordCredentialInner passwordCredential) {
        this.passwordCredential = passwordCredential;
        return this;
    }

    /**
     * Get the proof property: The proof property.
     * 
     * @return the proof value.
     */
    public String proof() {
        return this.proof;
    }

    /**
     * Set the proof property: The proof property.
     * 
     * @param proof the proof value to set.
     * @return the ServicePrincipalsAddKeyRequestBodyInner object itself.
     */
    public ServicePrincipalsAddKeyRequestBodyInner withProof(String proof) {
        this.proof = proof;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;AnyObject&gt;.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;AnyObject&gt;.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the ServicePrincipalsAddKeyRequestBodyInner object itself.
     */
    public ServicePrincipalsAddKeyRequestBodyInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyCredential() != null) {
            keyCredential().validate();
        }
        if (passwordCredential() != null) {
            passwordCredential().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("keyCredential", this.keyCredential);
        jsonWriter.writeJsonField("passwordCredential", this.passwordCredential);
        jsonWriter.writeStringField("proof", this.proof);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServicePrincipalsAddKeyRequestBodyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServicePrincipalsAddKeyRequestBodyInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServicePrincipalsAddKeyRequestBodyInner.
     */
    public static ServicePrincipalsAddKeyRequestBodyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServicePrincipalsAddKeyRequestBodyInner deserializedServicePrincipalsAddKeyRequestBodyInner
                = new ServicePrincipalsAddKeyRequestBodyInner();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyCredential".equals(fieldName)) {
                    deserializedServicePrincipalsAddKeyRequestBodyInner.keyCredential
                        = MicrosoftGraphKeyCredentialInner.fromJson(reader);
                } else if ("passwordCredential".equals(fieldName)) {
                    deserializedServicePrincipalsAddKeyRequestBodyInner.passwordCredential
                        = MicrosoftGraphPasswordCredentialInner.fromJson(reader);
                } else if ("proof".equals(fieldName)) {
                    deserializedServicePrincipalsAddKeyRequestBodyInner.proof = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedServicePrincipalsAddKeyRequestBodyInner.additionalProperties = additionalProperties;

            return deserializedServicePrincipalsAddKeyRequestBodyInner;
        });
    }
}
