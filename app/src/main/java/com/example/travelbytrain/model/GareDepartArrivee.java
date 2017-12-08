package com.example.travelbytrain.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.travelbytrain.model.jsongaremodel.Fields;

import java.io.Serializable;

/**
 * Created by 77011-40-04 on 06/12/2017.
 */

public class GareDepartArrivee implements Serializable {
    Fields gareDepart;
    Fields gareArrivee;

    public GareDepartArrivee(Fields gareDepart, Fields gareArrivee) {
        this.gareDepart = gareDepart;
        this.gareArrivee = gareArrivee;
    }

    public Fields getGareDepart() {
        return gareDepart;
    }

    public Fields getGareArrivee() {
        return gareArrivee;
    }


}
