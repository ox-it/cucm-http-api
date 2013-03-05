package uk.ac.ox.it.cha.resources;

import com.cisco.axl.api._8.StandardResponse;
import com.cisco.axl.api._8.UpdatePhoneReq;
import com.cisco.axlapiservice.AXLPort;
import com.yammer.dropwizard.auth.Auth;
import java.util.List;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import uk.ac.ox.it.cha.auth.User;
import uk.ac.ox.it.cha.representations.Speeddial;

/**
 *
 * @author martinfilliau
 */
@Path("/speeddials")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SpeeddialsResource {

    private final AXLPort axlService;

    public SpeeddialsResource(AXLPort axlService) {
        this.axlService = axlService;
    }

    /**
     * Update the speeddials for the given directory number
     * @param dirn query parameter: dir number
     * @param speeddials list of Speeddial
     * @return response code from the SOAP web service
     */
    @POST
    public Response updateSpeeddials(@QueryParam("phone") String phone,
            @Valid List<Speeddial> speeddials,
            @Auth User user) {
        String response = updateSpeeddialsByPhone(phone, speeddials);
        return Response.ok(response).build();
    }

    /**
     * Do an update phone request to the given phone name to update speeddials
     * @param phoneName name of the phone
     * @param speeddials list of speeddials
     * @return String representing the UUID of this action
     */
    private String updateSpeeddialsByPhone(String phoneName, List<Speeddial> speeddials) {
        UpdatePhoneReq upr = new UpdatePhoneReq();
        upr.setName(phoneName);
        UpdatePhoneReq.Speeddials sds = new UpdatePhoneReq.Speeddials();
        for (Speeddial sd : speeddials) {
            sds.getSpeeddial().add(sd.getXSpeeddial());
        }
        upr.setSpeeddials(sds);
        StandardResponse response = this.axlService.updatePhone(upr);
        return response.getReturn();
    }
}
