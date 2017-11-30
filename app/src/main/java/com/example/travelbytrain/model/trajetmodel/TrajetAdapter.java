package com.example.travelbytrain.model.trajetmodel;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.travelbytrain.R;

import java.util.ArrayList;

/**
 * Created by DimsDev on 29/11/2017.
 */

class TrajetAdapter extends RecyclerView.Adapter<TrajetViewHolder> {
    private final ArrayList<GareHoraire> listHoraires;

    public TrajetAdapter(ArrayList<GareHoraire> listHoraires) {
        this.listHoraires = listHoraires;
    }

    @Override
    public TrajetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ligne_horaire, parent, false);
        return new TrajetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TrajetViewHolder trajetViewHolder, int position) {
        GareHoraire gareHoraire = listHoraires.get(position);
        trajetViewHolder.bind(gareHoraire);
    }
/*
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }
*/
    @Override
    public int getItemCount() {
        return listHoraires.size();
    }
}
