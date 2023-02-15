// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.reservations.fluent.AzureReservationApi;
import com.azure.resourcemanager.reservations.implementation.AzureReservationApiBuilder;
import com.azure.resourcemanager.reservations.implementation.CalculateExchangesImpl;
import com.azure.resourcemanager.reservations.implementation.CalculateRefundsImpl;
import com.azure.resourcemanager.reservations.implementation.ExchangesImpl;
import com.azure.resourcemanager.reservations.implementation.OperationsImpl;
import com.azure.resourcemanager.reservations.implementation.QuotaRequestStatusImpl;
import com.azure.resourcemanager.reservations.implementation.QuotasImpl;
import com.azure.resourcemanager.reservations.implementation.ReservationOrdersImpl;
import com.azure.resourcemanager.reservations.implementation.ReservationsImpl;
import com.azure.resourcemanager.reservations.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.reservations.implementation.ReturnsImpl;
import com.azure.resourcemanager.reservations.models.CalculateExchanges;
import com.azure.resourcemanager.reservations.models.CalculateRefunds;
import com.azure.resourcemanager.reservations.models.Exchanges;
import com.azure.resourcemanager.reservations.models.Operations;
import com.azure.resourcemanager.reservations.models.QuotaRequestStatus;
import com.azure.resourcemanager.reservations.models.Quotas;
import com.azure.resourcemanager.reservations.models.ReservationOrders;
import com.azure.resourcemanager.reservations.models.Reservations;
import com.azure.resourcemanager.reservations.models.ResourceProviders;
import com.azure.resourcemanager.reservations.models.Returns;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to ReservationsManager. This API describe Azure Reservation. */
public final class ReservationsManager {
    private Reservations reservations;

    private ResourceProviders resourceProviders;

    private ReservationOrders reservationOrders;

    private Operations operations;

    private CalculateRefunds calculateRefunds;

    private Returns returns;

    private CalculateExchanges calculateExchanges;

    private Exchanges exchanges;

    private Quotas quotas;

    private QuotaRequestStatus quotaRequestStatus;

    private final AzureReservationApi clientObject;

    private ReservationsManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new AzureReservationApiBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of reservations service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the reservations service API instance.
     */
    public static ReservationsManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of reservations service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the reservations service API instance.
     */
    public static ReservationsManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new ReservationsManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create ReservationsManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ReservationsManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         *
         * <p>This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval =
                Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of reservations service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the reservations service API instance.
         */
        public ReservationsManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.reservations")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new ReservationsManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Reservations.
     *
     * @return Resource collection API of Reservations.
     */
    public Reservations reservations() {
        if (this.reservations == null) {
            this.reservations = new ReservationsImpl(clientObject.getReservations(), this);
        }
        return reservations;
    }

    /**
     * Gets the resource collection API of ResourceProviders.
     *
     * @return Resource collection API of ResourceProviders.
     */
    public ResourceProviders resourceProviders() {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ResourceProvidersImpl(clientObject.getResourceProviders(), this);
        }
        return resourceProviders;
    }

    /**
     * Gets the resource collection API of ReservationOrders.
     *
     * @return Resource collection API of ReservationOrders.
     */
    public ReservationOrders reservationOrders() {
        if (this.reservationOrders == null) {
            this.reservationOrders = new ReservationOrdersImpl(clientObject.getReservationOrders(), this);
        }
        return reservationOrders;
    }

    /**
     * Gets the resource collection API of Operations.
     *
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of CalculateRefunds.
     *
     * @return Resource collection API of CalculateRefunds.
     */
    public CalculateRefunds calculateRefunds() {
        if (this.calculateRefunds == null) {
            this.calculateRefunds = new CalculateRefundsImpl(clientObject.getCalculateRefunds(), this);
        }
        return calculateRefunds;
    }

    /**
     * Gets the resource collection API of Returns.
     *
     * @return Resource collection API of Returns.
     */
    public Returns returns() {
        if (this.returns == null) {
            this.returns = new ReturnsImpl(clientObject.getReturns(), this);
        }
        return returns;
    }

    /**
     * Gets the resource collection API of CalculateExchanges.
     *
     * @return Resource collection API of CalculateExchanges.
     */
    public CalculateExchanges calculateExchanges() {
        if (this.calculateExchanges == null) {
            this.calculateExchanges = new CalculateExchangesImpl(clientObject.getCalculateExchanges(), this);
        }
        return calculateExchanges;
    }

    /**
     * Gets the resource collection API of Exchanges.
     *
     * @return Resource collection API of Exchanges.
     */
    public Exchanges exchanges() {
        if (this.exchanges == null) {
            this.exchanges = new ExchangesImpl(clientObject.getExchanges(), this);
        }
        return exchanges;
    }

    /**
     * Gets the resource collection API of Quotas. It manages CurrentQuotaLimitBase.
     *
     * @return Resource collection API of Quotas.
     */
    public Quotas quotas() {
        if (this.quotas == null) {
            this.quotas = new QuotasImpl(clientObject.getQuotas(), this);
        }
        return quotas;
    }

    /**
     * Gets the resource collection API of QuotaRequestStatus.
     *
     * @return Resource collection API of QuotaRequestStatus.
     */
    public QuotaRequestStatus quotaRequestStatus() {
        if (this.quotaRequestStatus == null) {
            this.quotaRequestStatus = new QuotaRequestStatusImpl(clientObject.getQuotaRequestStatus(), this);
        }
        return quotaRequestStatus;
    }

    /**
     * @return Wrapped service client AzureReservationApi providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public AzureReservationApi serviceClient() {
        return this.clientObject;
    }
}