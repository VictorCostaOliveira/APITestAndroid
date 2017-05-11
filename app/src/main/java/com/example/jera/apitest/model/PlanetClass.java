package com.example.jera.apitest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by jera on 09/05/17.
 */

public class PlanetClass {

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

    public PlanetClass(int id, String name, String population, String diamenter, String climate, String gravity, String terrain) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.diamenter = diamenter;
        this.climate = climate;
        this.gravity = gravity;
        this.terrain = terrain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        this.terrain = terrain;
    }
}
