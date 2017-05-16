package com.example.jera.apitest.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by jera on 16/05/17.
 */

public class APIPeopleResults {

    @SerializedName("results")
    ArrayList<PeopleAPI> peoples;

    public ArrayList<PeopleAPI> getPeoples() {
        return peoples;
    }

    public void setPeoples(ArrayList<PeopleAPI> peoples) {
        this.peoples = peoples;
    }
}
