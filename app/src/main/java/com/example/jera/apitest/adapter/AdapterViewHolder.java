package com.example.jera.apitest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.jera.apitest.R;

/**
 * Created by jera on 16/05/17.
 */

public final class AdapterViewHolder extends RecyclerView.ViewHolder {

    // Planets View
    TextView viewNamePlanet;
    TextView viewGravity;
    TextView viewPopulation;
    TextView viewClimate;
    TextView viewTerrain;

    // Films View
    TextView viewNameFilm;
    TextView viewEpisodeFilm;
    TextView viewOpeningFilm;
    TextView viewDirectorFilm;
    TextView viewDateFilm;

    public AdapterViewHolder(View itemView) {
        super(itemView);
        // Planets view
        viewNamePlanet = (TextView) itemView.findViewById(R.id.textViewPlanetName);
        viewGravity = (TextView) itemView.findViewById(R.id.textViewGravity);
        viewPopulation = (TextView) itemView.findViewById(R.id.textViewPopulation);
        viewClimate = (TextView) itemView.findViewById(R.id.textViewClimate);
        viewTerrain = (TextView) itemView.findViewById(R.id.textViewTerrain);

        // Films view
        viewNameFilm = (TextView) itemView.findViewById(R.id.textViewFilmName);
        viewEpisodeFilm = (TextView) itemView.findViewById(R.id.textViewEpisode);
        viewOpeningFilm = (TextView) itemView.findViewById(R.id.textViewOpening);
        viewDirectorFilm = (TextView) itemView.findViewById(R.id.textViewDirector);
        viewDateFilm = (TextView) itemView.findViewById(R.id.textViewRealeseDate);
    }
}