package com.MBLJ.cketcket;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//imports del menu


public class PasarelaPagoNN extends AppCompatActivity {

    CheckBox checkBox5, checkBox6, checkBox7, checkBox8;
    Button button66;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasarela_pago_nn);

        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        button66 = findViewById(R.id.button66);

        checkBox5.setOnCheckedChangeListener((buttonView, isChecked) -> {
                if (isChecked) {
                    checkBox6.setChecked(false);
                    checkBox7.setChecked(false);
                    checkBox8.setChecked(false);
                    button66.setEnabled(true);
                    button66.setOnClickListener(v -> {
                        Intent intent = new Intent(PasarelaPagoNN.this, PasarelaPagoNNTarjeta.class);
                        startActivity(intent);
                    });
                } else {
                    button66.setEnabled(false);
                }
            });

        checkBox6.setOnCheckedChangeListener((buttonView, isChecked) -> {
                if (isChecked) {
                    checkBox5.setChecked(false);
                    checkBox7.setChecked(false);
                    checkBox8.setChecked(false);
                    button66.setEnabled(true);
                    button66.setOnClickListener(v -> {
                        Intent intent = new Intent(PasarelaPagoNN.this, PasarelaPagoNNContrareembolso.class);
                        startActivity(intent);
                    });
                } else {
                    button66.setEnabled(false);
                }
            });

        checkBox7.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox6.setChecked(false);
                checkBox8.setChecked(false);
                checkBox5.setChecked(false);
                button66.setEnabled(true);
                button66.setOnClickListener(v -> {
                    Intent intent = new Intent(PasarelaPagoNN.this, PasarelaPagoNNPayPal.class);
                    startActivity(intent);
                });
            } else {
                button66.setEnabled(false);
            }
        });
        checkBox8.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox5.setChecked(false);
                checkBox6.setChecked(false);
                checkBox7.setChecked(false);
                button66.setEnabled(true);
                button66.setOnClickListener(v -> {
                    Intent intent = new Intent(PasarelaPagoNN.this, PasarelaPagoNNRegalo.class);
                    startActivity(intent);
                });
            } else {
                button66.setEnabled(false);
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
            if (id == R.id.ayuda) {
                Intent siguiente = new Intent(this, Ayuda.class);
                startActivity(siguiente);
            }
        }
        if (tipoUsuario==2) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradas.class);
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
            if (id == R.id.ayuda) {
                Intent siguiente = new Intent(this, Ayuda.class);
                startActivity(siguiente);
            }
        }

        if (tipoUsuario==3) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradas.class);
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
            if (id == R.id.ayuda) {
                Intent siguiente = new Intent(this, Ayuda.class);
                startActivity(siguiente);
            }
        }

        if (tipoUsuario==4) {
            if (id == R.id.mis_entradas) {
                Intent siguiente = new Intent(this, MisEntradas.class);
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
            if (id == R.id.ayuda) {
                Intent siguiente = new Intent(this, Ayuda.class);
                startActivity(siguiente);
            }
        }
        return true;
    }
}