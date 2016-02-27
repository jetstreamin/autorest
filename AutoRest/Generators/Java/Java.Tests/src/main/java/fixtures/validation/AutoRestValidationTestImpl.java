/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation;

import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.AutoRestBaseUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.validation.models.ErrorException;
import fixtures.validation.models.Product;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Initializes a new instance of the AutoRestValidationTest class.
 */
public final class AutoRestValidationTestImpl extends ServiceClient implements AutoRestValidationTest {
    /**
     * The Retrofit service to perform REST calls.
     */
    private AutoRestValidationTestService service;
    /**
     * The URL used as the base for all cloud service requests.
     */
    private final AutoRestBaseUrl baseUrl;

    /**
     * Gets the URL used as the base for all cloud service requests.
     *
     * @return The BaseUrl value.
     */
    public AutoRestBaseUrl getBaseUrl() {
        return this.baseUrl;
    }

    /** Subscription ID. */
    private String subscriptionId;

    /**
     * Gets Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /** Required string following pattern \d{2}-\d{2}-\d{4}. */
    private String apiVersion;

    /**
     * Gets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @param apiVersion the apiVersion value.
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     */
    public AutoRestValidationTestImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestValidationTestImpl(String baseUrl) {
        super();
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building up an {@link OkHttpClient}
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestValidationTestImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder retrofitBuilder) {
        super(clientBuilder, retrofitBuilder);
        this.baseUrl = new AutoRestBaseUrl(baseUrl);
        initialize();
    }

    @Override
    protected void initialize() {
        super.initialize();
        this.retrofitBuilder.baseUrl(baseUrl);
        initializeService();
    }

    private void initializeService() {
        service = this.retrofitBuilder.client(this.clientBuilder.build())
                .build()
                .create(AutoRestValidationTestService.class);
    }

    /**
     * Sets the logging level for OkHttp client.
     *
     * @param logLevel the logging level enum
     */
    @Override
    public void setLogLevel(Level logLevel) {
        super.setLogLevel(logLevel);
        initializeService();
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Product object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Product> validationOfMethodParameters(String resourceGroupName, int id) throws ErrorException, IOException, IllegalArgumentException {
        if (this.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.validationOfMethodParameters(this.getSubscriptionId(), resourceGroupName, id, this.getApiVersion());
        return validationOfMethodParametersDelegate(call.execute());
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> validationOfMethodParametersAsync(String resourceGroupName, int id, final ServiceCallback<Product> serviceCallback) {
        if (this.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (this.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.validationOfMethodParameters(this.getSubscriptionId(), resourceGroupName, id, this.getApiVersion());
        call.enqueue(new ServiceResponseCallback<Product>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(validationOfMethodParametersDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Product> validationOfMethodParametersDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Product, ErrorException>(this.getMapperAdapter())
                .register(200, new TypeToken<Product>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Product object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Product> validationOfBody(String resourceGroupName, int id, Product body) throws ErrorException, IOException, IllegalArgumentException {
        if (this.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.validationOfBody(this.getSubscriptionId(), resourceGroupName, id, body, this.getApiVersion());
        return validationOfBodyDelegate(call.execute());
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> validationOfBodyAsync(String resourceGroupName, int id, Product body, final ServiceCallback<Product> serviceCallback) {
        if (this.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (this.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.validationOfBody(this.getSubscriptionId(), resourceGroupName, id, body, this.getApiVersion());
        call.enqueue(new ServiceResponseCallback<Product>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(validationOfBodyDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Product> validationOfBodyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Product, ErrorException>(this.getMapperAdapter())
                .register(200, new TypeToken<Product>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     *
     * @param constantParam the String value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getWithConstantInPath(String constantParam) throws ServiceException, IOException, IllegalArgumentException {
        if (constantParam == null) {
            throw new IllegalArgumentException("Parameter constantParam is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getWithConstantInPath(constantParam);
        return getWithConstantInPathDelegate(call.execute());
    }

    /**
     *
     * @param constantParam the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getWithConstantInPathAsync(String constantParam, final ServiceCallback<Void> serviceCallback) {
        if (constantParam == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter constantParam is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getWithConstantInPath(constantParam);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getWithConstantInPathDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getWithConstantInPathDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ServiceException>(this.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     *
     * @param constantParam the String value
     * @param body the Product value
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Product object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Product> postWithConstantInBody(String constantParam, Product body) throws ServiceException, IOException, IllegalArgumentException {
        if (constantParam == null) {
            throw new IllegalArgumentException("Parameter constantParam is required and cannot be null.");
        }
        Call<ResponseBody> call = service.postWithConstantInBody(constantParam, body);
        return postWithConstantInBodyDelegate(call.execute());
    }

    /**
     *
     * @param constantParam the String value
     * @param body the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> postWithConstantInBodyAsync(String constantParam, Product body, final ServiceCallback<Product> serviceCallback) {
        if (constantParam == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter constantParam is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.postWithConstantInBody(constantParam, body);
        call.enqueue(new ServiceResponseCallback<Product>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(postWithConstantInBodyDelegate(response));
                } catch (ServiceException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Product> postWithConstantInBodyDelegate(Response<ResponseBody> response) throws ServiceException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Product, ServiceException>(this.getMapperAdapter())
                .register(200, new TypeToken<Product>() { }.getType())
                .build(response);
    }

}
