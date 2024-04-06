package com.MBLJ.cketcket;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class CompraEntradasACDC extends AppCompatActivity {
    private ImageView imageView;
    private boolean imagen1 = true;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compra_entradas);

        imageView = findViewById(R.id.imageView10);
    }
    public void cambiarImagen(View view) {
        if (imagen1) {
            imageView.setImageResource(R.drawable.acdcmapa2);
        } else {
            imageView.setImageResource(R.drawable.acdc_mapa);
        }
        imagen1 = !imagen1;
    }
}