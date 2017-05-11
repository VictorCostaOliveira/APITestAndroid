package com.example.jera.apitest.model;

/**
 * Created by jera on 11/05/17.
 */

public class Planet {

    private String namePlanet;
    private String populationPlanet;
    private String climatePlanet;
    private String terrainPlanet;
    private String gravityPlanet;

    public Planet(String namePlanet, String populationPlanet, String climatePlanet, String terrainPlanet, String gravityPlanet) {
        this.namePlanet = namePlanet;
        this.populationPlanet = populationPlanet;
        this.climatePlanet = climatePlanet;
        this.terrainPlanet = terrainPlanet;
        this.gravityPlanet = gravityPlanet;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public String getPopulationPlanet() {
        return populationPlanet;
    }

    public void setPopulationPlanet(String populationPlanet) {
        this.populationPlanet = populationPlanet;
    }

    public String getClimatePlanet() {
        return climatePlanet;
    }

    public void setClimatePlanet(String climatePlanet) {
        this.climatePlanet = climatePlanet;
    }

    public String getTerrainPlanet() {
        return terrainPlanet;
    }

    public void setTerrainPlanet(String terrainPlanet) {
        this.terrainPlanet = terrainPlanet;
    }

    public String getGravityPlanet() {
        return gravityPlanet;
    }

    public void setGravityPlanet(String gravityPlanet) {
        this.gravityPlanet = gravityPlanet;
    }
}
