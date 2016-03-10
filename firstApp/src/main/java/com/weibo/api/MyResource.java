package com.weibo.api;


import com.weibo.api.service.WorkflowController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("my")
@Component
public class MyResource {
    @Autowired
    private WorkflowController workflowController ;

    @GET
    @Path("/test")
    public String test() {
        return workflowController.func();
    }

}
