package com.example.travelbytrain.model.trajetmodel;

/**
 * Created by DimsDev on 29/11/2017.
 */

public class GareHoraire {
    private String dateDepart, heureDepart, dateArrivee, heureArrivee;

    public GareHoraire(String dateDepart, String heureDepart, String dateArrivee, String heureArrivee) {
        this.dateDepart     = dateDepart;
        this.heureDepart    = heureDepart;
        this.dateArrivee    = dateArrivee;
        this.heureArrivee   = heureArrivee;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public String getHeureArrivee() {
        return heureArrivee;
    }
}
