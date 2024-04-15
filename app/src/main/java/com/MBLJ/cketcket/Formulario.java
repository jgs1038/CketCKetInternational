package com.MBLJ.cketcket;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class Formulario extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Resgistro Terminado", Toast.LENGTH_SHORT).show();
    }
    public void InicioOrganizador(View view) {
        Intent siguiente = new Intent(this, InicioPrincipal.class);
        startActivity(siguiente);
    }

}

