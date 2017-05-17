package com.example.jera.apitest.rest;

import com.example.jera.apitest.model.APIFilmResults;
import com.example.jera.apitest.model.APIPeopleResults;
import com.example.jera.apitest.model.APIPlanetsResults;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jera on 11/05/17.
 */

public interface ClienteInfarfaceAPI {

    @GET("api/planets/")
    Call<APIPlanetsResults> getPlanet();

    @GET("api/films/")
    Call<APIFilmResults> getFilms();

    @GET("api/people/")
    Call<APIPeopleResults> getPeoples();

}
