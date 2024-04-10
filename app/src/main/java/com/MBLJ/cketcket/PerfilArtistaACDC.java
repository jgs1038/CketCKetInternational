package com.MBLJ.cketcket;

//Esto es una prueba

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
//imports del menu
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import android.view.Menu;
import android.widget.Toast;

public class PerfilArtistaACDC extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_artista_acdc);

    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.tres_rayas, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        if (id == R.id.mis_entradas){
            Intent siguiente = new Intent (this, MisEntradas.class);
            startActivity(siguiente);
        }
        if (id == R.id.ForoDudas){
            Intent siguiente = new Intent (this, ForoDudas.class);
            startActivity(siguiente);
        }
        if (id == R.id.asistencia_tecnica){
            Intent siguiente = new Intent (this, AsistenciaTecnica.class);
            startActivity(siguiente);
        }
        if (id == R.id.chat){
            Intent siguiente = new Intent (this, Chat1.class);
            startActivity(siguiente);
        }
        if (id == R.id.mis_puntos){
            Intent siguiente = new Intent (this, MisPuntos.class);
            startActivity(siguiente);
        }
        if (id == R.id.usuarios_bloqueados){
            Intent siguiente = new Intent (this, UsuariosBloqueados.class);
            startActivity(siguiente);
        }
        if (id == R.id.live_activities){
            Intent siguiente = new Intent (this, LiveActivities.class);
            startActivity(siguiente);
        }
        if (id == R.id.merchandising){
            Intent siguiente = new Intent (this, Merchandising.class);
            startActivity(siguiente);
        }

        //Toast.makeText(this,"Fallo", Toast.LENGTH_SHORT).show();
        //return super.onOptionsItemSelected(item);
        return true;
    }
    /*
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
    }*/
    public void SiguienteEACDC(View view){
        Intent siguiente = new Intent (this, PerfilEventoACDC.class);
        startActivity(siguiente);
    }

}