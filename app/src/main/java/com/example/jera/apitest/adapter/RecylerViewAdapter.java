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

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.AdapterViewHolder> {

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
        holder.films.setText("");
        holder.peoples.setText("");
        holder.planets.setText("");
        holder.spaceships.setText("");
        holder.species.setText("");
        holder.vehicles.setText("");
        holder.cardViewPlanets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapterInterface.onClickSelected(getItemCount());
            }
        });
    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }


    public interface AdapterInterface {
        void onClickSelected(int id);

    }

    public final class AdapterViewHolder extends RecyclerView.ViewHolder {

        CardView cardViewFilms;
        CardView cardViewPeoples;
        CardView cardViewPlanets;
        CardView cardViewSpaceships;
        CardView cardViewSpecies;
        CardView cardViewVehicles;
        TextView viewNamePlanet;
        TextView viewGravity;
        TextView viewPopulation;
        TextView viewClimate;
        TextView viewTerrain;
        TextView films;
        TextView peoples;
        TextView planets;
        TextView spaceships;
        TextView species;
        TextView vehicles;

        public AdapterViewHolder(View itemView) {
            super(itemView);
            viewNamePlanet = (TextView) itemView.findViewById(R.id.textViewPlanetName);
            viewGravity = (TextView) itemView.findViewById(R.id.textViewGravity);
            viewPopulation = (TextView) itemView.findViewById(R.id.textViewPopulation);
            viewClimate = (TextView) itemView.findViewById(R.id.textViewClimate);
            viewTerrain = (TextView) itemView.findViewById(R.id.textViewTerrain);
            films = (TextView) itemView.findViewById(R.id.textViewFilms);
            peoples = (TextView) itemView.findViewById(R.id.textViewPeoples);
            planets = (TextView) itemView.findViewById(R.id.textViewPlanets);
            spaceships = (TextView) itemView.findViewById(R.id.textViewSpaceships);
            species = (TextView) itemView.findViewById(R.id.textViewSpecies);
            vehicles = (TextView) itemView.findViewById(R.id.textViewVehicle);
            cardViewFilms = (CardView) itemView.findViewById(R.id.cardViewFilms);
            cardViewPeoples = (CardView) itemView.findViewById(R.id.cardViewPeoples);
            cardViewPlanets = (CardView) itemView.findViewById(R.id.cardViewPlanets);
            cardViewSpaceships = (CardView) itemView.findViewById(R.id.cardViewSpaceships);
            cardViewSpecies = (CardView) itemView.findViewById(R.id.cardViewSpecies);
            cardViewVehicles = (CardView) itemView.findViewById(R.id.cardViewVehicles);
        }
    }
}


