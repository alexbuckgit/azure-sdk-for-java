// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.Get1ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.Get2ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.Get5ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.Get6ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.Get7ItemsItem;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphDomainInner;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in DomainsDomainsClient.
 */
public interface DomainsDomainsClient {
    /**
     * Get entities from domains.
     * 
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from domains as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphDomainInner> listDomainAsync(Integer top, Integer skip, String search, String filter,
        Boolean count, List<Get5ItemsItem> orderby, List<Get6ItemsItem> select, List<Get7ItemsItem> expand);

    /**
     * Get entities from domains.
     * 
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from domains as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphDomainInner> listDomainAsync();

    /**
     * Get entities from domains.
     * 
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from domains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphDomainInner> listDomain();

    /**
     * Get entities from domains.
     * 
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entities from domains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphDomainInner> listDomain(Integer top, Integer skip, String search, String filter,
        Boolean count, List<Get5ItemsItem> orderby, List<Get6ItemsItem> select, List<Get7ItemsItem> expand,
        Context context);

    /**
     * Add new entity to domains.
     * 
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphDomainInner>> createDomainWithResponseAsync(MicrosoftGraphDomainInner body);

    /**
     * Add new entity to domains.
     * 
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphDomainInner> createDomainAsync(MicrosoftGraphDomainInner body);

    /**
     * Add new entity to domains.
     * 
     * @param body New entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphDomainInner> createDomainWithResponse(MicrosoftGraphDomainInner body, Context context);

    /**
     * Add new entity to domains.
     * 
     * @param body New entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphDomainInner createDomain(MicrosoftGraphDomainInner body);

    /**
     * Get entity from domains by key.
     * 
     * @param domainId key: id of domain.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from domains by key along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphDomainInner>> getDomainWithResponseAsync(String domainId, List<Get1ItemsItem> select,
        List<Get2ItemsItem> expand);

    /**
     * Get entity from domains by key.
     * 
     * @param domainId key: id of domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from domains by key on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphDomainInner> getDomainAsync(String domainId);

    /**
     * Get entity from domains by key.
     * 
     * @param domainId key: id of domain.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from domains by key along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphDomainInner> getDomainWithResponse(String domainId, List<Get1ItemsItem> select,
        List<Get2ItemsItem> expand, Context context);

    /**
     * Get entity from domains by key.
     * 
     * @param domainId key: id of domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return entity from domains by key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphDomainInner getDomain(String domainId);

    /**
     * Update entity in domains.
     * 
     * @param domainId key: id of domain.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> updateDomainWithResponseAsync(String domainId, MicrosoftGraphDomainInner body);

    /**
     * Update entity in domains.
     * 
     * @param domainId key: id of domain.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> updateDomainAsync(String domainId, MicrosoftGraphDomainInner body);

    /**
     * Update entity in domains.
     * 
     * @param domainId key: id of domain.
     * @param body New property values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> updateDomainWithResponse(String domainId, MicrosoftGraphDomainInner body, Context context);

    /**
     * Update entity in domains.
     * 
     * @param domainId key: id of domain.
     * @param body New property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateDomain(String domainId, MicrosoftGraphDomainInner body);

    /**
     * Delete entity from domains.
     * 
     * @param domainId key: id of domain.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteDomainWithResponseAsync(String domainId, String ifMatch);

    /**
     * Delete entity from domains.
     * 
     * @param domainId key: id of domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteDomainAsync(String domainId);

    /**
     * Delete entity from domains.
     * 
     * @param domainId key: id of domain.
     * @param ifMatch ETag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteDomainWithResponse(String domainId, String ifMatch, Context context);

    /**
     * Delete entity from domains.
     * 
     * @param domainId key: id of domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteDomain(String domainId);
}
