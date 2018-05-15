package com.hpark12.dao;

import com.hpark12.repository.Activity;

import java.util.List;

public interface ActivityDao {

    public Activity findActivity();
    List<Activity> GetAllActivities();

}
