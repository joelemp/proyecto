package com.example.app_movil;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class menu extends AppCompatActivity {

    TextView texto, textodose;
    private Typeface nuevo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);




        texto=(TextView) findViewById(R.id.text);
        textodose=(TextView) findViewById(R.id.textdos);
        String fuente= "fuente/nuevo.ttf";
        this.nuevo= Typeface.createFromAsset(getAssets(),fuente);
        texto.setTypeface(nuevo);
        textodose.setTypeface(nuevo);
    }
}
