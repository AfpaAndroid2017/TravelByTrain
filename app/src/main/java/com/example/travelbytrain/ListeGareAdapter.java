package com.example.travelbytrain;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;


import com.example.travelbytrain.model.jsongaremodel.Fields;

import java.util.ArrayList;

/**
 * Created by 77011-40-04 on 04/12/2017.
 */

public class ListeGareAdapter extends ArrayAdapter<Fields> {
    ArrayList<Fields> listeGare, suggestions, gareTemps;

    public ListeGareAdapter(Context context, ArrayList<Fields> listeGare) {
        super(context, android.R.layout.activity_list_item, listeGare);
        this.listeGare =listeGare ;
        this.suggestions = new ArrayList<>(listeGare);

        this.gareTemps = new ArrayList<>(listeGare);

    }

    public void setGare (ArrayList<Fields> listeGare) {
        this.suggestions = new ArrayList<>();
        this.suggestions.addAll(listeGare);

        this.gareTemps = new ArrayList<>();
        this.gareTemps.addAll(listeGare);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

//        Log.w("TAG","getView" );
        Fields fields = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.gare_row, parent, false);
        }
        TextView ttvGare = (TextView) convertView.findViewById(R.id.ttvGare);
//        ImageView imvGareImage = (ImageView) convertView.findViewById(R.id.imvGareImage);
        if (ttvGare != null)
            ttvGare.setText(fields.getLibelle_gare());
       // if (imvGareImage != null && imvGareImage.getProfilePic() != -1)
        //    imvGareImage.setImageResource(customer.getProfilePic());
  //      imvGareImage.setImageResource(R.drawable.tgv );
        return convertView ;
    }

    @Override
    public Filter getFilter() {
        return myFilter;
    }

    Filter myFilter = new Filter() {
        @Override
        public CharSequence convertResultToString(Object resultValue) {
            Log.w("TAG","convertResultToString" );
            Fields fields = (Fields) resultValue;
            return fields.getLibelle_gare();
        }

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            Log.w("TAG","performFiltering" );
            if ((constraint != null) &&(constraint.length() >1) ) {
                Log.w("TAG","performFiltering constraint" );
                suggestions.clear();
                Log.w("TAG","performFiltering constraint size :"+gareTemps.size() );
                for( int i=0; i < gareTemps.size();i++) {
                    //Log.w("TAG","performFiltering constraint :"+gareTemps.get(i).getLibelle_gare() );
                    if (gareTemps.get(i).getLibelle_gare().toLowerCase().startsWith(constraint.toString().toLowerCase())) {
                        suggestions.add(gareTemps.get(i));
                    }
                }

                /*
                for (Fields nomGare : gareTemps ) {
                    Log.w("TAG","performFiltering constraint"+nomGare.getLibelle_gare() );
                    if (nomGare.getLibelle_gare().toLowerCase().startsWith(constraint.toString().toLowerCase())) {
                        suggestions.add(nomGare);
                    }
                }
*/

/*                for (Customer people : tempCustomer) {
                    if (people.getFirstName().toLowerCase().startsWith(constraint.toString().toLowerCase())) {
                        suggestions.add(people);
                    }
                }
*/

                FilterResults filterResults = new FilterResults();
                filterResults.values = suggestions;
                filterResults.count = suggestions.size();
                return filterResults;
            } else {
                return new FilterResults();
            }
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            ArrayList<Fields> c = (ArrayList<Fields>) results.values;
            if (results != null && results.count > 0) {
                clear();
                for (Fields cust : c) {
                    add(cust);
                    notifyDataSetChanged();
                }
            }
        }
    };
}
