package com.example.jera.apitest.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by jera on 16/05/17.
 */

public class APIFilmResults {

    @SerializedName("results")
    ArrayList<FilmAPI> films;

    public ArrayList<FilmAPI> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<FilmAPI> films) {
        this.films = films;
    }
}
