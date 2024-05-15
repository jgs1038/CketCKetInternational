package com.MBLJ.cketcket;

//Esto es una prueba

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//import android.widget.Toast;

public class PerfilEventoNickiIN extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_evento_nicki_in);

        Button myButton = findViewById(R.id.compra_nicki);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            // Mostrar el Toast
            Toast.makeText(PerfilEventoNickiIN.this, "This button takes you to the shopping page", Toast.LENGTH_SHORT).show();

            // Usar un Handler para retrasar la siguiente acción
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Cambiar a la siguiente Activity después de 20 segundos
                    Intent intent = new Intent(PerfilEventoNickiIN.this, CompraEntradasNickiIN.class);
                    startActivity(intent);
                    finish(); // Finalizar la Activity actual si no quieres que el usuario regrese a ella
                }
            }, 2000); // 20000 milisegundos = 20 segundos
        }
    });

    }

    public int obtenerTipoUsuario() {
        SharedPreferences prefs = getSharedPreferences("PreferenciasUsuario", MODE_PRIVATE);
        return prefs.getInt("tipoUsuario", 0);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        int tipoUsuario=obtenerTipoUsuario();

        if (tipoUsuario == 1) {
            menuInflater.inflate(R.menu.tres_rayas_in, menu);
        }
        if (tipoUsuario == 2) {
            menuInflater.inflate(R.menu.tres_rayas_artista_in, menu);
        }
        if (tipoUsuario == 3) {
            menuInflater.inflate(R.menu.tres_rayas_organizador_in, menu);
        }
        if (tipoUsuario == 4) {
            menuInflater.inflate(R.menu.tres_rayas_administrador_in, menu);
        }
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        int tipoUsuario=obtenerTipoUsuario();
        if (tipoUsuario==1) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.chat) {
                Intent siguiente = new Intent(this, Chat1IN.class);
                startActivity(siguiente);
            }
            if (id == R.id.mis_puntos) {
                Intent siguiente = new Intent(this, MisPuntosIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.usuarios_bloqueados) {
                Intent siguiente = new Intent(this, UsuariosBloqueadosIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.live_activities) {
                Intent siguiente = new Intent(this, LiveActivitiesIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.merchandising) {
                Intent siguiente = new Intent(this, MerchandisingIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.ayuda) {
                Intent siguiente = new Intent(this, AyudaIN.class);
                startActivity(siguiente);
            }
        }
        if (tipoUsuario==2) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.chat) {
                Intent siguiente = new Intent(this, Chat1IN.class);
                startActivity(siguiente);
            }
            if (id == R.id.mis_puntos) {
                Intent siguiente = new Intent(this, MisPuntosArtistaIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.usuarios_bloqueados) {
                Intent siguiente = new Intent(this, UsuariosBloqueadosIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.live_activities) {
                Intent siguiente = new Intent(this, LiveActivitiesIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.merchandising) {
                Intent siguiente = new Intent(this, MerchandisingIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.solicitud_evento){
                Intent siguiente = new Intent (this, SolicitudEventoArtistaIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.datos_evento){
                Intent siguiente = new Intent (this, ModificarDatosEventoIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.ayuda) {
                Intent siguiente = new Intent(this, AyudaIN.class);
                startActivity(siguiente);
            }
        }

        if (tipoUsuario==3) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.chat) {
                Intent siguiente = new Intent(this, Chat1IN.class);
                startActivity(siguiente);
            }
            if (id == R.id.mis_puntos) {
                Intent siguiente = new Intent(this, MisPuntosOrganizadorIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.usuarios_bloqueados) {
                Intent siguiente = new Intent(this, UsuariosBloqueadosIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.live_activities) {
                Intent siguiente = new Intent(this, LiveActivitiesIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.merchandising) {
                Intent siguiente = new Intent(this, MerchandisingIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.publicar_evento) {
                Intent siguiente = new Intent(this, SolicitudEventoOrganizadorIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.modificar_evento) {
                Intent siguiente = new Intent(this, ModificarDatosEventoIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.ayuda) {
                Intent siguiente = new Intent(this, AyudaIN.class);
                startActivity(siguiente);
            }
        }

        if (tipoUsuario==4) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.chat) {
                Intent siguiente = new Intent(this, Chat1IN.class);
                startActivity(siguiente);
            }
            if (id == R.id.mis_puntos) {
                Intent siguiente = new Intent(this, MisPuntosAdministradorIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.usuarios_bloqueados) {
                Intent siguiente = new Intent(this, UsuariosBloqueadosIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.live_activities) {
                Intent siguiente = new Intent(this, LiveActivitiesIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.merchandising) {
                Intent siguiente = new Intent(this, MerchandisingIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.publicar_evento) {
                Intent siguiente = new Intent(this, SolicitudEventoOrganizadorIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.modificar_evento) {
                Intent siguiente = new Intent(this, ModificarDatosEventoIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.aceptar_solicitudes) {
                Intent siguiente = new Intent(this, AceptarSolicitudIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.crear_descuentos) {
                Intent siguiente = new Intent(this, CrearDescuentosIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.ayuda) {
                Intent siguiente = new Intent(this, AyudaIN.class);
                startActivity(siguiente);
            }
        }

        //Toast.makeText(this,"Fallo", Toast.LENGTH_SHORT).show();
        //return super.onOptionsItemSelected(item);
        return true;
    }

    public void Comprar(View view) {
        Intent siguiente = new Intent(this, CompraEntradasNickiIN.class);
        startActivity(siguiente);
    }

}