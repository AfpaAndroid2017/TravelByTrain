package com.example.travelbytrain.model.garemodel;

import android.util.Log;


import com.example.travelbytrain.model.jsongaremodel.Fields;
import com.example.travelbytrain.model.jsongaremodel.ListeGare;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;


/**
 * Created by jct on 22/11/17.
 */

public class OpenDataGare {

    //private static final String WS_URL = "https://data.iledefrance.fr/api/records/1.0/search/?dataset=carte-des-pharmacies-dile-de-france&facet=libdepartement&facet=commune";
   // private static final String WS_URL = "https://data.iledefrance.fr/api/records/1.0/search/?dataset=carte-des-pharmacies-dile-de-france&rows=3991&facet=libdepartement&facet=commune";
    private static final String WS_URL ="https://data.sncf.com/api/records/1.0/search/?dataset=liste-des-gares&rows=44&facet=voyageurs";

    public static ListeGare getGareDuServeur() throws Exception {

        //Lancer la requête
        String reponseEnJson = OkHttpUtils.sendGetOkHttpRequest(WS_URL);

        //reponseEnJson ="["+reponseEnJson+"]";

        Type type = new TypeToken<ArrayList<Fields>>() { }.getType();
        //Log.w("TAG", reponseEnJson);
        //Parser le résultat
        Gson gson = new Gson();

        ListeGare listeGare = gson.fromJson(reponseEnJson, ListeGare.class);


        //Extraire uniquement le nécessaire à savoir les records
        if (listeGare == null) {
            Log.w("TAG", "Variable gare à null");
            throw new Exception("Variable gare à null");

        }

        Log.w("TAG", "return gare");



        return listeGare;

    }

}
