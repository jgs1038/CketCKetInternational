package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class InicioIN extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_in);

    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "Starting", Toast.LENGTH_SHORT).show();
    }
    public void SiguienteRegistro(View view) {
        Intent siguiente = new Intent(this, RegistroIN.class);
        startActivity(siguiente);
    }

    public void SiguienteInicio(View view) {
        Intent posterior = new Intent(this, InicioSesionIN.class);
        startActivity(posterior);
    }
    public void Español(View view) {
        Intent posterior = new Intent(this, Inicio.class);
        startActivity(posterior);
    }
}

