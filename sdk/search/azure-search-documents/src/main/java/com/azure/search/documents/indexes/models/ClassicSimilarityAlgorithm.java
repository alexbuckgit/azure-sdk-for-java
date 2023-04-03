// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Legacy similarity algorithm which uses the Lucene TFIDFSimilarity implementation of TF-IDF. This variation of TF-IDF
 * introduces static document length normalization as well as coordinating factors that penalize documents that only
 * partially match the searched queries.
 */
@Immutable
public final class ClassicSimilarityAlgorithm extends SimilarityAlgorithm {
    /*
     * The @odata.type property.
     */
    private static final String ODATA_TYPE = "#Microsoft.Azure.Search.ClassicSimilarity";

    /** Creates an instance of ClassicSimilarityAlgorithm class. */
    public ClassicSimilarityAlgorithm() {}

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClassicSimilarityAlgorithm from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClassicSimilarityAlgorithm if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the ClassicSimilarityAlgorithm.
     */
    public static ClassicSimilarityAlgorithm fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    ClassicSimilarityAlgorithm deserializedClassicSimilarityAlgorithm =
                            new ClassicSimilarityAlgorithm();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedClassicSimilarityAlgorithm;
                });
    }
}
