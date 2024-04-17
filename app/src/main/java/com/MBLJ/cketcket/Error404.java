package com.MBLJ.cketcket;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Error404 extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.error404);
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "Error 404", Toast.LENGTH_SHORT).show();
    }


        //Toast.makeText(this,"Fallo", Toast.LENGTH_SHORT).show();
        //return super.onOptionsItemSelected(item);



}
