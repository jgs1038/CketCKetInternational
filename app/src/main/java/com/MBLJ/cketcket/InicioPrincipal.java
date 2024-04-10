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

    public void BusquedaAvanzada(View view){
        Intent siguiente = new Intent (this, BusquedaAvanzada.class);
        startActivity(siguiente);
    }
    public void SiguienteNicki(View view){
        Intent siguienteNicki = new Intent (this, PerfilArtistaNicki.class);
        startActivity(siguienteNicki);
    }
    public void SiguienteKiki(View view){
        Intent siguienteNicki = new Intent (this, PerfilArtistaKiki.class);
        startActivity(siguienteNicki);
    }
    public void SiguienteEventoACDC(View view){
        Intent siguienteACDC = new Intent (this, PerfilEventoACDC.class);
        startActivity(siguienteACDC);
    }
    public void SiguientePrincipal(View view){
        Intent siguiente = new Intent (this, InicioPrincipal.class);
        startActivity(siguiente);
    }
    public void PerfilUsuario(View view){
        Intent siguiente = new Intent (this, PerfilUsuario.class);
        startActivity(siguiente);
    }

}
