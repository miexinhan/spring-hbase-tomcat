package com.weibo.api;

import com.weibo.api.service.WorkflowController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

/**
 * The Java class will be hosted at the URI path "/helloworld"
 *
 * @author hp
 *
 */
@Path("restful")
@Component
public class WorkflowResource {

    @Autowired
    private WorkflowController workflowController;

    @GET
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON})
    @Path("/hello")
    public String getClichedMessage(@QueryParam("test") String test) {
        // Return some cliched textual content
        return workflowController.func() + test;
        //return "test";
    }
}