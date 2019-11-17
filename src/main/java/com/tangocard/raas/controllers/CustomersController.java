/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.controllers;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.tangocard.raas.*;
import com.tangocard.raas.models.*;
import com.tangocard.raas.http.client.HttpContext;
import com.tangocard.raas.http.request.HttpRequest;
import com.tangocard.raas.http.response.HttpResponse;
import com.tangocard.raas.http.response.HttpStringResponse;
import com.tangocard.raas.http.client.APICallBack;
import com.tangocard.raas.controllers.syncwrapper.APICallBackCatcher;

public class CustomersController extends BaseController {    
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static CustomersController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the CustomersController class 
     */
    public static CustomersController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new CustomersController();
            }
        }
        return instance;
    }

    /**
     * Get a customer
     * @param    customerIdentifier    Required parameter: Customer Identifier
     * @return    Returns the CustomerModel response from the API call 
     */
    public CustomerModel getCustomer(
                final String customerIdentifier
    ) throws Throwable {
        APICallBackCatcher<CustomerModel> callback = new APICallBackCatcher<>();
        getCustomerAsync(customerIdentifier, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get a customer. Returns the void response from the API call
     * @param    customerIdentifier    Required parameter: Customer Identifier
     */
    public void getCustomerAsync(
                final String customerIdentifier,
                final APICallBack<CustomerModel> callBack
    ) {
        //validating required parameters
        if (null == customerIdentifier)
            throw new NullPointerException("The parameter \"customerIdentifier\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/customers/{customerIdentifier}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4761399796691843403L;
            {
                    put( "customerIdentifier", customerIdentifier );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5480297857209282617L;
            {
                    put( "user-agent", "TangoCardv2NGSDK" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.platformName, Configuration.platformKey);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = () -> {
            //make the API call
            getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                public void onSuccess(HttpContext _context, HttpResponse _response) {
                    try {

                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //handle errors defined at the API level
                        validateResponse(_response, _context);

                        //extract result from the http response
                        String _responseBody = ((HttpStringResponse)_response).getBody();
                        CustomerModel _result = APIHelper.deserialize(_responseBody,
                                                    new TypeReference<CustomerModel>(){});

                        //let the caller know of the success
                        callBack.onSuccess(_context, _result);
                    } catch (Exception ioException) {
                        //let the caller know of the caught IO Exception
                        callBack.onFailure(_context, ioException);
                    }//let the caller know of the error
//let the caller know of the caught Exception

                }
                public void onFailure(HttpContext _context, Throwable _error) {
                    //invoke the callback after response if its not null
                    if (getHttpCallBack() != null)
                        {
                        getHttpCallBack().OnAfterResponse(_context);
                    }

                    //let the caller know of the failure
                    callBack.onFailure(_context, _error);
                }
            });
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Create a new customer
     * @param    body    Required parameter: Request Body
     * @return    Returns the CustomerModel response from the API call 
     */
    public CustomerModel createCustomer(
                final CreateCustomerRequestModel body
    ) throws Throwable {
        APICallBackCatcher<CustomerModel> callback = new APICallBackCatcher<>();
        createCustomerAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Create a new customer. Returns the void response from the API call
     * @param    body    Required parameter: Request Body
     */
    public void createCustomerAsync(
                final CreateCustomerRequestModel body,
                final APICallBack<CustomerModel> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == body)
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/customers");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4772656327235065573L;
            {
                    put( "user-agent", "TangoCardv2NGSDK" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body),
                                        Configuration.platformName, Configuration.platformKey);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = () -> {
            //make the API call
            getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                public void onSuccess(HttpContext _context, HttpResponse _response) {
                    try {

                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //handle errors defined at the API level
                        validateResponse(_response, _context);

                        //extract result from the http response
                        String _responseBody = ((HttpStringResponse)_response).getBody();
                        CustomerModel _result = APIHelper.deserialize(_responseBody,
                                                    new TypeReference<CustomerModel>(){});

                        //let the caller know of the success
                        callBack.onSuccess(_context, _result);
                    } catch (Exception ioException) {
                        //let the caller know of the caught IO Exception
                        callBack.onFailure(_context, ioException);
                    }//let the caller know of the error
//let the caller know of the caught Exception

                }
                public void onFailure(HttpContext _context, Throwable _error) {
                    //invoke the callback after response if its not null
                    if (getHttpCallBack() != null)
                        {
                        getHttpCallBack().OnAfterResponse(_context);
                    }

                    //let the caller know of the failure
                    callBack.onFailure(_context, _error);
                }
            });
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Gets all customers under the platform
     * @return    Returns the List of {@link CustomerModel} response from the API call
     */
    public List<CustomerModel> getAllCustomers(
    ) throws Throwable {
        APICallBackCatcher<List<CustomerModel>> callback = new APICallBackCatcher<>();
        getAllCustomersAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Gets all customers under the platform. Returns the void response from the API call
     */
    public void getAllCustomersAsync(
                final APICallBack<List<CustomerModel>> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/customers");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5051411522972405927L;
            {
                    put( "user-agent", "TangoCardv2NGSDK" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.platformName, Configuration.platformKey);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = () -> {
            //make the API call
            getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                public void onSuccess(HttpContext _context, HttpResponse _response) {
                    try {

                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //handle errors defined at the API level
                        validateResponse(_response, _context);

                        //extract result from the http response
                        String _responseBody = ((HttpStringResponse)_response).getBody();
                        List<CustomerModel> _result = APIHelper.deserialize(_responseBody,
                                                    new TypeReference<List<CustomerModel>>(){});

                        //let the caller know of the success
                        callBack.onSuccess(_context, _result);
                    } catch (Exception ioException) {
                        //let the caller know of the caught IO Exception
                        callBack.onFailure(_context, ioException);
                    }//let the caller know of the error
//let the caller know of the caught Exception

                }
                public void onFailure(HttpContext _context, Throwable _error) {
                    //invoke the callback after response if its not null
                    if (getHttpCallBack() != null)
                        {
                        getHttpCallBack().OnAfterResponse(_context);
                    }

                    //let the caller know of the failure
                    callBack.onFailure(_context, _error);
                }
            });
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}