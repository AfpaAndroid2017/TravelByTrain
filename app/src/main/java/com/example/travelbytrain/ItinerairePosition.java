package com.example.travelbytrain;

import android.location.Location;

/**
 * Created by 77011-40-04 on 29/11/2017.
 */

public class ItinerairePosition {

    Position positionGPS;
    Position positionGare;

    public ItinerairePosition(Position positionGPS, Position positionGare) {
        this.positionGPS = positionGPS;
        this.positionGare = positionGare;
    }

    public Position getPositionGPS() {
        return positionGPS;
    }

    public Position getPositionGare() {
        return positionGare;
    }
}


