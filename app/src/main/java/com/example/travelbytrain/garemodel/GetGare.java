package com.example.travelbytrain.garemodel;

import android.os.AsyncTask;
import android.util.Log;

import com.example.travelbytrain.model.ListeGare;


/**
 * Created by jct on 22/11/17.
 */

public class GetGare extends AsyncTask {

    private ListeGare listeGare ;
    private Exception exception;
    private GetGareResult  getGareResult;

    public GetGare(GetGareResult getGareResult) {
        this.getGareResult = getGareResult;
    }

    @Override
    protected Object doInBackground(Object[] params) {
        try {
            Log.w("TAG", "doInBackground pharmacie 1");
            listeGare = OpenDataGare.getGareDuServeur();
            //Log.w("TAG", "doInBackground pharmacie 2");
        } catch (Exception e) {
            Log.w("TAG", "doInBackground pharmacie "+e.toString());
            exception = e;
        }

        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
        if (getGareResult != null) {
            if (exception != null) {
                getGareResult.getGareResultErreur(exception);
            } else {
                getGareResult.gareChargees(listeGare);
            }
        }
    }

    public interface GetGareResult {
        void gareChargees(ListeGare listeGare);

        void getGareResultErreur(Exception exception);
    }
}
