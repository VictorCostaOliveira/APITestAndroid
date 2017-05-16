package com.example.jera.apitest.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.jera.apitest.R;
import com.example.jera.apitest.adapter.RecylerViewAdapter;

public class MainActivity extends AppCompatActivity {
    private CardView cardViewPlanet;
    private CardView cardViewFilms;
    private CardView cardViewPeoples;
    private CardView cardViewSpecies;
    private CardView cardViewVehicles;
    private static final String TAG = "Victor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewFilms = (CardView) findViewById(R.id.cardViewFilms);
        cardViewPlanet = (CardView) findViewById(R.id.cardViewPlanets);

        cardViewPlanet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ShowAllPlanets.class));
            }
        });

        cardViewFilms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ShowAllFilms.class));
            }
        });



    }

}
