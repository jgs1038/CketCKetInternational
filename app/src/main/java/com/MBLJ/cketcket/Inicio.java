package com.MBLJ.cketcket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;


public class Inicio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "Iniciando", Toast.LENGTH_SHORT).show();
    }
    public void SiguienteRegistro(View view) {
        Intent siguiente = new Intent(this, Registro.class);
        startActivity(siguiente);
    }

    public void SiguienteInicio(View view) {
        Intent posterior = new Intent(this, InicioSesion.class);
        startActivity(posterior);
    }
}

