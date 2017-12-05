
package com.example.travelbytrain.model.jsonhorairemodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stop_point {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("links")
    @Expose
    private List<Object> links = null;
    @SerializedName("coord")
    @Expose
    private Coord coord;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("equipments")
    @Expose
    private List<Object> equipments = null;
    @SerializedName("administrative_regions")
    @Expose
    private List<Administrative_region> administrative_regions = null;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("stop_area")
    @Expose
    private Stop_area stop_area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Object> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Object> equipments) {
        this.equipments = equipments;
    }

    public List<Administrative_region> getAdministrative_regions() {
        return administrative_regions;
    }

    public void setAdministrative_regions(List<Administrative_region> administrative_regions) {
        this.administrative_regions = administrative_regions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Stop_area getStop_area() {
        return stop_area;
    }

    public void setStop_area(Stop_area stop_area) {
        this.stop_area = stop_area;
    }

}
