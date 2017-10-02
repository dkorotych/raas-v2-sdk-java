/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas.exceptions;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.tangocard.raas.http.client.HttpContext;
import com.tangocard.raas.models.*;

public class RaasServerException 
        extends APIException
        implements java.io.Serializable {
    private static final long serialVersionUID = 5704525641880612519L;
    private Date timestamp;
    private String requestId;
    private String path;
    private int httpCode;
    private String httpPhrase;
    private List<RaasServerErrorModel> errors;
    /** GETTER
     * Request timestamp
     */
    @JsonGetter("timestamp")
    public Date getTimestamp ( ) { 
        return this.timestamp;
    }
    
    /** SETTER
     * Request timestamp
     */
    @JsonSetter("timestamp")
    private void setTimestamp (Date value) { 
        this.timestamp = value;
    }
 
    /** GETTER
     * Request ID
     */
    @JsonGetter("requestId")
    public String getRequestId ( ) { 
        return this.requestId;
    }
    
    /** SETTER
     * Request ID
     */
    @JsonSetter("requestId")
    private void setRequestId (String value) { 
        this.requestId = value;
    }
 
    /** GETTER
     * Request Path
     */
    @JsonGetter("path")
    public String getPath ( ) { 
        return this.path;
    }
    
    /** SETTER
     * Request Path
     */
    @JsonSetter("path")
    private void setPath (String value) { 
        this.path = value;
    }
 
    /** GETTER
     * HTTP Code
     */
    @JsonGetter("httpCode")
    public int getHttpCode ( ) { 
        return this.httpCode;
    }
    
    /** SETTER
     * HTTP Code
     */
    @JsonSetter("httpCode")
    private void setHttpCode (int value) { 
        this.httpCode = value;
    }
 
    /** GETTER
     * HTTP Phrase
     */
    @JsonGetter("httpPhrase")
    public String getHttpPhrase ( ) { 
        return this.httpPhrase;
    }
    
    /** SETTER
     * HTTP Phrase
     */
    @JsonSetter("httpPhrase")
    private void setHttpPhrase (String value) { 
        this.httpPhrase = value;
    }
 
    /** GETTER
     * An array of errors
     */
    @JsonGetter("errors")
    public List<RaasServerErrorModel> getErrors ( ) { 
        return this.errors;
    }
    
    /** SETTER
     * An array of errors
     */
    @JsonSetter("errors")
    private void setErrors (List<RaasServerErrorModel> value) { 
        this.errors = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public RaasServerException(String reason, HttpContext context) {
        super(reason, context);
    }
}
 