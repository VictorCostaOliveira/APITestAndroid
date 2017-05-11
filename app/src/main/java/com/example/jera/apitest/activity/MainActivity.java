package com.example.jera.apitest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.jera.apitest.R;
import com.example.jera.apitest.adapter.RecylerViewaAdapter;
import com.example.jera.apitest.model.Planet;
import com.example.jera.apitest.model.PlanetAPI;
import com.example.jera.apitest.rest.APIClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Path;

public class MainActivity extends AppCompatActivity implements RecylerViewaAdapter.AdapterInterface {
    private RecylerViewaAdapter adapter;
    private RecyclerView recyclerViewPlanetName;
    private final static String NAME_PLANET = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new RecylerViewaAdapter(RecylerViewaAdapter.planetList, this);
        recyclerViewPlanetName = (RecyclerView) findViewById(R.id.recyclerViewPlanet);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerViewPlanetName.setLayoutManager(layoutManager);

        Call<PlanetAPI> call = APIClient.getPlanet().getPlanet(NAME_PLANET);
        call.enqueue(new Callback<PlanetAPI>() {
            @Override
            public void onResponse(Call<PlanetAPI> call, Response<PlanetAPI> response) {
                String planetName = response.body().getName();
                recyclerViewPlanetName.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<PlanetAPI> call, Throwable t) {

            }
        });





    }
}
