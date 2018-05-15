package com.hpark12.services;

import com.hpark12.dao.ActivityDaoImplementation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("activities")
public class ActivityServices {

    @Path("{activityid}")
    public void getActivity(int activityId){
        new ActivityDaoImplementation().findActivity(activityId);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {

        return "Got it with the pipeline!";
    }
}
