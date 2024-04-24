package com.MBLJ.cketcket;

//Esto es una prueba

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class PerfilArtistaKiki1IN extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_artista_kiki1_in);

    }

    public int obtenerTipoUsuario() {
        SharedPreferences prefs = getSharedPreferences("PreferenciasUsuario", MODE_PRIVATE);
        return prefs.getInt("tipoUsuario", 0);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        int tipoUsuario=obtenerTipoUsuario();

        if (tipoUsuario == 1) {
            menuInflater.inflate(R.menu.tres_rayas, menu);
        }
        if (tipoUsuario == 2) {
            menuInflater.inflate(R.menu.tres_rayas_artista, menu);
        }
        if (tipoUsuario == 3) {
            menuInflater.inflate(R.menu.tres_rayas_organizador, menu);
        }
        if (tipoUsuario == 4) {
            menuInflater.inflate(R.menu.tres_rayas_administrador, menu);
        }
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        int tipoUsuario=obtenerTipoUsuario();
        if (tipoUsuario==1) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradas.class);
                startActivity(siguiente);
            }
            if (id == R.id.ForoDudas) {
                Intent siguiente = new Intent(this, ForoDudas.class);
                startActivity(siguiente);
            }
            if (id == R.id.asistencia_tecnica) {
                Intent siguiente = new Intent(this, AsistenciaTecnica.class);
                startActivity(siguiente);
            }
            if (id == R.id.chat) {
                Intent siguiente = new Intent(this, Chat1.class);
                startActivity(siguiente);
            }
            if (id == R.id.mis_puntos) {
                Intent siguiente = new Intent(this, MisPuntos.class);
                startActivity(siguiente);
            }
            if (id == R.id.usuarios_bloqueados) {
                Intent siguiente = new Intent(this, UsuariosBloqueados.class);
                startActivity(siguiente);
            }
            if (id == R.id.live_activities) {
                Intent siguiente = new Intent(this, LiveActivities.class);
                startActivity(siguiente);
            }
            if (id == R.id.merchandising) {
                Intent siguiente = new Intent(this, Merchandising.class);
                startActivity(siguiente);
            }
        }
        if (tipoUsuario==2) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradas.class);
                startActivity(siguiente);
            }
            if (id == R.id.ForoDudas) {
                Intent siguiente = new Intent(this, ForoDudas.class);
                startActivity(siguiente);
            }
            if (id == R.id.asistencia_tecnica) {
                Intent siguiente = new Intent(this, AsistenciaTecnica.class);
                startActivity(siguiente);
            }
            if (id == R.id.chat) {
                Intent siguiente = new Intent(this, Chat1.class);
                startActivity(siguiente);
            }
            if (id == R.id.mis_puntos) {
                Intent siguiente = new Intent(this, MisPuntosArtista.class);
                startActivity(siguiente);
            }
            if (id == R.id.usuarios_bloqueados) {
                Intent siguiente = new Intent(this, UsuariosBloqueados.class);
                startActivity(siguiente);
            }
            if (id == R.id.live_activities) {
                Intent siguiente = new Intent(this, LiveActivities.class);
                startActivity(siguiente);
            }
            if (id == R.id.merchandising) {
                Intent siguiente = new Intent(this, Merchandising.class);
                startActivity(siguiente);
            }
            if (id == R.id.solicitud_evento){
                Intent siguiente = new Intent (this, SolicitudEventoArtista.class);
                startActivity(siguiente);
            }
            if (id == R.id.datos_evento){
                Intent siguiente = new Intent (this, ModificarDatosEvento.class);
                startActivity(siguiente);
            }
        }

        if (tipoUsuario==3) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradas.class);
                startActivity(siguiente);
            }
            if (id == R.id.ForoDudas) {
                Intent siguiente = new Intent(this, ForoDudas.class);
                startActivity(siguiente);
            }
            if (id == R.id.asistencia_tecnica) {
                Intent siguiente = new Intent(this, AsistenciaTecnica.class);
                startActivity(siguiente);
            }
            if (id == R.id.chat) {
                Intent siguiente = new Intent(this, Chat1.class);
                startActivity(siguiente);
            }
            if (id == R.id.mis_puntos) {
                Intent siguiente = new Intent(this, MisPuntosOrganizador.class);
                startActivity(siguiente);
            }
            if (id == R.id.usuarios_bloqueados) {
                Intent siguiente = new Intent(this, UsuariosBloqueados.class);
                startActivity(siguiente);
            }
            if (id == R.id.live_activities) {
                Intent siguiente = new Intent(this, LiveActivities.class);
                startActivity(siguiente);
            }
            if (id == R.id.merchandising) {
                Intent siguiente = new Intent(this, Merchandising.class);
                startActivity(siguiente);
            }
            if (id == R.id.publicar_evento) {
                Intent siguiente = new Intent(this, SolicitudEventoOrganizador.class);
                startActivity(siguiente);
            }
            if (id == R.id.modificar_evento) {
                Intent siguiente = new Intent(this, ModificarDatosEvento.class);
                startActivity(siguiente);
            }
        }

        if (tipoUsuario==4) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradas.class);
                startActivity(siguiente);
            }
            if (id == R.id.ForoDudas) {
                Intent siguiente = new Intent(this, ForoDudas.class);
                startActivity(siguiente);
            }
            if (id == R.id.asistencia_tecnica) {
                Intent siguiente = new Intent(this, AsistenciaTecnica.class);
                startActivity(siguiente);
            }
            if (id == R.id.chat) {
                Intent siguiente = new Intent(this, Chat1.class);
                startActivity(siguiente);
            }
            if (id == R.id.mis_puntos) {
                Intent siguiente = new Intent(this, MisPuntosAdministrador.class);
                startActivity(siguiente);
            }
            if (id == R.id.usuarios_bloqueados) {
                Intent siguiente = new Intent(this, UsuariosBloqueados.class);
                startActivity(siguiente);
            }
            if (id == R.id.live_activities) {
                Intent siguiente = new Intent(this, LiveActivities.class);
                startActivity(siguiente);
            }
            if (id == R.id.merchandising) {
                Intent siguiente = new Intent(this, Merchandising.class);
                startActivity(siguiente);
            }
            if (id == R.id.publicar_evento) {
                Intent siguiente = new Intent(this, SolicitudEventoOrganizador.class);
                startActivity(siguiente);
            }
            if (id == R.id.modificar_evento) {
                Intent siguiente = new Intent(this, ModificarDatosEvento.class);
                startActivity(siguiente);
            }
            if (id == R.id.aceptar_solicitudes) {
                Intent siguiente = new Intent(this, AceptarSolicitud.class);
                startActivity(siguiente);
            }
            if (id == R.id.crear_descuentos) {
                Intent siguiente = new Intent(this, CrearDescuentos.class);
                startActivity(siguiente);
            }
        }

        //Toast.makeText(this,"Fallo", Toast.LENGTH_SHORT).show();
        //return super.onOptionsItemSelected(item);
        return true;
    }
    public void EventoKiki(View view){
        Intent evento = new Intent (this, PerfilEventoKikiIN.class);
        startActivity(evento);
    }

    public void HistoriaKiki(View view){
        Intent historia = new Intent (this, HistoriaKikiIN.class);
        startActivity(historia);
    }

    public void SiguientePrincipal(View view){
        Intent siguiente = new Intent (this, InicioPrincipalIN.class);
        startActivity(siguiente);
    }
    public void BusquedaAvanzada(View view){
        Intent siguiente = new Intent (this, BusquedaAvanzadaIN.class);
        startActivity(siguiente);
    }

}