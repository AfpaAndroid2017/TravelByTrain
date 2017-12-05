
package com.example.travelbytrain.model.jsonhorairemodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HoraireTrajet {

    @SerializedName("tickets")
    @Expose
    private List<Object> tickets = null;
    @SerializedName("links")
    @Expose
    private List<Link> links = null;
    @SerializedName("journeys")
    @Expose
    private List<Journey> journeys = null;
    @SerializedName("disruptions")
    @Expose
    private List<Object> disruptions = null;
    @SerializedName("notes")
    @Expose
    private List<Object> notes = null;
    @SerializedName("feed_publishers")
    @Expose
    private List<Object> feed_publishers = null;
    @SerializedName("context")
    @Expose
    private Context context;
    @SerializedName("exceptions")
    @Expose
    private List<Object> exceptions = null;

    public List<Object> getTickets() {
        return tickets;
    }

    public void setTickets(List<Object> tickets) {
        this.tickets = tickets;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(List<Journey> journeys) {
        this.journeys = journeys;
    }

    public List<Object> getDisruptions() {
        return disruptions;
    }

    public void setDisruptions(List<Object> disruptions) {
        this.disruptions = disruptions;
    }

    public List<Object> getNotes() {
        return notes;
    }

    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    public List<Object> getFeed_publishers() {
        return feed_publishers;
    }

    public void setFeed_publishers(List<Object> feed_publishers) {
        this.feed_publishers = feed_publishers;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Object> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<Object> exceptions) {
        this.exceptions = exceptions;
    }

}
