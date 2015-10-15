/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestIntegerTestService class.
 */
public class AutoRestIntegerTestServiceImpl extends ServiceClient implements AutoRestIntegerTestService {
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private IntOperations intOperations;

    /**
     * Gets the IntOperations object to access its operations.
     * @return the intOperations value.
     */
    public IntOperations getIntOperations() {
        return this.intOperations;
    }

    /**
     * Initializes an instance of AutoRestIntegerTestService client.
     */
    public AutoRestIntegerTestServiceImpl() {
        this("https://localhost");
    }

    /**
     * Initializes an instance of AutoRestIntegerTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestIntegerTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestIntegerTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestIntegerTestServiceImpl(String baseUri, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        Retrofit retrofit = retrofitBuilder.baseUrl(baseUri).build();
        this.intOperations = new IntOperationsImpl(retrofit, this);
    }
}
