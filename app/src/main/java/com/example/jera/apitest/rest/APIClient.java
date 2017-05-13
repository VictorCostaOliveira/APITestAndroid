package com.example.jera.apitest.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jera on 10/05/17.
 */

public class APIClient {

    private static final String BASE_URL = "http://swapi.co/api/";
    private static Retrofit retrofit;

    public static ClienteInfarfaceAPI getPlanetAPI() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        ClienteInfarfaceAPI apiInteface = retrofit.create(ClienteInfarfaceAPI.class);
        return apiInteface;

    }


}
