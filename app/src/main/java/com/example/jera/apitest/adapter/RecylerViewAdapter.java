package com.example.jera.apitest.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jera.apitest.R;
import com.example.jera.apitest.model.PlanetAPI;

import java.util.List;

/**
 * Created by jera on 11/05/17.
 */

public class RecylerViewAdapter extends RecyclerView.Adapter<AdapterViewHolder> {

    AdapterInterface adapterInterface;

    public static List<PlanetAPI> planetList;
    private int rowLayout;
    private Context context;

    public RecylerViewAdapter(List<PlanetAPI> planetList, int rowLayout, Context context) {
        this.planetList = planetList;
        this.context = context;
        this.rowLayout = rowLayout;
    }


    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {
        holder.viewNamePlanet.setText("Nome: " + planetList.get(position).getName());
        holder.viewGravity.setText("Gravidade: " + planetList.get(position).getGravity());
        holder.viewPopulation.setText("População: " + planetList.get(position).getPopulation());
        holder.viewClimate.setText("Clima: " + planetList.get(position).getClimate());
        holder.viewTerrain.setText("Terreno: " + planetList.get(position).getTerrain());

    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }


    public interface AdapterInterface {
        void onClickSelected(int id);

    }


}


