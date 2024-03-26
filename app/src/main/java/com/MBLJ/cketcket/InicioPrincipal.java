package com.MBLJ.cketcket;

//Esto es una prueba

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InicioPrincipal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_inicio);

    }

    public void SiguienteNicki(View view){
        Intent siguiente = new Intent (this, PerfilEvento.class);
        startActivity(siguiente);
    }

}