
package com.example.travelbytrain.model.jsongaremodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fields {

    @SerializedName("departement")
    @Expose
    private String departement;
    @SerializedName("commune")
    @Expose
    private String commune;
    @SerializedName("y_wgs84")
    @Expose
    private Double y_wgs84;
    @SerializedName("x_wgs84")
    @Expose
    private Double x_wgs84;
    @SerializedName("coordonnees_geographiques")
    @Expose
    private List<Double> coordonnees_geographiques = null;
    @SerializedName("voyageurs")
    @Expose
    private String voyageurs;
    @SerializedName("rang")
    @Expose
    private Double rang;
    @SerializedName("x_lambert_93")
    @Expose
    private Double x_lambert_93;
    @SerializedName("code_uic")
    @Expose
    private Double code_uic;
    @SerializedName("y_lambert_93")
    @Expose
    private Double y_lambert_93;
    @SerializedName("libelle_gare")
    @Expose
    private String libelle_gare;
    @SerializedName("pk")
    @Expose
    private String pk;
    @SerializedName("code_ligne")
    @Expose
    private String code_ligne;
    @SerializedName("fret")
    @Expose
    private String fret;

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public Double getY_wgs84() {
        return y_wgs84;
    }

    public void setY_wgs84(Double y_wgs84) {
        this.y_wgs84 = y_wgs84;
    }

    public Double getX_wgs84() {
        return x_wgs84;
    }

    public void setX_wgs84(Double x_wgs84) {
        this.x_wgs84 = x_wgs84;
    }

    public List<Double> getCoordonnees_geographiques() {
        return coordonnees_geographiques;
    }

    public void setCoordonnees_geographiques(List<Double> coordonnees_geographiques) {
        this.coordonnees_geographiques = coordonnees_geographiques;
    }

    public String getVoyageurs() {
        return voyageurs;
    }

    public void setVoyageurs(String voyageurs) {
        this.voyageurs = voyageurs;
    }

    public Double getRang() {
        return rang;
    }

    public void setRang(Double rang) {
        this.rang = rang;
    }

    public Double getX_lambert_93() {
        return x_lambert_93;
    }

    public void setX_lambert_93(Double x_lambert_93) {
        this.x_lambert_93 = x_lambert_93;
    }

    public Double getCode_uic() {
        return code_uic;
    }

    public void setCode_uic(Double code_uic) {
        this.code_uic = code_uic;
    }

    public Double getY_lambert_93() {
        return y_lambert_93;
    }

    public void setY_lambert_93(Double y_lambert_93) {
        this.y_lambert_93 = y_lambert_93;
    }

    public String getLibelle_gare() {
        return libelle_gare;
    }

    public void setLibelle_gare(String libelle_gare) {
        this.libelle_gare = libelle_gare;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getCode_ligne() {
        return code_ligne;
    }

    public void setCode_ligne(String code_ligne) {
        this.code_ligne = code_ligne;
    }

    public String getFret() {
        return fret;
    }

    public void setFret(String fret) {
        this.fret = fret;
    }

}
