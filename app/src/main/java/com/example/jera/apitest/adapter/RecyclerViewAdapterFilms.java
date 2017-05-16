package com.example.jera.apitest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jera.apitest.model.FilmAPI;

import java.util.List;

/**
 * Created by vitor on 15/05/2017.
 */

public class RecyclerViewAdapterFilms extends RecyclerView.Adapter<AdapterViewHolder> {
    private List<FilmAPI> filmAPI;
    private Context context;
    private int rowLayoutFilms;

    public RecyclerViewAdapterFilms(List<FilmAPI> filmAPI, Context context, int rowLayoutFilms) {
        this.filmAPI = filmAPI;
        this.context = context;
        this.rowLayoutFilms = rowLayoutFilms;
    }

    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayoutFilms, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {
        holder.viewNameFilm.setText("Nome do filme" + filmAPI.get(position).getFilmName());
        holder.viewEpisodeFilm.setText(filmAPI.get(position).getFilmEpisode());
        holder.viewOpeningFilm.setText(filmAPI.get(position).getFilmOpening());
        holder.viewDirectorFilm.setText(filmAPI.get(position).getFilmDirector());
        holder.viewDateFilm.setText(filmAPI.get(position).getFilmDate());

    }

    @Override
    public int getItemCount() {
        return filmAPI.size();
    }
}