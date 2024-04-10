package com.MBLJ.cketcket;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class CeAcdcF2 extends AppCompatActivity{
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
    public void SiguienteElegirAsientos(View view) {
        Intent siguiente = new Intent(this, CompraEntradasACDC.class);
        startActivity(siguiente);
    }
    //uyfukyfyf
}
