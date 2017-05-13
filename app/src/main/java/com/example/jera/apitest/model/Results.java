package com.example.jera.apitest.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by vitor on 13/05/2017.
 */

public class Results {

    @SerializedName("results")
    ArrayList<PlanetAPI> planets;

    public Results(ArrayList<PlanetAPI> planets) {
        this.planets = planets;
    }

    public ArrayList<PlanetAPI> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<PlanetAPI> planets) {
        this.planets = planets;
    }
}
