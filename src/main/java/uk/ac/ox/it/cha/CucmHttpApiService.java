package uk.ac.ox.it.cha;

import com.cisco.axlapiservice.AXLAPIService;
import com.cisco.axlapiservice.AXLPort;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.auth.basic.BasicAuthProvider;
import com.yammer.dropwizard.config.Bootstrap;
import javax.xml.ws.BindingProvider;
import uk.ac.ox.it.cha.auth.AppAuthenticator;
import uk.ac.ox.it.cha.auth.User;
import uk.ac.ox.it.cha.configuration.AppConfiguration;
import uk.ac.ox.it.cha.configuration.CucmConfiguration;
import uk.ac.ox.it.cha.health.CucmAxlServiceHealthCheck;
import uk.ac.ox.it.cha.resources.PhoneResource;
import uk.ac.ox.it.cha.resources.SpeeddialsResource;
import uk.ac.ox.it.cha.services.CucmAxlService;

/**
 * Main entry point of the application
 * @author martinfilliau
 */
class CucmHttpApiService extends Service<AppConfiguration> {

    public static void main(String[] args) throws Exception {
        new CucmHttpApiService().run(args);
    }
    
    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
        bootstrap.setName("CucmHttpApiService");
    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {
        AXLPort axl = initAxlService(configuration.getCucm());
        environment.manage(new CucmAxlService(axl));
        environment.addProvider(new BasicAuthProvider<User>(new AppAuthenticator(configuration.getApiauth()), "PROTECTED"));
        environment.addHealthCheck(new CucmAxlServiceHealthCheck(axl));
        
        environment.addResource(new PhoneResource(axl));
        environment.addResource(new SpeeddialsResource(axl));
    }
    
    /**
     * Initialise the AXL service
     * @param conf CucmConfiguration
     * @return AXLPort
     */
    private AXLPort initAxlService(CucmConfiguration conf) {
        AXLAPIService axlService = new AXLAPIService();
        AXLPort axlPort = axlService.getAXLPort();

        ((BindingProvider) axlPort).getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                "https://" + conf.getHost() + ":8443/axl/");
        ((BindingProvider) axlPort).getRequestContext().put(
                BindingProvider.USERNAME_PROPERTY, conf.getUser());
        ((BindingProvider) axlPort).getRequestContext().put(
                BindingProvider.PASSWORD_PROPERTY, conf.getPassword());
        return axlPort;
    }
    
}