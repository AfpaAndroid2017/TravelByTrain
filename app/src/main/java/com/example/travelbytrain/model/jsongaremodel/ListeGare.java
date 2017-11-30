
package com.example.travelbytrain.model.jsongaremodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListeGare {

    @SerializedName("nhits")
    @Expose
    private Integer nhits;
    @SerializedName("parameters")
    @Expose
    private Parameters parameters;
    @SerializedName("records")
    @Expose
    private List<Record> records = null;
    @SerializedName("facet_groups")
    @Expose
    private List<Facet_group> facet_groups = null;

    public Integer getNhits() {
        return nhits;
    }

    public void setNhits(Integer nhits) {
        this.nhits = nhits;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public List<Facet_group> getFacet_groups() {
        return facet_groups;
    }

    public void setFacet_groups(List<Facet_group> facet_groups) {
        this.facet_groups = facet_groups;
    }

}
