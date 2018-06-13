package com.example.movil.proyectomoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void llamarInicioSesion(View view)
    {
        Intent intent=new Intent(this,InicioSesion.class);
        startActivity(intent);
    }
    public void llamarCrearCuenta(View view)
    {
        Intent intent=new Intent(this,CrearCuenta.class);
        startActivity(intent);
    }
}
