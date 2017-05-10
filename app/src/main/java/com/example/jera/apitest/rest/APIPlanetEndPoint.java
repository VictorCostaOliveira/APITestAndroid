package com.example.jera.apitest.rest;

import com.example.jera.apitest.model.PlanetClass;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jera on 10/05/17.
 */

public class APIPlanetEndPoint {

    @GET("name"/{"username"})
    Call<PlanetClass> getName
}
