package com.example.jera.apitest.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.jera.apitest.R;
import com.example.jera.apitest.adapter.RecylerViewAdapter;
import com.example.jera.apitest.model.APIResults;
import com.example.jera.apitest.model.PlanetAPI;
import com.example.jera.apitest.rest.APIClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jera on 15/05/17.
 */

public class ShowAllPlanets extends AppCompatActivity {
    private static final String TAG = "Victor";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_show_all_planets);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewPlanet);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Call<APIResults> call = APIClient.getPlanetAPI().getPlanet();
        call.enqueue(new Callback<APIResults>() {
            @Override
            public void onResponse(Call<APIResults> call, Response<APIResults> response) {
                List<PlanetAPI> planetAPI = response.body().getPlanets();
                recyclerView.setAdapter(new RecylerViewAdapter(planetAPI, R.layout.show_all_planets, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<APIResults> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
