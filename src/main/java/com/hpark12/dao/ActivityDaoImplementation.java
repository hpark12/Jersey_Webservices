package com.hpark12.dao;

import com.hpark12.repository.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityDaoImplementation implements ActivityDao{


    @Override
    public Activity findActivity(int activityId) {
        Activity swim = new Activity();
        swim.setActivityId(10);
        swim.setActivityName("Swimming");
        swim.setDuration("40");
        return swim;
    }

    @Override
    public List<Activity> GetAllActivities() {
        Activity bike = new Activity();
        bike.setActivityId(20);
        bike.setActivityName("Biking");
        bike.setDuration("20");
        Activity swim = new Activity();
        swim.setActivityId(10);
        swim.setActivityName("Swimming");
        swim.setDuration("40");

        List<Activity> list = new ArrayList<>();
        list.add(bike);
        list.add(swim);
        return list;
    }
}
