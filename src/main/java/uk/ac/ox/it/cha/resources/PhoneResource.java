package uk.ac.ox.it.cha.resources;

import com.cisco.axl.api._8.ExecuteSQLQueryReq;
import com.cisco.axl.api._8.ExecuteSQLQueryRes;
import com.cisco.axl.api._8.GetPhoneReq;
import com.cisco.axl.api._8.GetPhoneRes;
import com.cisco.axlapiservice.AXLPort;
import com.yammer.dropwizard.jersey.params.IntParam;
import com.yammer.dropwizard.auth.Auth;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.soap.SOAPFaultException;
import org.w3c.dom.Node;
import uk.ac.ox.it.cha.auth.User;
import uk.ac.ox.it.cha.representations.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;

/**
 * Phone resource
 * Expose information about phones
 * @author martinfilliau
 */
@Path("/phone")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PhoneResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(PhoneResource.class);

    private final AXLPort axlService;
    
    public PhoneResource(AXLPort axlService) {
        this.axlService = axlService;
    }
    
    /**
     * Get phone information from a directory number
     * @param dirn directory number
     * @param user authenticated user
     * @return list of phones corresponding to this directory number
     */
    @GET
    public List<Phone> get(@QueryParam("dirn") IntParam dirn, @Auth User user) {
        List<String> phoneNames = this.findPhonesByDirN(dirn.get());
        List<Phone> phones = new ArrayList<Phone>();
        for(String phoneName : phoneNames) {
            phones.add(getPhoneInfo(phoneName));
        }
        return phones;
    }

    /**
     * Find the name of a phone by its directory number
     * @param dirn directory number to search for
     * @return list of phone name as a String, null if it couldn't be found
     */
    private List<String> findPhonesByDirN(int dirn) {
        List<String> phones = new ArrayList<String>();
        try {
            ExecuteSQLQueryReq sql = new ExecuteSQLQueryReq();
            sql.setSql("SELECT D.Name FROM NumPlan NP, DeviceNumPlanMap DNPMap, Device D WHERE NP.DNorPattern = '" + Integer.toString(dirn)
                    + "' AND DNPMap.fkNumPlan = NP.pkid AND D.pkid = DNPMap.fkDevice");

            ExecuteSQLQueryRes res = this.axlService.executeSQLQuery(sql);
            ElementNSImpl element;
            Node n;
            for(Object o : res.getReturn().getRow()) {
                element = (ElementNSImpl) o;
                for(int i = 0; i < element.getChildNodes().getLength(); i++) {
                    n = element.getChildNodes().item(i);
                    phones.add(n.getTextContent());
                }
            }
        } catch (SOAPFaultException sfe) {
            LOGGER.error("Exception when reaching upstream service", sfe);
        }
        return phones;
    }
    
    /**
     * Get phone information by phone name
     * @param phoneName name of the phone
     * @return Phone object
     */
    private Phone getPhoneInfo(String phoneName) {
        GetPhoneReq axlParams = new GetPhoneReq();
        axlParams.setName(phoneName);
        GetPhoneRes getPhoneResponse = this.axlService.getPhone(axlParams);
        return new Phone(getPhoneResponse);
    }
    
}
