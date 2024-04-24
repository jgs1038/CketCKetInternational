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

public class InicioPrincipalEvento3IN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_inicio_evento3_in);
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
            if (id == R.id.ForoDudas) {
                Intent siguiente = new Intent(this, ForoDudasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.asistencia_tecnica) {
                Intent siguiente = new Intent(this, AsistenciaTecnicaIN.class);
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
        }
        if (tipoUsuario==2) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.ForoDudas) {
                Intent siguiente = new Intent(this, ForoDudasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.asistencia_tecnica) {
                Intent siguiente = new Intent(this, AsistenciaTecnicaIN.class);
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
        }

        if (tipoUsuario==3) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.ForoDudas) {
                Intent siguiente = new Intent(this, ForoDudasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.asistencia_tecnica) {
                Intent siguiente = new Intent(this, AsistenciaTecnicaIN.class);
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
        }

        if (tipoUsuario==4) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.ForoDudas) {
                Intent siguiente = new Intent(this, ForoDudasIN.class);
                startActivity(siguiente);
            }
            if (id == R.id.asistencia_tecnica) {
                Intent siguiente = new Intent(this, AsistenciaTecnicaIN.class);
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
        }

        //Toast.makeText(this,"Fallo", Toast.LENGTH_SHORT).show();
        //return super.onOptionsItemSelected(item);
        return true;
    }

    public void BusquedaAvanzada(View view){
        Intent siguiente = new Intent (this, BusquedaAvanzadaIN.class);
        startActivity(siguiente);
    }
    public void SiguienteNicki(View view){
        Intent siguienteNicki = new Intent (this, PerfilArtistaNickiIN.class);
        startActivity(siguienteNicki);
    }
    public void SiguienteKiki(View view){
        Intent siguienteNicki = new Intent (this, PerfilArtistaKikiIN.class);
        startActivity(siguienteNicki);
    }
    public void SiguienteEventoACDC(View view){
        Intent siguienteACDC = new Intent (this, PerfilEventoTeatroIN.class);
        startActivity(siguienteACDC);
    }

    public void AnteriorEvento(View view){
        Intent siguienteACDC = new Intent (this, InicioPrincipalEvento2IN.class);
        startActivity(siguienteACDC);
    }
    public void SiguienteEvento(View view){
        Intent siguienteACDC = new Intent (this, InicioPrincipalIN.class);
        startActivity(siguienteACDC);
    }
    public void SiguienteArtista(View view){
        Intent siguienteACDC = new Intent (this, InicioPrincipal5IN.class);
        startActivity(siguienteACDC);
    }

    public void PerfilUsuario(View view){
        int tipoUsuario=obtenerTipoUsuario();
        if (tipoUsuario==1) {
            Intent siguiente = new Intent(this, PerfilUsuarioIN.class);
            startActivity(siguiente);
        }
        if (tipoUsuario==2) {
            Intent siguiente = new Intent(this, PerfilArtistaKiki1IN.class);
            startActivity(siguiente);
        }
        if (tipoUsuario==3) {
            Intent siguiente = new Intent(this, PerfilOrganizadorIN.class);
            startActivity(siguiente);
        }
        if (tipoUsuario==4) {
            Intent siguiente = new Intent(this, PerfilAdministradorIN.class);
            startActivity(siguiente);
        }

    }

}
