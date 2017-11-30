package com.example.travelbytrain;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            init(true);
        }
        else {

            init(false);
        }
    }





    private void init(boolean firstLaunch){
        if( firstLaunch ) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    final Intent intent = new Intent(MainActivity.this, GareActivity.class);
                    startActivity(intent);
                    MainActivity.this.finish();

                }
            }, 5000);
        }
    }



}
