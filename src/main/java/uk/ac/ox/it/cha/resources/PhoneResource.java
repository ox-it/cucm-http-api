package uk.ac.ox.it.cha.resources;

import com.cisco.axl.api._8.ExecuteSQLQueryReq;
import com.cisco.axl.api._8.ExecuteSQLQueryRes;
import com.cisco.axl.api._8.GetPhoneReq;
import com.cisco.axl.api._8.GetPhoneRes;
import com.cisco.axlapiservice.AXLPort;
import com.yammer.dropwizard.jersey.params.IntParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.ws.soap.SOAPFaultException;
import org.w3c.dom.Node;
import uk.ac.ox.it.cha.representations.Phone;

/**
 *
 * @author martinfilliau
 */
@Path("/phone")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PhoneResource {
    
    private final AXLPort axlService;
    
    public PhoneResource(AXLPort axlService) {
        this.axlService = axlService;
    }
    
    @GET
    public Phone get(@QueryParam("dirn") IntParam dirn) {
        String phoneName = this.findPhoneByDirN(dirn.toString());
        if(phoneName == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return getPhoneInfo(phoneName);
    }

    private String findPhoneByDirN(String lineNumber) {
        try {
            ExecuteSQLQueryReq sql = new ExecuteSQLQueryReq();
            sql.setSql("SELECT D.Name FROM NumPlan NP, DeviceNumPlanMap DNPMap, Device D WHERE NP.DNorPattern = '" + lineNumber + "' AND DNPMap.fkNumPlan = NP.pkid AND D.pkid = DNPMap.fkDevice");

            ExecuteSQLQueryRes res = this.axlService.executeSQLQuery(sql);
            for(Object o : res.getReturn().getRow()) {
                com.sun.org.apache.xerces.internal.dom.ElementNSImpl element = (com.sun.org.apache.xerces.internal.dom.ElementNSImpl) o;
                for(int i = 0; i < element.getChildNodes().getLength(); i++) {
                    Node n = element.getChildNodes().item(i);
                    return n.getTextContent();
                }
            }
        } catch (SOAPFaultException sfe) {
        }
        return null;
    }
    
    private Phone getPhoneInfo(String phoneName) {
        Phone p = new Phone();
        GetPhoneReq axlParams = new GetPhoneReq();
        axlParams.setName(phoneName);
        GetPhoneRes getPhoneResponse = this.axlService.getPhone(axlParams);
        p.setDescription(getPhoneResponse.getReturn().getPhone().getDescription());
        p.setModel(getPhoneResponse.getReturn().getPhone().getModel());
        p.setName(getPhoneResponse.getReturn().getPhone().getName());
        p.setProduct(getPhoneResponse.getReturn().getPhone().getProduct());
        p.setUuid(getPhoneResponse.getReturn().getPhone().getUuid());
        return p;
    }
    
}
