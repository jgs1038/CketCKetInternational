package com.MBLJ.cketcket;

//Esto es una prueba

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registro1IN extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    Button button99;
    int tipoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro1_in);
        checkBox1 = findViewById(R.id.usuario);
        checkBox2 = findViewById(R.id.artista);
        checkBox3 = findViewById(R.id.organizador);
        checkBox4 = findViewById(R.id.administrador);
        button99 = findViewById(R.id.botonRegistro);

        checkBox1.setChecked(true);
        tipoUsuario = 1;
        button99.setEnabled(true);

        checkBox1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                tipoUsuario = 1;
            }
        });
        checkBox2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox1.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                tipoUsuario = 2;
            }
            button99.setEnabled(isChecked);
        });

        checkBox3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox4.setChecked(false);
                tipoUsuario = 3;
            }
            button99.setEnabled(isChecked);
        });

        checkBox4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                tipoUsuario = 4;
            }
            button99.setEnabled(isChecked);
        });

        button99.setOnClickListener(v -> {
            guardarTipoUsuario();
            if (tipoUsuario == 1 || tipoUsuario == 2 || tipoUsuario == 4) {
                Intent intent = new Intent(Registro1IN.this, InicioPrincipalIN.class);
                startActivity(intent);
            }
            if (tipoUsuario == 3){
                Intent intent = new Intent(Registro1IN.this, FormularioIN.class);
                startActivity(intent);
            }
        });
    }

    protected void onStop(){
        super.onStop();
        guardarTipoUsuario();
        //String tipoUsuario = tipo.getText().toString();
        if (tipoUsuario==1 || tipoUsuario==2 || tipoUsuario==4 ) {
            Toast.makeText(this, "Registration Completed", Toast.LENGTH_SHORT).show();
            }

        }

    public void guardarTipoUsuario() {
        //int tipoUsuario = Integer.parseInt(tipo.getText().toString());
        SharedPreferences prefs = getSharedPreferences("PreferenciasUsuario", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("tipoUsuario", tipoUsuario);
        editor.apply();
    }



}