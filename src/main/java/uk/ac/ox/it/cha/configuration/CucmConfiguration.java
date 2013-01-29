package uk.ac.ox.it.cha.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Configuration for the CUCM server
 * @author martinfilliau
 */
public class CucmConfiguration {
    
    @NotEmpty
    @JsonProperty
    private String host;
    
    @NotEmpty
    @JsonProperty
    private String user;
    
    @NotEmpty
    @JsonProperty
    private String password;

    /**
     * Get the host to connect to
     */
    public String getHost() {
        return host;
    }
    
    /**
     * Get the username
     */
    public String getUser() {
        return user;
    }

    /**
     * Get the password 
     */
    public String getPassword() {
        return password;
    }
}
