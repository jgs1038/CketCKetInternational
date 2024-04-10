package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//imports del menu
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import android.view.Menu;
import android.widget.Toast;

public class SolicitudEventoArtista extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solicitud_evento_artista);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.tres_rayas_artista, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        if (id == R.id.solicitud_evento){
            Intent siguiente = new Intent (this, SolicitudEventoArtista.class);
            startActivity(siguiente);
        }
        if (id == R.id.ver_perfil){
            Intent siguiente = new Intent (this, PerfilArtistaKiki.class);
            startActivity(siguiente);
        }
        if (id == R.id.datos_evento){
            Intent siguiente = new Intent (this, ModificarDatosEvento.class);
            startActivity(siguiente);
        }
        if (id == R.id.directo){
            Intent siguiente = new Intent (this, EmpezarDirecto.class);
            startActivity(siguiente);
        }
        if (id == R.id.encuesta){
            Intent siguiente = new Intent (this, CrearEncuesta.class);
            startActivity(siguiente);
        }
        if (id == R.id.preguntas_respuestas){
            Intent siguiente = new Intent (this, PreguntasRespuestas.class);
            startActivity(siguiente);
        }
        if (id == R.id.historia){
            Intent siguiente = new Intent (this, AnadirHistoria.class);
            startActivity(siguiente);
        }


        //Toast.makeText(this,"Fallo", Toast.LENGTH_SHORT).show();
        //return super.onOptionsItemSelected(item);
        return true;
    }

}
