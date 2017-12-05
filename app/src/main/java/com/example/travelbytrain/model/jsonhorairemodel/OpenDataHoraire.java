package com.example.travelbytrain.model.jsonhorairemodel;

import android.util.Log;



import com.example.travelbytrain.model.jsongaremodel.ListeGare;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;


/**
 * Created by jct on 22/11/17.
 */

public class OpenDataHoraire {

    //private static final String WS_URL ="https://data.sncf.com/api/records/1.0/search/?dataset=liste-des-gares&rows=44&facet=voyageurs";
    private static final String WS_URL ="https://api.sncf.com/v1/coverage/sncf/journeys?from=admin:fr:75056&to=admin:fr:69123&datetime=20171208T213015";

    // Username=80acfa87-5cea-4530-91c9-48c19e923808&Password=
    public static ListeGare getHoraireDuServeur() throws Exception {

        //Lancer la requête
        String reponseEnJson = OkHttpUtilsHoraire.sendGetOkHttpRequest(WS_URL);

        reponseEnJson =reponseEnJson+"";
        Log.w("TAG", reponseEnJson);



  /*
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

*/

        return null;
        //return listeGare;

    }

}
