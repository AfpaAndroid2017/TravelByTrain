package com.example.travelbytrain.model.trajetmodel;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.travelbytrain.R;

/**
 * Created by DimsDev on 29/11/2017.
 */

class TrajetViewHolder extends RecyclerView.ViewHolder {

    private TextView ttvDateDepart;
    private TextView ttvHrDepart;
    private TextView ttvDateArrivee;
    private TextView ttvHrArrivee;

    public TrajetViewHolder(View itemTrajetView) {
        super(itemTrajetView);

        ttvDateDepart   = itemTrajetView.findViewById(R.id.ttvDateDepart);
        ttvHrDepart     = itemTrajetView.findViewById(R.id.ttvHrDepart);
        ttvDateArrivee  = itemTrajetView.findViewById(R.id.ttvDateArrivee);
        ttvHrArrivee    = itemTrajetView.findViewById(R.id.ttvHrArrivee);
    }

    public void bind(GareHoraire gareHoraire){
        ttvDateDepart.setText(  "Date départ : "   + " " + gareHoraire.getDateDepart());
        ttvHrDepart.setText(    "Heure départ : "  + " " + gareHoraire.getHeureDepart());
        ttvDateArrivee.setText( "Date arrivée : "  + " " + gareHoraire.getDateArrivee());
        ttvHrArrivee.setText(   "Heure arrivée : " + " " + gareHoraire.getHeureArrivee());
    }
}
