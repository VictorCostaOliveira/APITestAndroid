package com.example.jera.apitest.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by vitor on 13/05/2017.
 */

public class APIResults {

    @SerializedName("results")
    ArrayList<PlanetAPI> planets;

    @SerializedName("results")
    ArrayList<PeopleAPI> peoples;

    public ArrayList<PlanetAPI> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<PlanetAPI> planets) {
        this.planets = planets;
    }

    public ArrayList<PeopleAPI> getPeoples() {
        return peoples;
    }

    public void setPeoples(ArrayList<PeopleAPI> peoples) {
        this.peoples = peoples;
    }
}
