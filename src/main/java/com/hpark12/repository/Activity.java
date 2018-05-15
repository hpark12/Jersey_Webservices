package com.hpark12.repository;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Activity {

    private int activityId;
    private String activityName;
    private String duration;


    public Activity(int activityId, String activityName, String duration) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.duration = duration;
    }

    public Activity() {

    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;

        Activity activity = (Activity) o;

        if (activityId != activity.activityId) return false;
        if (activityName != null ? !activityName.equals(activity.activityName) : activity.activityName != null)
            return false;
        return duration != null ? duration.equals(activity.duration) : activity.duration == null;
    }

    @Override
    public int hashCode() {
        int result = activityId;
        result = 31 * result + (activityName != null ? activityName.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", activityName='" + activityName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
