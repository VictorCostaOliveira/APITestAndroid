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
import com.example.jera.apitest.model.Results;

import java.util.List;

import retrofit2.Callback;

/**
 * Created by jera on 11/05/17.
 */

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.AdapterViewHolder>{

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
        holder.viewNamePlanet.setText(planetList.get(position).getName());
        holder.viewGravity.setText(planetList.get(position).getGravity());
        holder.viewPopulation.setText(planetList.get(position).getPopulation());
        holder.viewTerrain.setText(planetList.get(position).getTerrain());


    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }


    public final class AdapterViewHolder extends RecyclerView.ViewHolder{

        CardView cardViewNamePlanet;
        TextView viewNamePlanet;
        TextView viewGravity;
        TextView viewPopulation;
        TextView viewClimate;
        TextView viewTerrain;

        public AdapterViewHolder(View itemView) {
            super(itemView);
            viewNamePlanet = (TextView) itemView.findViewById(R.id.textViewPlanetName);
            cardViewNamePlanet = (CardView) itemView.findViewById(R.id.cardViewPlanet);
            viewGravity = (TextView) itemView.findViewById(R.id.textViewGravity);
            viewPopulation = (TextView) itemView.findViewById(R.id.textViewPopulation);
            viewClimate = (TextView) itemView.findViewById(R.id.textViewClimate);
            viewTerrain = (TextView) itemView.findViewById(R.id.textViewTerrain);
        }
    }




    public interface AdapterInterface {

    }
}


