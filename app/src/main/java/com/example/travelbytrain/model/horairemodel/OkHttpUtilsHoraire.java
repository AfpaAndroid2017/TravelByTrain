package com.example.travelbytrain.model.horairemodel;


import android.util.Log;

import java.net.HttpURLConnection;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class OkHttpUtilsHoraire {

    /**
     * Réalise une requête GET avec l'URL transmise en paramètre et retourne le résultat
     */
    public static String sendGetOkHttpRequest(String url) throws Exception {
        Log.w("TAG", url);
        OkHttpClient client = new OkHttpClient();

        //Création de la requête
        Request request = new Request.Builder()
                .header("Authorization", "80acfa87-5cea-4530-91c9-48c19e923808" )
                .url(url)
                .build();

        //Exécution de la requête
        Response response = client.newCall(request).execute();

        //Analyse du code retour
        if (response.code() != HttpURLConnection.HTTP_OK) {
            throw new Exception("Réponse du serveur incorrecte : " + response.code());
        }
        else {
            //Résultat de la requête
            Log.w("TAG", "200 OK");
            return response.body().string();
        }
    }
}


