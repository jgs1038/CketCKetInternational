package com.MBLJ.cketcket;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InicioSesion extends AppCompatActivity {


    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    Button button99;
    int tipoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_inicio);
        checkBox1 = findViewById(R.id.usuario);
        checkBox2 = findViewById(R.id.artista);
        checkBox3 = findViewById(R.id.organizador);
        checkBox4 = findViewById(R.id.administrador);
        button99 = findViewById(R.id.IniciarSesion);
        checkBox1.setChecked(true);
        checkBox1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                button99.setEnabled(true);
                button99.setOnClickListener(v -> {
                    tipoUsuario = 1;
                    guardarTipoUsuario();
                    Intent intent = new Intent(InicioSesion.this, InicioPrincipal.class);
                    startActivity(intent);
                });
            } else {
                button99.setEnabled(false);
            }
        });

        checkBox2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox1.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                button99.setEnabled(true);
                button99.setOnClickListener(v -> {
                    tipoUsuario = 2;
                    guardarTipoUsuario();
                    Intent intent = new Intent(InicioSesion.this, InicioPrincipal.class);
                    startActivity(intent);
                });
            } else {
                button99.setEnabled(false);
            }
        });

        checkBox3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox4.setChecked(false);
                button99.setEnabled(true);
                button99.setOnClickListener(v -> {
                    tipoUsuario = 3;
                    guardarTipoUsuario();
                    Intent intent = new Intent(InicioSesion.this, InicioPrincipal.class);
                    startActivity(intent);
                });
            } else {
                button99.setEnabled(false);
            }
        });
        checkBox4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                button99.setEnabled(true);
                button99.setOnClickListener(v -> {
                    tipoUsuario = 4;
                    guardarTipoUsuario();
                    Intent intent = new Intent(InicioSesion.this, InicioPrincipal.class);
                    startActivity(intent);
                });
            } else {
                button99.setEnabled(false);
            }
        });
    }

    public void guardarTipoUsuario() {
        //int tipoUsuario = Integer.parseInt(tipo.getText().toString());
        SharedPreferences prefs = getSharedPreferences("PreferenciasUsuario", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("tipoUsuario", tipoUsuario);
        editor.apply();
    }

}
