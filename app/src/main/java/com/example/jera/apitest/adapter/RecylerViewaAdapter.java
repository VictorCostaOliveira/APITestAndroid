package com.example.jera.apitest.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jera.apitest.R;
import com.example.jera.apitest.model.Planet;
import com.example.jera.apitest.model.PlanetAPI;

import java.util.List;

/**
 * Created by jera on 11/05/17.
 */

public class RecylerViewaAdapter extends RecyclerView.Adapter{

    AdapterInterface adapterInterface;

     public static List<PlanetAPI> planetList;
    private Context context;

    public RecylerViewaAdapter(List<PlanetAPI> planetList, Context context) {
        this.planetList = planetList;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.text_view_planet, parent, false);
        AdapterViewHolder holder = new AdapterViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        AdapterViewHolder holder = (AdapterViewHolder) viewHolder;
        final PlanetAPI planet = planetList.get(position);
        holder.viewNamePlanet.setText(planetList.get(position).getName());
        holder.viewPopulation.setText(planetList.get(position).getPopulation());
        holder.viewTerrain.setText(planetList.get(position).getTerrain());
        holder.viewClimate.setText(planetList.get(position).getClimate());
        holder.viewGravity.setText(planetList.get(position).getGravity());

    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    public interface AdapterInterface {

    }
}
class AdapterViewHolder extends RecyclerView.ViewHolder{

    final CardView cardViewNamePlanet;
    final TextView viewNamePlanet;
    final TextView viewGravity;
    final TextView viewPopulation;
    final TextView viewClimate;
    final TextView viewTerrain;

    public AdapterViewHolder(View itemView, CardView cardViewNamePlanet, TextView viewNamePlanet, TextView viewGravity, TextView viewPopulation, TextView viewClimate, TextView viewTerrain) {
        super(itemView);
        this.cardViewNamePlanet = cardViewNamePlanet;
        this.viewNamePlanet = viewNamePlanet;
        this.viewGravity = viewGravity;
        this.viewPopulation = viewPopulation;
        this.viewClimate = viewClimate;
        this.viewTerrain = viewTerrain;
    }

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
