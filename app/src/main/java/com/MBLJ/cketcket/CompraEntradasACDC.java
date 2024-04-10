package com.MBLJ.cketcket;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class CompraEntradasACDC extends AppCompatActivity {
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
    public void SiguientePEAcdc(View view) {
        Intent siguiente = new Intent(this, PerfilEventoACDC.class);
        startActivity(siguiente);
    }
    public void SiguientePorPrecios(View view) {
        Intent siguiente = new Intent(this, CeAcdcF2.class);
        startActivity(siguiente);
    }
}