/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.controllers;

import com.tangocard.raas.exceptions.*;
import com.tangocard.raas.http.client.HttpClient;
import com.tangocard.raas.http.client.HttpContext;
import com.tangocard.raas.http.client.HttpCallBack;
import com.tangocard.raas.http.client.UnirestClient;
import com.tangocard.raas.http.response.HttpResponse;

public abstract class BaseController {
    /**
     * Private variable to keep shared reference of client instance
     */
    private static HttpClient clientInstance = null;
    private static final Object syncObject = new Object();

    /**
     * Protected variable to keep reference of httpCallBack instance if user provides any
     */
    protected HttpCallBack httpCallBack = null;
    
    /**
     * Get httpCallBack associated with this controller
     * @return HttpCallBack
     */
    public HttpCallBack getHttpCallBack() {
        return httpCallBack;
    }
    
    /**
     * Set the httpCallBack for this controller
     * @param httpCallBack
     */
    public void setHttpCallBack(HttpCallBack httpCallBack) {
        this.httpCallBack = httpCallBack;
    }

    /**
     * Shared instance of the Http client
     * @return The shared instance of the http client 
     */
    public static HttpClient getClientInstance() {
        synchronized (syncObject) {
            if (null == clientInstance) {
                clientInstance = UnirestClient.getSharedInstance();
                clientInstance.setTimeout(15000);
    }
        }
        return clientInstance;
    }

    /**
     * Shared instance of the Http client
     * @param    client    The shared instance of the http client 
     */
    public static void setClientInstance(HttpClient client) {
        synchronized (syncObject) {
            if (null != client) {
                clientInstance = client;
            }
        }
    }

    /**
     * Validates the response against HTTP errors defined at the API level
     * @param   response    The response recieved
     * @param   context     Context of the request and the recieved response 
     */
    protected void validateResponse(HttpResponse response, HttpContext context) 
            throws APIException {
        //get response status code to validate
        int responseCode = response.getStatusCode();
        if (responseCode == 400)
            throw new RaasClientException("Bad Request", context);

        if (responseCode == 401)
            throw new RaasGenericException("Unauthorized - Invalid Credentials", context);

        if (responseCode == 403)
            throw new RaasClientException("Forbidden", context);

        if (responseCode == 404)
            throw new RaasGenericException("Not Found", context);

        if (responseCode == 409)
            throw new RaasClientException("Conflict", context);

        if (responseCode == 500)
            throw new RaasServerException("Internal Server Error - Retry Later", context);

        if (responseCode == 503)
            throw new RaasServerException("Service Unavailable - Retry Later", context);

        if ((responseCode < 200) || (responseCode > 208)) //[200,208] = HTTP OK
            throw new RaasGenericException("API Error", context);

    }
}
