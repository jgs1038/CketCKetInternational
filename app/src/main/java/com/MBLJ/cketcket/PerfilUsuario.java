package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_usuario);
    }

    public void SiguienteTresRayas(View view){
        Intent siguiente = new Intent (this, TresRayas.class);
        startActivity(siguiente);
    }
    public void SiguienteChiara(View view){
        Intent siguiente = new Intent (this, PerfilArtistaKiki.class);
        startActivity(siguiente);
    }
    public void SiguienteNicki(View view){
        Intent siguiente = new Intent (this, PerfilArtistaNicki.class);
        startActivity(siguiente);
    }
    public void SiguienteACDC(View view){
        Intent siguiente = new Intent (this, PerfilArtistaACDC.class);
        startActivity(siguiente);
    }
    public void SiguienteENicki(View view){
        Intent siguiente = new Intent (this, PerfilEventoNicki.class);
        startActivity(siguiente);
    }
    public void SiguienteEACDC(View view){
        Intent siguiente = new Intent (this, PerfilEventoACDC.class);
        startActivity(siguiente);
    }

}
