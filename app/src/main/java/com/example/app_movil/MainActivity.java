package com.example.app_movil;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton;
    private Typeface nuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button)findViewById(R.id.button1);

        String fuente= "fuente/nuevo.ttf";
        this.nuevo= Typeface.createFromAsset(getAssets(),fuente);
        boton.setTypeface(nuevo);
    }
    public void siguiente(View view)
    {
        Intent sig=new Intent(this,menu.class);
        startActivity(sig);
    }
}
