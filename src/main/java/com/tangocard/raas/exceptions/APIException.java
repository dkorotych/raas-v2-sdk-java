/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.exceptions;

import java.io.IOException;

import com.tangocard.raas.APIHelper;
import com.tangocard.raas.http.client.HttpContext;
import com.tangocard.raas.http.response.HttpStringResponse;

public class APIException extends Exception {
    //UID for serialization
    private static final long serialVersionUID = 6424174253911720338L;

    //private fields
    private int responseCode;

    //private fields
    private HttpContext httpContext;

    /**
    * The HTTP response code from the API request
    */
    public int getResponseCode() {
        return (httpContext != null) ? httpContext.getResponse().getStatusCode() : -1;
    }

    /**
     * The HTTP response body from the API request
     */
    public HttpContext getHttpContext() {
        return httpContext;
    }

    /**
     * Initialization constructor
     * @param reason The reason for throwing exception
     */
    public APIException(String reason) {
        super(reason);
    }

    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public APIException(String reason, HttpContext context) {
        super(reason);
        this.httpContext = context;

        //if a derived exception class is used, then perform deserialization of response body
        if (getClass().equals(APIException.class)
            || (context == null) || (context.getResponse() == null)
            || (context.getResponse().getRawBody() == null))
            return;

        try {            
            String response_body = ((HttpStringResponse)context.getResponse()).getBody();
            APIHelper.populate(response_body, this);
        } catch (IOException ignored) { }
    }
}