package com.MBLJ.cketcket;

//Esto es una prueba

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilArtistaACDC extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_artista_kiki);

    }
    public void SiguienteEACDC(View view){
        Intent siguiente = new Intent (this, PerfilEventoACDC.class);
        startActivity(siguiente);
    }

}