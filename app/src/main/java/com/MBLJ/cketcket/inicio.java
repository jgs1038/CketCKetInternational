package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class inicio extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
    }

    public void SiguienteR(View view){
        Intent SiguienteR = new Intent (this, registro.class);
        startActivity(SiguienteR);
    }
    public void SiguienteI(View view){
        Intent SiguienteI = new Intent (this, inicioSesion.class);
        startActivity(SiguienteI);
    }

}
