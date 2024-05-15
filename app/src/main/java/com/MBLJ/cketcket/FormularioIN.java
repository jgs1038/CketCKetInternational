package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class FormularioIN extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario_in);
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Registration Completed", Toast.LENGTH_SHORT).show();
    }
    public void InicioOrganizador(View view) {
        Intent siguiente = new Intent(this, InicioPrincipalIN.class);
        startActivity(siguiente);
    }

}

