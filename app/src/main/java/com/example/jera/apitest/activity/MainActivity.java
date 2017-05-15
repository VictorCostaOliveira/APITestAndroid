package com.example.jera.apitest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.jera.apitest.R;
import com.example.jera.apitest.adapter.RecylerViewAdapter;
import com.example.jera.apitest.model.PlanetAPI;
import com.example.jera.apitest.model.Results;
import com.example.jera.apitest.rest.APIClient;
import com.example.jera.apitest.rest.ClienteInfarfaceAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Victor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewPlanet);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Call<Results> call = APIClient.getPlanetAPI().getPlanet();
        call.enqueue(new Callback<Results>() {
            @Override
            public void onResponse(Call<Results> call, Response<Results> response) {
                List<PlanetAPI> planetAPI = response.body().getPlanets();
                recyclerView.setAdapter(new RecylerViewAdapter(planetAPI, R.layout.text_view_planet, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<Results> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });

    }
}

