
package com.example.travelbytrain.model.jsonhorairemodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Journey {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("fare")
    @Expose
    private Fare fare;
    @SerializedName("links")
    @Expose
    private List<Link> links = null;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("nb_transfers")
    @Expose
    private Integer nb_transfers;
    @SerializedName("durations")
    @Expose
    private Durations durations;
    @SerializedName("arrival_date_time")
    @Expose
    private String arrival_date_time;
    @SerializedName("calendars")
    @Expose
    private List<Calendar> calendars = null;
    @SerializedName("departure_date_time")
    @Expose
    private String departure_date_time;
    @SerializedName("requested_date_time")
    @Expose
    private String requested_date_time;
    @SerializedName("co2_emission")
    @Expose
    private Co2_emission co2_emission;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("sections")
    @Expose
    private List<Section> sections = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Fare getFare() {
        return fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getNb_transfers() {
        return nb_transfers;
    }

    public void setNb_transfers(Integer nb_transfers) {
        this.nb_transfers = nb_transfers;
    }

    public Durations getDurations() {
        return durations;
    }

    public void setDurations(Durations durations) {
        this.durations = durations;
    }

    public String getArrival_date_time() {
        return arrival_date_time;
    }

    public void setArrival_date_time(String arrival_date_time) {
        this.arrival_date_time = arrival_date_time;
    }

    public List<Calendar> getCalendars() {
        return calendars;
    }

    public void setCalendars(List<Calendar> calendars) {
        this.calendars = calendars;
    }

    public String getDeparture_date_time() {
        return departure_date_time;
    }

    public void setDeparture_date_time(String departure_date_time) {
        this.departure_date_time = departure_date_time;
    }

    public String getRequested_date_time() {
        return requested_date_time;
    }

    public void setRequested_date_time(String requested_date_time) {
        this.requested_date_time = requested_date_time;
    }

    public Co2_emission getCo2_emission() {
        return co2_emission;
    }

    public void setCo2_emission(Co2_emission co2_emission) {
        this.co2_emission = co2_emission;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

}
