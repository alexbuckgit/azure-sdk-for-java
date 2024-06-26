// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.CosmosException;
import com.azure.cosmos.implementation.directconnectivity.HttpUtils;
import com.azure.cosmos.implementation.http.HttpHeaders;

import java.net.URI;
import java.util.Map;

/**
 * This exception is thrown when DocumentServiceRequest contains x-ms-documentdb-partitionkeyrangeid
 * header and such range id doesn't exist.
 * <p>
 * No retries should be made in this case, as either split or merge might have happened and query/readfeed
 * must take appropriate actions.
 */
public class InternalServerErrorException extends CosmosException {

    InternalServerErrorException() {
        this(RMResources.InternalServerError, HttpConstants.SubStatusCodes.UNKNOWN);
    }

    /**
     * Instantiates a new Internal server error exception.
     *
     * @param cosmosError the cosmos error
     * @param lsn the lsn
     * @param partitionKeyRangeId the partition key range id
     * @param responseHeaders the response headers
     */
    public InternalServerErrorException(CosmosError cosmosError,
                                        long lsn,
                                        String partitionKeyRangeId,
                                        Map<String, String> responseHeaders) {
        super(HttpConstants.StatusCodes.INTERNAL_SERVER_ERROR, cosmosError, responseHeaders);
        BridgeInternal.setLSN(this, lsn);
        BridgeInternal.setPartitionKeyRangeId(this, partitionKeyRangeId);
    }

    /**
     * Instantiates a new Internal server error exception.
     *
     * @param message the message
     */
    public InternalServerErrorException(String message, int subStatusCode) {
        this(message, null, (Map<String, String>) null, null);
        BridgeInternal.setSubStatusCode(this, subStatusCode);
    }

    public InternalServerErrorException(String message, Exception innerException, int subStatusCode) {
        this(message, innerException, (HttpHeaders) null, (String) null);
        BridgeInternal.setSubStatusCode(this, subStatusCode);
    }

    /**
     * Instantiates a new Internal server error exception.
     *
     * @param message the message
     * @param headers the headers
     * @param requestUri the request uri
     * @param subStatusCode the subStatusCode
     */
    public InternalServerErrorException(String message, HttpHeaders headers, URI requestUri, int subStatusCode) {
        super(message, null, HttpUtils.asMap(headers), HttpConstants.StatusCodes.INTERNAL_SERVER_ERROR,
            requestUri != null ? requestUri.toString() : null);
        BridgeInternal.setSubStatusCode(this, subStatusCode);
    }

    // used in test
    InternalServerErrorException(String message, HttpHeaders headers, String requestUriString) {
        super(message, null, HttpUtils.asMap(headers), HttpConstants.StatusCodes.INTERNAL_SERVER_ERROR,
            requestUriString);
    }

    InternalServerErrorException(String message, Exception innerException, HttpHeaders headers,
                                 String requestUriString) {
        super(message, innerException, HttpUtils.asMap(headers), HttpConstants.StatusCodes.INTERNAL_SERVER_ERROR,
            requestUriString);
    }

    /**
     * Instantiates a new Internal server error exception.
     *
     * @param message the message
     * @param innerException the inner exception
     * @param headers the headers
     * @param requestUriString the request uri string
     */
    public InternalServerErrorException(String message, Exception innerException, Map<String, String> headers,
                                        String requestUriString) {
        super(message, innerException, headers, HttpConstants.StatusCodes.INTERNAL_SERVER_ERROR, requestUriString);
    }

    public InternalServerErrorException(
        String message,
        Exception innerException,
        Map<String, String> headers,
        String requestUriString,
        int subStatusCode) {
        super(message, innerException, headers, HttpConstants.StatusCodes.INTERNAL_SERVER_ERROR, requestUriString);
        BridgeInternal.setSubStatusCode(this, subStatusCode);
    }
}
