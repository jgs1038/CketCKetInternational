package com.MBLJ.cketcket;

//Esto es una prueba

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilArtistaNicki extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_artista_nicki);

    }
    public void SiguienteTresRayas(View view){
        Intent siguiente = new Intent (this, TresRayas.class);
        startActivity(siguiente);
    }
    public void EventoNicki(View view){
        Intent evento = new Intent (this, PerfilEventoNicki.class);
        startActivity(evento);
    }



}