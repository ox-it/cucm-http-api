package uk.ac.ox.it.cha.resources;

import com.cisco.axl.api._8.*;
import com.cisco.axlapiservice.AXLPort;
import com.yammer.dropwizard.auth.Auth;
import com.yammer.dropwizard.jersey.params.IntParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.ox.it.cha.auth.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/callers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CallersResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(PhoneResource.class);

    private final AXLPort axlService;

    public CallersResource(AXLPort axlService) {
        this.axlService = axlService;
    }

    @GET
    public String get(@QueryParam("name") String name) {
        GetCallerFilterListReq req = new GetCallerFilterListReq();
        req.setName(name);
        RCallerFilterList list = new RCallerFilterList();
        //this.axlService.getCcdRequestingService()
        GetCcdRequestingServiceReq ccd = new GetCcdRequestingServiceReq();
        ccd.setName(name);
        GetCcdRequestingServiceRes ccdr = new GetCcdRequestingServiceRes();
        ccdr.getReturn().getCcdRequestingService().getAssociatedTrunks().getAssociatedTrunk().get(0).

        GetCallerFilterListRes res = this.axlService.getCallerFilterList(req);
        StringBuilder sb = new StringBuilder();
        RCallerFilterList.Members members = res.getReturn().getCallerFilterList().getMembers();
        for (RCallerFilterListMember member : members.getMember()) {
            sb.append("CallerFilterMask: ").append(member.getCallerFilterMask()).append(" DnMask: ").append(member.getDnMask()).append(" UUID: ").append(member.getUuid()).append("\n");
        }
        return sb.toString();
    }

}
