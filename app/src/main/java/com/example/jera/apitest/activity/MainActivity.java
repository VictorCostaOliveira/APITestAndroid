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
    private static final String TAG = "Victor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cardViewPlanet = (CardView) findViewById(R.id.cardViewPlanets);

        cardViewPlanet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ShowAllPlanets.class));
            }
        });

    }

}
