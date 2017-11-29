package com.example.travelbytrain;

/**
 * Created by 77011-40-04 on 29/11/2017.
 */

public class Position {
    Double lattitude ;
    Double longitude ;

    public Position(Double lattitude, Double longitude) {
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public Double getLattitude() {
        return lattitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
