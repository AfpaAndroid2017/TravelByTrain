package com.example.travelbytrain.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 77011-40-04 on 30/11/2017.
 */

public class GareSelect implements Parcelable {
    private Fields gareDepart;
    private Fields gareArrivee;

    public GareSelect(Fields gareDepart, Fields gareArrivee) {
        this.gareDepart = gareDepart;
        this.gareArrivee = gareArrivee;
    }

    protected GareSelect(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<GareSelect> CREATOR = new Creator<GareSelect>() {
        @Override
        public GareSelect createFromParcel(Parcel in) {
            return new GareSelect(in);
        }

        @Override
        public GareSelect[] newArray(int size) {
            return new GareSelect[size];
        }
    };
}
