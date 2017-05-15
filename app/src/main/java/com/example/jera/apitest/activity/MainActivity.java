package com.example.jera.apitest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.jera.apitest.R;
import com.example.jera.apitest.adapter.RecylerViewaAdapter;
import com.example.jera.apitest.model.Planet;
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
import retrofit2.http.Path;

public class MainActivity extends AppCompatActivity implements RecylerViewaAdapter.AdapterInterface {
    private RecylerViewaAdapter adapter;
    private RecyclerView recyclerViewPlanetName;
    private Retrofit retrofit;
    private static final String BASE_URL = "http://swapi.co/api/";
    private static final String TAG = "Victor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        adapter = new RecylerViewaAdapter(RecylerViewaAdapter.planetList, this);
        recyclerViewPlanetName = (RecyclerView) findViewById(R.id.recyclerViewPlanet);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewPlanetName.setLayoutManager(layoutManager);

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ClienteInfarfaceAPI apiInteface = retrofit.create(ClienteInfarfaceAPI.class);
        Call<Results> resultsCall = apiInteface.getPlanet();

        resultsCall.enqueue(new Callback<Results>() {
            @Override
            public void onResponse(Call<Results> call, Response<Results> response) {
                if (!response.isSuccessful()) {
                    Log.i("TAG", "Erro: " + response.code());
                } else {
                    Results results = response.body();
                    for (PlanetAPI planets : results.getPlanets()) {
                        
                    }
                }
            }

            @Override
            public void onFailure(Call<Results> call, Throwable t) {
                Log.e(TAG, "Erro" + t.getMessage());
            }
        });
    }


}
}
