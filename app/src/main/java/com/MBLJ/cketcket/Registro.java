package com.MBLJ.cketcket;

//Esto es una prueba

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.SharedPreferences;

public class Registro extends AppCompatActivity {
    private EditText tipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        tipo = (EditText) findViewById(R.id.tipoUsuario);

    }

    public void guardarTipoUsuario() {
        int tipoUsuario = Integer.parseInt(tipo.getText().toString());
        SharedPreferences prefs = getSharedPreferences("PreferenciasUsuario", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("tipoUsuario", tipoUsuario);
        editor.apply();
    }

    public void SiguientePrincipal(View view){
        guardarTipoUsuario();
        String tipoUsuario = tipo.getText().toString();
        Intent siguiente = null ;
        if (tipoUsuario.equals("1") || tipoUsuario.equals("2") || tipoUsuario.equals("4") ) {
            siguiente = new Intent(this, InicioPrincipal.class);
        }

        if (tipoUsuario.equals("3")) {
            siguiente = new Intent(this, Formulario.class);
        }
        if(siguiente != null){
            startActivity(siguiente);
        }
    }


}