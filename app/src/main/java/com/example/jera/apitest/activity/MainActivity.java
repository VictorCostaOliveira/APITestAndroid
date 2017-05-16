package com.example.jera.apitest.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.jera.apitest.R;
import com.example.jera.apitest.adapter.RecylerViewAdapter;

public class MainActivity extends AppCompatActivity implements RecylerViewAdapter.AdapterInterface {
    private RecylerViewAdapter adapter;
    private RecyclerView recyclerView;
    private static final String TAG = "Victor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewOptions);

    }

    @Override
    public void onClickSelected(int id) {
        startActivity(new Intent(MainActivity.this, ShowAllPlanets.class));
    }
}
