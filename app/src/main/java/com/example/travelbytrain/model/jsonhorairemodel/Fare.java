
package com.example.travelbytrain.model.jsonhorairemodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fare {

    @SerializedName("found")
    @Expose
    private Boolean found;
    @SerializedName("total")
    @Expose
    private Total total;
    @SerializedName("links")
    @Expose
    private List<Object> links = null;

    public Boolean getFound() {
        return found;
    }

    public void setFound(Boolean found) {
        this.found = found;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

}
