package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Formulario extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);
    }

    public void InicioOrganizador(View view) {
        Intent siguiente = new Intent(this, InicioOrganizador.class);
        startActivity(siguiente);
    }

}

