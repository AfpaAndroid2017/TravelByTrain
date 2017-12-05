
package com.example.travelbytrain.model.jsonhorairemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Durations {

    @SerializedName("walking")
    @Expose
    private Integer walking;
    @SerializedName("total")
    @Expose
    private Integer total;

    public Integer getWalking() {
        return walking;
    }

    public void setWalking(Integer walking) {
        this.walking = walking;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
