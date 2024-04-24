package com.MBLJ.cketcket;

//Esto es una prueba

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroIN extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    Button button99;
    int tipoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_in);
    }

    public void Registro1IN(View view) {
        Intent siguiente = new Intent(this, Registro1IN.class);
        startActivity(siguiente);
    }

}