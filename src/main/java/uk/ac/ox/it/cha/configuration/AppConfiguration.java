package uk.ac.ox.it.cha.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Application configuration
 * @author martinfilliau
 */
public class AppConfiguration extends Configuration {
    
    @Valid
    @JsonProperty
    @NotNull
    CucmConfiguration cucm = new CucmConfiguration();

    public CucmConfiguration getCucm() {
        return cucm;
    }
    
}