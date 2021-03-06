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

public class AccountsController extends BaseController {    
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static AccountsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the AccountsController class 
     */
    public static AccountsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new AccountsController();
            }
        }
        return instance;
    }

    /**
     * Gets a list of accounts for a given customer
     * @param    customerIdentifier    Required parameter: Customer Identifier
     * @return    Returns the List of {@link AccountSummaryModel} response from the API call
     */
    public List<AccountSummaryModel> getAccountsByCustomer(
                final String customerIdentifier
    ) throws Throwable {
        APICallBackCatcher<List<AccountSummaryModel>> callback = new APICallBackCatcher<>();
        getAccountsByCustomerAsync(customerIdentifier, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Gets a list of accounts for a given customer. Returns the void response from the API call
     * @param    customerIdentifier    Required parameter: Customer Identifier
     */
    public void getAccountsByCustomerAsync(
                final String customerIdentifier,
                final APICallBack<List<AccountSummaryModel>> callBack
    ) {
        //validating required parameters
        if (null == customerIdentifier)
            throw new NullPointerException("The parameter \"customerIdentifier\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/customers/{customerIdentifier}/accounts");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4942499474876076856L;
            {
                    put( "customerIdentifier", customerIdentifier );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5586673613325093773L;
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
                        List<AccountSummaryModel> _result = APIHelper.deserialize(_responseBody,
                                                    new TypeReference<List<AccountSummaryModel>>(){});

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
     * Get an account
     * @param    accountIdentifier    Required parameter: Account Identifier
     * @return    Returns the AccountModel response from the API call 
     */
    public AccountModel getAccount(
                final String accountIdentifier
    ) throws Throwable {
        APICallBackCatcher<AccountModel> callback = new APICallBackCatcher<>();
        getAccountAsync(accountIdentifier, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get an account. Returns the void response from the API call
     * @param    accountIdentifier    Required parameter: Account Identifier
     */
    public void getAccountAsync(
                final String accountIdentifier,
                final APICallBack<AccountModel> callBack
    ) {
        //validating required parameters
        if (null == accountIdentifier)
            throw new NullPointerException("The parameter \"accountIdentifier\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/accounts/{accountIdentifier}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5214834297797958270L;
            {
                    put( "accountIdentifier", accountIdentifier );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5320436831926617225L;
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
                        AccountModel _result = APIHelper.deserialize(_responseBody,
                                                    new TypeReference<AccountModel>(){});

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
     * Create an account under a given customer
     * @param    customerIdentifier    Required parameter: Customer Identifier
     * @param    body    Required parameter: Request Body
     * @return    Returns the AccountModel response from the API call 
     */
    public AccountModel createAccount(
                final String customerIdentifier,
                final CreateAccountRequestModel body
    ) throws Throwable {
        APICallBackCatcher<AccountModel> callback = new APICallBackCatcher<>();
        createAccountAsync(customerIdentifier, body, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Create an account under a given customer. Returns the void response from the API call
     * @param    customerIdentifier    Required parameter: Customer Identifier
     * @param    body    Required parameter: Request Body
     */
    public void createAccountAsync(
                final String customerIdentifier,
                final CreateAccountRequestModel body,
                final APICallBack<AccountModel> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == customerIdentifier)
            throw new NullPointerException("The parameter \"customerIdentifier\" is a required parameter and cannot be null.");

        if (null == body)
            throw new NullPointerException("The parameter \"body\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/customers/{customerIdentifier}/accounts");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5001261200401845210L;
            {
                    put( "customerIdentifier", customerIdentifier );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5731429041987224601L;
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
                        AccountModel _result = APIHelper.deserialize(_responseBody,
                                                    new TypeReference<AccountModel>(){});

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
     * Gets all accounts under the platform
     * @return    Returns the List of {@link AccountModel} response from the API call
     */
    public List<AccountModel> getAllAccounts(
    ) throws Throwable {
        APICallBackCatcher<List<AccountModel>> callback = new APICallBackCatcher<>();
        getAllAccountsAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Gets all accounts under the platform. Returns the void response from the API call
     */
    public void getAllAccountsAsync(
                final APICallBack<List<AccountModel>> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/accounts");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5132123933460907578L;
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
                        List<AccountModel> _result = APIHelper.deserialize(_responseBody,
                                                    new TypeReference<List<AccountModel>>(){});

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