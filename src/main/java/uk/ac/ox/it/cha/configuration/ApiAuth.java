package uk.ac.ox.it.cha.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author martinfilliau
 */
public class ApiAuth extends Configuration {
    
    @NotEmpty
    @JsonProperty
    private String user;
    
    @NotEmpty
    @JsonProperty
    private String password;

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
