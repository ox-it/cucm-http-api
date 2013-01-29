package uk.ac.ox.it.cha.services;

import com.cisco.axlapiservice.AXLPort;
import com.yammer.dropwizard.lifecycle.Managed;

/**
 *
 * @author martinfilliau
 */
public class CucmAxlService implements Managed {

    private AXLPort service;
    
    public CucmAxlService(AXLPort service) {
        this.service = service;
    }
    
    public void start() throws Exception {
        
    }

    public void stop() throws Exception {
        
    }
    
}
