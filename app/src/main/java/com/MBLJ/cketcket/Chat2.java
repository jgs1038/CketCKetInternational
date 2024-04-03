package com.MBLJ.cketcket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Chat2 extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat2);
    }
    public void SiguienteLupa(View view){
        Intent siguiente = new Intent (this, BusquedaUsuario.class);
        startActivity(siguiente);
    }

    public void SiguienteTresRayas(View view){
        Intent siguiente = new Intent (this, TresRayas.class);
        startActivity(siguiente);
    }
    public void SiguienteTresPuntods(View view) {
        Intent siguiente = new Intent(this, TresPuntos.class);
        startActivity(siguiente);
    }
    public void Chat(View view) {
        Intent siguiente = new Intent(this, Chat.class);
        startActivity(siguiente);
    }
    public void UsuariosBloqueados(View view) {
        Intent siguiente = new Intent(this, UsuariosBloqueados.class);
        startActivity(siguiente);
    }
    public void BuscarUsuario(View view) {
        Intent siguiente = new Intent(this, BusquedaUsuario.class);
        startActivity(siguiente);
    }
    public void EntradasCompradas(View view) {
        Intent siguiente = new Intent(this, EntradasCompradas.class);
        startActivity(siguiente);
    }
    public void EntradasVendidas(View view) {
        Intent siguiente = new Intent(this, EntradasVendidas.class);
        startActivity(siguiente);
    }

}
