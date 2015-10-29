/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurereport;

import com.microsoft.rest.AzureClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.util.Map;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;

/**
 * The interface for AutoRestReportServiceForAzure class.
 */
public interface AutoRestReportServiceForAzure {
    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    String getBaseUri();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets The management credentials for Azure..
     *
     * @return the credentials value.
     */
    ServiceClientCredentials getCredentials();

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String getAcceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    void setAcceptLanguage(String acceptLanguage);

    /**
     * Gets The retry timeout for Long Running Operations..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int getLongRunningOperationRetryTimeout();

    /**
     * Sets The retry timeout for Long Running Operations..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * The interface defining all the services for AutoRestReportServiceForAzure to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AutoRestReportServiceForAzureService {
        @GET("/report/azure")
        Call<ResponseBody> getReport(@Header("accept-language") String acceptLanguage);

    }

    /**
     * Get test coverage report
     *
     * @throws ServiceException exception thrown from REST call
     * @return the Map&lt;String, Integer&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Map<String, Integer>> getReport() throws ServiceException;

    /**
     * Get test coverage report
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback);

}