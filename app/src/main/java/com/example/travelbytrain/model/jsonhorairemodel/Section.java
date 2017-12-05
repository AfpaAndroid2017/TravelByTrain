
package com.example.travelbytrain.model.jsonhorairemodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Section {

    @SerializedName("from")
    @Expose
    private From from;
    @SerializedName("links")
    @Expose
    private List<Link> links = null;
    @SerializedName("arrival_date_time")
    @Expose
    private String arrival_date_time;
    @SerializedName("departure_date_time")
    @Expose
    private String departure_date_time;
    @SerializedName("to")
    @Expose
    private To to;
    @SerializedName("co2_emission")
    @Expose
    private Co2_emission co2_emission;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("mode")
    @Expose
    private String mode;
    @SerializedName("additional_informations")
    @Expose
    private List<String> additional_informations = null;
    @SerializedName("display_informations")
    @Expose
    private Display_informations display_informations;
    @SerializedName("base_arrival_date_time")
    @Expose
    private String base_arrival_date_time;
    @SerializedName("base_departure_date_time")
    @Expose
    private String base_departure_date_time;
    @SerializedName("geojson")
    @Expose
    private Geojson geojson;
    @SerializedName("data_freshness")
    @Expose
    private String data_freshness;
    @SerializedName("stop_date_times")
    @Expose
    private List<Stop_date_time> stop_date_times = null;

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public String getArrival_date_time() {
        return arrival_date_time;
    }

    public void setArrival_date_time(String arrival_date_time) {
        this.arrival_date_time = arrival_date_time;
    }

    public String getDeparture_date_time() {
        return departure_date_time;
    }

    public void setDeparture_date_time(String departure_date_time) {
        this.departure_date_time = departure_date_time;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To to) {
        this.to = to;
    }

    public Co2_emission getCo2_emission() {
        return co2_emission;
    }

    public void setCo2_emission(Co2_emission co2_emission) {
        this.co2_emission = co2_emission;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public List<String> getAdditional_informations() {
        return additional_informations;
    }

    public void setAdditional_informations(List<String> additional_informations) {
        this.additional_informations = additional_informations;
    }

    public Display_informations getDisplay_informations() {
        return display_informations;
    }

    public void setDisplay_informations(Display_informations display_informations) {
        this.display_informations = display_informations;
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

    public Geojson getGeojson() {
        return geojson;
    }

    public void setGeojson(Geojson geojson) {
        this.geojson = geojson;
    }

    public String getData_freshness() {
        return data_freshness;
    }

    public void setData_freshness(String data_freshness) {
        this.data_freshness = data_freshness;
    }

    public List<Stop_date_time> getStop_date_times() {
        return stop_date_times;
    }

    public void setStop_date_times(List<Stop_date_time> stop_date_times) {
        this.stop_date_times = stop_date_times;
    }

}
