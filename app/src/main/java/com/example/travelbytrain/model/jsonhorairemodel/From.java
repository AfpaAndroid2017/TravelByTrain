
package com.example.travelbytrain.model.jsonhorairemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class From {

    @SerializedName("embedded_type")
    @Expose
    private String embedded_type;
    @SerializedName("quality")
    @Expose
    private Integer quality;
    @SerializedName("administrative_region")
    @Expose
    private Administrative_region administrative_region;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("stop_point")
    @Expose
    private Stop_point stop_point;

    public String getEmbedded_type() {
        return embedded_type;
    }

    public void setEmbedded_type(String embedded_type) {
        this.embedded_type = embedded_type;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Administrative_region getAdministrative_region() {
        return administrative_region;
    }

    public void setAdministrative_region(Administrative_region administrative_region) {
        this.administrative_region = administrative_region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Stop_point getStop_point() {
        return stop_point;
    }

    public void setStop_point(Stop_point stop_point) {
        this.stop_point = stop_point;
    }

}
