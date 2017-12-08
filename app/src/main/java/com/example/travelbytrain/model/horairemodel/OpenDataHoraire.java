package com.example.travelbytrain.model.horairemodel;

import android.util.Log;


import com.example.travelbytrain.model.GareDepartArrivee;
import com.example.travelbytrain.model.jsongaremodel.Fields;
import com.example.travelbytrain.model.jsonhorairemodel.HoraireTrajet;
import com.google.gson.Gson;

import java.text.DecimalFormat;


/**
 * Created by jct on 22/11/17.
 */

public class OpenDataHoraire {

    //private static final String WS_URL ="https://data.sncf.com/api/records/1.0/search/?dataset=liste-des-gares&rows=44&facet=voyageurs";
    //private static final String WS_URL ="https://api.sncf.com/v1/coverage/sncf/journeys?from=admin:fr:75056&to=admin:fr:69123&datetime=20171208T003015";

   // private static final String WS_URL ="https://api.sncf.com/v1/coverage/sncf/journeys?from=stop_area:OCE:SA:87686006&to=stop_area:OCE:SA:87722025&datetime=20171208T003015";

    // Username=80acfa87-5cea-4530-91c9-48c19e923808&Password=
    public static HoraireTrajet getHoraireDuServeur(GareDepartArrivee gareDepartArrivee) throws Exception {

        Fields gareDepart =gareDepartArrivee.getGareDepart();
        Fields gareArrivee = gareDepartArrivee.getGareArrivee();

        // Float code_uic = gareDepart.getCode_uic().floatValue();
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String code_uicDepart = decimalFormat.format(gareDepart.getCode_uic() ) ;
        String code_uicArrivee = decimalFormat.format(gareArrivee.getCode_uic() ) ;

        //Log.w("TAG", "Double uic "+ (float );
        String WS_URL ="https://api.sncf.com/v1/coverage/sncf/journeys?from=stop_area:OCE:SA:"+code_uicDepart+"&to=stop_area:OCE:SA:"+code_uicArrivee+"&datetime=20171208T003015&min_nb_journeys=5";


//        String WS_URL ="https://api.sncf.com/v1/coverage/sncf/journeys?from=stop_area:OCE:SA:"+gareDepart.getCode_uic().toString()+"&to=stop_area:OCE:SA:87722025&datetime=20171208T003015";
//        String WS_URL ="https://api.sncf.com/v1/coverage/sncf/journeys?from=stop_area:OCE:SA:87686006&to=stop_area:OCE:SA:87722025&datetime=20171208T003015";

        //Lancer la requête
        String reponseEnJson = OkHttpUtilsHoraire.sendGetOkHttpRequest(WS_URL);

        //reponseEnJson =reponseEnJson+"";
        //Log.w("TAG", reponseEnJson);




       // Type type = new TypeToken<ArrayList<Fields>>() { }.getType();
        //Log.w("TAG", reponseEnJson);
        //Parser le résultat
        Gson gson = new Gson();

        HoraireTrajet horaireTrajet = gson.fromJson(reponseEnJson, HoraireTrajet.class);


        //Extraire uniquement le nécessaire à savoir les records
        if (horaireTrajet == null) {
            Log.w("TAG", "Variable horaire à null");
            throw new Exception("Variable horaire à null");

        }

        Log.w("TAG", "return horaire");



        return horaireTrajet;
        //return listeGare;

    }

}
