package uk.ac.ox.it.cha.resources;

import com.cisco.axl.api._8.LSoftKeyTemplate;
import com.cisco.axl.api._8.ListSoftKeyTemplateReq;
import com.cisco.axl.api._8.ListSoftKeyTemplateRes;
import com.cisco.axlapiservice.AXLPort;
import com.yammer.dropwizard.auth.Auth;
import com.yammer.dropwizard.jersey.params.IntParam;
import uk.ac.ox.it.cha.auth.User;
import uk.ac.ox.it.cha.representations.Phone;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/softkey")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SoftKeyResource {

    private final AXLPort axlService;

    public SoftKeyResource(AXLPort axlService) {
        this.axlService = axlService;
    }

    /**
     * List all soft key templates
     * @param user authenticated user
     * @return list of phone key templates
     */
    @GET
    public String list(@Auth User user) {
        StringBuilder sb = new StringBuilder();
        ListSoftKeyTemplateReq lsktr = new ListSoftKeyTemplateReq();
        ListSoftKeyTemplateRes response = this.axlService.listSoftKeyTemplate(lsktr);
        List<LSoftKeyTemplate> templates = response.getReturn().getSoftKeyTemplate();
        for(LSoftKeyTemplate template : templates) {
            sb.append(template.getUuid()).append(" - ").append(template.getName()).append(" - ").append(template.getDescription()).append("\n");
        }
        return sb.toString();
    }
}
