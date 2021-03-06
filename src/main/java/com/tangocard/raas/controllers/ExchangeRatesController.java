/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.controllers;

import java.util.*;

import com.tangocard.raas.*;
import com.tangocard.raas.http.client.HttpContext;
import com.tangocard.raas.http.request.HttpRequest;
import com.tangocard.raas.http.response.HttpResponse;
import com.tangocard.raas.http.client.APICallBack;
import com.tangocard.raas.controllers.syncwrapper.APICallBackCatcher;

public class ExchangeRatesController extends BaseController {    
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static ExchangeRatesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ExchangeRatesController class 
     */
    public static ExchangeRatesController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new ExchangeRatesController();
            }
        }
        return instance;
    }

    /**
     * Retrieve current exchange rates. Returns the void response from the API call
     */
    public void getExchangeRates(
    ) throws Throwable {
        APICallBackCatcher<Object> callback = new APICallBackCatcher<>();
        getExchangeRatesAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        callback.getResult();
    }

    /**
     * Retrieve current exchange rates. Returns the void response from the API call
     */
    public void getExchangeRatesAsync(
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/exchangerate");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5500451968816888323L;
            {
                    put( "user-agent", "TangoCardv2NGSDK" );
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

                        //let the caller know of the success
                        callBack.onSuccess(_context, _context);
                    } catch (Exception error) {
                        //let the caller know of the error
                        callBack.onFailure(_context, error);
                    }//let the caller know of the caught Exception

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