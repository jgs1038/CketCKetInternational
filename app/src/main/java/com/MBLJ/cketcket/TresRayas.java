package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class TresRayas extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tres_rayas);
    }

    public void SiguienteMisEntradas(View view){
        Intent siguiente = new Intent (this, MisEntradas.class);
        startActivity(siguiente);
    }
    public void SiguienteForo(View view){
        Intent siguiente = new Intent (this, ForoDudas.class);
        startActivity(siguiente);
    }
    public void SiguienteAsistencia(View view){
        Intent siguiente = new Intent (this, AsistenciaTecnica.class);
        startActivity(siguiente);
    }
    public void SiguienteChat(View view){
        Intent siguiente = new Intent (this, Chat.class);
        startActivity(siguiente);
    }
    public void SiguientePuntos(View view){
        Intent siguiente = new Intent (this, MisPuntos.class);
        startActivity(siguiente);
    }
}
