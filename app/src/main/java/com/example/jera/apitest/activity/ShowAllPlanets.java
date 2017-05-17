package com.example.jera.apitest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.jera.apitest.R;
import com.example.jera.apitest.adapter.RecylerViewAdapter;
import com.example.jera.apitest.model.APIPlanetsResults;
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
    private FrameLayout frameLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_planets);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewPlanet);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        frameLayout = (FrameLayout) findViewById(R.id.loadingFrameLayout);

        frameLayout.setVisibility(View.VISIBLE);
        Call<APIPlanetsResults> call = APIClient.getAPI().getPlanet();

        call.enqueue(new Callback<APIPlanetsResults>() {
            @Override
            public void onResponse(Call<APIPlanetsResults> call, Response<APIPlanetsResults> response) {
                frameLayout.setVisibility(View.GONE);
                List<PlanetAPI> planetAPI = response.body().getPlanets();
                recyclerView.setAdapter(new RecylerViewAdapter(planetAPI, R.layout.show_all_planets, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<APIPlanetsResults> call, Throwable t) {
                Toast.makeText(ShowAllPlanets.this, R.string.conectioError, Toast.LENGTH_SHORT).show();
                Log.e(TAG, t.toString());
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
