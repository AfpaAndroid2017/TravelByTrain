package com.example.travelbytrain.controler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.travelbytrain.R;
import com.example.travelbytrain.model.horairemodel.GetHoraire;
import com.example.travelbytrain.model.jsonhorairemodel.HoraireTrajet;
import com.example.travelbytrain.model.jsonhorairemodel.Journey;
import com.example.travelbytrain.model.jsonhorairemodel.Section;
import com.example.travelbytrain.model.trajetmodel.GareHoraire;
import com.example.travelbytrain.model.trajetmodel.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DimsDev on 29/11/2017.
 */

public class TrajetActivity extends AppCompatActivity   implements GetHoraire.GetHoraireResult {
    // Class de test sur les horaires
    private ArrayList<GareHoraire> gareHoraires;
    private RecyclerView rclViewTrajet;

    private HoraireTrajet horaireTrajet ;
    private ArrayList<Journey> journeys ;
    private ArrayList<Section> sections ;

    private TrajetAdapter trajetAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trajet);


        new GetHoraire(TrajetActivity.this).execute();


        gareHoraires = new ArrayList<>();
        rclViewTrajet = (RecyclerView) findViewById(R.id.rclVtrajet);
        rclViewTrajet.setLayoutManager(new LinearLayoutManager(this));
        //rclViewTrajet.setLayoutManager(new GridLayoutManager(this, 2));
        trajetAdapter = new TrajetAdapter (gareHoraires);
        rclViewTrajet.setAdapter(trajetAdapter);
/*
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
*/
    }

    @Override
    public void horaireChargees(HoraireTrajet horaireTrajet) {
        this.horaireTrajet =horaireTrajet ;
        ChargerHoraire();
    }

    @Override
    public void getHoraireResultErreur(Exception exception) {

    }


    private String convertDateTime(String datetime, int choix){
        String extraitDate="";// 20171208T055000
        switch (choix){
            case 0: // date jj/mm/aaaa
                extraitDate = datetime.substring(6,8)+"/"+ datetime.substring(4,6)+"/"+ datetime.substring(0,4) ;
                break;

            case 1: // heure hh:mm:ss
                extraitDate = datetime.substring(9,11)+":"+ datetime.substring(11,13)+":"+ datetime.substring(13,15) ;
                break;


        }


        return extraitDate;
    }


    private void ChargerHoraire() {

        List<Journey> journey = this.horaireTrajet.getJourneys();
        if (journey.size() >0) {
            Log.w("TAG","nb horaire :"+journey.size() );

            for (int i=0; i< journey.size() ; i++) {

                String Datedepart = journey.get(i).getDeparture_date_time();
                String Datedarrivee = "20171208T123456";//journey.get(i).getArrival_date_time();


                Log.w("TAG", "Horaire :" + Datedepart+"("+convertDateTime(Datedepart,0)+" "+convertDateTime(Datedepart,1)+")" + " ---- "
                        + Datedarrivee +"("+convertDateTime(Datedarrivee,0)+" "+convertDateTime(Datedarrivee,1)+")");

                gareHoraires.add(new GareHoraire(convertDateTime(Datedepart,0),convertDateTime(Datedepart,1),
                        convertDateTime(Datedarrivee,0),convertDateTime(Datedarrivee,1)));

                gareHoraires.add(new GareHoraire(convertDateTime(Datedepart,0),convertDateTime(Datedepart,1),
                        convertDateTime(Datedarrivee,0),convertDateTime(Datedarrivee,1)));

                //gareHoraires.add(new GareHoraire("29/11","21h14","29/11","22h09"));
                trajetAdapter.notifyDataSetChanged();
            }
        }


    }
}
