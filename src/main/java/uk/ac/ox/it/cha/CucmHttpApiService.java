package uk.ac.ox.it.cha;

import com.cisco.axlapiservice.AXLAPIService;
import com.cisco.axlapiservice.AXLPort;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import javax.xml.ws.BindingProvider;
import uk.ac.ox.it.cha.configuration.AppConfiguration;
import uk.ac.ox.it.cha.configuration.CucmConfiguration;
import uk.ac.ox.it.cha.resources.PhoneResource;
import uk.ac.ox.it.cha.services.CucmAxlService;


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
        environment.addResource(new PhoneResource(axl));
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