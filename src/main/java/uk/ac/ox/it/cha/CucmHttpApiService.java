package uk.ac.ox.it.cha;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import uk.ac.ox.it.cha.configuration.AppConfiguration;


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
        
    }
    
}