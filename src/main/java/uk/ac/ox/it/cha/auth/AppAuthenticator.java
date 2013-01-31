package uk.ac.ox.it.cha.auth;

import com.google.common.base.Optional;
import com.yammer.dropwizard.auth.AuthenticationException;
import com.yammer.dropwizard.auth.Authenticator;
import com.yammer.dropwizard.auth.basic.BasicCredentials;
import java.security.MessageDigest;
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
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(credentials.getPassword().getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            byte byteData[] = md.digest();
            // convert byte to hex
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }

            // checks hashed (SHA-256) password against hash from the configuration
            if(this.apiAuth.getPassword().equals(sb.toString()) 
                && this.apiAuth.getUser().equals(credentials.getUsername())) {
                return Optional.of(new User(credentials.getUsername()));
            }
        } catch(Exception e) {
            throw new AuthenticationException(e);
        }
        return Optional.absent();
    }
    
}
