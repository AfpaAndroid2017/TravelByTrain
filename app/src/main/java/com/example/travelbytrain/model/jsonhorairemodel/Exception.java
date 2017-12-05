
package com.example.travelbytrain.model.jsonhorairemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exception {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("datetime")
    @Expose
    private String datetime;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

}
