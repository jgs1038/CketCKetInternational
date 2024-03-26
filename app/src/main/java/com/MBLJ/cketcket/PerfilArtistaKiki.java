package com.MBLJ.cketcket;

//Esto es una prueba

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilArtistaKiki extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_artista_kiki);

    }
    public void EventoKiki(View view){
        Intent evento = new Intent (this, PerfilEventoKiki.class);
        startActivity(evento);
    }

    public void HistoriaKiki(View view){
        Intent historia = new Intent (this, HistoriaKiki.class);
        startActivity(historia);
    }


}