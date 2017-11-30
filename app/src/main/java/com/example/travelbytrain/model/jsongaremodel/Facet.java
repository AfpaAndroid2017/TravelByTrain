
package com.example.travelbytrain.model.jsongaremodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Facet {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("state")
    @Expose
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
