// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The authorization properties for accessing the source code repository.
 */
@Fluent
public final class AuthInfo implements JsonSerializable<AuthInfo> {
    /*
     * The type of Auth token.
     */
    private TokenType tokenType;

    /*
     * The access token used to access the source control provider.
     */
    private String token;

    /*
     * The refresh token used to refresh the access token.
     */
    private String refreshToken;

    /*
     * The scope of the access token.
     */
    private String scope;

    /*
     * Time in seconds that the token remains valid
     */
    private Integer expiresIn;

    /**
     * Creates an instance of AuthInfo class.
     */
    public AuthInfo() {
    }

    /**
     * Get the tokenType property: The type of Auth token.
     * 
     * @return the tokenType value.
     */
    public TokenType tokenType() {
        return this.tokenType;
    }

    /**
     * Set the tokenType property: The type of Auth token.
     * 
     * @param tokenType the tokenType value to set.
     * @return the AuthInfo object itself.
     */
    public AuthInfo withTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Get the token property: The access token used to access the source control provider.
     * 
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token property: The access token used to access the source control provider.
     * 
     * @param token the token value to set.
     * @return the AuthInfo object itself.
     */
    public AuthInfo withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the refreshToken property: The refresh token used to refresh the access token.
     * 
     * @return the refreshToken value.
     */
    public String refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refreshToken property: The refresh token used to refresh the access token.
     * 
     * @param refreshToken the refreshToken value to set.
     * @return the AuthInfo object itself.
     */
    public AuthInfo withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the scope property: The scope of the access token.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of the access token.
     * 
     * @param scope the scope value to set.
     * @return the AuthInfo object itself.
     */
    public AuthInfo withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the expiresIn property: Time in seconds that the token remains valid.
     * 
     * @return the expiresIn value.
     */
    public Integer expiresIn() {
        return this.expiresIn;
    }

    /**
     * Set the expiresIn property: Time in seconds that the token remains valid.
     * 
     * @param expiresIn the expiresIn value to set.
     * @return the AuthInfo object itself.
     */
    public AuthInfo withExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tokenType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tokenType in model AuthInfo"));
        }
        if (token() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property token in model AuthInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AuthInfo.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("tokenType", this.tokenType == null ? null : this.tokenType.toString());
        jsonWriter.writeStringField("token", this.token);
        jsonWriter.writeStringField("refreshToken", this.refreshToken);
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeNumberField("expiresIn", this.expiresIn);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthInfo if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AuthInfo.
     */
    public static AuthInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthInfo deserializedAuthInfo = new AuthInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tokenType".equals(fieldName)) {
                    deserializedAuthInfo.tokenType = TokenType.fromString(reader.getString());
                } else if ("token".equals(fieldName)) {
                    deserializedAuthInfo.token = reader.getString();
                } else if ("refreshToken".equals(fieldName)) {
                    deserializedAuthInfo.refreshToken = reader.getString();
                } else if ("scope".equals(fieldName)) {
                    deserializedAuthInfo.scope = reader.getString();
                } else if ("expiresIn".equals(fieldName)) {
                    deserializedAuthInfo.expiresIn = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAuthInfo;
        });
    }
}
