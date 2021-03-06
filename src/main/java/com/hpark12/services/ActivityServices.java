package com.hpark12.services;

import com.hpark12.dao.ActivityDaoImplementation;
import com.hpark12.repository.Activity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("activities")
public class ActivityServices {

    static ActivityDaoImplementation example = new ActivityDaoImplementation();

    @GET
    @Path("{activityid}")
    @Produces(MediaType.APPLICATION_XML)
    public Activity getActivity(@PathParam("activityid") int activityId) {
        return example.findActivity(activityId);
    }


    @GET                                    // http://localhost:8080/Jersey_Webservices/webapi/activities
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Activity> getAllActivities() {
        return example.GetAllActivities();
    }


}
