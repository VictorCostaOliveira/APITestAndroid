package com.example.jera.apitest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.jera.apitest.R;
import com.example.jera.apitest.adapter.RecyclerViewAdapterFilms;
import com.example.jera.apitest.model.APIFilmResults;
import com.example.jera.apitest.model.FilmAPI;
import com.example.jera.apitest.rest.APIClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ShowAllFilms extends AppCompatActivity {
    private FrameLayout frameLayoutFilms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_films);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewFilms);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        frameLayoutFilms = (FrameLayout) findViewById(R.id.loadingFrameLayoutFilms);

        frameLayoutFilms.setVisibility(View.VISIBLE);
        Call<APIFilmResults> call = APIClient.getAPI().getFilms();
        call.enqueue(new Callback<APIFilmResults>() {
            @Override
            public void onResponse(Call<APIFilmResults> call, Response<APIFilmResults> response) {
                frameLayoutFilms.setVisibility(View.GONE);
                List<FilmAPI> filmAPI = response.body().getFilms();
                recyclerView.setAdapter(new RecyclerViewAdapterFilms(filmAPI, getApplicationContext(), R.layout.show_all_films));
            }

            @Override
            public void onFailure(Call<APIFilmResults> call, Throwable t) {
                Toast.makeText(ShowAllFilms.this, R.string.conectioError, Toast.LENGTH_SHORT).show();
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
