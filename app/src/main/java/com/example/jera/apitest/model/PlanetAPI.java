package com.example.jera.apitest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.Streams;

import java.io.Serializable;

/**
 * Created by jera on 09/05/17.
 */

public class PlanetAPI {


    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("population")
    private String population;
    @SerializedName("diameter")
    private String diamenter;
    @SerializedName("climate")
    private String climate;
    @SerializedName("gravity")
    private String gravity;
    @SerializedName("terrain")
    private String terrain;
    @SerializedName("rotation_period")
    private String rotation_period;
    @SerializedName("orbital_period")
    private String orbital_period;
    @SerializedName("surface_water")
    private String surface_water;
    @SerializedName("created")
    private String created;
    @SerializedName("edited")
    private String edited;
    @SerializedName("url")
    private String url;


    public PlanetAPI(String name, String population, String diamenter, String climate,
                     String gravity, String terrain, String rotation_period, String orbital_period,
                     String surface_water, int id, String created, String edited, String url) {
        this.name = name;
        this.population = population;
        this.diamenter = diamenter;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
        this.rotation_period = rotation_period;
        this.orbital_period = orbital_period;
        this.surface_water = surface_water;
        this.id = id;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(String rotation_period) {
        this.rotation_period = rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(String surface_water) {
        this.surface_water = surface_water;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getDiamenter() {
        return diamenter;
    }

    public void setDiamenter(String diamenter) {
        this.diamenter = diamenter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain  ;
    }
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
