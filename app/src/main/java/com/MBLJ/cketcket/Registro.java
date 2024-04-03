package com.MBLJ.cketcket;

//Esto es una prueba

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
    private EditText tipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        tipo = (EditText) findViewById(R.id.tipoUsuario);

    }

    public void SiguientePrincipal(View view){
        String tipoUsuario = tipo.getText().toString();
        Intent siguiente = null ;
        if (tipoUsuario.equals("1")) {
            siguiente = new Intent(this, InicioPrincipal.class);
        }
        if (tipoUsuario.equals("2")) {
            siguiente = new Intent(this, InicioArtista.class);
        }
        if (tipoUsuario.equals("3")) {
            siguiente = new Intent(this, InicioOrganizador.class);
        }
        if(siguiente != null){
            startActivity(siguiente);
        }
    }


}