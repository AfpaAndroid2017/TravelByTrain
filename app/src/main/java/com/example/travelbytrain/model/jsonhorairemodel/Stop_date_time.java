
package com.example.travelbytrain.model.jsonhorairemodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stop_date_time {

    @SerializedName("stop_point")
    @Expose
    private Stop_point stop_point;
    @SerializedName("links")
    @Expose
    private List<Object> links = null;
    @SerializedName("arrival_date_time")
    @Expose
    private String arrival_date_time;
    @SerializedName("additional_informations")
    @Expose
    private List<Object> additional_informations = null;
    @SerializedName("departure_date_time")
    @Expose
    private String departure_date_time;
    @SerializedName("base_arrival_date_time")
    @Expose
    private String base_arrival_date_time;
    @SerializedName("base_departure_date_time")
    @Expose
    private String base_departure_date_time;

    public Stop_point getStop_point() {
        return stop_point;
    }

    public void setStop_point(Stop_point stop_point) {
        this.stop_point = stop_point;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public String getArrival_date_time() {
        return arrival_date_time;
    }

    public void setArrival_date_time(String arrival_date_time) {
        this.arrival_date_time = arrival_date_time;
    }

    public List<Object> getAdditional_informations() {
        return additional_informations;
    }

    public void setAdditional_informations(List<Object> additional_informations) {
        this.additional_informations = additional_informations;
    }

    public String getDeparture_date_time() {
        return departure_date_time;
    }

    public void setDeparture_date_time(String departure_date_time) {
        this.departure_date_time = departure_date_time;
    }

    public String getBase_arrival_date_time() {
        return base_arrival_date_time;
    }

    public void setBase_arrival_date_time(String base_arrival_date_time) {
        this.base_arrival_date_time = base_arrival_date_time;
    }

    public String getBase_departure_date_time() {
        return base_departure_date_time;
    }

    public void setBase_departure_date_time(String base_departure_date_time) {
        this.base_departure_date_time = base_departure_date_time;
    }

}
