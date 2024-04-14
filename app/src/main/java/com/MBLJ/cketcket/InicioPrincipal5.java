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

public class InicioPrincipal5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_inicio5);
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

    public void BusquedaAvanzada(View view){
        Intent siguiente = new Intent (this, BusquedaAvanzada.class);
        startActivity(siguiente);
    }
    public void SiguienteACDC(View view){
        Intent siguienteNicki = new Intent (this, PerfilArtistaACDC.class);
        startActivity(siguienteNicki);
    }
    public void SiguienteKiki(View view){
        Intent siguienteNicki = new Intent (this, PerfilArtistaKiki.class);
        startActivity(siguienteNicki);
    }
    public void SiguienteEventoACDC(View view){
        Intent siguienteACDC = new Intent (this, PerfilEventoTeatro.class);
        startActivity(siguienteACDC);
    }

    public void AnteriorEvento(View view){
        Intent siguienteACDC = new Intent (this, InicioPrincipal4.class);
        startActivity(siguienteACDC);
    }
    public void AnteriorArtista(View view){
        Intent siguienteACDC = new Intent (this, InicioPrincipalEvento3.class);
        startActivity(siguienteACDC);
    }

    public void PerfilUsuario(View view){
        int tipoUsuario=obtenerTipoUsuario();
        if (tipoUsuario==1) {
            Intent siguiente = new Intent(this, PerfilUsuario.class);
            startActivity(siguiente);
        }
        if (tipoUsuario==2) {
            Intent siguiente = new Intent(this, PerfilArtistaKiki1.class);
            startActivity(siguiente);
        }
        if (tipoUsuario==3) {
            Intent siguiente = new Intent(this, PerfilOrganizador.class);
            startActivity(siguiente);
        }
        if (tipoUsuario==4) {
            Intent siguiente = new Intent(this, PerfilAdministrador.class);
            startActivity(siguiente);
        }

    }

}
