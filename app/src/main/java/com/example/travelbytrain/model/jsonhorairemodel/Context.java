
package com.example.travelbytrain.model.jsonhorairemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Context {

    @SerializedName("car_direct_path")
    @Expose
    private Car_direct_path car_direct_path;

    public Car_direct_path getCar_direct_path() {
        return car_direct_path;
    }

    public void setCar_direct_path(Car_direct_path car_direct_path) {
        this.car_direct_path = car_direct_path;
    }

}
