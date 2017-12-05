
package com.example.travelbytrain.model.jsonhorairemodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Calendar {

    @SerializedName("exceptions")
    @Expose
    private List<Exception> exceptions = null;
    @SerializedName("active_periods")
    @Expose
    private List<Active_period> active_periods = null;
    @SerializedName("week_pattern")
    @Expose
    private Week_pattern week_pattern;
    @SerializedName("id")
    @Expose
    private Object id;

    public List<Exception> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<Exception> exceptions) {
        this.exceptions = exceptions;
    }

    public List<Active_period> getActive_periods() {
        return active_periods;
    }

    public void setActive_periods(List<Active_period> active_periods) {
        this.active_periods = active_periods;
    }

    public Week_pattern getWeek_pattern() {
        return week_pattern;
    }

    public void setWeek_pattern(Week_pattern week_pattern) {
        this.week_pattern = week_pattern;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

}
