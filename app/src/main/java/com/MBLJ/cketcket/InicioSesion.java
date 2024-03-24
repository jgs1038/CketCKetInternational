package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InicioSesion extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_inicio);

    }
    public void SiguientePrincipal(View view){
        Intent siguiente = new Intent (this, InicioPrincipal.class);
        startActivity(siguiente);
    }
}
