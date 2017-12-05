
package com.example.travelbytrain.model.jsonhorairemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Week_pattern {

    @SerializedName("monday")
    @Expose
    private Boolean monday;
    @SerializedName("tuesday")
    @Expose
    private Boolean tuesday;
    @SerializedName("friday")
    @Expose
    private Boolean friday;
    @SerializedName("wednesday")
    @Expose
    private Boolean wednesday;
    @SerializedName("thursday")
    @Expose
    private Boolean thursday;
    @SerializedName("sunday")
    @Expose
    private Boolean sunday;
    @SerializedName("saturday")
    @Expose
    private Boolean saturday;

    public Boolean getMonday() {
        return monday;
    }

    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    public Boolean getTuesday() {
        return tuesday;
    }

    public void setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
    }

    public Boolean getFriday() {
        return friday;
    }

    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

    public Boolean getWednesday() {
        return wednesday;
    }

    public void setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
    }

    public Boolean getThursday() {
        return thursday;
    }

    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    public Boolean getSunday() {
        return sunday;
    }

    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }

    public Boolean getSaturday() {
        return saturday;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }

}
