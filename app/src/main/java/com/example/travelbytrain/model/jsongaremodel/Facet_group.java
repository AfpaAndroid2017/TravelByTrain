
package com.example.travelbytrain.model.jsongaremodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Facet_group {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("facets")
    @Expose
    private List<Facet> facets = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

}
