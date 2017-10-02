/*
 * Raas
 *
 * This file was automatically generated for Tango Card, Inc. by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.tangocard.raas;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import com.tangocard.raas.models.*;

public class Configuration {
    //RaaS v2 API Platform Name
    //TODO: Replace the platformName with an appropriate value
    public static String platformName = "QAPlatform2";

    //RaaS v2 API Platform Key
    //TODO: Replace the platformKey with an appropriate value
    public static String platformKey = "apYPfT6HNONpDRUj3CLGWYt7gvIHONpDRUYPfT6Hj";

    /**
     * Current API environment
     */
    public static Environments environment = Environments.SANDBOX;

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public static String getBaseUri(Servers server) {
        StringBuilder baseUrl = new StringBuilder(environmentsMap.get(Configuration.environment).get(server));
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5560876128634869390L;
            {
            }
        };
        APIHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }
    
    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    public static String getBaseUri() {
        return Configuration.getBaseUri(Servers.DEFAULT);
    }
    
    /**
     * Map of all base URLs by environments and server aliases 
     */
    private static EnumMap<Environments, EnumMap<Servers, String>> environmentsMap = new EnumMap<Environments, EnumMap<Servers,String>>(Environments.class) {
        private static final long serialVersionUID = 5586501950105096363L;
        {
            put(Environments.SANDBOX , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 4644756435500478620L;
                {
                    put(Servers.DEFAULT, "https://integration-api.tangocard.com/raas/v2");
                }
            });
            put(Environments.PRODUCTION , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5062950070316985844L;
                {
                    put(Servers.DEFAULT, "https://api.tangocard.com/raas/v2");
                }
            });
            put(Environments.QA , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5666145083637537567L;
                {
                    put(Servers.DEFAULT, "https://qa-api.tangocard.com/raas/v2");
                }
            });
            put(Environments.GAMMA , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 5738338152046464502L;
                {
                    put(Servers.DEFAULT, "https://gamma-api.tangocard.com/raas/v2");
                }
            });
            put(Environments.LOCAL , new EnumMap<Servers, String>(Servers.class) {
                private static final long serialVersionUID = 4665412867131998879L;
                {
                    put(Servers.DEFAULT, "http://raastango.cc:8080/v2");
                }
            });
        }
    };
}
