
package com.example.travelbytrain.model.jsonhorairemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Car_direct_path {

    @SerializedName("co2_emission")
    @Expose
    private Co2_emission co2_emission;

    public Co2_emission getCo2_emission() {
        return co2_emission;
    }

    public void setCo2_emission(Co2_emission co2_emission) {
        this.co2_emission = co2_emission;
    }

}
