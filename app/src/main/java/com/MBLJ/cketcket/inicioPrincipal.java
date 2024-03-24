package com.MBLJ.cketcket;

//Esto es una prueba

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class inicioPrincipal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

    }
    public void Siguiente(View view){
        Intent Siguiente = new Intent (this, inicioPrincipal.class);
        startActivity(Siguiente);
    }


}