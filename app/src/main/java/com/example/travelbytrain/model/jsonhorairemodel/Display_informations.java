
package com.example.travelbytrain.model.jsonhorairemodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Display_informations {

    @SerializedName("direction")
    @Expose
    private String direction;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("network")
    @Expose
    private String network;
    @SerializedName("links")
    @Expose
    private List<Object> links = null;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("physical_mode")
    @Expose
    private String physical_mode;
    @SerializedName("headsign")
    @Expose
    private String headsign;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("equipments")
    @Expose
    private List<Object> equipments = null;
    @SerializedName("text_color")
    @Expose
    private String text_color;
    @SerializedName("commercial_mode")
    @Expose
    private String commercial_mode;
    @SerializedName("description")
    @Expose
    private String description;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhysical_mode() {
        return physical_mode;
    }

    public void setPhysical_mode(String physical_mode) {
        this.physical_mode = physical_mode;
    }

    public String getHeadsign() {
        return headsign;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
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

    public String getText_color() {
        return text_color;
    }

    public void setText_color(String text_color) {
        this.text_color = text_color;
    }

    public String getCommercial_mode() {
        return commercial_mode;
    }

    public void setCommercial_mode(String commercial_mode) {
        this.commercial_mode = commercial_mode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
