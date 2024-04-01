package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MisPuntos extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mis_puntos);
    }
    public void Canjear(View view){
        Intent siguiente = new Intent (this, TiendaPuntos.class);
        startActivity(siguiente);
    }

}
