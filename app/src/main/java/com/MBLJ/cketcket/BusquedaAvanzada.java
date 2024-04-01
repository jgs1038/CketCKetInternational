package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class BusquedaAvanzada extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busqueda_avanzada);
    }
    public void SiguienteLupa(View view){
        Intent siguiente = new Intent (this, BusquedaUsuario.class);
        startActivity(siguiente);
    }

    public void SiguienteTresRayas(View view){
        Intent siguiente = new Intent (this, TresRayas.class);
        startActivity(siguiente);
    }
    public void SiguienteTresPuntods(View view) {
        Intent siguiente = new Intent(this, TresPuntos.class);
        startActivity(siguiente);
    }
    public void Evento(View view) {
        Intent siguiente = new Intent(this, BusquedaAvanzadaEvento.class);
        startActivity(siguiente);
    }

    public void Merchandising(View view) {
        Intent siguiente = new Intent(this, BusquedaAvanzadaMerchandising.class);
        startActivity(siguiente);
    }

}
