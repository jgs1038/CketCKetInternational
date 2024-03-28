package com.MBLJ.cketcket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class Inicio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
    }

    public void SiguienteRegistro(View view) {
        Intent siguiente = new Intent(this, Registro.class);
        startActivity(siguiente);
    }

    public void SiguienteInicio(View view) {
        Intent posterior = new Intent(this, InicioSesion.class);
        startActivity(posterior);
    }
}

