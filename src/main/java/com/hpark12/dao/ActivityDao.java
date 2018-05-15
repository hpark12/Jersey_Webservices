package com.hpark12.dao;

import com.hpark12.repository.Activity;

import java.util.List;

public interface ActivityDao {

    public Activity findActivity(int activityId);
    List<Activity> GetAllActivities();

}
