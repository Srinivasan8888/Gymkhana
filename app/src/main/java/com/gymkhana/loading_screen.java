package com.gymkhana;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.gymkhana.R;

public class loading_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_screen);
        getSupportActionBar().hide();
        Handler handler = new Handler();
        handler.postDelayed(
                new Runnable() {
                    public void run() {
                        Intent i = new Intent(loading_screen.this,MainActivity.class);
                        startActivity(i);
                        finish();

                    }
                }, 2000);


    }
}