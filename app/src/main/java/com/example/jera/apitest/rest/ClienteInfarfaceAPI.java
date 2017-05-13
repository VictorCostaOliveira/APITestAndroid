package com.example.jera.apitest.rest;

import com.example.jera.apitest.model.PlanetAPI;
import com.example.jera.apitest.model.Results;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by jera on 11/05/17.
 */

public interface ClienteInfarfaceAPI {


    @GET("api/planets/")
    Call<Results> getPlanet();

}
