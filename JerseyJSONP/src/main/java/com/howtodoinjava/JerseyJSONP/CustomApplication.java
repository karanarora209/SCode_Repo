/**
 * 
 */
package com.howtodoinjava.JerseyJSONP;

import com.sun.research.ws.wadl.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.jsonp.JsonProcessingFeature;
import org.glassfish.jersey.filter.LoggingFilter;
import javax.json.stream.JsonGenerator;
import java.util.Set;
import java.util.HashSet;

/**
 * @author eprmahi
 *
 */

@SuppressWarnings("deprecation")
public class CustomApplication extends ResourceConfig 
{
    public CustomApplication() 
    {
        register(JsonProcessingFeature.class);
        packages("com.howtodoinjava.JerseyJSONP");
        packages("org.glassfish.jersey.examples.jsonp");
        register(LoggingFilter.class);
        property(JsonGenerator.PRETTY_PRINTING, true);
 
    }
}