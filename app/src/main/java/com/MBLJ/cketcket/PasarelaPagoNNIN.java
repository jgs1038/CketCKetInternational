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


public class PasarelaPagoNNIN extends AppCompatActivity {

    CheckBox checkBox5, checkBox6, checkBox7, checkBox8;
    Button button66;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasarela_pago_nn_in);

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
                        Intent intent = new Intent(PasarelaPagoNNIN.this, PasarelaPagoNNTarjetaIN.class);
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
                        Intent intent = new Intent(PasarelaPagoNNIN.this, PasarelaPagoNNContrareembolsoIN.class);
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
                    Intent intent = new Intent(PasarelaPagoNNIN.this, PasarelaPagoNNPayPalIN.class);
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
                    Intent intent = new Intent(PasarelaPagoNNIN.this, PasarelaPagoNNRegaloIN.class);
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
}