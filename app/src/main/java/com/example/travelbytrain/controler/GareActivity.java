package com.example.travelbytrain.controler;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.travelbytrain.ListeGareAdapter;
import com.example.travelbytrain.R;
import com.example.travelbytrain.model.garemodel.GetGare;
import com.example.travelbytrain.model.jsongaremodel.Fields;
import com.example.travelbytrain.model.jsongaremodel.ListeGare;
import com.example.travelbytrain.model.jsongaremodel.Record;
import com.example.travelbytrain.vue.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class GareActivity extends Activity implements GetGare.GetGareResult ,  RadioGroup.OnCheckedChangeListener {

    //private ListeGare listeGare;


    private ListeGare listeGare;
    private ArrayList<Fields> fieldses ;
    private ListeGareAdapter gareDepartAdapter =null;
    private ListeGareAdapter gareArriveeAdapter =null;
    private AutoCompleteTextView actGareDepart , actGareArrivee;
    private RadioGroup radioGroup ;

    private Button btnValider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gare);


        radioGroup=findViewById(R.id.rdgRechercheGare);
        // On pose notre listener sur le radio group
        radioGroup.setOnCheckedChangeListener(this);


        actGareDepart = findViewById(R.id.actGareDepart);
        actGareArrivee = findViewById(R.id.actGareArrivee);
        //desactive les champs de saisie
        actGareDepart.setEnabled(false);
        actGareArrivee.setEnabled(false);


        // Recupère la liste des gares
        fieldses = new ArrayList<>();
        gareDepartAdapter = new ListeGareAdapter(this , fieldses);
        gareArriveeAdapter = new ListeGareAdapter(this , fieldses);


        // ajout de l'adaptater pour la gare
        actGareDepart.setAdapter(gareDepartAdapter);
        actGareArrivee.setAdapter(gareArriveeAdapter);







        //new GetHoraire(GareActivity.this).execute();




        btnValider = (Button) findViewById(R.id.btnValider);

        btnValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.w("TAG",gareArriveeAdapter.getGareChoisie().getLibelle_gare() );
                Intent intent = new Intent(GareActivity.this ,TrajetActivity.class );
                startActivity(intent);

            }
        });
    }





    /* ---------------------------------
    // CallBack AsyncTask
    // -------------------------------- */

    @Override
    public void gareChargees(ListeGare listeGare) {
        this.listeGare =listeGare;

        Log.w("TAG","nb total gares :"+this.listeGare.getNhits() );
        ChargerGare();

        // Ajoute les gares recu

        gareDepartAdapter.setGare(fieldses);
        gareArriveeAdapter.setGare(fieldses);

        actGareDepart.setEnabled(true);
        actGareArrivee.setEnabled(true);
    }

    @Override
    public void getGareResultErreur(Exception exception) {

    }

/*
    private void ChargerGare(){
        List<Record> records = listeGare.getRecords() ;
        if (records.size() >0){
            Log.w("TAG","nb gares :"+records.size() );
            ArrayList<Fields> fieldses = new ArrayList<>();
            // on récupère un par un les fields
            for (int i = 0; i < records.size(); i++) {
                fieldses.add(records.get(i).getFields());
                Log.w("TAG","nom gares :"+ records.get(i).getFields().getLibelle_gare() );
            }
        }
    }
*/
    private void ChargerGare(){
        List<Record> records = listeGare.getRecords() ;
        if (records.size() >0){
            Log.w("TAG","nb gares :"+records.size() );
            //ArrayList<Fields> fieldses = new ArrayList<>();
            // on récupère un par un les fields
            for (int i = 0; i < records.size(); i++) {
                fieldses.add(records.get(i).getFields());
                Log.w("TAG","nom gares :"+ records.get(i).getFields().getLibelle_gare() );
            }
        }
    }

    // Ecouteur sur la radioGroup
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        // TODO Auto-generated method stub
        RadioButton rEnCours=(RadioButton)findViewById(checkedId);
        if (rEnCours.getId()==R.id.rbtGPS){
            Toast.makeText(this,rEnCours.getText()+ "Chargement gare", Toast.LENGTH_SHORT).show();
        }
        else if (rEnCours.getId()==R.id.rbtALL) {
            Toast.makeText(this,rEnCours.getText()+ "Chargement gare", Toast.LENGTH_SHORT).show();
        }
        radioGroup.setEnabled(false);
        //set default to false
        for(int i = 0; i < radioGroup.getChildCount(); i++){
            ((RadioButton)radioGroup.getChildAt(i)).setEnabled(false);
        }
        new GetGare(GareActivity.this).execute();
    }
}
