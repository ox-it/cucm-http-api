package uk.ac.ox.it.cha.auth;

import com.google.common.base.Optional;
import com.yammer.dropwizard.auth.AuthenticationException;
import com.yammer.dropwizard.auth.Authenticator;
import com.yammer.dropwizard.auth.basic.BasicCredentials;
import uk.ac.ox.it.cha.configuration.ApiAuth;

/**
 *
 * @author martinfilliau
 */
public class AppAuthenticator implements Authenticator<BasicCredentials, User> {
    
    ApiAuth apiAuth;
    
    public AppAuthenticator(ApiAuth apiAuth) {
        this.apiAuth = apiAuth;
    }

    @Override
    public Optional<User> authenticate(BasicCredentials credentials) throws AuthenticationException {
        if(this.apiAuth.getPassword().equals(credentials.getPassword()) 
                && this.apiAuth.getUser().equals(credentials.getUsername())) {
            return Optional.of(new User(credentials.getUsername()));
        }
        return Optional.absent();
    }
    
}
