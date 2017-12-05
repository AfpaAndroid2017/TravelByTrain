package com.example.travelbytrain.model.horairemodel;

import android.os.AsyncTask;
import android.util.Log;



import com.example.travelbytrain.model.jsongaremodel.ListeGare;
import com.example.travelbytrain.model.jsonhorairemodel.HoraireTrajet;


/**
 * Created by jct on 22/11/17.
 */

public class GetHoraire extends AsyncTask {

    private HoraireTrajet horaireTrajet ;
    private Exception exception;
    private GetHoraireResult  getHoraireResult;

    public GetHoraire(GetHoraireResult getHoraireResult) {
        this.getHoraireResult = getHoraireResult;
    }

    @Override
    protected Object doInBackground(Object[] params) {
        try {
            Log.w("TAG", "doInBackground horaire 1");
            horaireTrajet = OpenDataHoraire.getHoraireDuServeur();
            //Log.w("TAG", "doInBackground horaire 2");
        } catch (Exception e) {
            Log.w("TAG", "doInBackground horaire "+e.toString());
            exception = e;
        }

        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
        if (getHoraireResult != null) {
            if (exception != null) {
                getHoraireResult.getHoraireResultErreur(exception);
            } else {
                getHoraireResult.horaireChargees(horaireTrajet);
            }
        }
    }

    public interface GetHoraireResult {
        void horaireChargees(HoraireTrajet horaireTrajet);

        void getHoraireResultErreur(Exception exception);
    }
}
