package com.example.jera.apitest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jera.apitest.model.APIPeopleResults;

import java.util.List;

/**
 * Created by jera on 17/05/17.
 */

public class RecyclerViewAdapterPeoples extends RecyclerView.Adapter<AdapterViewHolder>{

    private List<APIPeopleResults> peopleList;
    private int rowPeopleLayout;
    private Context context;

    public RecyclerViewAdapterPeoples(List<APIPeopleResults> peopleList, int rowPeopleLayout, Context context) {
        this.peopleList = peopleList;
        this.rowPeopleLayout = rowPeopleLayout;
        this.context = context;
    }

    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowPeopleLayout, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
