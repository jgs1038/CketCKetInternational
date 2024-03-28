package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class TresPuntos extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tres_puntos);
    }

    public void UsuariosBloqueados(View view){
        Intent siguiente = new Intent (this, UsuariosBloqueados.class);
        startActivity(siguiente);
    }
    public void LiveActivities(View view){
        Intent siguiente = new Intent (this, LiveActivities.class);
        startActivity(siguiente);
    }
    public void Merchandising(View view){
        Intent siguiente = new Intent (this, Merchandising.class);
        startActivity(siguiente);
    }

}
