/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.http.client;

import com.tangocard.raas.exceptions.APIException;
import com.tangocard.raas.http.request.HttpBodyRequest;
import com.tangocard.raas.http.request.HttpRequest;
import com.tangocard.raas.http.response.HttpResponse;
import java.util.Map;

public interface HttpClient {

     /**
     * Sets a timeout for HTTP requests
     * @param   timeout    The timeout in seconds
     */
     void setTimeout(long timeout);

    /**
     * Execute a given HttpRequest to get string response back
     * @param   request     The given HttpRequest to execute
     * @param   callBack    Callback after execution
     */
    void executeAsStringAsync(final HttpRequest request, final APICallBack<HttpResponse> callBack);

    /**
     * Execute a given HttpRequest to get binary response back
     * @param   request     The given HttpRequest to execute
     * @param   callBack    Callback after execution
     */
    void executeAsBinaryAsync(final HttpRequest request, final APICallBack<HttpResponse> callBack);

    /**
     * Execute a given HttpRequest to get binary response back
     * @param   request     The given HttpRequest to execute     
     */
    HttpResponse executeAsBinary(final HttpRequest request) throws APIException;

    /**
     * Execute a given HttpRequest to get string response back
     * @param   request     The given HttpRequest to execute     
     */
    HttpResponse executeAsString(final HttpRequest request) throws APIException;

    /**
     * Create a simple HTTP GET request with basic authentication
     */
    HttpRequest get(String _queryUrl,
                    Map<String, String> _headers, Map<String, Object> _parameters,
                    String _username, String _password);

    /**
     * Create a simple HTTP GET request
     */
    HttpRequest get(String _queryUrl,
                    Map<String, String> _headers, Map<String, Object> _parameters);

    /**
     * Create an HTTP POST request with parameters
     */
    HttpRequest post(String _queryUrl,
                     Map<String, String> _headers, Map<String, Object> _parameters);


    /**
     * Create an HTTP POST request with parameters and with basic authentication
     */
    HttpRequest post(String _queryUrl,
                     Map<String, String> _headers, Map<String, Object> _parameters,
                     String _username, String _password);

    /**
     * Create an HTTP POST request with body
     */
    HttpBodyRequest postBody(String _queryUrl,
                             Map<String, String> _headers, String _body);

    /**
     * Create an HTTP POST request with body and with basic authentication
     */
    HttpBodyRequest postBody(String _queryUrl,
                             Map<String, String> _headers, String _body,
                             String _username, String _password);

    /**
     * Create an HTTP PUT request with parameters
     */
    HttpRequest put(String _queryUrl,
                    Map<String, String> _headers, Map<String, Object> _parameters);

    /**
     * Create an HTTP PUT request with parameters and with basic authentication
     */
    HttpRequest put(String _queryUrl,
                    Map<String, String> _headers, Map<String, Object> _parameters,
                    String _username, String _password);

    /**
     * Create an HTTP PUT request with body
     */
    HttpBodyRequest putBody(String _queryUrl,
                            Map<String, String> _headers, String _body);

    /**
     * Create an HTTP PUT request with body and with basic authentication
     */
    HttpBodyRequest putBody(String _queryUrl,
                            Map<String, String> _headers, String _body,
                            String _username, String _password);

    /**
     * Create an HTTP PATCH request with parameters
     */
    HttpRequest patch(String _queryUrl,
                      Map<String, String> _headers, Map<String, Object> _parameters);

    /**
     * Create an HTTP PATCH request with parameters and with basic authentication
     */
    HttpRequest patch(String _queryUrl,
                      Map<String, String> _headers, Map<String, Object> _parameters,
                      String _username, String _password);

    /**
     * Create an HTTP PATCH request with body
     */
    HttpBodyRequest patchBody(String _queryUrl,
                              Map<String, String> _headers, String _body);

    /**
     * Create an HTTP PATCH request with body and with basic authentication
     */
    HttpBodyRequest patchBody(String _queryUrl,
                              Map<String, String> _headers, String _body,
                              String _username, String _password);

    /**
     * Create an HTTP DELETE request with parameters
     */
    HttpRequest delete(String _queryUrl,
                       Map<String, String> _headers, Map<String, Object> _parameters);

    /**
     * Create an HTTP DELETE request with parameters and with basic authentication
     */
    HttpRequest delete(String _queryUrl,
                       Map<String, String> _headers, Map<String, Object> _parameters,
                       String _username, String _password);

    /**
     * Create an HTTP DELETE request with body
     */
    HttpBodyRequest deleteBody(String _queryUrl,
                               Map<String, String> _headers, String _body);

    /**
     * Create an HTTP DELETE request with body and with basic authentication
     */
    HttpBodyRequest deleteBody(String _queryUrl,
                               Map<String, String> _headers, String _body,
                               String _username, String _password);
}