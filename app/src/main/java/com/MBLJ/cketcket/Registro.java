package com.MBLJ.cketcket;

//Esto es una prueba

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

    }

    public void SiguientePrincipal(View view){
        Intent siguiente = new Intent (this, InicioPrincipal.class);
        startActivity(siguiente);
    }


}