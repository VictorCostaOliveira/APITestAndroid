package com.example.jera.apitest.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by jera on 09/05/17.
 */

public class FilmAPI {

    @SerializedName("title")
    private String filmName;

    @SerializedName("episode_id")
    private int filmEpisode;

    @SerializedName("opening_crawl")
    private String filmOpening;

    @SerializedName("director")
    private String filmDirector;

    @SerializedName("release_date")
    private String filmDate;

    public FilmAPI(String filmName, int filmEpisode, String filmOpening, String filmDirector, String filmDate) {
        this.filmName = filmName;
        this.filmEpisode = filmEpisode;
        this.filmOpening = filmOpening;
        this.filmDirector = filmDirector;
        this.filmDate = filmDate;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getFilmEpisode() {
        return filmEpisode;
    }

    public void setFilmEpisode(int filmEpisode) {
        this.filmEpisode = filmEpisode;
    }

    public String getFilmOpening() {
        return filmOpening;
    }

    public void setFilmOpening(String filmOpening) {
        this.filmOpening = filmOpening;
    }

    public String getFilmDirector() {
        return filmDirector;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

    public String getFilmDate() {
        return filmDate;
    }

    public void setFilmDate(String filmDate) {
        this.filmDate = filmDate;
    }
}
