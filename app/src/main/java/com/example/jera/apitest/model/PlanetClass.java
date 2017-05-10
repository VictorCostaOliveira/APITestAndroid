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
    @Expose
    private String name;

    @SerializedName("population")
    @Expose
    private String population;


}
