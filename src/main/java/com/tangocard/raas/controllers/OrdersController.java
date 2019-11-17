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
import com.tangocard.raas.exceptions.*;
import com.tangocard.raas.http.client.HttpContext;
import com.tangocard.raas.http.request.HttpRequest;
import com.tangocard.raas.http.response.HttpResponse;
import com.tangocard.raas.http.response.HttpStringResponse;
import com.tangocard.raas.http.client.APICallBack;
import com.tangocard.raas.controllers.syncwrapper.APICallBackCatcher;

public class OrdersController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static OrdersController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the OrdersController class 
     */
    public static OrdersController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new OrdersController();
            }
        }
        return instance;
    }

    /**
     * TODO: type endpoint description here
     * @param    body    Required parameter: Example: 
     * @return    Returns the OrderModel response from the API call 
     */
    public OrderModel createOrder(
                final CreateOrderRequestModel body
    ) throws Throwable {
        APICallBackCatcher<OrderModel> callback = new APICallBackCatcher<OrderModel>();
        createOrderAsync(body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    body    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createOrderAsync(
                final CreateOrderRequestModel body,
                final APICallBack<OrderModel> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == body)
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/orders");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4808353888141565274L;
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
        Runnable _responseTask = new Runnable() {
            public void run() {
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
                            OrderModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<OrderModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
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
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * TODO: type endpoint description here
     * @param    referenceOrderID    Required parameter: Reference Order ID
     * @return    Returns the OrderModel response from the API call 
     */
    public OrderModel getOrder(
                final String referenceOrderID
    ) throws Throwable {
        APICallBackCatcher<OrderModel> callback = new APICallBackCatcher<OrderModel>();
        getOrderAsync(referenceOrderID, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    referenceOrderID    Required parameter: Reference Order ID
     * @return    Returns the void response from the API call 
     */
    public void getOrderAsync(
                final String referenceOrderID,
                final APICallBack<OrderModel> callBack
    ) {
        //validating required parameters
        if (null == referenceOrderID)
            throw new NullPointerException("The parameter \"referenceOrderID\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/orders/{referenceOrderID}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4762355958309302709L;
            {
                    put( "referenceOrderID", referenceOrderID );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4975569673915637699L;
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
        Runnable _responseTask = new Runnable() {
            public void run() {
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
                            OrderModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<OrderModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
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
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * TODO: type endpoint description here
     * @param    referenceOrderID    Required parameter: Example: 
     * @return    Returns the ResendOrderResponseModel response from the API call 
     */
    public ResendOrderResponseModel createResendOrder(
                final String referenceOrderID
    ) throws Throwable {
        APICallBackCatcher<ResendOrderResponseModel> callback = new APICallBackCatcher<ResendOrderResponseModel>();
        createResendOrderAsync(referenceOrderID, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    referenceOrderID    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void createResendOrderAsync(
                final String referenceOrderID,
                final APICallBack<ResendOrderResponseModel> callBack
    ) {
        //validating required parameters
        if (null == referenceOrderID)
            throw new NullPointerException("The parameter \"referenceOrderID\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/orders/{referenceOrderID}/resends");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5067222466110436086L;
            {
                    put( "referenceOrderID", referenceOrderID );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5224465015860740625L;
            {
                    put( "user-agent", "TangoCardv2NGSDK" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, null,
                                        Configuration.platformName, Configuration.platformKey);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
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
                            ResendOrderResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ResendOrderResponseModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
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
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * TODO: type endpoint description here
     * @param    GetOrdersInput    Object containing request parameters
     * @return    Returns the GetOrdersResponseModel response from the API call 
     */
    public GetOrdersResponseModel getOrders(
                final GetOrdersInput input
    ) throws Throwable {
        APICallBackCatcher<GetOrdersResponseModel> callback = new APICallBackCatcher<GetOrdersResponseModel>();
        getOrdersAsync(input, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    GetOrdersInput    Object containing request parameters
     * @return    Returns the void response from the API call 
     */
    public void getOrdersAsync(
                final GetOrdersInput input,
                final APICallBack<GetOrdersResponseModel> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/orders");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5709701352735573186L;
            {
                    put( "accountIdentifier", input.getAccountIdentifier() );
                    put( "customerIdentifier", input.getCustomerIdentifier() );
                    put( "externalRefID", input.getExternalRefID() );
                    put( "startDate", input.getStartDate() );
                    put( "endDate", input.getEndDate() );
                    put( "elementsPerBlock", input.getElementsPerBlock() );
                    put( "page", input.getPage() );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5239934274275913919L;
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
        Runnable _responseTask = new Runnable() {
            public void run() {
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
                            GetOrdersResponseModel _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GetOrdersResponseModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
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
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}