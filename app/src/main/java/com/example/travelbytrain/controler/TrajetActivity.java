package com.example.travelbytrain.controler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.travelbytrain.R;
import com.example.travelbytrain.model.trajetmodel.GareHoraire;
import com.example.travelbytrain.model.trajetmodel.*;

import java.util.ArrayList;

/**
 * Created by DimsDev on 29/11/2017.
 */

public class TrajetActivity extends AppCompatActivity {
    // Class de test sur les horaires
    private ArrayList<GareHoraire> gareHoraires;
    private RecyclerView rclViewTrajet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trajet);




        gareHoraires = new ArrayList<>();
        rclViewTrajet = (RecyclerView) findViewById(R.id.rclVtrajet);
        rclViewTrajet.setLayoutManager(new LinearLayoutManager(this));
        //rclViewTrajet.setLayoutManager(new GridLayoutManager(this, 2));
        rclViewTrajet.setAdapter(new TrajetAdapter (gareHoraires));

        gareHoraires.add(new GareHoraire("29/11","08h14","29/11","09h09"));
        gareHoraires.add(new GareHoraire("29/11","09h40","29/11","10h34"));
        gareHoraires.add(new GareHoraire("29/11","10h40","29/11","11h34"));
        gareHoraires.add(new GareHoraire("29/11","12h14","29/11","13h09"));
        gareHoraires.add(new GareHoraire("29/11","14h14","29/11","15h09"));
        gareHoraires.add(new GareHoraire("29/11","15h40","29/11","16h34"));
        gareHoraires.add(new GareHoraire("29/11","16h40","29/11","17h34"));
        gareHoraires.add(new GareHoraire("29/11","17h14","29/11","18h04"));
        gareHoraires.add(new GareHoraire("29/11","17h40","29/11","18h34"));
        gareHoraires.add(new GareHoraire("29/11","18h40","29/11","19h34"));
        gareHoraires.add(new GareHoraire("29/11","19h14","29/11","20h09"));
        gareHoraires.add(new GareHoraire("29/11","19h40","29/11","20h34"));
        gareHoraires.add(new GareHoraire("29/11","21h14","29/11","22h09"));
    }
}
